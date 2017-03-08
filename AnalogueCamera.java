class AnalogueCamera implements Camera{

  private String printDetails;

  public AnalogueCamera(String value){
    this.printDetails = value;
  }

  public String printDetails(){
    return this.printDetails;
  }
  
}