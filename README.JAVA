# FB  
public static String stringReverse(String string) {
  String reversed = "";
  for(int i = string.length() - 1; i >= 0; i--) {
    reversed += string.charAt(i);
  }
  return reversed;
}
