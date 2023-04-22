

class Armazon(lista_sesiones:MutableList<Sesion>, almacen: MutableList<Producto>): Funcionalidades {

    private var lista_sesiones= mutableListOf<Sesion>()
        get(){
            return field
        }

        set(value) {
            if (value.size<1){
                println("Error. La lista debe contener al menos una Sesion\n")
            }
            field = value
        }

    private var almacen= mutableListOf<Producto>()
        get(){
            return field
        }

        set(value) {
            if (value.size<1){
                println("Error. La lista debe contener al menos un Producto\n")
            }
            field = value
        }


    init {
        this.lista_sesiones=lista_sesiones
        this.almacen=almacen
    }


    private fun buscar_todos_productos(): String{
       return almacen.toString()
    }

}