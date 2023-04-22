class Carrito(lista_productos: MutableList<Producto>, precio: Double) {

    private var lista_productos= mutableListOf<Producto>()
    private var precio=0.0
        get(){
            return field
        }
        set(value) {
            if (value<0){
                println("Error. Debe ser positivo\n")
            }
            field = value
        }

    init {
        this.lista_productos=lista_productos
        this.precio=precio
    }

}