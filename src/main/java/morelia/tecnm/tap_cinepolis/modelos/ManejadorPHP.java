/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morelia.tecnm.tap_cinepolis.modelos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author DELL
 */
public class ManejadorPHP {
    
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    OkHttpClient client = new OkHttpClient();
    
    public Usuario autenticarUsuario(String email, String password) throws IOException, ParseException {
        Usuario usuario = new Usuario();
        
        // Objeto json con el password e email a autenticar
        JSONObject jsonDatosUsuario = new JSONObject();
        jsonDatosUsuario.put("password", password);
        jsonDatosUsuario.put("email", email);
        String datosUsuario = jsonDatosUsuario.toString();
        
        // String que almacena la respuesta de la petición post
        String respuestaApi = post("http://localhost:10080/api.cinepolis.com/v1/usuarios/login", datosUsuario);

        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 1){
            return null;
        }
        
        // Almacenar dentro un jsonObject los valores dentro de usuario
        JSONObject jsonUsuario = (JSONObject) jsonRespuesta.get("usuario");
        String nombre = (String) jsonUsuario.get("nombre");
        usuario.setNombre(nombre);
        String idUsuario = (String) jsonUsuario.get("id_usuario");
        usuario.setIdUsuario(Integer.parseInt(idUsuario));
        
        /*
        // getting address 
        Map address = ((Map)jo.get("usuario")); 
          
        // iterating address Map 
        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
        */
        
