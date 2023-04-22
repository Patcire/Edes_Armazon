class Usuario(nombre: String, mail: String, contrasenia: String, id:String) {

    private var nombre="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<2){
                println("Error. El nombre debe contener mínimo 2 carácteres\n")
            }
            field = value
        }

    private var mail="defecto@gmail.com"
        get(){
            return field
        }

        set(value) {
            if (value.contains("@") && value.contains(".")) {
                field = value
            }
            else{
                println("El mail debe contener una '@' y un '.'\n")
            }

        }

    private var contrasenia="defecto"
        get(){
            return field
        }

        set(value) {
            if (value.length<8){
                println("Error. La contraseña debe contener mínimo 8 carácteres\n")
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
        this.mail=mail
        this.contrasenia=contrasenia
        this.id=id
    }

    companion object{
        //aquí guardamos los id que ya se han utilizado en la clase
        private var lista_id=mutableListOf<String>()
    }

}