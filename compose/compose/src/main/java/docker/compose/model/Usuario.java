package docker.compose.model;

import java.util.Objects;

public class Usuario {

    private String name;
    private double PR;

    public Usuario(String name, double PR) {
        this.name = name;
        this.PR = PR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPR() {
        return PR;
    }

    public void setPR(double PR) {
        this.PR = PR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Double.compare(usuario.PR, PR) == 0 && Objects.equals(name, usuario.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, PR);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", PR=" + PR +
                '}';
    }
}
