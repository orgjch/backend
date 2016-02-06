class UrlMappings {

	static mappings = {
        "/restaurant/search"(controller:'search', action: 'search')
        "/restaurant/reservation"(controller:'reservation', parseRequest: true){
        	action = [POST:'create', PUT: 'update']
        }
        "/restaurant/"(controller:'restaurant', parseRequest: true){
        	action = [POST:'create', PUT: 'update']
        }
        "restaurant/table"(controller:'table', parseRequest: true){
        	action = [POST:'create', PUT: 'update']
        }
        "restaurant/area"(controller:'area', parseRequest: true){
        	action = [POST:'create', PUT: 'update']
        }
        "500"(view:'/error')
	}
}
