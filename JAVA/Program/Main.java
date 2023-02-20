/* Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */
 
//Import library
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {   
        //Deklarasi linked list library
        ArrayList<Mahasiswa> list = new ArrayList<>();
        int query = 0;
        Scanner sc = new Scanner(System.in);

        //Loop untuk menjalankan CRUD
        while(query < 5)
        {
            System.out.println();
            System.out.println("DATA MAHASISWA UNIVERSITAS PENDIDIKAN INDONESIA 2023");
            System.out.println("PILIH QUERY");
            System.out.println("1. CREATE DATA");
            System.out.println("2. READ DATA");
            System.out.println("3. UPDATE DATA");
            System.out.println("4. DELETE DATA");
            System.out.println("5. EXIT");

            int i;
            //Menampung pilihan user
            query = sc.nextInt();

            // Menjalankan Create Data
            if(query == 1)
            {
                int n = 0;
                int find = 0;
                String nik;
                String jenis_kelamin;
                String asal_universitas;
                String fakultas;
                String nama;
                String nim;
                String prodi;
                String email_edu;

                //Menampung jumlah data yang akan ditambahkan
                System.out.print("Jumlah data yang akan dimasukkan:");
                n = sc.nextInt();
                System.out.println("Masukkan data anda dengan urutan sebagai berikut");
                System.out.println("NIK - NAMA - JENIS_KELAMIN - UNIVERSITAS - FAKULTAS - PRODI - NIM - EMAIL");
                
                //Menambahkan Data List
                for(i = 0; i < n; i++)
                {
                    find = 0;
                    nik = sc.next();
                    nama = sc.next();
                    jenis_kelamin = sc.next();
                    asal_universitas = sc.next();
                    fakultas = sc.next();
                    prodi = sc.next();
                    nim = sc.next();
                    email_edu = sc.next();

                    //Cek apakah nim tersedia
                    for(i = 0; i < list.size(); i++)
                    {
                        if(nik.compareTo(list.get(i).getnik()) == 0)
                        {
                            find = 1;
                        }
                        if(nim.compareTo(list.get(i).getnim()) == 0)
                        {
                            find = 1;
                        }
                    }

                    //Gagal tambah data
                    if(find == 1)
                    {
                        System.out.println("NIK atau NIM tidak unik, data gagal ditambahkan!");
                    }
                    else
                    {
                        //Set data ke list mahasiswa
                        Mahasiswa temp = new Mahasiswa();
                        temp.setnik(nik); 
                        temp.setnama(nama); 
                        temp.setjenis(jenis_kelamin); 
                        temp.setuniv(asal_universitas);
                        temp.setfakultas(fakultas); 
                        temp.setprodi(prodi); 
                        temp.setnim(nim); 
                        temp.setemail(email_edu);
                        list.add(temp);
                        System.out.println("Create data berhasil!");
                    }
                }
            }
            //Menjalankan Read Data List
            else if(query == 2)
            {
                System.out.println("DAFTAR NAMA MAHASISWA UNIVERSITAS PENDIDIKAN INDONESIA 2023");
                i = 0;
                //Menampilkan data list Mahasiswa
                for(i = 0; i < list.size(); i++)
                {
                    //panggil private attributs dengan get
                    System.out.println(Integer.toString(i+1) + ". " + list.get(i).getnama());
                    System.out.println("   NIK           : " + list.get(i).getnik());
                    System.out.println("   Jenis Kelamin : " + list.get(i).getjenis());
                    System.out.println("   Universitas   : " + list.get(i).getuniv());
                    System.out.println("   Fakultas      : " + list.get(i).getfakultas());
                    System.out.println("   Program Studi : " + list.get(i).getprodi());
                    System.out.println("   NIM           : " + list.get(i).getnim());
                    System.out.println("   Email         : " + list.get(i).getemail());
                }
            }
            //Menjalankan Update Data
            else if(query == 3)
            {
                String ubah;
                int find = 0;
                String prodi;
                String fakultas;

                //Tampung nim yang akan diupdate
                System.out.println("Masukkan NIM data yang akan di-update");
                ubah = sc.next();

                //Update list
                for(i = 0; i < list.size(); i++)
                {
                    //Jika nim yg akan diupdate tersedia
                    if(ubah.compareTo(list.get(i).getnim()) == 0)
                    {
                        System.out.println("Masukkan data update dengan urutan sebagai berikut");
                        System.out.println("PROGRAM_STUDI - FAKULTAS");
                        //Tampung data baru lalu set kembali list yg akan diupdate
                        prodi = sc.next();
                        fakultas = sc.next();
                        Mahasiswa temp = new Mahasiswa();
                        temp.setnik(list.get(i).getnik());
                        temp.setnama(list.get(i).getnama());
                        temp.setjenis(list.get(i).getjenis());
                        temp.setuniv(list.get(i).getuniv()); 
                        temp.setfakultas(fakultas);
                        temp.setprodi(prodi);
                        temp.setnim(list.get(i).getnim()); 
                        temp.setemail(list.get(i).getemail()); 
                        list.set(i, temp);
                        find = 1;
                        System.out.println("Update data berhasil!");
                    } 
                }
                if(find == 0)
                {
                    System.out.println("Gagal, data yang anda masukkan tidak ada!");
                }
            }
            //Menjalankan Delete Data
            else if(query == 4)
            {
                String apus;
                int find = 0;

                //Tampung nim yang akan didelete
                System.out.println("Masukkan NIM data yang akan di-delete");
                apus = sc.next();

                //Delete List
                for(i = 0; i < list.size(); i++)
                {
                    //Jika nim yg akan didelete tersedia
                    if(apus.compareTo(list.get(i).getnim()) == 0)
                    {
                        //Delete list
                        list.remove(i);
                        find = 1;
                        i = list.size();
                        System.out.println("Delete data berhasil!");
                    } 
                }
                if(find == 0)
                {
                    System.out.println("Gagal, data yang anda masukkan tidak ada!");
                }
            }
        }
        sc.close();
    }
}