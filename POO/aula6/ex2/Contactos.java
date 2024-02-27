package aula6.ex2;

import aula7.ex2.DateYMD;
import aula6.ex1.Pessoa;

import java.util.Scanner;

import static utils.Contacts.validateMail;
import static utils.Contacts.validateNumbr;

public class Contactos {
    public static void main(String[] args) {
        int op = 6;
        Scanner sc = new Scanner(System.in);
        Contacto[] lstContactos = new Contacto[10];
        int id = 1;
        while (op != 0) {
            System.out.println("1 - Inserir contacto\n" +
                    "2 - Alterar contacto\n" +
                    "3 - Apagar contacto\n" +
                    "4 - Procurar contacto\n" +
                    "5 - Listar contactos\n" +
                    "0 – Sair");
            op = sc.nextInt();
            int count = 0;
            switch (op) {
                case 1:
                    System.out.println("Nome - ");
                    String nome = sc.next();
                    System.out.println("CC - ");
                    int cc = sc.nextInt();
                    System.out.println("Data de Nascimento");
                    System.out.println("Dia - ");
                    int dia = sc.nextInt();
                    System.out.println("Mês - ");
                    int mes = sc.nextInt();
                    System.out.println("Ano - ");
                    int ano = sc.nextInt();
                    DateYMD dataNasc = new DateYMD(dia, mes, ano);
                    Pessoa pessoa = new Pessoa(nome, cc, dataNasc);
                    for (Contacto contcts : lstContactos ){
                        if (pessoa == contcts.getPessoa()){
                            System.out.println("Essa pessoa ja existe.");
                            System.out.println("Se quiser inserir como novo contacto prima (Y).");
                            sc.nextLine();
                            String c = sc.nextLine();
                            if (c.toUpperCase() != "Y"){
                                break;
                            }
                        }
                    }
                    System.out.println("Numero Telefônico - ");
                    int numbr = sc.nextInt();
                    System.out.println("Mail - ");
                    sc.nextLine();
                    String mail = sc.nextLine();

                    if (!validateNumbr(numbr) && !validateMail(mail)){
                        System.out.println("Pfv insira pelo menos um número de telefone ou mail valido.");
                        break;
                    }
                    else{
                        if (validateNumbr(numbr) && !validateMail(mail) ){
                            Contacto contacto = new Contacto(pessoa, numbr);
                            lstContactos[id - 1] = contacto;
                            break;
                        } else if (!validateNumbr(numbr) && validateMail(mail)) {
                            Contacto contacto = new Contacto(pessoa,mail);
                            lstContactos[id - 1] = contacto;

                            break;
                        }else{
                            Contacto contacto = new Contacto(pessoa, numbr, mail);
                            lstContactos[id - 1] = contacto;

                            break;
                        }

                    }
                case 2:
                    for(Contacto contactox : lstContactos){
                        System.out.println(contactox);
                    }

                    if (lstContactos[0] == null) {
                        System.out.println("Pfv insira um contacto primeiro");
                    } else {
                        System.out.println("Procurar por Nome(1)/Número(2) - ");
                        op = sc.nextInt();
                        switch (op) {
                            case 1:
                                System.out.println("Insira o nome ");
                                String nomeAlt = sc.nextLine();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (nomeAlt.equals(lstContactos[i].getName())) {
                                        System.out.println(lstContactos[i]);
                                        count++;
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Insira o número ");
                                int numbrAlt = sc.nextInt();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (numbrAlt == lstContactos[i].getNumbr()) {
                                        System.out.println(lstContactos[i]);
                                        count++;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Insira uma das opções!");
                        }
                        if (count > 1) {
                            System.out.println("Insira o ID do contacto que deseja alterar - ");
                            int idAlt = sc.nextInt();
                            System.out.println("1 - Alterar Pessoa\n" +
                                    "2 - Alterar Número\n" +
                                    "3 - Alterar Mail\n");
                            op = sc.nextInt();
                            switch (op) {
                                case 1:
                                    for (int i = 0; i < lstContactos.length; i++) {
                                        if (idAlt == lstContactos[i].getId()) {
                                            System.out.println("Nova Pessoa - ");
                                            System.out.println("Nome - ");
                                            String newNome = sc.nextLine();
                                            System.out.println("CC - ");
                                            int newCc = sc.nextInt();
                                            System.out.println("Data de Nascimento");
                                            System.out.println("Dia - ");
                                            int newDia = sc.nextInt();
                                            System.out.println("Mês - ");
                                            int newMes = sc.nextInt();
                                            System.out.println("Ano - ");
                                            int newAno = sc.nextInt();
                                            DateYMD newDataNasc = new DateYMD(newDia, newMes, newAno);
                                            Pessoa newPessoa = new Pessoa(newNome, newCc, newDataNasc);
                                            lstContactos[i].setPessoa(newPessoa);
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < lstContactos.length; i++) {
                                        if (idAlt == lstContactos[i].getId()) {
                                            System.out.println("Novo Número - ");
                                            int newNumbr = sc.nextInt();
                                            lstContactos[i].setNumbr(newNumbr);
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < lstContactos.length; i++) {
                                        if (idAlt == lstContactos[i].getId()) {
                                            System.out.println("Novo Mail - ");
                                            String newMail = sc.nextLine();
                                            lstContactos[i].setMail(newMail);
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Opção Invalida.");
                            }
                            for (int i = 0; i < lstContactos.length; i++) {
                                if (idAlt == lstContactos[i].getId()) {

                                }
                            }
                            break;

                        }

                    }
                    break;
                case 3:
                    if (lstContactos[0] == null) {
                        System.out.println("Pfv insira um contacto primeiro");
                    } else {
                        System.out.println("Procurar por Nome(1)/Número(2) - ");
                        op = sc.nextInt();
                        Contacto[] newContactos = new Contacto[10];
                        switch (op) {
                            case 1:
                                System.out.println("Insira o nome ");
                                String nomeApgr = sc.nextLine();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (nomeApgr != lstContactos[i].getName()) {
                                        newContactos[i] = lstContactos[i];
                                    }
                                    else{
                                        i--;
                                    }
                                }
                                lstContactos = newContactos;
                                break;
                            case 2:
                                System.out.println("Insira o número ");
                                int numbrApgr = sc.nextInt();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (numbrApgr != lstContactos[i].getNumbr()) {
                                        newContactos[i] = lstContactos[i];
                                    }
                                    else{
                                        i--;
                                        count++;
                                    }
                                }
                                lstContactos = newContactos;
                                break;
                            default:
                                System.out.println("Insira uma das opções!");
                        }
                        if (count > 1) {
                            System.out.println("Insira o ID ");
                            int numbrApgr = sc.nextInt();
                            for (int i = 0; i < lstContactos.length; i++) {
                                if (numbrApgr != lstContactos[i].getNumbr()) {
                                    newContactos[i] = lstContactos[i];
                                }
                                else{
                                    i--;
                                }
                            }
                            lstContactos = newContactos;
                        }
                    }
                case 4:
                    if (lstContactos[0] == null) {
                        System.out.println("Pfv insira um contacto primeiro");
                    } else {
                        System.out.println("Procurar por Nome(1)/Número(2) - ");
                        op = sc.nextInt();
                        Contacto[] newContactos = new Contacto[10];
                        switch (op) {
                            case 1:
                                System.out.println("Insira o nome ");
                                String nomeApgr = sc.nextLine();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (nomeApgr != lstContactos[i].getName()) {
                                        newContactos[i] = lstContactos[i];
                                    }
                                    else{
                                        i--;
                                    }
                                }
                                lstContactos = newContactos;
                                break;
                            case 2:
                                System.out.println("Insira o nome ");
                                int numbrApgr = sc.nextInt();
                                for (int i = 0; i < lstContactos.length; i++) {
                                    if (numbrApgr != lstContactos[i].getNumbr()) {
                                        newContactos[i] = lstContactos[i];
                                    }
                                    else{
                                        i--;
                                    }
                                }
                                lstContactos = newContactos;
                                break;
                            default:
                                System.out.println("Insira uma das opções!");
                        }
                        if (count > 1) {
                            System.out.println("Insira o número ");
                            int numbrApgr = sc.nextInt();
                            for (int i = 0; i < lstContactos.length; i++) {
                                if (numbrApgr != lstContactos[i].getNumbr()) {
                                    newContactos[i] = lstContactos[i];
                                }
                                else{
                                    i--;
                                }
                            }
                            lstContactos = newContactos;
                        }
                    }
                    break;
                case 5:
                    for(Contacto contact : lstContactos){
                        if (contact == null){
                            break;
                        }
                        else{
                            System.out.println(contact);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida.");
                    break;

            }
            }
        }
    }
