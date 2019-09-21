import java.util.*;

public class TestSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"Ramesh",15000);
		Account a2=new Account(110,"Ganesh",10000);
		Account a3=new Account(111,"Suresh",1000);
	    Account a4=new Account(111,"Suresh",1000);

	/*	Set<Account> st=new TreeSet<Account>();
		st.add(a1);
		st.add(a2);
		st.add(a3);
		//st.add(a4);*/
		Set<Account> hst=new HashSet<Account>(); //hashSet check both equality and reference
		hst.add(a1);
		hst.add(a2);
		hst.add(a3);
		hst.add(a4);
		for(Account a:hst){
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}

}
