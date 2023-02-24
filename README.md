# LATIHAN2DPBO2023

Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

=DESAIN PROGRAM=

1. Membuat class Human dengan 3 private attributes (nik, nama, dan jenis_kelamin)
2. Membuat class Civitas sebagai inheritance dari class Human dengan 2 protected attributes (asal_universitas dan email_edu)
3. Membuat class Mahasiswa sebagai inheritance dari class Civitas dengan 3 protected attributes (nim, prodi, dan fakultas)
4. Membuat linked list untuk mendeklarasikan list berisikan sekumpulan object mahasiswa
5. dapat melakukan CRUD terhadap list

![LATIHAN2DPBO drawio](https://user-images.githubusercontent.com/99266430/221128637-6c275989-c8a0-483f-9026-27908145c1b2.png)

=PENJELASAN ALUR PROGRAM=

1. Membuat class Human, Civitas, dan Mahasiswa dengan menambahkan attibutes nik, nama, jenis_kelamin, asal_universitas, fakultas, prodi, nim, dan email_edu
2. Membuat Public Methods untuk mengakses attribute dari class Mahasiswa. Methods yang dibuat berupa method untuk menambahkan data ke attribute pada class mahasiswa, serta setter dan getter

Bagian Main

1. Deklarasikan linked list/membuat list yang isinya berupa sekumpulan object mahasiswa.
2. Membuat loop untuk menjalankan program. Nantinya user akan memasukkan kode angka 1-5 sesuai dengan action yang akan user lakukan terhadap list mahasiswa.
NIM sebagai primary key
3. Ketika user memilih create data, maka akan dijalankan kode program (jika dikembangkan bisa dibuat menjadi method) untuk menambahkan data kelist mahasiswa sebanyak n dengan memanfaatkan method set. Nantinya inputan user akan ditampung pada attribute yang terdapat pada object mahasiswa serta ortunya.
4. Ketika user memilih read data, maka akan menjalankan kode program untuk menampilkan list mahasiswa dengan memanfaatkan method get
5. Ketika user memilih update data, maka akan menjalankan kode program untuk mengupdate object pada list sesuai primary key yang dipilih dengan memanfaatkan method set
6. Ketika user memilih delete data, maka akan dijalankan kode program untuk menghapus obbject pada list sesuai primary key yang dipilih dengan memanfaatkan fungsi erase pada library
7. Program akan berhenti ketika user memilih exit


=DOKUMENTASI PROGRAM=

Create data dengan inputan yang benar dan salah, lalu read/menampilkan list mahasiswa

![JAVA (11)](https://user-images.githubusercontent.com/99266430/220072422-fd5b7427-9137-4e88-92fd-c16eeeb375f3.png)

![JAVA (5)](https://user-images.githubusercontent.com/99266430/220070912-650a0108-d167-40ad-a708-d5ae4f1d9773.png)


Update data dengan inputan yang benar dan salah, lalu read/menampilkan list mahasiswa setelah di-update

![JAVA (6)](https://user-images.githubusercontent.com/99266430/220071424-d261d1db-97b4-440b-98e3-31ce8c31d3ff.png)

![JAVA (7)](https://user-images.githubusercontent.com/99266430/220071498-e0f6a8c2-116f-4134-b36b-8eadf5ef95a1.png)


Delete data dengan inputan yang benar dan salah, lalu read/menampilkan list mahasiswa setelah di-delete

![JAVA (8)](https://user-images.githubusercontent.com/99266430/220071800-99a0263f-d634-4192-bbe2-97cfb5a25232.png)

![JAVA (9)](https://user-images.githubusercontent.com/99266430/220071824-958271d5-c483-430e-bf9f-617d7b1dfd63.png)


Exit/keluar dari program 
![JAVA (10)](https://user-images.githubusercontent.com/99266430/220071962-7defb265-e0c9-453d-942e-ac1eaf2ab126.png)
