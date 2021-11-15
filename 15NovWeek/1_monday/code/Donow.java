
String str = new String("Good day!");
//Return substring from index 0 through index 2
String firstWord = str.substring(0, 3);
System.out.println(firstWord);

public int numUpperCase(String string)
{
 int counter = 0;
 for(int i = 0; i < string.length(); i++)
 {
     char character = string.charAt(i);
     if(isUpperCase(character))
     {
counter++; }
}
 return counter;
}

String str = "CodeHS";

System.out.println(numUpperCase(str));

public String replace(String string, String remove, String add)
{
    String newString = “”;
    for(int i = 0; i < string.length(); i++)
    {
        String character = string.substring(i, i+1);
        if(character.equals(remove))
        {
            newString += add;
        }
else {
            newString += character;
        }
}
    return newString;
}
String original = "piper";
String alteredString = replace(original, “p”, “st”);
System.out.println(alteredString);
