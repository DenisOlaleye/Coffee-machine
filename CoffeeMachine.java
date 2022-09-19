
public class CoffeeMachine 
{
	public static void main(String[] args) {
		int cofeeAmount = 2330;
		int milkAmount = 3210;
		
		int cappucinoMilkRequird = 60;
		int cappucinoCoffeRequired = 15;
		
		if (cofeeAmount >= cappucinoCoffeRequired && milkAmount >= cappucinoMilkRequird)
		{
			System.out.println("Готуємо капучино...");
		}
		else 
		{ 
			System.out.println("Не вистачає кави...");
		}
	}

}
