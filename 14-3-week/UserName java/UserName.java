import java.util.*;
public class UserName
{
// The list of possible user names, based on a user's first and last names and initialized by theconstructor.
private ArrayList<String> possibleNames = new ArrayList<String>();
/** Constructs a UserName object as described in part (a).
* Precondition: firstName and lastName have length greater than 0
* and contain only uppercase and lowercase letters.
*/
public UserName(String firstName, String lastName)
{ /* to be implemented in part (a) */

 }


/** Returns true if arr contains name, and false otherwise. */
public boolean isUsed(String name)
{
  for (String item : possibleNames){
    if (item.equals(name)){
      return true;
    }

  }
  return false;
}
public ArrayList<String> getNames(){
  return possibleNames;
}
/** Removes strings from possibleNames that are found in usedNames as described in part (b).
*/
public void setAvailableUserNames(String[] usedNames)
{ /* to be implemented in part (b) */ }
}
