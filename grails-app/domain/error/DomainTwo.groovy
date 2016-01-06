package error

class DomainTwo {

	DomainOne getRelatedDomainOne(){
		DomainOne.findByDomainTwo(this)
	}

    static constraints = {
    }
}
