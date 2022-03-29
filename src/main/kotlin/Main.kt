import Serie
import Videojuego
fun main() {
    var videojuegos = arrayOf<Videojuego>()
    var series = arrayOf<Serie>()

    val serie1 = Serie("OKAY","Bryan")
    val serie2 =  Serie("Hello","Elif")
    val serie3 =  Serie("Wayward",2,false,"CienciaFiccion", "LukeBlake")
    val serie4 =  Serie("WaywardSon",2,true,"XD", "LukeJack")
    val serie5 =  Serie("WaywardPines",2,false,"Drama", "MichaelBlake")
    serie2.entregar()
    serie5.entregar()
    series  = series .plus(serie1)
    series  = series .plus(serie2)
    series  = series .plus(serie3)
    series  = series .plus(serie4)
    series  = series .plus(serie5)

    val vj1 = Videojuego("Halo",200)
    val vj2 =  Videojuego("Minecraft",20)
    val vj3 =  Videojuego("Valorant",400,"Shooter" ,"Riot")
    val vj4 = Videojuego("CS:GO",500,"Shooter" ,"Valve")
    val vj5 =  Videojuego("Warzone",1000,"Shooter" ,"Activision")
    vj5.entregar()
    vj4.entregar()
    vj3.entregar()
    videojuegos = videojuegos.plus(vj1)
    videojuegos = videojuegos.plus(vj2)
    videojuegos = videojuegos.plus(vj3)
    videojuegos = videojuegos.plus(vj4)
    videojuegos = videojuegos.plus(vj5)

    var contadorSeriesEntregadas:Int=0
    var contadorVideoJuegosEntregados:Int=0

    for (i in series.indices){
        if(series[i].isEntregado()==true)
        contadorSeriesEntregadas++
        series[i].devolver()
    }
    println("Series entregadas: "+contadorSeriesEntregadas)

    for (i in videojuegos.indices){
        if(videojuegos[i].isEntregado()==true)
            contadorVideoJuegosEntregados++
        videojuegos[i].devolver()
    }
    println("Videojuegos entregados: "+contadorVideoJuegosEntregados)
    println("Desea imprimir todos los videojuegos y series?(Y/N)\n")
    var resp = readLine()!![0]
    if(resp=='Y'||resp=='y') {
        for (i in series.indices) {
            println("=====================")
            series[i].imprimir()
            println("=====================")
        }
        for (i in videojuegos.indices) {
            println("=====================")
            videojuegos[i].imprimir()
            println("=====================")
        }

    }
}