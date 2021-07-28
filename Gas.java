enum Gas {
	AIR("air"),
	NITROX("nitrox");
	
	private String gasText;
	
	Gas(String gasText) {
		this.gasText = gasText;
	}
	
	public String getGas() {
		return gasText;
	}
	
	public static Gas valueOfString(String text) {
		for(Gas gas : Gas.values()) {
			if(gas.gasText.equalsIgnoreCase(text)) {
				return gas;
			}
		}
		return null;
	}
	
	public String toString() {
		return getGas();
	}
}