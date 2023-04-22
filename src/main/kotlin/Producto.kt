class Producto(nombre: String, cantidad:Int, precio: Double, id:String) {

    private var nombre="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<4){
                println("Error. El producto debe contener mínimo 4 carácteres\n")
            }
            field = value
        }


    private var cantidad=0
        get(){
            return field
        }

        set(value) {
            if (value<0){
                println("Error. Debe ser positivo\n")
            }
            field = value
        }

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


    init {
        this.nombre=nombre
        this.cantidad=cantidad
        this.precio=precio
        this.id=id
    }

    companion object{
        //aquí guardamos los id que ya se han utilizado en la clase
        private var lista_id=mutableListOf<String>()
    }

}