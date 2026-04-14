
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UseCase15TrainConsistMgmtTest {

    // ---- TEST 1: Safe Assignment ----
    @Test
    void testCargo_SafeAssignment() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.cargo);
    }

    // ---- TEST 2: Unsafe Assignment Handled ----
    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        // Should NOT throw exception outside (handled internally)
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }

    // ---- TEST 3: Cargo Not Assigned After Failure ----
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.cargo); // cargo should not be assigned
    }

    // ---- TEST 4: Program Continues After Exception ----
    @Test
    void testCargo_ProgramContinuesAfterException() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie1 =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        UseCase15TrainConsistMgmt.GoodsBogie bogie2 =
                new UseCase15TrainConsistMgmt.GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum"); // unsafe
        bogie2.assignCargo("Petroleum"); // safe

        assertEquals("Petroleum", bogie2.cargo);
    }

    // ---- TEST 5: Finally Block Execution ----
    @Test
    void testCargo_FinallyBlockExecution() {
        UseCase15TrainConsistMgmt.GoodsBogie bogie =
                new UseCase15TrainConsistMgmt.GoodsBogie("Rectangular");

        // Since finally always runs, we just ensure no crash
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}