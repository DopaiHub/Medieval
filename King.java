//inherits Character
public class King extends Character{
	//constructor takes name from character and sets weapon to sword
	public King(String name)
	{
		super(name);
		weaponBehavior=new WeaponSword();
	}
	//displays that character is a king
	public void display()
	{
		System.out.println(name+" is a Noble King");
	}

}
