
document.addEventListener("DOMContentLoaded", function() {
    let spinIcon = document.querySelector(".spin-icon");

    spinIcon.addEventListener("animationend", function() {
        console.log("done")
    });
});