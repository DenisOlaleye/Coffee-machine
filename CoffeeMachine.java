
public class CoffeeMachine 
{
	public static void main(String[] args) {
		int coffeeAmount = 2330;
		int milkAmount = 3210;
		int skimmedMilkAmount = 1600;
	
		
		int cappucinoMilkRequired = 60;
		int cappucinoCoffeeRequired = 15;
		
		boolean isBlocked = true;
		
		if (!isBlocked && coffeeAmount >= cappucinoCoffeeRequired ||	//логічна помилка!
				skimmedMilkAmount >= cappucinoMilkRequired ||			//вираз дасть тру, через пріорітет виконання операторів
			milkAmount >= cappucinoMilkRequired) 
		{
			System.out.println("Готуємо каву!");
		}
		else
		{
			System.out.println("Кавомашина заблокована!");
		}
		
		if (skimmedMilkAmount >= cappucinoMilkRequired || milkAmount >= cappucinoMilkRequired)
		{
			System.out.println("Готуємо капучино...");
		}
		else 
		{ 
			System.out.println("Не вистачає кави...");
		}
	}

}
