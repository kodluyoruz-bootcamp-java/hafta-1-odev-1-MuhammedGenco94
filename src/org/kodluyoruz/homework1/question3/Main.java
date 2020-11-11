package org.kodluyoruz.homework1.question3;

public class Main {
    public static void main(String[] args) {
        privateConstructor Conn1 = privateConstructor.getInstance();
        Conn1.setDbName("MySQL");
        Conn1.setServerName("www.kodluyoruz.com");
        Conn1.setPortNumber(3306);

        System.out.println("#########################");
        System.out.println("Conn1 database name: " + Conn1.getDbName());
        System.out.println("Conn1 Server Name: " + Conn1.getServerName());
        System.out.println("Conn1 Port Number: " + Conn1.getPortNumber());

        privateConstructor conn2 = privateConstructor.getInstance();
        conn2.setDbName("MSSQL");
        conn2.setServerName("www.muhammed-genco.com");
        conn2.setPortNumber(8081);

        System.out.println("#########################");
        System.out.println("Conn1 database name: " + Conn1.getDbName());
        System.out.println("Conn1 Server Name: " + Conn1.getServerName());
        System.out.println("Conn1 Port Number: " + Conn1.getPortNumber());

        System.out.println("#########################");
        System.out.println("conn2 database name: " + conn2.getDbName());
        System.out.println("conn2 Server Name: " + conn2.getServerName());
        System.out.println("conn2 Port Number: " + conn2.getPortNumber());
    }
}
