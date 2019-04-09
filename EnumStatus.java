package cinema;

public class EnumStatus {
	
	public enum status {
		ATIVO("ativo"),
		INATIVO("inativo");
		
		private String status;
		
		status(String status){
			this.status = status;
		}
		
		public String getStatus() {
			return this.status;
		}
		
	}

}
