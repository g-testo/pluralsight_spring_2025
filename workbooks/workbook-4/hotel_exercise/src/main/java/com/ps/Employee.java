package com.ps;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastCheckedInTime;

    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double regularPay = this.getRegularHours() * this.payRate;
        double overtimePay = this.getOvertime() * this.payRate * 1.5;
        return regularPay + overtimePay;
    }

    private double getRegularHours(){
        return Math.min(this.hoursWorked, 40);
    }

    private double getOvertime(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        } else {
            return 0;
        }
    }

    private void punchIn(double time){
        this.lastCheckedInTime = time;
    }

    private void punchOut(double time){ // 20 hour 8 hour
        double timeWorked = time - this.lastCheckedInTime;

        this.hoursWorked += timeWorked;

        this.lastCheckedInTime = -1;
    }

}
