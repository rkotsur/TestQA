import java.io.File;

public class RWFile {
    private String pathFolderNew;
    String nameCreatFolder;

    RWFile(String pathFolder) {
        pathFolderNew = pathFolder;
    }

    void paramPath() {
        System.out.println(pathFolderNew);
    }
    void creatFolder(){
        File file = new File("c://Temps1//log//data");
        System.out.println(file.getAbsolutePath());
        //file.mkdir();
        file.mkdirs();
        file.delete();

        System.out.println(file.getAbsolutePath());
        File file1 = new File("c://Temps1");
        file1.delete();
    }
}
/*
    File myPath = new File(PathFolderNew);
myPath.mkdir()
        myPath.mkdirs()
}
*/