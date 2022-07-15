class Phone {
	private String processor;
	private int ram;
	private double screenSize;

	public Phone(String processor, int ram, double screenSize) {
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
	}

	public String toString() {
		return "Phone [ram = " + ram + " processor = " + processor + " screenSize = " + screenSize +"]";
	}
}
