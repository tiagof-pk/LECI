document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById('reserve-form');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        // Get form data
        const company = document.getElementById('company').value;
        const space = document.getElementById('space').value;
        const date = document.getElementById('date').value;
        const duration = document.getElementById('duration').value;
        const people = document.getElementById('people').value;

        // Simulate reservation check (replace with actual logic)
        const isAvailable = checkReservation(company, space, date, duration, people);

        // Display reservation result
        if (isAvailable) {
            showPopup('reserve-available');
            setTimeout(function() {
                window.location.href = "myReserve.html";
            }, 3000); // Redirect after 3 seconds
        } else {
            showPopup('reserve-unavailable');
        }
    });

    // Function to check reservation
    function checkReservation(company, space, date, duration, people) {
        // Simulate a successful reservation for demonstration purposes
        return true;
    }

    // Function to show the pop-up
    function showPopup(popupId) {
        const popup = document.getElementById(popupId);
        popup.style.display = 'block';

        // Close the pop-up after 3 seconds
        setTimeout(function() {
            popup.style.display = 'none';
        }, 3000);
    }
});