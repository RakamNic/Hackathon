public boolean Login(string email, string user, string pass){
    string tempemail, tempuser, tempemail;
    boolean returnable;
    if(email.equals(tempemail) == false || pass.equals(tempass) == false){
        JOptionPane.showMessageDialog("El email y/o la contraseña son incorrectas");
        returnable = false;
    }
    else if(email.equals(tempemail) && pass.equals(tempass)){
        returnable = true;
    }
    return returnable;
}

public void Registro(){
    //textboxes se reemplazan por las textbox que se ocupan
    Jtextbox text1, text2, text3;
    
    if(text1.isempty() || text2.isempty() || text3.isempty)
    {
        JOptionPane.showMessageDialog("Todos los campos son obligatorios");
    }
    else{
        Maestros maestro1 = new Maestros(text1.gettext(), text2.gettext(), text3.gettext());
        
        //regresa al login
        JOptionPane.showMessageDialog("Registro exitoso");
    }
}

private class Maestros(){
    private String nombre;
    private String apellidos;
    private String correo;
    private String contraseña;
    
    public Maestros(String nombre, String correo, String contraseña){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contraseña = contraseña;
    }
}