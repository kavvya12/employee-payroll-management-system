class Payroll {
    static double calculateSalary(Employee emp, Attendance att) {
        return emp.salaryPerDay * att.daysPresent;
    }
}
