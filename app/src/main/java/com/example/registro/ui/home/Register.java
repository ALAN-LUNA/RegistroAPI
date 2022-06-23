package com.example.registro.ui.home;

public class Register {
    public String name;
    public String apPat;
    public String apMat;
    public String email;
    public String password;
    public String validate;
    public String fecha_nacimiento;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Register(String name, String apPat, String apMat, String email, String password, String validate, String fecha_nacimiento) {
        this.name = name;
        this.apPat = apPat;
        this.apMat = apMat;
        this.email = email;
        this.password = password;
        this.validate = validate;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
