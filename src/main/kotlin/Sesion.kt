class Sesion(id:String, usuario: Usuario, carrito: Carrito) {

    private var id="defecto"
        get(){
            return field
        }
        set(value) {

            if (value.length<4){
                println("error. El código debe tenr 4 caracteres mínimo\n")
            }
            if (value in lista_id){
                println("Ese código ya existe, introduzca otro.")
            }
            else{
                field = value
                lista_id.add(field)
            }

        }

    private var usuario=Usuario("defecto", "example@.com", "defecto", "????")

    private var carrito=Carrito(mutableListOf<Producto>(), 0.0)


    init {
        this.id=id
        this.usuario=usuario
        this.carrito=carrito
    }

    companion object{
        //aquí guardamos los id que ya se han utilizado en la clase
        private var lista_id=mutableListOf<String>()
    }

    fun aniadir_producto_carrito(producto: Producto): String{
        return "sin implementar"
    }

    fun eliminar_producto_carrito(id_producto: String): String{
        return "sin implementar"
    }

    fun pagar_paypal(precio: Double): Boolean{
        return false
    }
    fun pagar_tarjeta(precio: Double): Boolean{
        return false
    }
    fun pagar_contrareembolso(precio: Double): Boolean{
        return false
    }





}