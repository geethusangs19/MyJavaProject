package Practice;

public class SoftDrinks {

	public static void main(String[] args) {
		
		SoftDrinksApp objSoftDrinksApp = new SoftDrinksApp();
		objSoftDrinksApp.getTaste();
		
		SugarContent objSugarContent = new SugarContent();
		
		Coke objCoke = new Coke();
		objSugarContent.setSugarPercent(65.34);
		objCoke.getTaste(objSugarContent.getSugarPercent());
		
		Sprite objSprite = new Sprite();
		objSugarContent.setSugarPercent(53.78);
		objSprite.getTaste(objSugarContent.getSugarPercent());
		
		Fanta objFanta = new Fanta();
		objSugarContent.setSugarPercent(70.56);
		objFanta.getTaste(objSugarContent.getSugarPercent());
		
		
		
		
	}

}
