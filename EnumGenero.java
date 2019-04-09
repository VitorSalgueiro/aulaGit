package cinema;

public class EnumGenero {
	
	public enum genero{
		
		ACAO("acao"),
		ROMANCE("romance"),
		COMEDIA("comedia"),
		AVENTURA("aventura"),
		TERROR("terror"),
		SCIFI("scifi"),
		DRAMA("drama"),
		SUSPENCE("suspence");
		
		private String genero;
		
		genero(String genero){
			this.genero = genero;
		}
		
		public String getGenero(){
			return this.genero;
		}
	}
}
