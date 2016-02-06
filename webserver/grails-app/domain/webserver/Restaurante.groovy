package webserver

class Restaurante {

	String name
	String address
	byte []image
	boolean parking
	String open
	String close
	String phone
	String deadline
	static belongsTo = [area: Area]
	static hasMany = [table: Mesa]


    static constraints = {
    }
}
