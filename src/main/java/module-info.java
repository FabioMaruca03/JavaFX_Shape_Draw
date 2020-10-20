module JavaFX.Shape.Draw {
    requires javafx.controls;
    requires javafx.graphics;

    opens com.marufeb.fiverr to javafx.controls, javafx.graphics;

    exports com.marufeb.fiverr;
}