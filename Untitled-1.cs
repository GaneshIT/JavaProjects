

Dictionary<string,int> namesDict=new Dictionary<string,int>();

string input="My name is ganesh";

string[] namesArr=input.ToCharArray();

foreach(var str in namesArr){
    var countChar= namesArr.Where(obj=>obj==str).Count();
    namesDict.Add(str,countChar);
}
return namesDict;




output-Dictionary<string,int>

result = G,1


namesDict.Add("GaneshG",101);
namesDict.Add("RajG",102);
namesDict.Add("GaGG",103);
namesDict.Add("Test",104);





