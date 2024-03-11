

public class TheRisingSunApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheRisingSunApplication.class,args);
    }
    
    @RequestMapping
    @ResponseBody
    public String home(){
        return "The Rising Sun Papelaria";
    }
}
