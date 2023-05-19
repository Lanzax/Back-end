package CONTROLLER;



public class mainProject {

    
    public static void main(String[] args) {
    	/*
    	try {
    		
    		EventiDao evd=new EventiDao(em);
        	Evento e1=new Evento( "piscina",LocalDate.of(2023, 7, 21),TipoEvento.PUBBLICO,33);
        	Evento e2=new Evento( "teatro",LocalDate.of(2023, 7, 21),TipoEvento.PRIVATO,33);
        	Evento e3=new Evento( "cinema",LocalDate.of(2023, 10, 21),TipoEvento.PRIVATO,36);
        	
        	inserisciEvento(e1);
        	
        	Evento el =leggiEvento(1);
        	System.out.println(el);
        	el.setTitolo("teatro");
        	modificaEvento(el);
        	System.out.println(el);

        	Evento ed1= leggiEvento(2);
        	Evento ed2= leggiEvento(3);
        	eliminaEvento(ed1);
        	eliminaEvento(ed2);
        	    	
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
    		em.close();
    		emf.close();
    	}
    	*/
    	
    }
    /*
    	public static void inserisciEvento(Evento e) {
    		em.getTransaction().begin();
    		em.persist(e);
    		em.getTransaction().commit();
    	}
    	public static void modificaEvento(Evento e) {
    		em.getTransaction().begin();
    		em.merge(e);
    		em.getTransaction().commit();
    	}
    	public static Evento leggiEvento(Integer id) {
    		em.getTransaction().begin();
    		Evento e=em.find(Evento.class, id);
    		em.getTransaction().commit();
    		return e;   		
    	}
    	public static void eliminaEvento(Evento e) {
    		em.getTransaction().begin();
    		em.remove(e);
    		em.getTransaction().commit();
    		System.out.println("Evento "+e.getTitolo()+" eliminato!!");
    	}
    	*/
}
