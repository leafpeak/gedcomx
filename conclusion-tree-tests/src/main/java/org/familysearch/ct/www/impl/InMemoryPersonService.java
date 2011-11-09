package org.familysearch.ct.www.impl;

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.core.spi.component.ComponentScope;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.InjectableProvider;
import org.familysearch.ct.www.binding.PersonService;
import org.gedcomx.common.Attribution;
import org.gedcomx.conclusion.Fact;
import org.gedcomx.conclusion.Gender;
import org.gedcomx.conclusion.Name;
import org.gedcomx.conclusion.Person;

import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Type;

/**
 * @author Ryan Heaton
 */
@Provider
public class InMemoryPersonService implements PersonService, InjectableProvider<Context, Type>, Injectable<PersonService> {

  public PersonService getValue() {
    return this;
  }

  public ComponentScope getScope() {
    return ComponentScope.Singleton;
  }

  public Injectable getInjectable(ComponentContext ic, Context context, Type type) {
    if (type instanceof Class && PersonService.class.isAssignableFrom((Class) type)) {
      return this;
    }
    
    return null;
  }

  public Person createPerson(boolean living, Name name, Gender gender, Fact death, String proofStatement) {
    Person person = new Person();
    person.setAttribution(new Attribution());
    person.getAttribution().setProofStatement(proofStatement);
    person.setLiving(living);
    return person;
  }

  /**
   * Create a person.
   *
   * @param person         Person object containing the data for the conclusion tree person that is to be created
   * @param proofStatement The proof statement that was given by the user when the person was created.
   * @return id of the person that was created
   */
  public String createPerson(Person person, String proofStatement) throws IllegalArgumentException {
    return null;
  }

  public Person readPerson(String id) {
    Person person = new Person();
    person.setId(id);
    return person;
  }

  public void deletePerson(String id, String proofStatement) {
    //no-op...
  }
}
