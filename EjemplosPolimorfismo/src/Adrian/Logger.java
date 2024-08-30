package Adrian;

class Logger{
    public void log(String... messages){
        System.out.println("Múltiples mensajes:") ;

        for(String message : messages)
            System.out.println(message) ;

    }

    public <T> void log(T message){
        System.out.println("Mesanje génerico:" + message);
    }

    public void log(int level, String... messages){
        System.out.println("Múltiples mensajes con niveles:" + level);
        for(String message : messages)
            System.out.println(message) ;
    }
}
