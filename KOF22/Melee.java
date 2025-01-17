

public class Melee extends Weapon{


	public Melee(){
 		this.setName("Melee");
 		this.setStrike(8);
 		this.setDurability(8);	
 	}
 	
	

	
	@Override
	public int specAttack() {
		if(this.getDurability() <= 0) {
			return 0;
		}
		// Melee is a weapon that has a high strength based special attack but takes a high durability cost. 
		// normally min strike for other weapon starts at 1, Melee start at 5;
		// Durability cost of other weapon is 1, Melee's is 3 
		int r = randInt(5,this.getStrike());
		
		
		this.setDurability(this.getDurability() -4);
		return r;
	}


}
