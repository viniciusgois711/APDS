package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import Produtos.Final;
import View.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class  Controllerteladois implements Initializable {

	public static String end;
	
	public static double total;
	
	public static double totaltrue;
	
	@FXML
	private Button ssdnvme;


    @FXML
    private Button ssdsata;


    @FXML
    private Button hd2tb;

	@FXML
	private Button hd1tb;
	
    @FXML
    private Button procescorei5;


    @FXML
    private Button procescorei3;


    @FXML
    private Button procescore2;

	
	@FXML
    private Button placavideo;

	
    @FXML
    private Button maelga1200;
	
	 @FXML
	private Button maelga1151;

	
	@FXML
    private Button maelga1155;
	
	 @FXML
	 private Button ramddr3;

    @FXML
    private Button ram8gbnote;
   
	@FXML
	private Button botaoremove;
	
	@FXML
    private Button botaoatualizar;

    @FXML
    private Button botaoavancar;

    @FXML
    private Button botaovoltar;

    @FXML
    private TableColumn<Final, Integer> id;

    @FXML
    private TableColumn<Final, String> nome;

    @FXML
    private Button ram4gbnote;


    @FXML
    private TableColumn<Final, Double> preco;
    
    @FXML
    private Label labeltotal;

    @FXML
    private Button ram0;

    @FXML
    private Button ram1;

    @FXML
    private TableView<Final> tabelaprodutos;
    
    private ObservableList<Final> list = FXCollections.observableArrayList();

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    	
		id.setCellValueFactory(new PropertyValueFactory<Final,Integer>("id"));
		preco.setCellValueFactory(new PropertyValueFactory<Final,Double>("valor"));
		nome.setCellValueFactory(new PropertyValueFactory<Final,String>("nomeproduto"));
		tabelaprodutos.setItems(list);
		
	}
    
    void adiciona(int id, String nome ,double valor) {
    	
    	Final f = new Final();
    	f.setId(id);
    	f.setNomeproduto(nome);
    	f.setValor(valor);
    	list.add(f);
    	f.sucesso();
    	
    	total = total + f.getValor();
    	Controllerteladois.this.refresh();
    	tabelaprodutos.refresh();
    }
    
    @FXML
    void refresh() {
  
    	end = Double.toString(total);
    	labeltotal.setText(end);

    }
    
    @FXML
    public void removendo() {
    	Final finalselect = tabelaprodutos.getSelectionModel().getSelectedItem();
    	if(finalselect != null) {
    	list.remove(finalselect);
    	total = total - finalselect.getValor();
    	Controllerteladois.this.refresh();
    	tabelaprodutos.refresh();
    	}
    }
    
    @FXML
    void remove(ActionEvent event) {
    	
    Controllerteladois.this.removendo();	

    }
    

    @FXML
    void ssdnvme(ActionEvent event) {

    Controllerteladois.this.adiciona(15, "SSD NVME 240GB ", 229);
    	
    }

    @FXML
    void addssdsata(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(14, "SSD SATA 240GB", 179);
    	
    }
    
    @FXML
    void addhd2tb(ActionEvent event) {

    Controllerteladois.this.adiciona(13, "HD 2TB",459 );
    	
    }
    
    @FXML
    void addhd1tb(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(12, "hd 1TB", 359.99);
    	
    }
    
    @FXML
    void addprocescorei5(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(11, "Processador I5",1349 );
    	
    }

    
    @FXML
    void addprocescorei3(ActionEvent event) {

    Controllerteladois.this.adiciona(10, "Processador I3",949 );
    	
    }
    
    @FXML
    void addprocescore2(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(9, "Processador core duo",298 );
    	
    }
    
    @FXML
    void addplacavideo(ActionEvent event) {

    Controllerteladois.this.adiciona(8, "Placa de video RTX3060",2998 );
    } 
    
    @FXML
    void addmaelga1200(ActionEvent event) {

    Controllerteladois.this.adiciona(7, "Placa mãe LGA1200",719 );
    	
    }
    
    @FXML
    void addmaelga1151(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(6, "Placa mãe LGA1151",549 );
    }
    
    @FXML
    void addmaelga1155(ActionEvent event) {
  
    Controllerteladois.this.adiciona(5, "Placa mãe LGA1155",379 );
    }
  
    @FXML
    void addramddr3(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(4, "RAM ddr3 4gb", 129 );
    	
    }
    
    
    @FXML
    void addram8gbnote(ActionEvent event) {

    Controllerteladois.this.adiciona(3, "RAM 8gb Notebook",229 );
    	
    }
   

    @FXML
    void addram4gbnote(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(2, "RAM 4gb Notebook",149 );
    	

    }

    @FXML
    void addram0(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(0, "RAM 4gb ddr4",179 );
    	

    }

    @FXML
    void addram1(ActionEvent event) {
    	
    Controllerteladois.this.adiciona(1, "RAM 8gb ddr4", 249 );

    }
    
 

    @FXML
    void avancar(ActionEvent event) {
    	
    Main.mudartela(3);
    
   
    

    }

    @FXML
    void voltar(ActionEvent event) {
    	
    Main.mudartela(1);

    }

	public static String getEnd() {
		return end;
	}

	public static void setEnd(String end) {
		Controllerteladois.end = end;
	}
  
}