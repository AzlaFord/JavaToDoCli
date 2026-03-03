class AddCommand extends Command {
    public void execute(ToDoList list , String[] args){
        if (args.length > 1){
            list.add(args[1]);
            System.out.println("Task aduagat : "+args[1]);
        }else{
            System.out.println("Prea putine argumente");
        }
    }
}

