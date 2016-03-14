
public class Objet {
  //Attribut
	//Compl�tude de l'objet (entre 0 et 1)
	//0=d�truit, 1=complet
	private double int�grit�;
	private int joursDepuisCr�ation;
	
  //Constructeur
	public Objet(){
		setInt�grit�(1);
	}
	public Objet(double int�grit�DeBase){
		setInt�grit�(int�grit�DeBase);
	}
  //M�thodes
   //get-set
	//get
	public double getInt�grit�() {
		return int�grit�;
	}public int getJoursDepuisCr�ation() {
		return joursDepuisCr�ation;
	}
	
	//set
	public void setInt�grit�(double int�grit�) {
		this.int�grit� = int�grit�;
	}public void setJoursDepuisCr�ation(int joursDepuisCr�ation) {
		this.joursDepuisCr�ation = joursDepuisCr�ation;
	}
   //Autres
	//Perte d'int�grit�
	public void perteInt�grit�(double perte){
		if (perte<=getInt�grit�())
			setInt�grit�(getInt�grit�() - perte);
		else
			setInt�grit�(0);
	}//Gain d'int�grit�
	public void gainInt�grit�(double gain){
		if ((gain+getInt�grit�())<=1)
			setInt�grit�(getInt�grit�() + gain);
		else
			setInt�grit�(1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
