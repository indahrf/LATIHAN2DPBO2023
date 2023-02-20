# Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
# untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

#Import file
from Mahasiswa import Mahasiswa

# Deklarasi linked list library
Mahasiswas = []

query = int(0)

#Loop untuk menjalankan CRUD
while (query < 5):
    print()
    print("DATA MAHASISWA UNIVERSITAS PENDIDIKAN INDONESIA 2023")
    print("PILIH QUERY")
    print("1. CREATE DATA")
    print("2. READ DATA")
    print("3. UPDATE DATA")
    print("4. DELETE DATA")
    print("5. EXIT")

    # Menampung pilihan user
    query = int(input())
    find = int(0)

    # Menjalankan Create Data
    if (query == 1):
        
        # Menampung jumlah data yang akan ditambahkan
        print("Jumlah data yang akan dimasukkan:")
        n = int(input())
        
        print("Masukkan data anda dengan urutan sebagai berikut")
        print("NIK - NAMA - JENIS KELAMIN - UNIVERSITAS - FAKULTAS - PROGRAM STUDI - NIM - EMAIL")

        find = int(0)
        # Menambahkan Data List
        for i in range (n):
            nik = str(input())
            nama = str(input())
            jenis_kelamin = str(input())
            asal_universitas = str(input())
            fakultas = str(input())
            prodi = str(input())
            nim = str(input())
            email_edu = str(input()) 

            # Set data ke list mahasiswa
            Mahasiswas.append(Mahasiswa(nik, nama, jenis_kelamin, asal_universitas, fakultas, prodi, nim, email_edu))
            print("Create data berhasil!")

    # Menjalankan Read Data List
    elif(query == 2):
        print("DAFTAR NAMA MAHASISWA UNIVERSITAS PENDIDIKAN INDONESIA 2023")
        i = 0
        # Menampilkan data list Mahasiswa
        for Mahasiswa in Mahasiswas:
            # panggil private attributs dengan get
            print(str(i + 1) + ".", Mahasiswa.get_nama())
            print("   NIK           : ", Mahasiswa.get_nik())
            print("   Jenis Kelamin : ", Mahasiswa.get_jenis())
            print("   Universitas   : ", Mahasiswa.get_univ())
            print("   Fakultas      : ", Mahasiswa.get_fakultas())
            print("   Program Studi : ", Mahasiswa.get_prodi())
            print("   NIM           : ", Mahasiswa.get_nim())
            print("   Email         : ", Mahasiswa.get_email())
            i += 1  
            
    # Menjalankan Update Data
    elif(query == 3):
        find = int(0)
        # Tampung nim yang akan diupdate
        print("Masukkan NIM data yang akan di-update")
        ubah = str(input())
        for Mahasiswa in Mahasiswas:  
            # Jika nim yg akan diupdate tersedia  
            if ubah == Mahasiswa.get_nim():
                # Tampung data baru lalu set kembali list yg akan diupdate
                print("Masukkan data update dengan urutan sebagai berikut")
                print("PROGRAM_STUDI - FAKULTAS")
                prodi = str(input())
                fakultas = str(input())
                    
                Mahasiswa.set_nama(Mahasiswa.get_nama())
                Mahasiswa.set_nim(Mahasiswa.get_nim())
                Mahasiswa.set_nik(Mahasiswa.get_nik())
                Mahasiswa.set_univ(Mahasiswa.get_univ())
                Mahasiswa.set_jenis(Mahasiswa.get_jenis())
                Mahasiswa.set_nama(Mahasiswa.get_email())
                Mahasiswa.set_prodi(prodi)
                Mahasiswa.set_fakultas(fakultas)
                find = 1
                print("Update data berhasil!")

        if(find == 0):
            print("Gagal, data yang anda masukkan tidak ada!")
            
    # Menjalankan Delete Data
    elif(query == 4):
        find = int(0)
        
        # Tampung nim yang akan didelete
        print("Masukkan NIM data yang akan di-delete")
        apus =str(input())
        
        # Delete List
        for Mahasiswa in Mahasiswas:
            # Jika nim yg akan didelete tersedia
            if apus == Mahasiswa.get_nim():
                # Delete list
                Mahasiswas.remove(Mahasiswa)
                find = 1
                print("Delete data berhasil!")

        if(find == 0):
            print("Gagal, data yang anda masukkan tidak ada!")