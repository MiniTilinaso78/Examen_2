public class Empleado {

        public String nombre;
        public String departamento;
        public double salarioBase;
        public double[] ultimosBonos;

        public Empleado(String nombre, String departamento, double salarioBase, double[] ultimosBonos) {
            this.nombre = nombre;
            this.departamento = departamento;
            this.salarioBase = salarioBase;
            this.ultimosBonos = ultimosBonos;
        }

        public Empleado(String nombre, double salarioBase) {
            this.nombre = nombre;
            this.departamento = "General";
            this.salarioBase = salarioBase;
            this.ultimosBonos = new double[0];
        }

        public Empleado(String nombre) {
            this.nombre = nombre;
            this.departamento = "General";
            this.salarioBase = 1400.0;
            this.ultimosBonos = new double[0];
        }

    }
