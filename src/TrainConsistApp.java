public class UseCase15TrainConsistMgmt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- Goods Bogie Model ----
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo! Rectangular bogie cannot carry petroleum."
                    );
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully: " + cargo);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Assignment attempt completed for bogie: " + shape);
            }
        }
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        // Safe case
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        bogie1.assignCargo("Petroleum");

        System.out.println();

        // Unsafe case
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");
        bogie2.assignCargo("Petroleum");

        System.out.println();

        // Another safe case (program continues)
        GoodsBogie bogie3 = new GoodsBogie("Rectangular");
        bogie3.assignCargo("Grain");
    }
}