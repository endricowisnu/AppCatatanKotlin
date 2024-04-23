package Tugas_Kelompok_Minggu_1

class PengelolaCatatan {
    private val daftarCatatan : MutableList<Catatan> = mutableListOf()

    fun tambahCatatan(judul : String, konten : String){
        daftarCatatan.add(Catatan(judul,konten))
    }

    fun tampilkanDaftarCatatan(){
        if(daftarCatatan.isEmpty()){
            println("Tidak ada catatan dalam list")
        }else{
            for(catatan in daftarCatatan){
                println(catatan.toString())
            }
        }
    }
}