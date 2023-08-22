package Logico.Enum;

public enum TipoSocket {
		LGA1200("LGA1200"),
	    LGA1700("LGA1700"),
	    AM4("AM4"),
	    sTRX4("sTRX4"),
	    sWRX8("sWRX8"),
	    SP3("SP3"),
	    LGA2066("LGA2066"),
	    LGA2011_3("LGA2011-3"),
	    AM3_AM3_PLUS("AM3/AM3+"),
	    LGA1151("LGA1151");

	    private final String value;

	    TipoSocket(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }

}
