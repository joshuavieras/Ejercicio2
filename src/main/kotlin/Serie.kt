class Serie:Entregable {
    var titulo:String=""
    var temporadas:Int=3
    var entregado:Boolean=false
    var genero:String=""
    var creador:String=""

    constructor()

    constructor(titulop: String, creadorp: String) {
        this.titulo = titulop
        this.creador=creadorp
    }
    constructor(titulop: String,temporadasp:Int,entregadop:Boolean,generop:String, creadorp: String) {
        this.titulo = titulop
        this.creador=creadorp
        this.temporadas=temporadasp
        this.entregado=entregadop
        this.genero=generop
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

}