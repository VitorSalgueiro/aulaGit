package cinema;

public class EnumIdioma {

	public enum idioma{
		INGLES("ingles"),
		PORTUGUES("portugues"),
		JAPONES("japones");
		
		private String idioma;
		
		idioma(String idioma){
			this.idioma = idioma;
		}
		
		public String getIdioma(){
			return this.idioma;
		}
	}
	
}
