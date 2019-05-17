function UserService() {

    this.findAllUsers = findAllUsers
    this.createUser = createUser

    // POST - Create
    function createUser(user) {
        return fetch('http://localhost:8080/users', {
            method: 'POST',
            body: JSON.stringify(user),
            headers: {
                'content-type': 'application/json'
            }
        }).then(function(response){
            return response.json()
        })
    }
    
    // GET - Read
    function findAllUsers() {
        return fetch('http://localhost:8080/users')
            .then(function(response){
                return response.json()
        })
    }
}