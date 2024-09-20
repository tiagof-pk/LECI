const init = () => {
    const validateEmail = (event) => {
    const input = event.currentTarget;
    const regex =   /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    const emailTest = regex.test(input.value);

        if(!emailTest){
            SubmitButton.setAttribute('disabled', 'disabled');
            input.nextElementSibling.classList.add('error');
        } else{
            SubmitButton.removeAttribute('disabled');
            input.nextElementSibling.classList.remove('error');
        }
    } 

    const validatePassword = (event) => {
        const input = event.currentTarget;

        if(input.value.length < 8){
            SubmitButton.setAttribute('disabled', 'disabled');
            input.nextElementSibling.classList.add('error');
        } else {
            SubmitButton.removeAttribute("disabled");
            input.nextElementSibling.classList.remove('error');
        }
    }

    const inputEmail = document.querySelector('input[type="email"]');
    const inputPassword  = document.querySelector('input[type="password"]');
    const SubmitButton = document.querySelector('.login__submit');

    inputEmail.addEventListener('input', validateEmail);
    inputPassword.addEventListener('input', validatePassword);

    const errorHandler = () => {
        SubmitButton.classList.remove('success');
        SubmitButton.classList.add('error');
        SubmitButton.textContent = "Error :("
    }

    const successHandler = () => {
        SubmitButton.classList.remove('error');
        SubmitButton.classList.add('success');
        SubmitButton.textContent = "Sent! :)"
    }

    if(SubmitButton){
        SubmitButton.addEventListener('click', (event) => {
            event.preventDefault();

            SubmitButton.textContent = "...Loading";
 

            fetch('https://reqres.in/api/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    email: inputEmail.value,
                    password: inputPassword.value,
                })
            }).then((response) => {
                if (response.status !== 200) {
                    return errorHandler();
                }    
                successHandler();    
            }).catch(() => {
                errorHandler();
            })
        })
    }
}

window.onload = init;

document.getElementById('passwordForm').addEventListener('submit', function(event) {
    var password1 = document.getElementById('password1').value;
    var password2 = document.getElementById('password2').value;

    if (password1 !== password2) {
        alert('As senhas não são iguais.');
        event.preventDefault();
    }
});

document.getElementById('passwordForm').addEventListener('submit', function(event) {
    var password1 = document.getElementById('password1').value;
    var password2 = document.getElementById('password2').value;

    if (password1 !== password2) {
        alert('As senhas não são iguais.');
        event.preventDefault();
    }
});
