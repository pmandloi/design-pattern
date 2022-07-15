class PhoneBuilder {
	private String processor;
	private int ram;
	private double screenSize;

	public PhoneBuilder processor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder ram(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder screenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public Phone build(){
		return new Phone(processor, ram, screenSize);
	}
}
