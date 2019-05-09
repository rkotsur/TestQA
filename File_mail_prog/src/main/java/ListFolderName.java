import java.io.File;

class ListFolderName {
    public String folderPathName;
    ListFolderName(String folderPath){
        folderPathName=folderPath;
    }
        void list() {
        File[]fList;
        File F = new File("folderPathName");

        fList = F.listFiles();

        for(int i=0; i<fList.length; i++)
        {
            //Нужны только папки в место isFile() пишим isDirectory()
            System.out.println(String.valueOf(i) + " - " + fList[i].getName());
        }
    }

}