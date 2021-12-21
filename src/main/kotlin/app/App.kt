package app

import utils.CalcUtils

class App {

    fun run(){
        printHeader()
        inputValue()
    }

    private fun printHeader(){
        println("======================")
        println(" Simple Calculator ")
        println("======================")
//        calculate()
    }

    private fun inputValue(){
        println("Enter value a : ")
        val a = readLine()?.toInt() ?: 0 //elvis operator default 0

        println("Enter value b : ")
        val b = readLine()?.toInt() ?: 0

        calculate(a, b)
    }

    private fun calculate(a: Int, b: Int){
        val calcUtils = CalcUtils()
        println("Result plus = ${calcUtils.plus(a, b)}")
        println("Result minus = ${calcUtils.minus(a, b)}")

        //task
        println("Result devide = ${calcUtils.devide(a,b)}")
        println("Result multiplication = ${calcUtils.multiplication(a,b)}")

//        calcUtils.plus(9, 7)
//        calcUtils.minus(7, 5)
    }

    companion object{ //sesuatu yg bisa di panggil di luar kelas utama
        @JvmStatic //agar method main bisa di panggil sebagai java class
        fun main(args: Array<String>) {
            //objek
            val app = App() //call constructor
            app.run()
//            app.printHeader()
        }
    }
}