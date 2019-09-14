public class Datos {
    String nombre;
    String Codigo;
    String CodMateria;
    String Semestre;
    String grupo;
    String espacio1;
    String espacio2;
    String descripcionEvaluacion;
    String porcentaje;
    String descripcion;
    String NomMateria;
    String espacio3;
    String Nota;
    String NotaDefinitiva;

    public Datos(String nombre, String codigo, String codMateria, String semestre, String grupo, String espacio1, String espacio2, String descripcionEvaluacion, String porcentaje, String descripcion, String nomMateria, String espacio3,String nota, String notaDefinitiva) {
        this.nombre = nombre;
        Codigo = codigo;
        CodMateria = codMateria;
        Semestre = semestre;
        this.grupo = grupo;
        this.descripcionEvaluacion = descripcionEvaluacion;
        this.porcentaje = porcentaje;
        this.descripcion = descripcion;
        NomMateria = nomMateria;
        Nota = nota;
        NotaDefinitiva = notaDefinitiva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getCodMateria() {
        return CodMateria;
    }

    public void setCodMateria(String codMateria) {
        CodMateria = codMateria;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDescripcionEvaluacion() {
        return descripcionEvaluacion;
    }

    public void setDescripcionEvaluacion(String descripcionEvaluacion) {
        this.descripcionEvaluacion = descripcionEvaluacion;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNomMateria() {
        return NomMateria;
    }

    public void setNomMateria(String nomMateria) {
        NomMateria = nomMateria;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String nota) {
        Nota = nota;
    }

    public String getNotaDefinitiva() {
        return NotaDefinitiva;
    }

    public void setNotaDefinitiva(String notaDefinitiva) {
        NotaDefinitiva = notaDefinitiva;
    }
}
