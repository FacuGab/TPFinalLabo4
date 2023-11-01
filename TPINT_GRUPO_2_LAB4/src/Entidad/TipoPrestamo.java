package Entidad;

public class TipoPrestamo {
	
	 public int IdTipoPrestamo ;
     public  String Descripcion ;
     
     //Constructotes
     public TipoPrestamo () {}
     
     public TipoPrestamo(int idTipoPrestamo, String descripcion) {
		super();
		IdTipoPrestamo = idTipoPrestamo;
		Descripcion = descripcion;
     }
     
     
    //Getter 
     
	public int getIdTipoPrestamo() {
		return IdTipoPrestamo;
	}

	public String getDescripcion() {
		return Descripcion;
	}
	
	
	//Setter
	
	public void setIdTipoPrestamo(int idTipoPrestamo) {
		IdTipoPrestamo = idTipoPrestamo;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


     
     
     //Tostring

	@Override
	public String toString() {
		return "TipoPrestamo [IdTipoPrestamo=" + IdTipoPrestamo + ", Descripcion=" + Descripcion + "]";
	}
     
     
     
}
