document.querySelector('form').addEventListener('submit', function (e) {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    if (!email || !password) {
        e.preventDefault();
        alert("Por favor, preencha todos os campos.");
    }
});



