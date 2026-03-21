class Switch{
	public static void main(String[] args) {
		
		String day = args[0];
  
		switch(day)
		{
			case "sat", "sun" -> System.out.println("9M");

			case "mon", "tue" -> System.out.println("6am");

			default -> System.out.println("7am");
		}
	}
}