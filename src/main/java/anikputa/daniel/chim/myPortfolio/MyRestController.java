package anikputa.daniel.chim.myPortfolio;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyRestController {
    @GetMapping("/")
    public ModelAndView index_page(){
        ModelAndView mvc;
        mvc = new ModelAndView();
        mvc.setViewName("index");
        return mvc;
    }

    @GetMapping("/education")
    public ModelAndView education_page(){
        ModelAndView mvc;
        mvc = new ModelAndView();
        mvc.setViewName("education");
        return mvc;
    }
    @GetMapping("/skills")
    public ModelAndView skills_page(){
        ModelAndView mvc;
        mvc = new ModelAndView();
        mvc.setViewName("skills");
        return mvc;
    }

    @GetMapping("/projects")
    public ModelAndView project_page(){
        ModelAndView mvc;
        mvc = new ModelAndView();
        mvc.setViewName("projects");
        return mvc;
    }
}
