import java.util.*;

public class Photographer{

 private String name;
 private ArrayList<Camera>catalogue; 

 public Photographer(String name){
  this.name = name;
  this.catalogue = new ArrayList<Camera>();
 }

 public String getName(){
  return this.name;
 }

 public void addCamera(Camera model){
  catalogue.add(model);
 }

 public int cameraCount(){
  return catalogue.size();
 }

 public void minusCamera(Camera model){
   catalogue.remove(model);
 }

 

 public String printCatalogue(){
  
 }





}

