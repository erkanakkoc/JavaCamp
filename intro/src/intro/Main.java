package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu ="Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false; 
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}else {
			System.out.println("Dolar eþittir resmi");
		}
		
		
		
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Konut Kredisi";
		String kredi3 = "Çiftçi Kredisi";
		String kredi4 = "Ýhtiyaç Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);

		String[] krediler = 
			{
					"Hýzlý Kredi",
					"Konut Kredisi",
					"Çiftçi Kredisi",
					"Ýhtiyaç Kredisi"
			};
		
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
	}

}
