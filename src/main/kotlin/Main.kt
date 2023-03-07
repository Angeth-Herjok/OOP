import java.util.Arrays

fun main() {
     val toyo=Car("Toyota","Prado","KDG 112B",0)
    var audi =Car("Audi","A4","KCT 300F",0)
    audi.start()
    println(audi.speed)
    audi.accelarate(acceleration = 60)
    println(audi.speed)
    audi.accelarate(acceleration = 35)
    println(audi.speed)
    audi.decelerate(deceleration = 50)
    println(audi.speed)
    audi.hoot()
    audi.stop()
    println(audi.speed)

    val myBook=Book("Born a crime","Trevor Noah",288,2017)
    println(myBook.title)
    println(myBook.pages)

    val myAgestates=Agestates(20,6,20.9,10.6)
    println(myAgestates.max)
    println(myAgestates.median)

    var africans=Africa(54,1,"Africans")
    println(africans.people)
    println(africans.countries)
    array()
    substraction()
    product(8,9)
    var s=sum(8,10,45)
    println(s)
    var d=division(72,12,4)
    println(d)
    age()
    weight()
    sign()
    many(12,1)
    var z=sister(6,6)
    println(z)
    var g=getFullName("Angeth ","Ajak")
    println(g)
    var messages=message("Becky ","Mathew ")
    println(messages)
    cancate("John")
    fruit()
    vegetable("Kales","Cabbages",9)
    africa("South Africa")
    people()
    names()
    kilograms()
    social()
    number()
    friends()
    cities()
    shoe()
    student()
}
class Car(var make:String,var model:String,var registration:String,var speed:Int){
    fun start(){
        println("truuuuuh,vrooom")
    }
    fun accelarate(acceleration:Int):Int{
        speed+=acceleration
        return speed
    }
    fun decelerate(deceleration: Int):Int{
        speed-=deceleration
        return speed
    }
    fun hoot(){
        println("beep beep")
    }
    fun stop(){
        speed-=speed
        speed=0
        println("hhhmhm")
    }
}

data class Book(var title:String,var author:String,var pages:Int,var year:Int)
data class Agestates(var max:Int,var min:Int,var mean:Double,var median:Double)

class Africa(var countries:Int,var number:Int,var people:String){

}
fun array(){
    var namesArray=arrayOf("Angeth","Aluel","Apiu","Atong")
    println(namesArray[0])
    println(namesArray[3])
    var name=namesArray.get(2)
    println(name)
    println(namesArray.get(1))
    namesArray.set(0,"Angeth")
    println(namesArray.get(1))
    println(namesArray.size)
    println(namesArray.max())
    println(namesArray.min())
    println(namesArray.count())
    var namesArray2 = namesArray.plus("Jane")
    println(namesArray2.contentToString())
    println(namesArray2)
}
//fun number(){
//    var numbersArray= arrayOf(9,3,4,1,5,2,6,7,8)l
//    println(numbersArray.sum())
//}

fun substraction(){
    var num1=5
    var num2=2
    var difference=num1-num2
    println(difference)
}
fun product(num3:Int,num4:Int){
    var product=num3*num4
    println(product)
}
fun sum(num5:Int,num6:Int,num7:Int):Int{
    var sum=num5+num6+num7
    return sum
}
fun division(num8:Int,num9:Int,num10:Int):Int{
    var result=num8/num9/num10
    return result
}
fun age(){
    var age=19
    age++
    println(age)
}
fun weight(){
    var weight=52
    weight--
    println(weight)
}
fun sign(){
    val a=56
    val b=12
    println(a<b)
}
fun many(c:Int,d:Int){
   var man= c>d
    println(man)
}
fun sister(e:Int,f:Int):Boolean{
 var girl=e==f
 return girl
}
fun getFullName(firstName:String,secondName:String):String{
  var fullName=firstName + "" + secondName
    return fullName
}
fun message(person:String,person2:String):String{
    var messages= person +"and " + person2 + "are friends"
    return messages
}
fun cancate(name:String){
    var them="My name is " + name
    println(them)
}
fun fruit(){
    var text="Pineapple"
    println(text[0])
    println(text.first())
    println(text.last())

    println(text.length)
    println(text.uppercase())
}
fun vegetable(veg:String,veget:String,vegetables:Int){
    println("$veg,$veget,$vegetables")
}
fun africa(country:String){
    var country1="USA"
    if (country==country1)
        println(true)
    else{
        println(false)
    }
}
fun people(){
    var text="Yar comes from South Austria but she is Sudanese."
    println(text.replace("South Austria","Kenya"))
}
fun names(){
    var word="Valo,Neme,Dese,Seko"
    var name=word.split(",")
    println(name[2])
    println(word.get(0))
}
fun kilograms(){
    var weight=60
    println("My weight is " +weight.toString())
}
fun social(){
    var socialArray= arrayOf("facebook","instagram","twitter","whatsap")
    println(socialArray.get(0))
    var socialArray1=socialArray.plus("Pinterest")
    println(socialArray1.contentToString())
    println(socialArray1)

}
fun number(){
    var numberArray= arrayOf(21,32,54,67,98,12,90)
    var numberArray2=numberArray.plus(34)
    println(numberArray2.contentToString())
    println(numberArray2)
    println(numberArray2[7])
    println(numberArray2.sum())
    println(numberArray.sum())
    println(numberArray2[5])
    var sortedNumber=numberArray.sortedArray()
    println(Arrays.toString(sortedNumber))
}
fun friends(){
    var friendsArray= arrayOf("Fiona","Juma","Becca","Jima")
    var sortedFriends=friendsArray.sortedArray()
    println(Arrays.toString(sortedFriends))
    for (friend in friendsArray)
        println(friend)

}
fun cities(){
    var citiesArray= arrayOf("Nairobi","Kampala","Juba","Dodoma")
    var sortedCities=citiesArray.sortedArray()
    println(Arrays.toString(sortedCities))
    for (city in citiesArray)
        println(city)
}
fun shoe(){
    var shoesArray= arrayOf(32,45,65,98,9,32)
    var sortedShoes=shoesArray.sortedArray()
    println(Arrays.toString(sortedShoes))
}
fun student(){
    var studentsArray= arrayOf("Miriam","Yeke","Bree","Maureen","Cynthia")
    var sortedArrays=studentsArray.sortedArray()
    println(Arrays.toString(sortedArrays))
    println(studentsArray.size)

}





