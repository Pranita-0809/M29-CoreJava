package org.tnsifclassandobject;

public class customer {
private int customerid;
private string customername;
@Override
public String toString() {
	return "customer [customerid=" + customerid + ", salary=" + salary + "]";
}
public customer(int customerid, string customername, float salary, string city) {
	super();
	this.customerid = customerid;
	this.customername = customername;
	this.salary = salary;
	this.city = city;
}
public customer() {
	super();
	// TODO Auto-generated constructor stub
}
public customer(int customerid, string customername, string city) {
	super();
	this.customerid = customerid;
	this.customername = customername;
	this.city = city;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public string getCustomername() {
	return customername;
}
public void setCustomername(string customername) {
	this.customername = customername;
}

}
