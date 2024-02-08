import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

fun main(){
    z4()
    z14()
    z24()
    z34()
    z44()
}
fun z4(){
    print("Ввеидте число A: ")
    val a:Double = readLine()!!.toDouble()
    print("Ввеидте число B: ")
    val b:Double = readLine()!!.toDouble()
    print("Ввеидте число C: ")
    val c:Double = readLine()!!.toDouble()
    val p = ((max(max(a,b),c))+(min(min(a,b),c)))/2
    println("Ответ: $p")
}
fun z14(){
    print("Ввеидте число X: ")
    var x:Int = readLine()!!.toInt()
    print("Ввеидте число Y: ")
    val y:Int = readLine()!!.toInt()
    print("Ввеидте число M: ")
    val m:Int = readLine()!!.toInt()
    print("Ввеидте число N: ")
    val n:Int = readLine()!!.toInt()
    if ((x - y) < (m % n)) {
        x++;
        println("Значение X было увеличенно на 1: $x")
    }
}
fun z24(){
    print("Ввеидте X: ")
    val x:Double = readLine()!!.toDouble()
    print("Ввеидте Y: ")
    val y:Double = readLine()!!.toDouble()
    if ((x>0)&&(y>0)){
        println("первая")
    }else if ((x>0) && (y<0)){
        println("четвёртая")
    }else if ((x<0) && (y>0)){
        println("вторая")
    }else {
        println("третья")
    }
}
fun z34(){
    print("Ввеидте число K: ")
    val k:Double = readLine()!!.toDouble()
    print("Ввеидте число B: ")
    val b:Double = readLine()!!.toDouble()
    print("Ввеидте число A: ")
    val a:Double = readLine()!!.toDouble()
    val x1: Double
    val y1: Double
    val x2: Double
    val y2: Double
    var pointExist = true
    try {
        x1 = (-b+(sqrt(b*b+4*k*a)))/(2*k)
        if (x1 >0 || x1 == 0.0 || x1 < 0){
            y1 = a/x1
            println("Первая точка пересечения: ($x1,$y1)")
            pointExist = true
        }else{
            pointExist = false
        }
    }catch (e:Exception){
    pointExist = false
    }
    try {
        x2 = -(b+(sqrt(b*b+4*k*a)))/(2*k)
        if (x2 >0 || x2 == 0.0 || x2 < 0){
            y2 = a/x2
            println("Вторая точка пересечения: ($x2,$y2)")
            pointExist = true
        }else{
            if (!pointExist){
                pointExist = false
            }
        }
    }catch (e:Exception){
        if (!pointExist){
            pointExist = false
        }
    }
    if (!pointExist){
        println("Точек не существует")
    }
}
fun z44(){
    print("Ввеидте число n1: ")
    val n1:Int = readLine()!!.toInt()
    print("Ввеидте число n2: ")
    val n2:Int = readLine()!!.toInt()
    print("Ввеидте число n3: ")
    val n3:Int = readLine()!!.toInt()
    if (min(n1,min(n2,n3)) < 10){
        println("Есть хорошая группа")
    }
}