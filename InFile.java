import java.io.File;
import java.util.Scanner;

// Classe permettant de lire un ficher d'entrée
public class InFile {

	private int rows = 0;
	private int columns = 0;
	private int ingredientsPerSlice = 0;
	private int maxCellsPerSlice = 0;
	private char[][] content;

	public InFile(String filename) {
		try {
			File file = new File(filename);
			try (Scanner sc = new Scanner(file)) {
				this.rows = sc.nextInt();
				this.columns = sc.nextInt();
				this.ingredientsPerSlice = sc.nextInt();
				this.maxCellsPerSlice = sc.nextInt();
			}
		} catch(Exception e) {
			System.out.println("File not found");
		}
	}

	public void debug() {
		System.out.println("Nombre de lignes : " + this.rows);
		System.out.println("Nombre de colonnes : " + this.columns);
		System.out.println("Nombre de chaque ingrédient au minimum par part : " + this.ingredientsPerSlice);
		System.out.println("Nombre de cellules max par part : " + this.maxCellsPerSlice);
	}
}

// String content;
//     try (Scanner scanner = new Scanner(textFile).useDelimiter("\\Z")) {
//         content = scanner.next();
//     }