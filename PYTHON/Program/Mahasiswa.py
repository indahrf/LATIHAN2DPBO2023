# Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
from Civitas import Civitas
# Membuat class Mahasiswa
class Mahasiswa (Civitas):
    
    # Attributes dari class mahasiswa
    __nim = ""
    __prodi = ""
    __fakultas = ""
    
    # Constructors
    # methods dari class mahasiswa
    def __init__(self, nik = "", nama = "", jenis_kelamin ="", asal_universitas = "", fakultas = "", prodi = "", nim = "", email_edu = ""):
        # Set attributes pada class mahasiswa
        self.__nama = nama
        self.__nim = nim
        self.__prodi = prodi
        self.__fakultas = fakultas
        self.__nik = nik
        self.__asal_universitas = asal_universitas
        self.__jenis_kelamin = jenis_kelamin
        self.__email_edu = email_edu


    # Getter dan Setter

    # Getter dan setter untuk nama mahasiswa
    def get_nama(self):
        return self.__nama
    def set_nama(self, nama):
        self.__nama = nama
        
    # Getter dan setter untuk nim mahasiswa
    def get_nim(self):
        return self.__nim
    def set_nim(self, nim):
        self.__nim = nim
        
    # Getter dan setter untuk prodi mahasiswa
    def get_prodi(self):
        return self.__prodi
    def set_prodi(self, prodi):
        self.__prodi = prodi
        
    # Getter dan setter untuk fakultas mahasiswa
    def get_fakultas(self):
        return self.__fakultas
    def set_fakultas(self, fakultas):
        self.__fakultas = fakultas
        
    # Getter dan setter untuk nik mahasiswa
    def get_nik(self):
        return self.__nik
    def set_nik(self, nik):
        self.__nik = nik
        
    # Getter dan setter untuk nama mahasiswa
    def get_jenis(self):
        return self.__jenis_kelamin
    def set_jenis(self, jenis_kelamin):
        self.__jenis_kelamin = jenis_kelamin
        
    # Getter dan setter untuk nama mahasiswa
    def get_univ(self):
        return self.__asal_universitas
    def set_univ(self, asal_universitas):
        self.__asal_universitas = asal_universitas
        
    # Getter dan setter untuk nama mahasiswa
    def get_email(self):
        return self.__email_edu
    def set_email(self, email_edu):
        self.__email_edu = email_edu