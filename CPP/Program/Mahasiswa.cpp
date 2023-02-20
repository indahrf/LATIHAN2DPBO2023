/* Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

//Import Library
#include <iostream> 
#include <string>
#include "Civitas.cpp"

using namespace std;

//Membuat class Mahasiswa
class Mahasiswa : protected Civitas
{
    //Private attributes dari class mahasiswa
    private:
        string nim;
        string prodi;
        string fakultas;

    //Public methods dari class mahasiswa
    public:

        /*Constructors*/
        //Methods untuk set attributes dari class mahasiswa
        Mahasiswa()
        {
            //Set attributes pada class mahasiswa
            this->nik = "";
            this->nama = "";
            this->jenis_kelamin = "";
            this->asal_universitas = "";
            this->fakultas = "";
            this->prodi = "";
            this->nim = "";
            this->email_edu = "";
        }

        //Methods untuk set attributes dari class mahasiswa dengan parameter
        Mahasiswa(string nik, string nama, string jenis_kelamin, string asal_univeristas, string fakultas, string prodi, string nim, string email_edu)
        {
            //Set attributes pada class mahasiswa sesuai isi parameter
            this->nik = nik;
            this->nama = nama;
            this->jenis_kelamin = jenis_kelamin;
            this->asal_universitas = asal_universitas;
            this->fakultas = fakultas;
            this->prodi = prodi;
            this->nim = nim;
            this->email_edu = email_edu;
        }

        /*Getter dan Setter*/
        
        //Getter dan setter untuk nik mahasiswa
        string get_nik()
        {
            return this->nik;
        }
        void set_nik(string nik)
        {
            this->nik = nik;
        }

        //Getter dan setter untuk nama mahasiswa
        string get_nama()
        {
            return this->nama;
        }
        void set_nama(string nama)
        {
            this->nama = nama;
        }

        //Getter dan setter untuk jenis kelamin mahasiswa
        string get_jenis()
        {
            return this->jenis_kelamin;
        }
        void set_jenis(string jenis_kelamin)
        {
            this->jenis_kelamin = jenis_kelamin;
        }

        //Getter dan setter untuk asal universitas mahasiswa
        string get_univ()
        {
            return this->asal_universitas;
        }
        void set_univ(string asal_universitas)
        {
            this->asal_universitas = asal_universitas;
        }

        //Getter dan setter untuk fakultas mahasiswa
        string get_fakultas()
        {
            return this->fakultas;
        }
        void set_fakultas(string fakultas)
        {
            this->fakultas = fakultas;
        }

        //Getter dan setter untuk prodi mahasiswa
        string get_prodi()
        {
            return this->prodi;
        }
        void set_prodi(string prodi)
        {
            this->prodi = prodi;
        }

        //Getter dan setter untuk nim mahasiswa
        string get_nim()
        {
            return this->nim;
        }
        void set_nim(string nim)
        {
            this->nim = nim;
        }

        //Getter dan setter untuk email mahasiswa
        string get_email()
        {
            return this->email_edu;
        }
        void set_email(string email_edu)
        {
            this->email_edu = email_edu;
        }

        /*Destructors*/
        ~Mahasiswa()
        {

        }
};