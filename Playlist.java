import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
  ArrayList <String> desertIslandPlaylist = new ArrayList<String>();

  desertIslandPlaylist.add("Can't Help Myself");
  desertIslandPlaylist.add("Craving You");
  desertIslandPlaylist.add("Look What You Made Me Do");
  desertIslandPlaylist.add("Daft Pretty Boys");
  desertIslandPlaylist.add("Don't Let Me Go");
  desertIslandPlaylist.add("22");
  System.out.println(desertIslandPlaylist);

 // System.out.println(desertIslandPlaylist.size());

  //desertIslandPlaylist.remove(2);
  //System.out.println(desertIslandPlaylist.size());
 

  int indexA = desertIslandPlaylist.index("Don't Let Me Go");
  int indexB = desertIslandPlaylist.indexOf("Daft Pretty Boys");
  String tempA = a;
  desertIslandPlaylist.set(indexB, "Don't Let Me Go");
  desertIslandPlaylist.set(indexB, tempA);
  System.out.println(desertIslandPlaylist);
  }
  
}