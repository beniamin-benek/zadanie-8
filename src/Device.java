class Device {
	
	private String code;
	private String producer;
	private String type;
	private double price;

	Device(String code, String producer, String type) {
		this.code = code;
		this.producer = producer;
		this.type = type;
	}
	
	Device(String code, String producer, String type, double price) {
		this(code, producer, type);
		this.price = price;
	}

	String getInfo() {
		return "Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price;
	}

}