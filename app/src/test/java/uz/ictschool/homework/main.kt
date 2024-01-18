package uz.ictschool.homework

import java.util.Scanner
import kotlin.system.exitProcess

fun main() {




    println("Assalomu Alaykum Parkovkaga Xush kelibsiz: ")
    println("Parkovka qoyish uchun 1 ni kiriting: ")
    println("Parkovkadan olish uchun 2 ni kiriting: ")
    println("Parkovkadan olish uchun 3 ni kiriting: ")
    println("Tugatish uchun 4 ni kiriting: ")

    var controller = UserController()
    controller.onCreate()




}

class CarModel {




    private var parkingA = arrayOfNulls<Int>(5)
    private var parkingB = arrayOfNulls<Int>(5)
    private var parkingC = arrayOfNulls<Int>(5)

    private var ListA = 0
    private var ListB = 0
    private var ListC = 0





    fun addCar(parking: String) {




        when (parking) {

            "A" -> if (ListA < parkingA.size) {

                ListA +=1
                show("Joy egallandi!")
            } else {
                show("A parkovkada  bo'sh joy yoq!")
            }


            "B" -> if (ListB < parkingB.size) {
                ListB += 1
                show("Joy egallandi!")
            } else {
                show("B parkovkada bo'sh joy yoq!")
            }

            "C" -> if (ListC < parkingC.size) {
                ListC+=1
                show("Joy egallandi!")
            } else {
                show("C parkovkada bo'sh joy yoq!")
            }


        }

    }

    fun removeCar(parking: String) {

        when (parking) {

            "A" -> if (ListA > 0) {
                ListA -=1
                show("Joy egallandi!")
            } else {
                show("A parkovka bo'sh!")
            }

            "B" -> if (ListB > 0) {
                ListB -=1
                show("Joy egallandi!")
            } else {
                show("B parkovka bo'sh")
            }

            "C" -> if (ListC > 0) {
                ListC -=1
                show("Joy egallandi!")
            } else {
                show("C parkovka bo'sh!")
            }
        }
    }



    fun showUser(){
        if (ListA>0){
            show("A qatordagi mashinalar soni: " + ListA)


        }
        else {
            show("A qatorda mashina yoq")
        }

        if (ListB>0){
            show("B qatordagi mashinalar soni: " + ListB)

        }
        else {
            show("B qatorda mashina yoq")
        }
        if (ListC>0){
            show("C qatordagi mashinalar soni: " + ListC)

        }

        else {
            show("C qatorda mashina yoq")
        }
    }
}

fun show(m: String) {

    println(m)

}

class UserController {

    var carModel = CarModel()

    var scanner = Scanner(System.`in`)

    fun onCreate() {

        while (true) {
            var menuItem = scanner.next()
            when (menuItem) {

                "1" -> {
                    println("Parkovka nomini kiritng").toString()

                    carModel.addCar(scanner.next())

                }
                "2" -> {

                    println("Moshinani olmoqchi bo'lgan parkovka nomini kiriting: ")
                    carModel.removeCar(scanner.next())
                }
                "3" -> {

                    println("Mashina Royxati ")

                    carModel.showUser()



                }

                "4" ->{
                    exitProcess(0)

                }

            }
        }

    }

}
