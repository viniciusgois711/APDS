module apds_01 {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens View to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	opens Produtos to javafx.graphics, javafx.fxml, javafx.base;

	
	
}
