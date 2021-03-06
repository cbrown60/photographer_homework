import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalcamera;
  AnalogueCamera analoguecamera;



  @Before 
  public void before(){
    photographer = new Photographer("James");
    digitalcamera = new DigitalCamera("Nikon 300");
    analoguecamera = new AnalogueCamera("Nikon f90");

  }

  @Test 
  public void hasName(){
    assertEquals("James", photographer.getName());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(digitalcamera);
    assertEquals(1,photographer.cameraCount());
  }

  @Test 
  public void canRemoveCamera(){
    photographer.minusCamera(digitalcamera);
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrintCamera(){
    assertEquals("Nikon f90",analoguecamera.printDetails());
  }



 @Test 
 public void canPrintCatalogue(){
  photographer.addCamera(digitalcamera);
  photographer.addCamera(analoguecamera);
  assertEquals("Nikon 300, Nikon f90", photographer.printCatalogue());
 }

}