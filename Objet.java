
public class Objet {
  //Attribut
	//Complétude de l'objet (entre 0 et 1)
	//0=détruit, 1=complet
	private double intégrité;
	private int joursDepuisCréation;
	
  //Constructeur
	public Objet(){
		setIntégrité(1);
	}
	public Objet(double intégritéDeBase){
		setIntégrité(intégritéDeBase);
	}
  //Méthodes
   //get-set
	//get
	public double getIntégrité() {
		return intégrité;
	}public int getJoursDepuisCréation() {
		return joursDepuisCréation;
	}
	
	//set
	public void setIntégrité(double intégrité) {
		this.intégrité = intégrité;
	}public void setJoursDepuisCréation(int joursDepuisCréation) {
		this.joursDepuisCréation = joursDepuisCréation;
	}
   //Autres
	//Perte d'intégrité
	public void perteIntégrité(double perte){
		if (perte<=getIntégrité())
			setIntégrité(getIntégrité() - perte);
		else
			setIntégrité(0);
	}//Gain d'intégrité
	public void gainIntégrité(double gain){
		if ((gain+getIntégrité())<=1)
			setIntégrité(getIntégrité() + gain);
		else
			setIntégrité(1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
