package Tugas_Kelompok_Minggu_1
import kotlinx.coroutines.*

fun main(){
    val pengelolaCatatan = PengelolaCatatan()

    while(true){
        println("=======MENU=======")
        println("1. Tambah Catatan")
        println("2. Tampilkan Daftar Catatan")
        println("3. Keluar")
        print("Pilih : ")
        val pilihan = readLine()?.toIntOrNull() ?: continue

        when(pilihan){
            1 -> {
                print("Judul  : ")
                val judul = readLine() ?: continue
                print("Konten : ")
                val konten = readLine() ?: continue

                pengelolaCatatan.tambahCatatan(judul, konten)
                println("Catatan baru ditambahkan")
            }
            2 -> {
                println("Menunggu daftar catatan...")
                GlobalScope.launch{
                    tampilkanDaftarCatatanAsync(pengelolaCatatan)
                    delay(3_000)
                }
                runBlocking {
                    delay(2000) // Menunggu 4 detik agar coroutine memiliki waktu untuk selesai
                }

            }
            3 -> {
                println("Terima Kasih")
                break
            }
            else -> println("Pilihan Tidak valid")
        }
    }
}