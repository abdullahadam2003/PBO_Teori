# README - Penanganan Exception dalam Java

Repository ini berisi program Java yang menunjukkan penanganan exception menggunakan blok `try-catch-finally`. Program ini dirancang untuk menangani `ArrayIndexOutOfBoundsException` ketika mengakses elemen array di luar ukurannya.

## Prasyarat
Untuk menjalankan program ini, pastikan Anda memiliki yang berikut ini terpasang:
- Java Development Kit (JDK) - versi 8 atau yang lebih tinggi
- Antarmuka baris perintah atau Integrated Development Environment (IDE)

## Cara Menjalankan
1. Clone repository ini atau unduh file `Exception.java`.
2. Buka antarmuka baris perintah atau IDE dan arahkan ke direktori tempat file `Exception.java` berada.
3. Kompilasi file Java dengan menjalankan perintah berikut:
   ```
   javac Exception.java
   ```
4. Setelah kompilasi berhasil, jalankan program menggunakan perintah berikut:
   ```
   java Exception arg1 arg2 arg3 ...
   ```
   Ganti `arg1`, `arg2`, `arg3`, dan seterusnya dengan argumen baris perintah yang diinginkan.

## Deskripsi Program
Program Java `Exception.java` ini menjelaskan penggunaan penanganan exception. Program mencoba mengakses argumen baris perintah yang dilewatkan saat runtime menggunakan perulangan berbasis indeks. Namun, karena perulangan ini berjalan tanpa batas (`for (int i = 0; true; i++)`), 
pada akhirnya akan menimbulkan `ArrayIndexOutOfBoundsException` ketika mencoba mengakses elemen array di luar ukurannya.

Untuk menangani exception ini, program menggunakan blok `try-catch`. Blok `try` berisi kode yang mungkin menimbulkan exception. Di dalam blok `try`, setiap argumen baris perintah dicetak bersama dengan indeks yang sesuai.

Jika terjadi `ArrayIndexOutOfBoundsException`, program menangkap exception tersebut di blok `catch`. Program mencetak pesan kesalahan yang menunjukkan bahwa exception telah ditangkap dan mencetak informasi exception tersebut.


