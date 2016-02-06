package webserver

class Reserva {

	String name
	String phone
	Date date
	static belongsTo = [table: Mesa]
	

    static constraints = {
    }
}
