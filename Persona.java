class Persona{
  protected String nombre;
  protected int edad;

  public String getNombre(){
    return this.nombre;
  }

  public int getEdad(){
    return this.edad;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setEdad(int edad){
    this.edad = edad;
  }
}

class Abuelo extends Persona{
  Abuelo(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }
}

class Main{
  public static void main(String arg[]){
    Abuelo p1 = new Abuelo("nicolas", 16);
    System.out.print("esta persona se llama: " + p1.getNombre() + "\n");
  }
}