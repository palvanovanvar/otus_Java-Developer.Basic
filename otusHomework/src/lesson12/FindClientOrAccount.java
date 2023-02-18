package lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Client{
    String name;
    int    id;
    int    age;

    public Client(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class Account{
    int id;
    int client_id;

    public Account(int id, int client_id){
        this.id = id;
        this.client_id = client_id;
    }
}

class Bank{
    private Map<String, Client> clients = new HashMap<>();
    private ArrayList<Account> accounts;

    public Bank(Map<String, Client> clients, ArrayList<Account> accounts){
        this.clients = clients;
        this.accounts = accounts;
    }

    ArrayList<Account> getAccounts(Client client){
        ArrayList<Account> findAccounts = new ArrayList<>();
        for (int a = 0; a < this.accounts.size(); a++) {
            if (client.id == this.accounts.get(a).client_id) {
                findAccounts.add(this.accounts.get(a));
            }
        }
        return findAccounts;
    }

    Client findClient(Account account){
        return this.clients.get(String.valueOf(account.client_id));
    }
}

public class FindClientOrAccount {
    public static void main(String[] args) {
        Map<String, Client> clients = new HashMap<>();
        ArrayList<Account> accounts = new ArrayList<>();

        for (int c = 0; c < 10; c++) {
            clients.put(String.valueOf(c), new Client("Client " + c, c, 3*c+c));
        }

        for (int a = 0; a < 50; a++) {
            int client_id = (int) (Math.random()*10);
            accounts.add(new Account(a, client_id));
        }

        Bank bank = new Bank(clients, accounts);
        Client searchClient = new Client("Client 7", 7, 33);
        ArrayList<Account> findClientAccounts = bank.getAccounts(searchClient);

        System.out.println("find for Client-7 " + findClientAccounts.size()+ " Accounts");
        for (int a = 0; a < findClientAccounts.size(); a++) {
            System.out.println("id=" + findClientAccounts.get(a).id + " client_id=" + findClientAccounts.get(a).client_id);
        }

        searchClient = bank.findClient(accounts.get(3));
        System.out.println("find for Account-3 Client id=" + searchClient.id + " name=" + searchClient.name + " age=" + searchClient.age);
    }
}
