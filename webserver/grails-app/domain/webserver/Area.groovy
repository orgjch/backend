package webserver

class Area {

	String area
	String province
	String neighborhood

	static hasMany = [restaurant: Restaurante]

    static constraints = {
    }
}
