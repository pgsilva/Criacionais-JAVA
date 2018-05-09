package ex04_1;

public class Run {

	public static void main(String[] args) {
		String[][] notas = { 
				{ "8.0", "7.5", "8.5", "9.0", "8.0" },
				{ "8.9", "9.0", "8.6", "8.4", "8.0" },
				{ "6.8", "7.1", " 7.0", "7.6", "6.5" }
		};
		
		FazMap map = new FazMap();
		map.setMap(notas);
		System.out.println(map.getMap());
	}
}
