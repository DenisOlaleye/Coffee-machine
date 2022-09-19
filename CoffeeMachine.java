
public class CoffeeMachine 
{
	public static void main(String[] args) 
	{
		int coffeeAmount = 100;
		int milkAmount = 100;
		int skimmedMilkAmount = 1;
	
		
		int cappucinoMilkRequired = 60;
		int cappucinoCoffeeRequired = 15;
		
		boolean isBlocked = false;
		boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired || milkAmount >= cappucinoMilkRequired;
		
//спростили умову нижче додавши змінну isMilkEnough
		
		if (!isBlocked && coffeeAmount >= cappucinoCoffeeRequired && milkIsEnough)	
		{
			System.out.println("Готуємо каву!");
		}
		else
		{
			System.out.println("Щось пішло не так! ");
		}
		
	}

}
