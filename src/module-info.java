module javafxproject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens gui to javafx.fxml;
	opens model.entities to javafx.base;
	opens application to javafx.graphics, javafx.fxml;
}
