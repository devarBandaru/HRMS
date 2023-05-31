package com.spthhrms.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.servlet.http.HttpServletRequest;

import com.spthhrms.bean.EmpEntitlementBean;
import com.spthhrms.bean.RoasterBean;
import com.spthhrms.bean.TimeEntryBean;

public class Util {

	public static List<EmpEntitlementBean> prepareEntitlements(HttpServletRequest request) {
		List<EmpEntitlementBean> entitlements = new ArrayList<>();

		String empId = request.getParameter("empid");

		EmpEntitlementBean attendanceBean = new EmpEntitlementBean(empId, "Attendance",
				request.getParameter("Attendance"));
		entitlements.add(attendanceBean);
		EmpEntitlementBean updateProfileBean = new EmpEntitlementBean(empId, "UpdateProfile",
				request.getParameter("UpdateProfile"));
		entitlements.add(updateProfileBean);
		EmpEntitlementBean leaveRequestsBean = new EmpEntitlementBean(empId, "LeaveRequests",
				request.getParameter("LeaveRequests"));
		entitlements.add(leaveRequestsBean);
		EmpEntitlementBean payslipBean = new EmpEntitlementBean(empId, "Payslip", request.getParameter("Payslip"));
		entitlements.add(payslipBean);
		EmpEntitlementBean expensesBean = new EmpEntitlementBean(empId, "Expenses", request.getParameter("Expenses"));
		entitlements.add(expensesBean);
		EmpEntitlementBean holidaysBean = new EmpEntitlementBean(empId, "Holidays", request.getParameter("Holidays"));
		entitlements.add(holidaysBean);
		EmpEntitlementBean eventsBean = new EmpEntitlementBean(empId, "Events", request.getParameter("Events"));
		entitlements.add(eventsBean);
		EmpEntitlementBean employeeRoleAccessBean = new EmpEntitlementBean(empId, "EmployeeRoleAccess",
				request.getParameter("EmployeeRoleAccess"));
		entitlements.add(employeeRoleAccessBean);
		EmpEntitlementBean addEmployeeBean = new EmpEntitlementBean(empId, "AddEmployee",
				request.getParameter("AddEmployee"));
		entitlements.add(addEmployeeBean);
		EmpEntitlementBean branchConfigurationBean = new EmpEntitlementBean(empId, "BranchConfiguration",
				request.getParameter("BranchConfiguration"));
		entitlements.add(branchConfigurationBean);
		EmpEntitlementBean employeeConfigurationBean = new EmpEntitlementBean(empId, "EmployeeConfiguration",
				request.getParameter("EmployeeConfiguration"));
		entitlements.add(employeeConfigurationBean);
		EmpEntitlementBean leavesToApproveBean = new EmpEntitlementBean(empId, "LeavesToApprove",
				request.getParameter("LeavesToApprove"));
		entitlements.add(leavesToApproveBean);
		EmpEntitlementBean attendanceMonitoringBean = new EmpEntitlementBean(empId, "AttendanceMonitoring",
				request.getParameter("AttendanceMonitoring"));
		entitlements.add(attendanceMonitoringBean);
		EmpEntitlementBean expensesToApproveBean = new EmpEntitlementBean(empId, "ExpensesToApprove",
				request.getParameter("ExpensesToApprove"));
		entitlements.add(expensesToApproveBean);
		EmpEntitlementBean addHolidaysBean = new EmpEntitlementBean(empId, "AddHolidays",
				request.getParameter("AddHolidays"));
		entitlements.add(addHolidaysBean);
		EmpEntitlementBean addEventsBean = new EmpEntitlementBean(empId, "AddEvents",
				request.getParameter("AddEvents"));
		entitlements.add(addEventsBean);
		EmpEntitlementBean dayWiseRosterBean = new EmpEntitlementBean(empId, "DayWiseRoster",
				request.getParameter("DayWiseRoster"));
		entitlements.add(dayWiseRosterBean);
		EmpEntitlementBean modifyDayWiseRosterBean = new EmpEntitlementBean(empId, "ModifyDayWiseRoster",
				request.getParameter("ModifyDayWiseRoster"));
		entitlements.add(modifyDayWiseRosterBean);
		EmpEntitlementBean weekWiseRosterBean = new EmpEntitlementBean(empId, "WeekWiseRoster",
				request.getParameter("WeekWiseRoster"));
		entitlements.add(weekWiseRosterBean);
		EmpEntitlementBean monthWiseRosterBean = new EmpEntitlementBean(empId, "MonthWiseRoster",
				request.getParameter("MonthWiseRoster"));
		entitlements.add(monthWiseRosterBean);

		entitlements = entitlements.parallelStream().filter(e -> "Yes".equalsIgnoreCase(e.getStatus()))
				.collect(Collectors.toList());

		return entitlements;
	}

	public static List<RoasterBean> getFullMonthRoasters(List<RoasterBean> roasters) {

		List<Integer> days = IntStream.rangeClosed(1, LocalDate.now().lengthOfMonth()).boxed()
				.collect(Collectors.toList());

		LocalDate today = LocalDate.now();

		List<RoasterBean> missingRoasters = new ArrayList<>();

		days.stream().forEach(num -> {
			Optional<RoasterBean> findAny = roasters.stream()
					.filter(t -> Integer.valueOf(LocalDate.parse(t.getrDate()).getDayOfMonth()).equals(num)).findAny();

			if (findAny.isPresent()) {
				RoasterBean r = findAny.get();

				String inDateTime = r.getrDate() + "T" + r.getrInTime() + ":00";
				String outDateTime = r.getrDate() + "T" + r.getrOutTime() + ":00";

				LocalDateTime inLocal = LocalDateTime.parse(inDateTime);
				LocalDateTime outLocal = LocalDateTime.parse(outDateTime);

				r.setrTotalHours(ChronoUnit.HOURS.between(inLocal, outLocal) + " Hrs");
			} else {
				LocalDate missedDate = LocalDate.of(today.getYear(), today.getMonthValue(), num);

				RoasterBean roaster = new RoasterBean();
				roaster.setrDate(missedDate.toString());
				roaster.setrInTime("00:00");
				roaster.setrOutTime("00:00");
				roaster.setrTotalHours("0 Hrs");

				missingRoasters.add(roaster);
			}
		});

		roasters.addAll(missingRoasters);

		Collections.sort(roasters, (e1, e2) -> {
			return LocalDate.parse(e1.getrDate()).compareTo(LocalDate.parse(e2.getrDate()));
		});

		return roasters;
	}

	public static List<String> getCurrentMonthWeekNames() {
		List<String> weekNames = new ArrayList<>();

		LocalDate today = LocalDate.now();

		int numberOfDaysInMonth = today.lengthOfMonth();

		for (int i = 1; i <= numberOfDaysInMonth; i++) {
			LocalDate currentDayOfMonth = today.withDayOfMonth(i);

			String dayOfWeek = currentDayOfMonth.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);

			weekNames.add(dayOfWeek);
		}

		return weekNames;
	}

	public static String getCurrentMonthName() {
		LocalDate today = LocalDate.now();

		return today.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
	}

	public static int getCurrentYear() {
		LocalDate today = LocalDate.now();

		return today.getYear();
	}

	public static boolean isValid(String value) {
		return value != null && value.trim().length() > 0;
	}

	public static SimpleDateFormat getDDMMYYYFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		return sdf;
	}

}
