
fun main(){

    println("Numero : ")
    var num = readLine().toString().toInt()
    var barra = "|  |"

    if(num%2 ==0){
        println(" --")
        for(left in 1..num){
            println(barra)
        }
        println(" --")
    }else{                              //crear y rellenar la lista de valores aleatorios
        var element = num*5
        var lista = mutableListOf<Int>()

        repeat(element){
            lista.add((0..20).random())
        }
        println("La lista es: "+lista)

        var pares = mutableListOf<Int>()
        for(element in lista){
            if(element%2 ==0){
                pares.add(element)
            }
        }
        println("Los numeros pares son: " + pares)
        lista.sort()
        print("Lista ordenada: " + lista)

    }



}



