package tugas.week11;

public interface Phone
{
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_BATT_LEVEL = 100;
    public static final int MIN_BATT_LEVEL = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
    int getBalance();
    void getContact(String nama);
    void listContact();
    void getBatteryLevel();
    void insertContact(String nama, String nomor);
}