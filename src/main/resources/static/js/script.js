
document.addEventListener("DOMContentLoaded", ev =>  {
    const spinIcon = document.querySelector('.spin-icon');
    const hidden = document.querySelector('.hidden');
    spinIcon.addEventListener('animationend', () => {
        hidden.style.display = 'block';
    })
})
