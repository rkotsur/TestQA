package HAG.RKotsurLesson30;

/**
 * Created by 1 on 22.02.2019.
 */
public class Run {
    public static void main(String[] args) {
        CPU cpu =new CPU();
        RAM ram = new RAM();
        HDD hdd = new HDD(500);
        FDD fdd = new FDD();
        PC pc = new PC();

        pc.assembly(cpu);
        pc.assembly(ram);
        pc.assembly(hdd);
        pc.assembly(fdd);
        //pc.assembly(pc);

        pc.onPC();
        pc.offPC();
        pc.checkVirus();
        pc.hddSize(hdd);
    }
}
