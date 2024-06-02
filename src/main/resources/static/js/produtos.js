document.addEventListener("scroll", function(){
    const parallax = document.querySelector(".parallax");
    let scrollPosition = window.pageYOffset;

    parallax.style.backgroundPositionY = -scrollPosition * 0.5 + "px";
});