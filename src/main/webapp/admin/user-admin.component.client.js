(function () {
    var userService = new UserService();
    var rowTemplate;
    var tbody;
    var createUserBtn;

    jQuery(main);
    
    function main() {
        rowTemplate = jQuery('.wbdv-template');
        createUserBtn = jQuery('.wbdv-create');
        tbody = jQuery('tbody');

        createUserBtn.click(createUser);
        
        userService
            .findAllUsers()
            .then(renderUsers)
    }
    
    function createUser() {
        var usernameFld = $('#usernameFld');
        var passwordFld = '';

        var username = usernameFld.val();
        var password = 'boggus';

        var user = {
            username: username,
            password: password,
            firstName: ''
        }

        userService
            .createUser(user)
            .then(renderUsers)
    }

    function renderUsers(users) {
        tbody.empty()
        for(var u in users) {
            const user = users[u]
            const rowClone = rowTemplate.clone();
            rowClone.removeClass('wbdv-hidden');
            rowClone.find('.wbdv-username').html(user.username);
            tbody.append(rowClone);
        }
    }
})()