
public class Account implements Comparable<Account>{
 private int accNo;
private String custName;
 private double accBal;
 public Account(int accNo, String custName, double accBal) {
	super();
	this.accNo = accNo;
	this.custName = custName;
	this.accBal = accBal;
}
public int getAccNo() {
	return accNo;
}
public String getCustName() {
	return custName;
}
public double getAccBal() {
	return accBal;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(accBal);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + accNo;
	result = prime * result + ((custName == null) ? 0 : custName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Account other = (Account) obj;
	if (Double.doubleToLongBits(accBal) != Double.doubleToLongBits(other.accBal))
		return false;
	if (accNo != other.accNo)
		return false;
	if (custName == null) {
		if (other.custName != null)
			return false;
	} else if (!custName.equals(other.custName))
		return false;
	return true;
}
//when we use TreeSet that time we need compareTo() because we need to check content means equality and compare  but for hashSet it is not required
@Override
public int compareTo(Account o) {
	// TODO Auto-generated method stub
	if(this.getAccBal()>o.getAccBal()){
		return 1;
	}
	else if(this.getAccBal()<o.getAccBal()){
		return -1;
	}
	else{
		return 0;
	}
}

 
}
// comparator serach