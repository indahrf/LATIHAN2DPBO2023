<?php
/* Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

require ('Civitas.php');
//Membuat class Mahasiswa
class Mahasiswa extends Civitas{
    //Private attributes dari class mahasiswa
    private $nim = '';
    private $fakultas = '';
    private $prodi = '';

    //Public methods dari class mahasiswa
    /*Constructors*/
    //Methods untuk set attributes dari class mahasiswa dengan parameter
    public function __construct($nik = '', $nama = '', $jenis_kelamin = '', $asal_universitas = '', $fakultas = '', $prodi = '', $nim = '', $email_edu = '')
    {
        //Set attributes pada class mahasiswa sesuai isi parameter
        $this->nik = $nik;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
        $this->asal_universitas = $asal_universitas;
        $this->fakultas = $fakultas;
        $this->prodi = $prodi;
        $this->nim = $nim;
        $this->email_edu = $email_edu;
    }

    /*Getter dan Setter*/

    //Getter dan setter untuk nik mahasiswa
    public function setNik($nik){
        $this->nik = $nik;
    }
    public function getNik(){
        return $this->nik;
    }
    //Getter dan setter untuk nama mahasiswa
    public function setNama($nama){
        $this->nama = $nama;
    }
    public function getNama(){
        return $this->nama;
    }

    //Getter dan setter untuk jenis kelamin mahasiswa
    public function setJenis_Kelamin($jenis_kelamin){
        $this->jenis_kelamin = $jenis_kelamin;
    }
    public function getJenis_Kelamin(){
        return $this->jenis_kelamin;
    }

    //Getter dan setter untuk asal universitas mahasiswa
    public function setUniv($asal_universitas){
        $this->asal_universitas = $asal_universitas;
    }
    public function getUniv(){
        return $this->asal_universitas;
    }

    //Getter dan setter untuk fakultas mahasiswa
    public function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }
    public function getFakultas(){
        return $this->fakultas;
    }

    //Getter dan setter untuk prodi mahasiswa
    public function setProdi($prodi){
        $this->prodi = $prodi;
    }
    public function getProdi(){
        return $this->prodi;
    }

    //Getter dan setter untuk nim mahasiswa
    public function setNim($nim){
        $this->nim = $nim;
    }
    public function getNim(){
        return $this->nim;
    }

    //Getter dan setter untuk foto mahasiswa
    public function setEmail($email_edu){
        $this->email_edu= $email_edu;
    }
    public function getEmail(){
        return $this->email_edu;
    }
}

?>
