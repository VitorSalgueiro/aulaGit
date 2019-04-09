package cinema;

public class EnumClassificacao {
	
	public enum classificacao{
		LIVRE("livre"),
		DEZ("10"),
		DOZE("12"),
		QUATORZE("14"),
		DEZESSEIS("16"),
		DEZOITO("18");
		
		private String classificacao;
		
		classificacao(String classificacao){
			this.classificacao = classificacao;
		}
		
		public String getClassificacao(){
			return this.classificacao;
		}
	}	
}
