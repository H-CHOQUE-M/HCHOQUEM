package pe.edu.upeu.app;

import pe.edu.upeu.dao.MarcaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentasDao;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;


public class MenuPrincipal {
    LeerTeclado leer=new LeerTeclado();
    UsuarioDao userDao;
    MarcaDao marDao;
    ProductoDao proDao;
    VentasDao ventasDao;
    UtilsX util=new UtilsX();


    public void mainLogin() {
        util.clearConsole();
        System.out.println("**********************Autenticacion*********************");
        System.out.println();
        userDao=new UsuarioDao();
        if(userDao.login()){
            menuMain();
        }else{            
            System.out.println("Intente Nuevamemnte");
            mainLogin();
        }
    }


    public void menuMain() {
        int opcion=0;
        System.out.println("\tBienvenidos al Sistema\t");
        String msg="Seleccione una opción"+
        "\n1=Nuevo Usuario"    
        +"\n2=Lista de Usuario"
        +"\n3=Crear Marca"    
        +"\n4=Crear Producto"    
        +"\n5=Lista de Productos"    
        +"\n6=Actualizar Producto"
        +"\n7=Eliminar Producto"
        +"\n8=Registrar Ventas"    
        +"\n9=Reporte Ventas";        
        opcion=leer.leer(0,msg);
        while(opcion!=0){
            switch(opcion){
                case 1:{ 
                    userDao=new UsuarioDao();
                    userDao.registrarNuevoUsuario();
                 }
                break;
                case 2:{
                    userDao=new UsuarioDao();
                    userDao.listarUsuarios();
                } break;  
                case 3:{
                    marDao=new MarcaDao();
                    marDao.createMarca();
                } break;                  
                case 4:{
                    proDao=new ProductoDao();
                    proDao.createProducto();
                } break;                 
                case 5:{
                    proDao=new ProductoDao();
                    proDao.reportProducto();
                } break;                 
                case 6:{
                    proDao=new ProductoDao();
                    proDao.updateProducto();
                } break;                 
                case 7:{
                    proDao=new ProductoDao();
                    proDao.deleteProducto();
                } break;  
                case 8:{
                    ventasDao=new VentasDao();
                    ventasDao.registroVenta();
                } break;    
                case 9:{
                    ventasDao=new VentasDao();
                    ventasDao.ReporteVentasRangoFecha();
                } break;                                                                               
                default: System.out.println("Opcion no existe!");
            }        
          opcion=leer.leer(0,msg);
        }        
    }

}