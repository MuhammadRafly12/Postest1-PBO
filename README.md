# Postest1-PBO
<pre>Nama : Muhammad Rafly
NIM :2409116118</pre>

## Deskripsi Program

Program ini adalah aplikasi sederhana berbasis Java yang digunakan untuk mengelola daftar film atau series. Program memungkinkan pengguna untuk menambahkan data film/series, melihat daftar yang sudah tersimpan, memperbarui data yang ada, serta menghapus data tertentu.

## Fitur Program

<pre>- Tambah Data Film/Series Memasukkan judul, genre, tahun rilis, dan rating.
- Lihat Daftar Film/Series Menampilkan semua data yang sudah dimasukkan.
- Update Data Film/Series Memperbarui data lama dengan data baru.
- Hapus Data Film/Series Menghapus data berdasarkan nomor urut.
- Menu Berulang Program akan terus berjalan sampai pengguna memilih keluar.</pre>

## Atribut Data Film/Series

<pre>- Judul Atribut yang berisi Nama film atau series.
- Genre Atribut yang berisi Jenis film (aksi, komedi, drama, horor, dll.).
- Tahun Rilis Atribut yang berisi Tahun film atau series pertama kali dirilis.
- Rating Atribut yang berisi Nilai atau penilaian dari pengguna (misalnya 1–10).</pre>

## Alur Program

Tampilan Menu Utama
Program akan menampilkan daftar pilihan menu:

<pre>1) Tambah Film/Series
2) Lihat Daftar Film/Series
3) Update Data Film/Series
4) Hapus Data Film/Series
5) Keluar
Input Pilihan Menu:</pre>

<img width="377" height="225" alt="image" src="https://github.com/user-attachments/assets/e9c0851b-5504-42a2-85c2-ca8d021a8c69" />


Pengguna diminta memilih menu dengan mengetik angka sesuai pilihan.

### Menambahkan Film/Series
Pengguna memasukkan:

<pre>Judul
Genre
Tahun Rilis
Rating
Data kemudian disimpan di dalam ArrayList.</pre>

<img width="466" height="185" alt="image" src="https://github.com/user-attachments/assets/a6f3ffd1-9b93-4f3f-bcc4-075907206245" />


### Melihat Daftar Film/Series

<pre>Program akan menampilkan semua film/series yang sudah disimpan dalam bentuk daftar dengan nomor urut.
Setiap film akan ditampilkan lengkap dengan atributnya (judul, genre, tahun rilis, dan rating).
Jika daftar masih kosong, program akan memberi pesan bahwa belum ada data yang dimasukkan.</pre>

<img width="428" height="212" alt="image" src="https://github.com/user-attachments/assets/b96c7d1c-fffa-4db8-9066-e8c6d09d4160" />


### Update Data Film/Series

<pre>Pengguna dapat memilih film/series yang ingin diperbarui dengan cara memasukkan nomor urutnya.
Setelah itu, pengguna akan diminta untuk mengisi data baru (judul, genre, tahun rilis, dan rating),
yang akan menggantikan data lama secara keseluruhan.</pre>

<img width="487" height="295" alt="image" src="https://github.com/user-attachments/assets/ad88b924-1570-4764-b143-de82c0b2135c" />


### Hapus Data Film/Series

<pre>Pengguna dapat menghapus film/series dari daftar dengan memilih nomor urutnya.
Setelah data dihapus, daftar akan menyesuaikan dan menampilkan sisa film/series yang ada.
Jika nomor urut tidak ditemukan, program akan menampilkan pesan error sederhana.</pre>

<img width="439" height="154" alt="image" src="https://github.com/user-attachments/assets/104eedd1-f8fd-4cd8-b16f-ae5d74ee26a3" />


### Keluar

<pre>Program hanya akan berhenti jika pengguna memilih menu keluar.
Sebelum keluar, semua data akan dihapus secara otomatis (karena disimpan dalam memori sementara).</pre>

<img width="365" height="58" alt="image" src="https://github.com/user-attachments/assets/6d475adc-348a-47ed-b209-37f303ff5e40" />
