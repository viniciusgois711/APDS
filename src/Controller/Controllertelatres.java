package Controller;



import java.net.URL;
import java.util.ResourceBundle;
import View.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

public class Controllertelatres implements Initializable{

    @FXML
    private Button botao;
    
    @FXML
    private Button botaovolta;
    
    @FXML
    private Button botaoatualiza;
    
    @FXML
    private TextField fildcliente;

    @FXML
    private TextField fildtotal;
    
    @FXML
    private TextField fildcpf;

    @FXML
    private TextField fildnome;
    
    @FXML
    private ImageView loading;

    @FXML
    private Rectangle retangulo;
    
    @FXML
    private Label cry;
    
    @FXML
    private Label nome;

    @FXML
    private Label nomepessoa;
    
    @FXML
    private Label cpf;

    @FXML
    private Label cpfpessoa;

    @FXML
    private Label textcliente;

    @FXML
    private Label texttotal;

    @FXML
    private Label texttroco;

    @FXML
    private Label valorcliente;

    @FXML
    private Label valortotal;

    @FXML
    private Label valortroco;
    
    @FXML
    void back(ActionEvent event) {
    	
    	Main.mudartela(2);

    }

    @FXML
    void confrm(ActionEvent event) throws Exception{
    	
    	if (this.erro()) {
    		
    		this.alterandovalor();
        	this.visible();
        	this.alerta();
    	} else {
    		
    		Alert a = new Alert(Alert.AlertType.ERROR);
    		a.setTitle("Erro!");
    		a.setHeaderText("Você não preencheu todos os campos obrigatórios.");
    		a.showAndWait();
    	}
    	
    
    }
    
    void alterandovalor() {
    	
    	valorcliente.setText(fildcliente.getText()); //muda label cliente
    	valortotal.setText(Controllerteladois.getEnd()); //muda a label valor total
    	fildtotal.setText(Controllerteladois.getEnd()); //muda aquela segunda caixa de texto
    	valortroco.setText(Double.toString(this.troco())); // muda o valor do troco 
    	nomepessoa.setText(fildnome.getText()); //muda o nome na nota fiscal
    	cpfpessoa.setText(fildcpf.getText()); // muda o cpf na nota fiscal
    	
    }
    
    void visible() {
    	
    	retangulo.setVisible(true);
    	textcliente.setVisible(true);
    	texttotal.setVisible(true);
    	texttroco.setVisible(true);
    	valorcliente.setVisible(true);
    	valortotal.setVisible(true);
    	valortroco.setVisible(true);
    	nome.setVisible(true);
    	cpf.setVisible(true);
    	nomepessoa.setVisible(true);
    	cpfpessoa.setVisible(true);
    	cry.setVisible(true);
    	
    }
    
    void alerta() {
    	
    	Alert a = new Alert(Alert.AlertType.INFORMATION);
		a.setTitle("Concluido!");
		a.setHeaderText("Sua compra foi realizada!");
		a.showAndWait();
    }
    
    private double troco() {
    	
    	double vtotal = Double.parseDouble(Controllerteladois.getEnd());
    	double vcliente = Double.parseDouble(fildcliente.getText());
    	double troco = vcliente - vtotal;
    	return troco;
    	
    }
    
    @FXML
    void mouse(MouseEvent event) throws Exception {
    	
    	fildtotal.setText(Controllerteladois.getEnd()); //muda aquela segunda caixa de texto
    	valortotal.setText(Controllerteladois.getEnd()); //muda a label valor total
    	
    	
    }
    
    boolean erro () {
    	if (fildcliente.getText().equals("") || nomepessoa.getText().equals("") || cpfpessoa.getText().equals("")) {
    		
    		return false;
    	} else {
    		return true;
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		valortotal.setText(Controllerteladois.getEnd()); //muda a label valor total
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
}