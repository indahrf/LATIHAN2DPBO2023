//Membuat class Mahasiswa
public class Mahasiswa extends Civitas
{
    //Private attributes dari class mahasiswa
    private String nim;
    private String prodi;
    private String fakultas;

    /*Constructors*/
    /*Getter dan Setter*/

    //Getter dan setter untuk nik mahasiswa
    public String getnik()
    {
        return this.nik;
    }
    public void setnik(String nik)
    {
        this.nik = nik;
    }

    //Getter dan setter untuk nama mahasiswa
    public String getnama()
    {
        return this.nama;
    }
    public void setnama(String nama)
    {
        this.nama = nama;
    }

    //Getter dan setter untuk jenis kelamin mahasiswa
    public String getjenis()
    {
        return this.jenis_kelamin;
    }
    public void setjenis(String jenis_kelamin)
    {
        this.jenis_kelamin = jenis_kelamin;
    }

    //Getter dan setter untuk nama mahasiswa
    public String getuniv()
    {
        return this.asal_universitas;
    }
    public void setuniv(String asal_universitas)
    {
        this.asal_universitas = asal_universitas;
    }

    //Getter dan setter untuk nim mahasiswa
    public String getnim()
    {
        return this.nim;
    }
    public void setnim(String nim)
    {
        this.nim = nim;
    }

    //Getter dan setter untuk prodi mahasiswa
    public String getprodi()
    {
        return this.prodi;
    }
    public void setprodi(String prodi)
    {
        this.prodi = prodi;
    }

    //Getter dan setter untuk fakultas mahasiswa
    public String getfakultas()
    {
        return this.fakultas;
    }
    public void setfakultas(String fakultas)
    {
        this.fakultas = fakultas;
    }

    //Getter dan setter untuk fakultas mahasiswa
    public String getemail()
    {
        return this.email_edu;
    }
    public void setemail(String email_edu)
    {
        this.email_edu = email_edu;
    }

}