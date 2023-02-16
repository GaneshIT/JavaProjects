Interface IProduct{

Void Display();
}

Interface IProduc2t{

Void Display();
}


Class myclass:IProduct,IProduct2{

Public void IProduct.Display(){
}
Public void IProduct2.Display(){
}

}

Myclass obj=new myclass();
obj.Display();



Input

c=>apple
h=>jackle
b=>act
a=>ball
.
.
------------------
Output
c=>cat
h=>hen
b>ball
a

foreach(var item in dictInput){

//dictInput[item.key]=dictInput.ContainsValue(item.key);

foreach(var a in dictinput){
if(a.Value.StartsWith(item.Key)
dictInput[item.key]=a.Value;
}

}




WAP to allow only 5 instance of a class, more than that -> “No more objects allowed”




Class myclass{
Public static List<object> objLIst=new List<object>();

myclass(){
if(objList.Count>5){
console.WriteLine(“Cannot create object more than 5…”);
objList.Remove(objList.Count-1);
}
}


main(){
Myclass obj=new Myclass();
myclass.Add(obj)
}
