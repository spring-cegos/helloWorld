package fr.cegos.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
// @RequestMapping("/") : définit la route ("/") sur lequel mon controller va écouter
@RequestMapping("/")
class HelloRestController {

    /**
     * Créer une route qui renvoie "Hello Cegos" sur une requête de type GET (requête standard lorsque j'accède à une page Web)
     * => on va utiliser l'annotation @GetMapping
     */
    // @GetMapping indique que la méthode associée va être déclenchée
    // lorsque il y a une requête de type GET sur mon application (à la route définie dans @RequestMapping)
    @GetMapping
    public String hello() {
        // je définit ce qui foit être retourné
        return "Hello Cegos!";
    }

    @GetMapping("/francais")
    public String francais() {
        // je définit ce qui foit être retourné
        return "Bonjour Cegos!";
    }

}
