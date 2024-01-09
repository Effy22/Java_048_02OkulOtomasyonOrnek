package Com.Elif.repository;

import Com.Elif.entity.Contact;

public class ContactRepository extends RepositoryManager<Contact,Long> {
    public ContactRepository() {
        super(new Contact());
    }
}
