class DeleteCommand extends Command {
    public void execute(ToDoList list , String[] args){
        if (args.length > 1){
            int index = Integer.parseInt(args[1]);
            list.delete(index);
            System.out.println("Task sters la indexul: " + index );
        }else{
            System.out.println("Niciun index specificat pentru delete !");
        }
    }
}
