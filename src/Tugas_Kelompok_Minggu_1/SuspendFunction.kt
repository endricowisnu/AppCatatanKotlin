package Tugas_Kelompok_Minggu_1

import kotlinx.coroutines.*

suspend fun tampilkanDaftarCatatanAsync(PengelolaCatatan : PengelolaCatatan): Unit = withContext(Dispatchers.IO){
    PengelolaCatatan.tampilkanDaftarCatatan()
}