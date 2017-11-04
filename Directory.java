import java.io.File;
import java.util.LinkedList;

/**
 * Represent a directory
 */
public class Directory {
    private File directory;
    private final LinkedList<Directory> directories = new LinkedList<>();

    /**
     * Constructor
     *
     * @param path directory
     */
    public Directory(String path) {
        directory = new File(path);
        try {
            File test = new File(path);
            if (!test.exists()) throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": Directory not found");
        }

        setSubDirectories();
    }

    /**
     * Add subfolder and file to this Directory's attribute
     */
    private void setSubDirectories() {
        if (directory.isFile()) return;
        File[] tmp = directory.listFiles();
        for (File s : tmp) {
            directories.add(new Directory(s.getPath()));
        }
    }

    /**
     * Return a Linked List contains subdirectories and files
     *
     * @return directories
     */
    public LinkedList<Directory> getSubDirectories() {
        return directories;
    }

    /**
     * Print all files, subfolders and their files/subfolders
     */
    public void printContent() {
        System.out.println(directory.getName());

        for (Directory directory1 : directories) {
            if (directory1.directory.isFile()) {
                System.out.println(directory1.directory.getName());
            } else if (directory1.directory.isDirectory()) {
                directory1.printContent();
            }
        }
    }
}