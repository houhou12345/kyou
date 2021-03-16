package ren01;

public class Account {
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber +  ")";
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
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		return true;
	}
	
	
	

}
//public static final int MAX_HP = 50;