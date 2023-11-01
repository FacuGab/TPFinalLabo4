package Entidad;

public class Provincia {

		private int IdProvincia;
		private String Descripcion;


		//Contructores
		
		public Provincia() {
			
		}
		
		public Provincia(int idprovincia, String desc) {
			
			this.IdProvincia=idprovincia;
			this.Descripcion=desc;
		}
		
		
		//Setter
		public void setIdProvincia(int idProvincia) {
			IdProvincia = idProvincia;
		}

		public void setDescripcion(String descripcion) {
			Descripcion = descripcion;
		}
		
		
		
		//Getter
		public int getIdProvincia() {
			return IdProvincia;
		}
		
		public String getDescripcion() {
			return Descripcion;
		}


		
		//ToString
		
		@Override
		public String toString() {
			return "Provincia [IdProvincia=" + IdProvincia + ", Descripcion=" + Descripcion + "]";
		}
}
