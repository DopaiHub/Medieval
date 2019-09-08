//inherits character
public class Knight extends Character {
	//constructor takes name from character and sets weapon to bow
	public Knight(String name)
	{
		super(name);
		weaponBehavior=new WeaponBow();
	}
	//displays character is a knight
	public void display()
	{
		System.out.println(name+" is a valiant knight");
	}

}
