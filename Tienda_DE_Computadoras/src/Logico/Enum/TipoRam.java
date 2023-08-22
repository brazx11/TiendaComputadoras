package Logico.Enum;

public enum TipoRam {
	   DDR("DDR"),
	    DDR2("DDR2"),
	    DDR3("DDR3"),
	    DDR4("DDR4"),
	    DDR5("DDR5"),
	    VRAM("VRAM"),
	    WRAM("WRAM");

	    private final String value;

	    TipoRam(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
	}


