fun main(){
    val arr = intArrayOf(10, 2, 10, 3, 1, 2, 5, 2, -1, 3)

    var temp = 0
    for (i in 0 until arr.size - 1){
        println("Дейсвия " + (i + 1))
        for (k in 1 until arr.size - 1){
            println("Сравнение " + arr[k - 1] + " и " + arr[k])
            if (arr[k - 1] > arr[k]){

                temp = arr[k - 1]
                arr[k - 1] = arr [k]
                arr[k] = temp
                println(arr[k].toString() + " больше, чем " + arr[k - 1])
                println("Замена элементов: новый массив после замены")
                println(arr.contentToString())
            }
        }
    }
}
