package proyectofinal;

public class Vuelo {
    // Atributos (lo que el vuelo "sabe")
    private int idVuelo;
    private String numeroVuelo;
    private String origen;
    private String destino;
    private String fecha;
    private String hora;
    private double precio;

    // Constructor: Sirve para crear el objeto con datos de una vez
    public Vuelo(int idVuelo, String numeroVuelo, String origen, String destino, String fecha, String hora, double precio) {
        this.idVuelo = idVuelo;
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
    }

    // Getters: Son NECESARIOS para que otras clases (como PaginaPrincipalUsuario) 
    // puedan leer estos datos y usarlos en las etiquetas (Labels) o en el SQL.
    public int getIdVuelo() { return idVuelo; }
    public String getNumeroVuelo() { return numeroVuelo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public double getPrecio() { return precio; }
}
