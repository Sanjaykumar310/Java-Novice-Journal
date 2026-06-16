class Manager extends Employee{
    @Override
    
    public void work(){//manager
        super.work();//employee
        System.out.println("Manager is managing");
        
    }
}