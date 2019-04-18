package Band;


/**
 * Write a description of class Anggota here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Anggota
{
    private String nama;
    private StatusAnggota status;
    private String peran;

    public Anggota(String nama, StatusAnggota status, String peran){
        this.nama=nama;
        this.status=status;
        this.peran=peran;
    }
    
    public StatusAnggota getStatus()
    {
        return status;
    }
    
    public void setStatus(StatusAnggota status)
    {
        this.status=status;
    }
    
    public void printData()
    {
       System.out.println("========AnggotaBand=======");
       System.out.println(nama+" adalah seorang "+peran+" yang berstatus "+status);
     }
}
