package br.com.luanhenriquer8.myspringtoolskotlin.controllers

import br.com.luanhenriquer8.myspringtoolskotlin.models.Person
import br.com.luanhenriquer8.myspringtoolskotlin.services.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/person")
class PersonController {

    @Autowired
    private lateinit var personService: PersonService

    @GetMapping("{id}")
    private fun findOnePerson(@PathVariable("id") id: Long): ResponseEntity<Person> {
        return ResponseEntity.ok(personService.findOnePerson(id).get())
    }

    @GetMapping
    private fun findAllPersons(): ResponseEntity<List<Person>> {
        return ResponseEntity.ok(personService.findAllPersons())
    }

    @PostMapping
    private fun createPerson(@RequestBody person: Person): ResponseEntity<Person> {
        return ResponseEntity.ok(personService.createPerson(person))
    }

    @PutMapping
    private fun updatePerson() {

    }

    @DeleteMapping("{id}")
    private fun deletePerson(@PathVariable("id") id: Long) {
//        ret
    }
}


