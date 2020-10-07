package fileinfo;

import java.io.File;

public class Main {
    static int length = 0;
    public static void main(String[] args) {
	// write your code here
        File file = new File("src/fileinfo/Main.Java");
        System.out.println("Файл доступен для чтения - " + file.canRead());
        System.out.println("Файл доступен для записи - " + file.canWrite());
        System.out.println("Файл существует - " + file.exists());
        System.out.println("Полный путь - " + file.getAbsolutePath());
        System.out.println("Имя файла - " + file.getName());
        System.out.println("Название родительской директории - " + file.getParent());
        System.out.println("Это файл - " + file.isFile());
        System.out.println("Это директория - " + file.isDirectory());
        System.out.println("Последнее время изменения файла - " + file.lastModified());

        File parent = file.getAbsoluteFile().getParentFile().getParentFile().getParentFile();
        System.out.println(parent.getAbsolutePath());
        File[] files = parent.listFiles();

        for (File f: files) {
            System.out.println("-------------------------");
            System.out.println(f);
            System.out.println("Размер файла - " + f.length());
            System.out.println("Это файл - " + f.isFile());
        }
        int size = size(parent);
        
    }
    public static int size(File file) {
        File[] files = file.listFiles();
        for (File f: files) {
            if (f.isDirectory()) {
                size(f);
            }
            else if (f.isFile())  length+= f.length();
        }
        return length;
    }
}
