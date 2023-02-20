<?php
/* Saya Indah Resti Fauzi NIM 2103507 mengerjakan soal Latihan 1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek 
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

//Import file
require ('Mahasiswa.php');

//Membuat list class Mahasiswa
$arraymhs = array();

//Create Data List
// $nik = '', $nama = '', $jenis_kelamin = '', $asal_universitas = '', $fakultas = '', $prodi = '', $nim = '', $email_edu = ''
$Mahasiswa1 = new Mahasiswa('3211224707021113', 'Indah Resti Fauzi', 'P', 'Universitas Pendidikan Indonesia', 'FPMIPA', 'Ilmu Komputer', '2103507', 'indahrestifauzi@upi.edu');
array_push($arraymhs, $Mahasiswa1);
$Mahasiswa1 = new Mahasiswa('3211224707021113', 'PPPPP', 'P', 'Universitas Pendidikan Indonesia', 'FPMIPA', 'Ilmu Komputer', '2103507', 'indahrestifauzi@upi.edu');
array_push($arraymhs, $Mahasiswa1);



//Read list sebelum di update dan delete
echo "List sebelum Update dan Delete" . '<br><br>';
echo "Daftar Nama Mahasiswa Universitas Pendidikan Indonesia 2023" . '<br>';
echo "<table border='3'>";
echo "<tr>
    <th> NIK </th>
    <th> Nama </th>
    <th> Jenis Kelamin </th>
    <th> Universitas </th>
    <th> Fakultas </th>
    <th> Prodi </th>
    <th> NIM </th>
    <th> E-mail </th>
    </tr>";

for($i = 0; $i < 2; $i++){
    // $i = 0;
    echo "<tr><td>";
    echo $arraymhs[$i]->getNik();
    echo "</td><td>";
    echo $arraymhs[$i]->getNama();
    echo "</td><td>";
    echo $arraymhs[$i]->getJenis_Kelamin();
    echo "</td><td>";
    echo $arraymhs[$i]->getUniv();
    echo "</td><td>";
    echo $arraymhs[$i]->getFakultas();
    echo "</td><td>";
    echo $arraymhs[$i]->getProdi();
    echo "</td><td>";
    echo $arraymhs[$i]->getNim();
    echo "</td><td>";
    echo $arraymhs[$i]->getEmail();
    echo "</td>";
    echo "</tr>";
}
echo "</table>";
echo '<br><hr><br>';

//Update Data
$arraymhs[0]->setProdi("Matematika");

//Read list setelah di update
echo "List setelah Update" . '<br><br>';
echo "Daftar Nama Mahasiswa Universitas Pendidikan Indonesia 2023" . '<br>';
echo "<table border='3'>";
echo "<tr>
    <th> NIK </th>
    <th> Nama </th>
    <th> Jenis Kelamin </th>
    <th> Universitas </th>
    <th> Fakultas </th>
    <th> Prodi </th>
    <th> NIM </th>
    <th> E-mail </th>
    </tr>";
for($i = 0; $i < 2; $i++){
    // $i = 0;
    echo "<tr><td>";
    echo $arraymhs[$i]->getNik();
    echo "</td><td>";
    echo $arraymhs[$i]->getNama();
    echo "</td><td>";
    echo $arraymhs[$i]->getJenis_Kelamin();
    echo "</td><td>";
    echo $arraymhs[$i]->getUniv();
    echo "</td><td>";
    echo $arraymhs[$i]->getFakultas();
    echo "</td><td>";
    echo $arraymhs[$i]->getProdi();
    echo "</td><td>";
    echo $arraymhs[$i]->getNim();
    echo "</td><td>";
    echo $arraymhs[$i]->getEmail();
    echo "</td>";
    echo "</tr>";
}
echo "</table>";
echo '<br><hr><br>';

//Delete Data
array_splice($arraymhs, 0, 1);
//Read list setelah di delete
echo "List setelah Delete" . '<br><br>';
echo "Daftar Nama Mahasiswa Universitas Pendidikan Indonesia 2023" . '<br>';
echo "<table border='3'>";
echo "<tr>
    <th> NIK </th>
    <th> Nama </th>
    <th> Jenis Kelamin </th>
    <th> Universitas </th>
    <th> Fakultas </th>
    <th> Prodi </th>
    <th> NIM </th>
    <th> E-mail </th>
    </tr>";
// for($i = 0; $i < 2; $i++){
    $i = 0;
    echo "<tr><td>";
    echo $arraymhs[$i]->getNik();
    echo "</td><td>";
    echo $arraymhs[$i]->getNama();
    echo "</td><td>";
    echo $arraymhs[$i]->getJenis_Kelamin();
    echo "</td><td>";
    echo $arraymhs[$i]->getUniv();
    echo "</td><td>";
    echo $arraymhs[$i]->getFakultas();
    echo "</td><td>";
    echo $arraymhs[$i]->getProdi();
    echo "</td><td>";
    echo $arraymhs[$i]->getNim();
    echo "</td><td>";
    echo $arraymhs[$i]->getEmail();
    echo "</td>";
    echo "</tr>";
// }
echo "</table>";
echo '<br><hr><br>';
?>