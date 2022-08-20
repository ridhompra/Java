package com.belajar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner terminalInput = new Scanner(System.in);
            String pilihanUser;
            boolean lanjutkan = true;

            while (lanjutkan) {
                clearScreen();
                System.out.println("Data Base Perpustakaan\n");
                System.out.println("1.\t Lihat seluruh buku");
                System.out.println("2.\t Cari data buku");
                System.out.println("3.\t Tambah data buku");
                System.out.println("4.\t Ubah data buku");
                System.out.println("5.\t Hapus data buku");

                System.out.print("\nPilihan Anda: ");
                pilihanUser = terminalInput.next();

                switch (pilihanUser) {
                    case "1":
                        System.out.println("============================");
                        System.out.println("Menampilkan list seluruh buku");
                        System.out.println("============================");
                        tampilkanData();
                        break;
                    case "2":
                        System.out.println("==============");
                        System.out.println("Cari data buku");
                        System.out.println("==============");
                        //Cari data buku
                        break;
                    case "3":
                        System.out.println("================");
                        System.out.println("tambah data buku");
                        System.out.println("================");
                        //Tambah data buku
                        break;
                    case "4":
                        System.out.println("===================");
                        System.out.println("ubah data buku buku");
                        System.out.println("===================");
                        //Ubah data buku
                        break;
                    case "5":
                        System.out.println("===============");
                        System.out.println("Hapus data buku");
                        System.out.println("===============");
                        //Hapus data buku
                        break;
                    default:
                        System.out.println("Opsi yang anda masukan salah");
                }
                lanjutkan = getYesOrNo("Aapakah anda ingin melanjutkan");
            }


        }

        private static void tampilkanData() throws IOException {
            FileReader fileInput;
            BufferedReader inputBuffer;

            try {
                fileInput = new FileReader("database.txt");
                inputBuffer = new BufferedReader(fileInput);
            } catch (Exception ex) {
                System.out.println("Data tidak ditemukan, silahkan buat database terlebih dahulu");
                return;
            }
            String data = inputBuffer.readLine();
            System.out.println(data);
        }

        private static void clearScreen() {
            try {
                if (System.getProperty("os.name").contains("windows")) {
                    new ProcessBuilder("/cmd", "/c", "/cls").inheritIO().start().waitFor();
                } else {
                    System.out.print("\033\143");
                }
            } catch (Exception ex) {
                System.err.println("tidak bisa Clear Screen");
            }
        }

        private static boolean getYesOrNo(String message) {
            Scanner terminalInput = new Scanner(System.in);
            System.out.print(message + " (y/n)?");
            String pilihanUser = terminalInput.next();

            while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
                System.out.println("=== pilihan anda bukan (y/n) ===");
                break;
            }

            return !pilihanUser.equals("n");
            }


    }


