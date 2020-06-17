package br.com.luanhenriquer8.myspringtoolskotlin.services

import br.com.luanhenriquer8.myspringtoolskotlin.models.Person
import br.com.luanhenriquer8.myspringtoolskotlin.repositories.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService {

    @Autowired
    private lateinit var personRepository: PersonRepository

    fun findOnePerson(id: Long) = personRepository.findById(id)

    fun findAllPersons(): MutableList<Person> = personRepository.findAll()

    fun updatePerson(id: Long, person: Person): Person {
        val personFechted = personRepository.findById(id)
        val personToSave = Person().apply {
            this.id  = personFechted.get().id
            this.name = person.name
        }

        return personRepository.save(personToSave)
    }

    fun createPerson(person: Person) = personRepository.save(person)

    fun deletePerson(id: Long) = personRepository.deleteById(id)
}