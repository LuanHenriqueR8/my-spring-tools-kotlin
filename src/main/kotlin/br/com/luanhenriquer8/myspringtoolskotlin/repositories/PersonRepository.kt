package br.com.luanhenriquer8.myspringtoolskotlin.repositories

import br.com.luanhenriquer8.myspringtoolskotlin.models.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<Person, Long>