package Data;

import xmlProjectDomain.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class XMLPersonManager {

    //variables
    private final Document document;
    public Element root;
    private final String path;

    public XMLPersonManager(String path) throws JDOMException, IOException {
        this.path = path;

        File filePerson = new File(path);
        if (filePerson.exists()) {
            //1. El archivo ya existe, entonces lo cargo en memoria

            //toma la estructura de datos y las carga en memoria
            SAXBuilder saxBuilder = new SAXBuilder();
            saxBuilder.setIgnoringElementContentWhitespace(true);

            //cargar en memoria
            this.document = saxBuilder.build(this.path);
            this.root = this.document.getRootElement();
            
        } else {
            //2. El archivo no existe, lo creo y lo guardo

            //creamos el elemento raiz
            this.root = new Element("Persons");

            //creamos el documento
            this.document = new Document(this.root);

            //guardar el archivo
            storeXML();

            //guardar el archivo en disco duro
        }//end method 
    }//fin m'etodo

    private void storeXML() throws FileNotFoundException, IOException {
        XMLOutputter xMLOutputter = new XMLOutputter();
        xMLOutputter.output(this.document, new PrintWriter(this.path));
    }//fin m'etodo

    //insertar un estudiante nuevo
    public void insertPerson(Person person) throws IOException {
        //debemos crear elemento respecto la persona.
        Element pPerson = new Element("Person");
        pPerson.setAttribute("id", person.getId());
        

        //nombre
        Element pName = new Element("name");
        pName.addContent(person.getName());

        //Apellido
        Element pLastName1 = new Element("lastName1");
        pLastName1.addContent(String.valueOf(person.getLastName1()));
        
        //Apellido2
        Element pLastName2 = new Element("lastName2");
        pLastName2.addContent(String.valueOf(person.getLastName2()));
        
        //Fecha de nacimiento
        Element pBirthdate = new Element("birthdate");
        pBirthdate.addContent(String.valueOf(person.getBirthdate()));
        
        //Pa'is
        Element pcountry = new Element("country");
        pcountry.addContent(String.valueOf(person.getCountry()));
        
        //Apellido
        Element pIdDad = new Element("idDad");
        pIdDad.addContent(String.valueOf(person.getIdDad()));
               
        //agregar al elemento persona el sus atributos
        pPerson.addContent(pName);
        pPerson.addContent(pLastName1);
        pPerson.addContent(pLastName2);
        pPerson.addContent(pBirthdate);
        pPerson.addContent(pcountry);
        pPerson.addContent(pIdDad);


        //agregarmos al root
        if (searchPerson(root, person.getIdDad())) {
            getPerson(root, person.getIdDad()).addContent(pPerson);
        }else{
            this.root.addContent(pPerson);
        }
        
        
               
        //guardar al disco
        storeXML();
    }//fin m'etodo
    
    public Element getPerson(Element element, String desiredId) {
        if (desiredId.equals(element.getAttributeValue("id"))) {
            return element;
        }
        for (int i = 0; i < element.getChildren().size(); i++) {
            Object node = (Element) element.getChildren().get(i);
            if (node instanceof Element) {
                Element child = getPerson((Element) node, desiredId);
                if (child != null) {
                    return child;
                }
            }
        }
        return null;
    }
        
    
    public boolean searchPerson(Element element, String desiredId) {
        
        if (desiredId.equals(element.getAttributeValue("id"))) {
            return true;
        }
        for (int i = 0; i < element.getChildren().size(); i++) {
            Object node = (Element) element.getChildren().get(i);
            if (node instanceof Element) {
                Element child = getPerson((Element) node, desiredId);
                if (child != null) {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public void removePerson(Element element, String desiredId) throws IOException{
        
        if (desiredId.equals(element.getAttributeValue("id"))) {
            element.getParentElement().removeContent(element);
            storeXML();
        }
        for (int i = 0; i < element.getChildren().size(); i++) {
            Object node = (Element) element.getChildren().get(i);
            if (node instanceof Element) {
                Element child = getPerson((Element) node, desiredId);
                if (child != null) {
                    child.getParentElement().removeContent(child);
                    storeXML();
                }
            }
        }
    }
    
   public void progenyList(Element element, ArrayList<Person> list) throws IOException {

       final List nodeChildrenList = element.getChildren();

       for (int i = 0; i < nodeChildrenList.size(); i++) {
           final Element currentElement = (Element) nodeChildrenList.get(i);
           if (currentElement instanceof Element) {
               if (currentElement.getAttributeValue("id") != null) {

                   //Crear persona
                   Person currentPerson = new Person();
                   
                   //Atributos
                   currentPerson.setId(currentElement.getAttributeValue("id"));
                   currentPerson.setName(currentElement.getChild("name").getValue());
                   currentPerson.setLastName1(currentElement.getChild("lastName1").getValue());
                   currentPerson.setLastName2(currentElement.getChild("lastName2").getValue());
                   currentPerson.setBirthdate(currentElement.getChild("birthdate").getValue());
                   currentPerson.setCountry(currentElement.getChild("country").getValue());
                   currentPerson.setIdDad(currentElement.getChild("idDad").getValue());

                   list.add(currentPerson);
                   progenyList((Element) currentElement, list);
               }
               //getList((Element) currentElement, list);
           }
       }
       
    }
   
   public void getAllPersons(Element element, ArrayList<Person> list) throws IOException {

       final List nodeChildrenList = element.getChildren();

       for (int i = 0; i < nodeChildrenList.size(); i++) {
           final Element currentElement = (Element) nodeChildrenList.get(i);
           if (currentElement instanceof Element) {
               if (currentElement.getAttributeValue("id") != null) {

                   //Crear persona
                   Person currentPerson = new Person();
                   
                   //Atributos
                   currentPerson.setId(currentElement.getAttributeValue("id"));
                   currentPerson.setName(currentElement.getChild("name").getValue());
                   currentPerson.setLastName1(currentElement.getChild("lastName1").getValue());
                   currentPerson.setLastName2(currentElement.getChild("lastName2").getValue());
                   currentPerson.setBirthdate(currentElement.getChild("birthdate").getValue());
                   currentPerson.setCountry(currentElement.getChild("country").getValue());
                   currentPerson.setIdDad(currentElement.getChild("idDad").getValue());

                   list.add(currentPerson);
               }
               getAllPersons((Element) currentElement, list);
           }
       }
       
    }   
   
    public void getDecendents(Element element, ArrayList<Person> list, String desiredId) throws IOException {
        
        if (desiredId.equals(element.getAttributeValue("id"))) {
            progenyList(element, list);
        }
        for (int i = 0; i < element.getChildren().size(); i++) {
            Object node = (Element) element.getChildren().get(i);
            if (node instanceof Element) {
                Element child = getPerson((Element) node, desiredId);
                if (child != null) {
                    progenyList(child, list);
                }
            }
        }
        
    }
      
 

}//fin class