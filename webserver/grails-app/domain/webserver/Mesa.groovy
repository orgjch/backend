package webserver

class Mesa {

	int chairs
	static belongsTo = [restaurant: Restaurante]
	static hasMany = [reservation: Reserva]


    static constraints = {
    }
}