        return usuario;
    }
    
    public Boleto boletoNuevo(String totalBoleto, String usuario_idBoleto, String funcion_idBoleto) throws IOException, ParseException {
        Boleto boleto = new Boleto();
        
        // Objeto json con el password e email a autenticar
        JSONObject jsonDatosBoleto = new JSONObject();
        jsonDatosBoleto.put("total", totalBoleto);
        jsonDatosBoleto.put("usuario_id", usuario_idBoleto);
        jsonDatosBoleto.put("funcion_id", funcion_idBoleto);
        String datosBoleto = jsonDatosBoleto.toString();
        
        // String que almacena la respuesta de la petición post
        String respuestaApi = post("http://localhost:10080/api.cinepolis.com/v1/boletos", datosBoleto);

        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        return boleto;
    }
    
    public Asiento compraDeAsiento(String nombreAsiento, String estatusAsiento, String sala_idAsiento) throws IOException, ParseException {
        Asiento asiento = new Asiento();
        
        // Objeto json con el password & email a autenticar
        JSONObject jsonDatosAsiento = new JSONObject();
        jsonDatosAsiento.put("nombre", nombreAsiento);
        jsonDatosAsiento.put("estatus", estatusAsiento);
        jsonDatosAsiento.put("sala_id", sala_idAsiento);
        String datosAsiento = jsonDatosAsiento.toString();
        
        // String que almacena la respuesta de la petición post
        String respuestaApi = put("http://localhost:10080/api.cinepolis.com/v1/asientos/" + nombreAsiento, datosAsiento);

        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        /* EN ESTE CASO NO SE OCUPA ESTO PORQUE NO HAY NINGUN MOTIVO PARA REGRESAR EL ASIENTO, SOLO OCUPAMOS ACTUALIZAR 
        // Almacenar dentro un jsonObject los valores dentro de usuario
        JSONObject jsonUsuario = (JSONObject) jsonRespuesta.get("usuario");
        String nombre = (String) jsonUsuario.get("nombre");
        usuario.setNombre(nombre);
        String idUsuario = (String) jsonUsuario.get("id_usuario");
        usuario.setIdUsuario(Integer.parseInt(idUsuario));
        
        */
        
        return asiento;
    }
    
    public Funcion obtenerFuncionPorID(String idFuncion) throws IOException, ParseException {
        Funcion funcion = new Funcion();
        
        // String que almacena la respuesta de la petición post
        String respuestaApi = get("http://localhost:10080/api.cinepolis.com/v1/funciones/" + idFuncion);
        
        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        // getting phoneNumbers 
        JSONArray datosFuncion = (JSONArray) jsonRespuesta.get("datos"); 
          
        // iterating phoneNumbers 
         for (int i = 0; i < datosFuncion.size(); i++) {
            JSONObject address = (JSONObject) datosFuncion.get(i);
            
            String id_funcion = (String) address.get("id_funcion");
            funcion.setIdFuncion(Integer.parseInt(id_funcion));
            String costo = (String) address.get("costo");
            funcion.setCosto(Double.parseDouble(costo));
            String pelicula_id = (String) address.get("pelicula_id");
            funcion.setIdPelicula(Integer.parseInt(pelicula_id));
            String sala_id = (String) address.get("sala_id");
            funcion.setIdSala(Integer.parseInt(sala_id));
        }
        
        return funcion;
    }
    
    public Pelicula obtenerPeliculaPorID(String idPelicula) throws IOException, ParseException {
        Pelicula pelicula = new Pelicula();
        
        // String que almacena la respuesta de la petición get
        String respuestaApi = get("http://localhost:10080/api.cinepolis.com/v1/peliculas/" + idPelicula);
        
        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        // getting phoneNumbers 
        JSONArray datosPelicula = (JSONArray) jsonRespuesta.get("datos"); 
          
        // iterating phoneNumbers 
         for (int i = 0; i < datosPelicula.size(); i++) {
            JSONObject address = (JSONObject) datosPelicula.get(i);
            
            String id_pelicula = (String) address.get("id_pelicula");
            pelicula.setIdPelicula(Integer.parseInt(id_pelicula));
            String nombre = (String) address.get("nombre");
            pelicula.setNombre(nombre);
            /*String imagen = (String) address.get("imagen");
            pelicula.setImagen(imagen);*/
            String descripcion = (String) address.get("descripcion");
            pelicula.setDescripcion(descripcion);
        }
        
        return pelicula;
    }
    
    public ArrayList<String> enlistaHorarios(String idFuncion) throws IOException, ParseException {
        
        // String que almacena la respuesta de la petición get
        String respuestaApi = get("http://localhost:10080/api.cinepolis.com/v1/horarios/" + idFuncion);
        
        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        // getting phoneNumbers 
        JSONArray datosHorario = (JSONArray) jsonRespuesta.get("datos"); 
          
        // iterating phoneNumbers
        ArrayList<String> horarios = new ArrayList<>();
         for (int i = 0; i < datosHorario.size(); i++) {
            JSONObject address = (JSONObject) datosHorario.get(i);
            
            horarios.add((String) address.get("hora"));
        }
        
        return horarios;
    }
    
    public Asiento encuentraAsiento(String idSala, String nombreAsiento) throws Exception {
        Asiento asiento = new Asiento();
        
        // String que almacena la respuesta de la petición get
        String respuestaApi = get("http://localhost:10080/api.cinepolis.com/v1/asientos/" + idSala + "/" + nombreAsiento);
        
        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        // getting phoneNumbers 
        JSONArray datosAsiento = (JSONArray) jsonRespuesta.get("datos"); 
          
        // iterating phoneNumbers 
         for (int i = 0; i < datosAsiento.size(); i++) {          
            JSONObject address = (JSONObject) datosAsiento.get(i);
            
            String id_asiento = (String) address.get("id_asiento");
            asiento.setIdAsiento(Integer.parseInt(id_asiento));
            String nombre = (String) address.get("nombre");
            asiento.setNombre(nombre);
            String estatus = (String) address.get("estatus");
            asiento.setEstatus(estatus);
            String sala_id = (String) address.get("sala_id");
            asiento.setSala_id(Integer.parseInt(sala_id));
        }
        
        return asiento;
    }
    
    public ArrayList<String> consultarBoletos(int idUsuario) throws Exception{

        // String que almacena la respuesta de la petición get
        String respuestaApi = get("http://localhost:10080/api.cinepolis.com/v1/boletos/" + idUsuario);
        
        // Parsear la respuesta a un pojo
        Object objRespuesta = new JSONParser().parse(respuestaApi); 
          
        // Castear pojo a un jsonObject
        JSONObject jsonRespuesta = (JSONObject) objRespuesta;

        // Si el estado de respuesta de la API no es 1, entonces hubo un error y aqui termina la autenticación regresando un null
        long estado = (long) jsonRespuesta.get("estado");
        if(estado != 100){
            return null;
        }
        
        // getting phoneNumbers 
        JSONArray datosBoletos = (JSONArray) jsonRespuesta.get("datos"); 
          
        // iterating phoneNumbers
        ArrayList<String> boletos = new ArrayList<>();
         for (int i = 0; i < datosBoletos.size(); i++) {
            JSONObject address = (JSONObject) datosBoletos.get(i);
            
            String id_boleto = (String) address.get("id_boleto");
            String fecha_compra = (String) address.get("fecha_compra");
            String total = (String) address.get("total");
            String usuario_id = (String) address.get("usuario_id");
            String funcion_id = (String) address.get("funcion_id");
            
            boletos.add("Id_boleto: " + id_boleto + " , Fecha de compra: " + fecha_compra + " , Total: " + total + " , Funcion_id: " + funcion_id);
        }
        
        return boletos;
    }
    
    public String get(String url) throws IOException{
        Request request = new Request.Builder()
        .url(url)
        .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
    
    public String post(String url, String json) throws IOException {
    RequestBody body = RequestBody.create(json, JSON);
    Request request = new Request.Builder()
        .url(url)
        .post(body)
        .build();
    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }
    
    public String put(String url, String json) throws IOException {
    RequestBody body = RequestBody.create(json, JSON);
    Request request = new Request.Builder()
        .url(url)
        .put(body)
        .build();
    try (Response response = client.newCall(request).execute()) {
      return response.body().string();
    }
  }
    
}
