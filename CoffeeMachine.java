
public class CoffeeMachine 
{
	public static void main(String[] args) {
		int cofeeAmount = 2330;
		int milkAmount = 3210;
		int skimmedMilk = 1600;
		
		
		int cappucinoMilkRequird = 60;
		int cappucinoCoffeRequired = 15;
		
		boolean isBlocked = true;
		
		if (!isBlocked && milkAmount >= cappucinoMilkRequird && cofeeAmount >= cappucinoCoffeRequired)
		{
			System.out.println("Готуємо каву!");
		}
		else
		{
			System.out.println("Кавомашина заблокована!");
		}
		
		if (skimmedMilk >= cappucinoMilkRequird || milkAmount >= cappucinoMilkRequird)
		{
			System.out.println("Готуємо капучино...");
		}
		else 
		{ 
			System.out.println("Не вистачає кави...");
		}
	}

}
