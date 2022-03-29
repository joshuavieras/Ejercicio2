class Videojuego :Entregable{
    var titulo:String=""
    var horasEstimadas:Int=10
    var entregado:Boolean=false
    var genero:String=""
    var company:String=""

    constructor(){

    }

    override fun devolver() {
        this.entregado=false
    }

    override fun isEntregado():Boolean {
        if(this.entregado==true){
            return true
        }
        return false
    }

    override fun entregar() {
        this.entregado=true
    }

    constructor(titulop:String,horasEstimadasp:Int){
        this.titulo=titulop
        this.horasEstimadas=horasEstimadasp
    }

    constructor(titulop:String,horasEstimadasp:Int,generop:String,companyp:String){
        this.titulo=titulop
        this.horasEstimadas=horasEstimadasp
        this.genero=generop
        this.company=companyp
    }

    override fun imprimir() {
        println(titulo)
        println("Horas estimadas: " + this.horasEstimadas)
        println("Está entregado? "+this.isEntregado())
        println("Genero: "+this.genero)
        println("Creador: "+this.company)
    }
}