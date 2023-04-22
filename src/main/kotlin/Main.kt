fun main(){
    //1
   var cars=Cars("toyota", "corolla",6)
    println(cars.make)
    cars.drive()

    var trucks=Trucks("nissan","nissan",3000)
    trucks.carry()

    var motorcycles=Motorcycles("TVS","Honda",2)
    motorcycles.speed()

//2
    var circles=Circle(0,0,4.0)
    circles.area(6.0)

    circles.perimeter(7.0)

    var rectangles=Rectangles(4, 4, 8.5, 3.1)
    rectangles.area(8.1, 3.2)

    rectangles.perimeter(4.6, 6.6)

    var triangles=Triangles(3, 3, 4.4, 7.3)
    triangles.area(4.4, 7.3)

    triangles.perimetre(4.4, 7.3,)

//3
    var checking=Checking("Chep", 21, 2435.89, 34.0)
    checking.check()

    var savings=Savings("Chep", 21, 2435.89)
    savings.save()

//4
    var cats=Cats(5, "black", "meowing")
    cats.sound1("meowing")

    var dogs=Dogs(12, "red", "barking")
    dogs.sound2("barking")

    var birds=Birds(1, "blue", "chirping")
    birds.sound3("chirping")


}

// 1. Create a class hierarchy in Kotlin that includes a base class for vehicles,
//and subclasses for cars, trucks, and motorcycles. Each subclass should have
//a unique property, such as number of doors for cars, payload capacity for
    //trucks, and number of wheels for motorcycles.

open class Vehicles(var make: String, var model: String,) {
}
    class Cars(make: String, model: String, var numberOfDoors:Int): Vehicles(make, model){
        fun drive (){
            println("I can only drive with $numberOfDoors doors")
        }
    }
    class Trucks( make: String, model: String, var payLoadCapacity: Int): Vehicles(make, model){
        fun carry(){
            println("my truck can carry a load of upto $payLoadCapacity tones")
        }
    }
    class Motorcycles(make: String, model: String, var numberOfWheels: Int): Vehicles(model, make){
        fun speed(){
            println("Motocycles has only $numberOfWheels wheels")
        }
    }



// 2. Implement a base class in Kotlin for a simple shape hierarchy that includes subclasses
//for circles, rectangles, and triangles. Each subclass should have properties for the
//shape's dimensions (e.g., radius for circles, width and height for rectangles, and
//base and height for triangles), as well as methods for calculating the shape's area
//and perimeter.

 open class Shape(var edges: Int, var vertices: Int){
}
class Circle(edges: Int, vertices: Int, var radius: Double): Shape(edges, vertices){
    fun area(r:Double){
        var areas=Math.PI*(r*r)
        println(areas)

    }
    fun perimeter(r:Double){
        var perimeter=(Math.PI*r)*2
        println(perimeter)
    }

}
class Rectangles(edges: Int, vertices: Int, var width: Double, var height: Double): Shape(edges, vertices){
    fun area(w: Double, h: Double){
        var area1=(h*w)
        println(area1)
    }

    fun perimeter(w: Double, h: Double){
        var perimeter1=(w*h)*2
        println(perimeter1)
    }
}
class Triangles(edges: Int, vertices: Int, var base: Double, var height: Double): Shape(edges, vertices){
    fun area(b :Double, h: Double){
        var area2=(b*h)/2
        println(area2)
    }
    fun perimetre(b: Double, h: Double){
        var perimetre2=(h*2+b)
        println(perimetre2)
    }
}


// 3. Create a class hierarchy in Kotlin for a banking application that includes a base
//class for bank accounts, and subclasses for checking and savings accounts. Each
//account should have a balance and methods for depositing and withdrawing money.
//The checking account subclass should also have a property for the account's
//overdraft limit.

open class BankAccounts(name: String, age: Int){

}
class Checking(name: String, age: Int,var balance: Double, var overdraft: Double): BankAccounts(name,age){
    fun check(){
        println("I have a balance of $balance in my bank account")
    }
}
class Savings(name: String, age: Int, var balance: Double): BankAccounts(name,age){
    fun save(){
        println("My account number is in my card")
    }
}


// 4. Implement a base class in Kotlin for a simple animal hierarchy that includes subclasses
//for cats, dogs, and birds. Each subclass should have properties for the animal's name,
//age, and color, as well as methods for making sounds (e.g., meowing for cats, barking
//for dogs, and chirping for birds).

open class Animal(age: Int, color: String){
}
class Cats(age: Int, color: String, var sound: String): Animal(age, color){
    fun sound1(sound: String){
        println("A cat produces a $sound sound")
    }
}
class Dogs(age: Int, color: String, var sound: String): Animal(age, color){
    fun sound2(sound: String){
        println("A dog produces a $sound sound")
    }
}
class Birds(age: Int, color: String, var sound: String): Animal(age, color){
    fun sound3(sound: String){
        println("A bird produces a $sound sound")
    }
}


//                                     TAKEAWAY KEYS

// 1. open: This keyword is used to mark a class or a member of a class as open,
// which means that it can be inherited or overridden by subclasses.
//
// 2. override: This keyword is used to mark a member of a subclass that is
// intended to override the same member in the superclass.
//
// 3. super: This keyword is used to refer to the superclass from within a subclass.
// It is typically used to call the superclass implementation of a method that
// has been overridden in the subclass.




