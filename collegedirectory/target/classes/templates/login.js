// login.js
document.getElementById('login-form').addEventListener('submit', function (e) {
    e.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetch('/auth/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ username, password }),
    })
    .then(response => response.json())
    .then(data => {
        if (data === 'STUDENT') {
            window.location.href = '/student/dashboard';
        } else if (data === 'FACULTY_MEMBER') {
            window.location.href = '/faculty/dashboard';
        } else if (data === 'ADMINISTRATOR') {
            window.location.href = '/admin/dashboard';
        }
    })
    .catch(error => console.error('Error:', error));
});
