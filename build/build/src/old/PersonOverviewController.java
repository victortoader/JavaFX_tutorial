//package old;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import ch.makery.address.MainApp;
//import ch.makery.address.model.Person;
//import ch.makery.address.util.DateUtil;
//
//public class PersonOverviewController {
//	@FXML
//	private TableView<Person> personTable;
//	@FXML
//	private TableColumn<Person, String> firstNameColumn;
//	@FXML
//	private TableColumn<Person, String> lastNameColumn;
//
//	@FXML
//	private Label firstNameLabel;
//	@FXML
//	private Label lastNameLabel;
//	@FXML
//	private Label streetLabel;
//	@FXML
//	private Label postalCodeLabel;
//	@FXML
//	private Label cityLabel;
//	@FXML
//	private Label birthdayLabel;
//
//	// Reference to the main application.
//	private MainApp mainApp;
//
//	/**
//	 * The constructor. The constructor is called before the initialize()
//	 * method.
//	 */
//
//	@FXML
//	private void initialize() {
//		// Initialize the person table with the two columns.
//		firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
//		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
//
//		showPersonDetails(null);
//
//		personTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showPersonDetails(newValue));
//	}
//
//	/**
//	 * Is called by the main application to give a reference back to itself.
//	 *
//	 * @param mainApp
//	 */
//	public void setMainApp(MainApp mainApp) {
//		this.mainApp = mainApp;
//
//		// Add observable list data to the table
//		personTable.setItems(mainApp.getPersonData());
//	}
//
//	public PersonOverviewController() {
//	}
//
//	/**
//	 * Initializes the controller class. This method is automatically called
//	 * after the fxml file has been loaded.
//	 */
//
//	private void showPersonDetails(Person person)
//
//	{
//		if (person != null)
//
//		{
//			firstNameLabel.setText(person.getFirstName());
//			lastNameLabel.setText(person.getLastName());
//			streetLabel.setText(person.getStreet());
//			postalCodeLabel.setText(Integer.toString(person.getPostalCode()));
//			cityLabel.setText(person.getCity());
//			birthdayLabel.setText(DateUtil.format(person.getBirthday()));
//
//		} else
//
//		{
//			firstNameLabel.setText("");
//			lastNameLabel.setText("");
//			streetLabel.setText("");
//			postalCodeLabel.setText("");
//			cityLabel.setText("");
//			birthdayLabel.setText("");
//
//		}
//
//	}
//
//
//}