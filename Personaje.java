    public class Personaje {
        String nombre;
        String raza;
        Integer ki;
        Integer ataque;
        String planeta;

        public Personaje(String nombre,String raza, Integer ki, Integer ataque, String planeta) {
            this.nombre=nombre;
            this.raza=raza;
            this.ki=ki;
            this.ataque=ataque;
            this.planeta=planeta;
        }
        public String getNombre(){
            return nombre;
        }
        public String getRaza(){
            return raza;
        }

        public Integer getki(){
            return ki;
        }
        public void setKi(Integer kiNuevo){
            if (kiNuevo>1000) {
                ki=1000;
            }else if (kiNuevo<0) {
                ki=0;
            }else{
                ki=kiNuevo;
            }
        }

        public Integer getAtaque(){
            return ataque;
        }
        public String getPlaneta(){
            return planeta;
        }

        public void mostrarPersonaje(){
            System.out.println("El nombre es: "+nombre);
            System.out.println("La raza es: "+raza);
            System.out.println("El ki es: "+ki);
            System.out.println("El ataque es :"+ ataque);
            System.out.println("El planeta del que viene es :"+ planeta);
            System.out.println();
        }
        public void atacar(Personaje objetivo){
            objetivo.setKi(objetivo.getki()-ataque);
            System.out.println(nombre +" Ha atacado a "+ objetivo.getNombre() + "!! y su ki se ha reducido a "+ objetivo.getki());
        }
        public void curar(Personaje objetivo,Integer cura){
            objetivo.setKi(objetivo.getki()+cura);
            System.out.println(nombre +" Ha curado a "+ objetivo.getNombre() + "!! y su ki se ha recuperado en "+cura+" y su Ki quedó en "+ objetivo.getki());
        }
    public static void main(String[] args) {
        Personaje goku = new Personaje("Goku", "Saiyajin", 1000, 300, "Vegueta");
        Personaje vegueta = new Personaje("Vegueta", "Saiyajin", 1000, 400, "Vegueta");
        Personaje krillin = new Personaje("Krillin", "Humano", 1000, 150, "Tierra");
        goku.mostrarPersonaje();
        vegueta.mostrarPersonaje();
        goku.atacar(vegueta);
        goku.atacar(vegueta);
        krillin.curar(vegueta, 800);
    }
    }