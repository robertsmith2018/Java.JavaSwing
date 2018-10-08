package ca.qc.cgodin;

public class De {
	private int chiffre;
	private int maximum;
	
	public De (int maximum){
		this.maximum=maximum;
		tire();
		
	}
	public void  tire(){
		this.chiffre=(int) (1+ Math.round(Math.random()*(maximum-1)));
	}
	public int  getChiffre(){
		return this.chiffre;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chiffre;
		result = prime * result + maximum;
		return result;
	}
	
	
	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		De other = (De) obj;
		if (chiffre != other.chiffre)
			return false;
		if (maximum != other.maximum)
			return false;
		return true;
	}

}
