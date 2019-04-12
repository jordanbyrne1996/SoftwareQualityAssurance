
public class VariableDeclaration {

	//this is an example of how we DO NOT declare variable names 
	public boolean typeOne(){
		int a=0, h=0, z=0, o=0, t=0, e=0;
		
		if(a < h && z <o && t<e)
		{
		 	return true; 
		}
		 else 
		{ 
			return false; 
		} 
	}
	
	//this is an example of how we DO declare variable names
	public boolean typeTwo(){
		int Savings=0;
		int flights = 0;
		int accomodation = 0;   
		int spendingMoney = 0;
		int totalCost= flights + accomodation + spendingMoney;
		
		if(Savings>totalCost){
			return true;
		}
		else{
			return false;
		}
		
		
		
	}

}
