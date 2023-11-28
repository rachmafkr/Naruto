/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NARUTO;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hai, nama saya " + name);
    }
    public void performAction() {
        System.out.println("Melakukan aksi umum.");
    }
}

class AkatsukiMember extends Character {
    private String role;

    public AkatsukiMember(String name, String role) {
        super(name);
        this.role = role;
    }
    @Override
    
    public void introduce() {
        System.out.println("Hai, saya anggota Akatsuki. Nama saya " + name + ". Peran saya: " + role);
    }
    @Override
    
    public void performAction() {
        System.out.println("Melakukan aksi khas Akatsuki.");
    }
}

public class Naruto {
    public static void main(String[] args) {
        Character[] characters = new Character[2];
        characters[0] = new AkatsukiMember("Itachi Uchiha", "Jurus Api");
        characters[1] = new AkatsukiMember("Kisame Hoshigaki", "Pengguna Pedang Samehada");

        for (Character character : characters) {
            character.introduce();
            character.performAction();
            System.out.println(); 
        }
    }
}