document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById('equipment-reservation-form');



    form.addEventListener('submit', function(event) {
        event.preventDefault();

        // Get form data
        const association = document.getElementById('association').value;
        const date = document.getElementById('date').value;
        const time = document.getElementById('time').value;
        const equipment = document.getElementById('equipment').value;
        const duration = document.getElementById('duration').value;

        // Simulate availability check (replace with actual logic)
        const isAvailable = checkAvailability(date, time);

        // Display availability result
        if (isAvailable) {
            showPopup(true, 'Equipment is available!', function() {
                window.location.href = 'myReserve.html';
            });
        } else {
            showPopup(false, 'Equipment is not available. Please choose a different time.');
        }
    });


    function showPopup(isAvailable, message, callback) {
        const popupAvailable = document.getElementById('availability-available');
        const popupUnavailable = document.getElementById('availability-unavailable');

        if (isAvailable) {
            popupAvailable.style.display = 'block';
            window.location.href = "myReserve.html";
            setTimeout(function() {
                popupAvailable.style.display = 'none';
                if (callback) callback();
            }, 3000);
        } else {
            popupUnavailable.style.display = 'block';
            setTimeout(function() {
                popupUnavailable.style.display = 'none';
            }, 3000);
        }
    }
});
