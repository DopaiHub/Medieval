//inherits character
public class Queen extends Character {
	//constructor takes name from character and sets weapon to knife
	public Queen(String name)
	{
		super(name);
		weaponBehavior=new WeaponKnife();
	}
	//displays character is a queen
	public void display()
	{
		System.out.println(name+" is a beautiful Queen");
	}

}
