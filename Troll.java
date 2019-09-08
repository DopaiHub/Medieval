//inherits character
public class Troll extends Character{
	//constructor takes name from character and sets weapon to axe
	public Troll(String name)
	{
		super(name);
		weaponBehavior=new WeaponAxe();
	}
	//displays that character is a troll
	public void display()
	{
		System.out.println(name+" is a funny troll");
	}

}
