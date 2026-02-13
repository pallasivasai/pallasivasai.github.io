// Typed.js animation
var typed = new Typed('.animate', {
    strings: [
        "P Siva Sai",
        "a Student",
        "a Backend Developer",
        "a Frontend Developer",
        "a Web Developer",
        "a Full Stack Developer",
    ],
    typeSpeed: 50,
    backDelay: 900,
    backSpeed: 50,
    loop: true
});

// Loader - Shows for 500ms then fades out and removes from DOM
$(window).on('load', function() { 
    setTimeout(function() {
        $('.loader-wrapper').fadeOut('fast', function() {
            $(this).remove(); // Completely remove loader from DOM
        });
        $('body').css({'overflow': 'visible'}); // Ensure body is scrollable
    }, 500); // Wait 500ms before hiding (reduced from 1000ms)
});

// Mobile Navigation Toggle
function myFunction() {
    var x = document.getElementById("myTopnav");
    var y = document.getElementById("myDIV");    
    if (x.className === "nav-bar" && y.className === "fa fa-bars") {
        x.className += " responsive";
        y.className = "fa fa-times";
        y.style.fontSize = "30px";
    } else {
        x.className = "nav-bar";
        y.className = "fa fa-bars";
        y.style.fontSize = "24px";
    }
}

// Smooth Scrolling for Navigation Links
$(document).ready(function(){
    $(".nav-items").on('click', function(event) {
        if (this.hash !== "") {
            event.preventDefault();
            var hash = this.hash;
            
            $('html, body').animate({
                scrollTop: $(hash).offset().top - 70
            }, 800, function(){
                window.location.hash = hash;
            });
            
            // Close mobile menu after clicking
            var x = document.getElementById("myTopnav");
            if (x.className.includes("responsive")) {
                x.className = "nav-bar";
                var y = document.getElementById("myDIV");
                y.className = "fa fa-bars";
                y.style.fontSize = "24px";
            }
        }
    });
});