/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas.utiles;

import com.google.gson.Gson;
import controlador.AvionControlador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author DEEPIN
 */
public class Utilidades {

    public static String DIRCARPDATA = "data";

    public static boolean guardarJSON(AvionControlador aviones) {

        Gson gson = new Gson();
        String json = gson.toJson(aviones);

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter(DIRCARPDATA + File.separatorChar + "datos.json"))) {
            bw.write(json);

            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }

    }

    public static AvionControlador cargarJSON() {
        String json = "";
        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new FileReader(DIRCARPDATA + File.separatorChar + "datos.json"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                json += linea;
            }

            br.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        AvionControlador aviones = gson.fromJson(json, AvionControlador.class);
        return aviones;
    }
}
