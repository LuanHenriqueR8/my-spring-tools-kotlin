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

    fun findAllPersons() = personRepository.findAll()

//    fun createPerson() = personRepository.save()

    fun updatePerson(id: Long, person: Person): Person {
        return personRepository.save(person)
    }

    fun createPerson(person: Person) = personRepository.save(person)


//    fun deletePerson() = personRepository.delete()
}