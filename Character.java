//Adam Nguyen
//base abstract class to be inherited
public abstract class Character {
	//protected variables to allow children to use 
	protected String name;
	protected WeaponBehavior weaponBehavior;
	//constructor to set name
	public Character(String name)
	{
		this.name=name;
	}
	//attack method
	public void attack()
	{
		weaponBehavior.attack();
	}
	//change weaponbehavior
	public void setWeaponBehavior(WeaponBehavior wb)
	{
		weaponBehavior=wb;
	}
	//abstract display method, forces children to have 
	public abstract void display();
	

}
