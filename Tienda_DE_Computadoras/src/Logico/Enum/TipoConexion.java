package Logico.Enum;

public enum TipoConexion {
	
	IDE("Ide"), 
	SATA("SATA"), 
	SATA2("SATA2"), 
	SATA3("SATA3");
	
	
	private final String value;

	TipoConexion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
