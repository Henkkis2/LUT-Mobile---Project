// I used this to build listview https://www.tutorialspoint.com/how-to-put-a-listview-into-a-scrollview-without-it-collapsing-on-android
package com.example.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class XMLView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlview);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ArrayList<String> luettelo = readXML(); // Elokuvateatteri tietorakenne.
        ListView lista = (ListView) findViewById(R.id.listView);
        lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, luettelo));
        ListAdapter listaAdapter = lista.getAdapter();
        int j = 0;
        if (listaAdapter == null) {
            return;
        }
        for (int i = 0; i < listaAdapter.getCount(); i++) {
            View itemit = listaAdapter.getView(i, null, lista);
            itemit.measure(0, 0);
            j += itemit.getMeasuredHeight();
        }
        ViewGroup.LayoutParams size = lista.getLayoutParams();
        size.height = j + (lista.getDividerHeight() * (listaAdapter.getCount() - 1));
        lista.setLayoutParams(size);
    }

    public ArrayList<String> readXML() {
        ArrayList<String> lista = new ArrayList<>();
        try {
            DocumentBuilder builder = null;
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            System.out.println("Moi");
            String url = "https://www.finnkino.fi/xml/TheatreAreas/";
            Document doc = builder.parse(url);
            doc.getDocumentElement().normalize();
            lista = Teatterit(doc);

        } catch (IOException | SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<String> Teatterit(Document doc) {
        NodeList nList = doc.getDocumentElement().getElementsByTagName("TheatreArea");
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String ID = element.getElementsByTagName("ID").item(0).getTextContent();
                String paikka = element.getElementsByTagName("Name").item(0).getTextContent();
                lista.add(ID + " " + paikka);
            }
        }
        return lista;
    }

}