
public class GenericTest:Class<A>
{
    public T GetHashCode<T>(T tObj){
        return tObj.GetHash();
    }
}

public class GenericTest{
    void GetData(){
        
    }
}
main(){
    GenericTest genericTestObj=new  GenericTest();
    genericTestObj.GetHashCode<Class1>(Class1Obj);
}

