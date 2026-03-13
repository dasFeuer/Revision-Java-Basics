package TicketTracker;


import java.util.Scanner;

class User {
    private String name;

    private UserRole role;

    public User () {}

    public User(UserRole role, String name) {
        this.role = role;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void CreateUserWithRole(User user) {

        if (user.getName().isBlank()){
            Error<String> error = new Error<String>();
            error.setErrorMessage("Please enter your name it cannot be null");
            System.out.println(error.getErrorMessage());
            return;
        }
        else if (user.getName().equals("Barun")){
            user.setRole(UserRole.ADMIN_ROLE);
        } else  {
            user.setRole(UserRole.USER_ROLE);
        }

        System.out.printf("Your name is %s.\n", user.getName());
        System.out.printf("Your role is %s.\n", user.getRole());
    }
}

class Ticket {
    private String toDo;
    private TicketStatus status;
    private Priority priority;

    public Ticket () {}

    public Ticket(String toDo, TicketStatus status, Priority priority) {
        this.toDo = toDo;
        this.status = status;
        this.priority = priority;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void CreateTicketWithUser(User user, Ticket ticket){
        Scanner sc = new Scanner(System.in);
        String userName = user.getName();

        if (!userName.isEmpty()){
            System.out.println("Write your ticket: ");
            ticket.setToDo(sc.nextLine());
            ticket.setStatus(TicketStatus.PENDING);

            if(ticket.getToDo().isEmpty() || ticket.getToDo() == null){
                System.out.println("Ticket cannot be blank or null");
                return;
            }

            System.out.printf("What is the priority of your work: %s, %s, %s, %s.\n", "Normal", "High", "Low", "Urgent");
            String inputPriority = sc.nextLine().trim().toLowerCase();

            switch (inputPriority) {
                case "normal" -> ticket.setPriority(Priority.NORMAL);
                case "high" -> ticket.setPriority(Priority.HIGH);
                case "low" -> ticket.setPriority(Priority.LOW);
                case "urgent" -> ticket.setPriority(Priority.URGENT);
                default -> {
                    if (ticket.getPriority() == null) {
                        System.out.println("Ticket priority must be set up. It cannot be blank or null");
                        return;
                    } else {
                        ticket.setPriority(Priority.NORMAL);
                    }
                }
            }
        }

        System.out.printf("Todo is %s.\n", ticket.getToDo());
        System.out.printf("Ticket status (Default) is %s.\n", ticket.getStatus());
        System.out.printf("Ticket priority (Priority) is %s.\n", ticket.getPriority());

    }
}

class Comment {
    private String text;
    public Comment () {}

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

public class TicketTracker {
    static void main(String[] args) {

        // Create User
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.print("Enter your name: ");
        user.setName(sc.nextLine());
        user.CreateUserWithRole(user);

        System.out.println("=========================================\n");

        // Create Ticket
        Ticket ticket = new Ticket();
        ticket.CreateTicketWithUser(user, ticket);

    }
}
