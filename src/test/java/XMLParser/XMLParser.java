package XMLParser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.CTHdrFtrImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
	
	public static void main(String[] args) throws Exception {
		readXML();
	}

	public static void ReadXML(String Actual, String Expected) throws Exception{
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance()	;
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document= builder.parse(".//SeleniumPractice/SampleXML.xml");

		document.getDocumentElement().normalize();

		//Getting Food tags here
		NodeList Food = document.getElementsByTagName("food");

		//Traversing over individual food tags
		for(int i=0; i<Food.getLength();i++) {
			System.out.println("Food "+i);
			Node FoodNode=Food.item(i);

			if(FoodNode.getNodeType()==Node.ELEMENT_NODE) {
				//NodeList ChildsOfFood= FoodNode.getChildNodes();
				Element eElement = (Element) FoodNode;
				//System.out.println("   "+eElement.getTagName());

				NodeList childs=eElement.getChildNodes();
				for(int j=0; j<childs.getLength();j++) {
					Node child=childs.item(j);
					if(child.getNodeType()==Node.ELEMENT_NODE) {
						Element childElement= (Element) child;
						if(Actual.equalsIgnoreCase(childElement.getTextContent().trim()))
							ModifyXML(document, childElement,Expected);
						System.out.println("   "+childElement.getTagName()+" = "+  childElement.getTextContent().trim());
					}
				}
			}

			System.out.println("");
		}
	}
	
	
	
	public static void ModifyXML(Document document,Element element, String Expected) throws Exception {
		TransformerFactory transformerFactory=  TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		DOMSource source=new DOMSource(document);

		element.setTextContent("Biriyani");

		StreamResult streamResult = new StreamResult(new File(".//SeleniumPractice/SampleXML.xml"));
		transformer.transform(source, streamResult);

		StreamResult ConsoleResult = new StreamResult(System.out);
		transformer.transform(source, ConsoleResult);

	}
	

	public static void ReadXML() throws Exception {
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance()	;
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document= builder.parse(".//SeleniumPractice/SampleXML.xml");

		document.getDocumentElement().normalize();

		//Getting Food tags here
		NodeList Food = document.getElementsByTagName("food");

		//Traversing over individual food tags
		for(int i=0; i<Food.getLength();i++) {
			System.out.println("Food "+i);
			Node FoodNode=Food.item(i);

			if(FoodNode.getNodeType()==Node.ELEMENT_NODE) {
				//NodeList ChildsOfFood= FoodNode.getChildNodes();
				Element eElement = (Element) FoodNode;
				//System.out.println("   "+eElement.getTagName());

				NodeList childs=eElement.getChildNodes();
				for(int j=0; j<childs.getLength();j++) {
					Node child=childs.item(j);
					if(child.getNodeType()==Node.ELEMENT_NODE) {
						Element childElement= (Element) child;
						if("Belgian Waffles".equalsIgnoreCase(childElement.getTextContent().trim()))
							ModifyXML(document, childElement);
						System.out.println("   "+childElement.getTagName()+" = "+  childElement.getTextContent().trim());
					}
				}
			}

			System.out.println("");
		}
	}

	public static void ModifyXML(Document document,Element element) throws Exception {
		TransformerFactory transformerFactory=  TransformerFactory.newInstance();
		Transformer transformer=transformerFactory.newTransformer();
		DOMSource source=new DOMSource(document);

		element.setTextContent("Biriyani");

		StreamResult streamResult = new StreamResult(new File(".//SeleniumPractice/SampleXML.xml"));
		transformer.transform(source, streamResult);

		StreamResult ConsoleResult = new StreamResult(System.out);
		transformer.transform(source, ConsoleResult);

	}
	
	
	public static void readXML() throws Exception{
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		Document document=builder.parse(".//SeleniumPractice/SampleXML.xml");
		
		document.getDocumentElement().normalize();
		
		NodeList FoodNodeList = document.getElementsByTagName("food");
		
		for(int i=0;i<FoodNodeList.getLength();i++) {
			Node FoodNode=FoodNodeList.item(i);
			System.out.println("------------------\n"+(i+1)+"\n");
			if(FoodNode.getNodeType()==Node.ELEMENT_NODE) {
				NodeList FoodChildNodeList=FoodNode.getChildNodes();
				for(int j=0;j<FoodChildNodeList.getLength();j++) {
					Node FoodChildNode=FoodChildNodeList.item(j);
					if(FoodChildNode.getNodeType()==Node.ELEMENT_NODE) {
						Element FoodChildElement=(Element) FoodChildNode;
						System.out.println(j+". "+FoodChildElement.getTagName()+" : "+FoodChildElement.getTextContent().trim());
					}
				}
			}
			System.out.println("\n\n");
		}
	}

	public static void writeXML(Document document, Element element) throws TransformerException {
		TransformerFactory factory=TransformerFactory.newInstance();
		Transformer transformer=factory.newTransformer();
		DOMSource source=new DOMSource(document);
		
		element.setTextContent("sdfjhbs");
		
		StreamResult streamResult=new StreamResult(new File(""));
		transformer.transform(source, streamResult);
		
		StreamResult consoleResult=new StreamResult(System.out);
		transformer.transform(source, consoleResult);
		
	}
}
