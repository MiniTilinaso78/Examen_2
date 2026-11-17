public class Empleado {

        private String nombre;
        private String departamento;
        private double salarioBase;
        private double[] ultimosBonos;
        private static  double SALARIO_MINIMO = 1400.0;
        private static String DEPARTAMENTO = "General";

        public Empleado(String nombre, String departamento, double salarioBase, double[] ultimosBonos) {
            if (nombre.isBlank()){
                throw new IllegalArgumentException("NO se puede dejar el nombre en blanco");
            }else {
                this.nombre = nombre;
            }
            if (salarioBase<=SALARIO_MINIMO){
                throw new IllegalArgumentException("El salario no puede ser menor a 1400");
            }else{
                this.salarioBase = salarioBase;
            }

            this.departamento = departamento;

            this.ultimosBonos = ultimosBonos.clone();
        }

        public Empleado(String nombre, double salarioBase) {
            this(nombre,DEPARTAMENTO, salarioBase,new double[0]);
        }

        public Empleado(String nombre) {
            this(nombre, SALARIO_MINIMO);

        }
        public double[] getultimosBonos(){
            return this.ultimosBonos.clone();
        }
        public void aplicarAUmento(double porcentaje){
            if (porcentaje<1 || porcentaje>50){
                System.out.println("Porcentaje fuera del rango");
            }else{
                this.salarioBase=this.salarioBase*(porcentaje/100);
            }
        }

    }
