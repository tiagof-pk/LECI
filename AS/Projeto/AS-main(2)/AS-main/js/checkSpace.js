document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById('availability-form');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        // Get form data
        const association = document.getElementById('association').value;
        const date = document.getElementById('date').value;
        const time = document.getElementById('time').value;
        const space = document.getElementById('space').value;
        const duration = document.getElementById('duration').value;

        // Simulate availability check (replace with actual logic)
        const isAvailable = checkAvailability(date, time);

        // Display availability result
        if (isAvailable) {
            showAvailablePopup('Space is available!');
        } else {
            showUnavailablePopup('Space is not available. Please choose a different time.');
        }
    });

        // Function to check availability
    function checkAvailability(date, time) {
        // Simulated unavailable time range (Monday to Friday, 9:00 AM to 5:00 PM)
        const unavailableTimeStart = new Date(date + 'T09:00');
        const unavailableTimeEnd = new Date(date + 'T17:00');
        const selectedTime = new Date(date + 'T' + time);

        // Explanation: Space is unavailable if the selected time is within the range of 9:00 AM to 5:00 PM (Monday to Friday)
        const isUnavailable = (selectedTime >= unavailableTimeStart && selectedTime <= unavailableTimeEnd && selectedTime.getDay() >= 1 && selectedTime.getDay() <= 5);

        return !isUnavailable;
    }

    // Function to display pop-up message for available space
    function showAvailablePopup(message) {
        const popup = document.getElementById('availability-available');
        const popupMessage = popup.querySelector('p');
        popupMessage.textContent = message;

        // Show the pop-up
        popup.style.display = 'flex';

        // Close pop-up after 3 seconds
        setTimeout(function() {
            popup.style.display = 'none';
        }, 3000);
    }

    // Function to display pop-up message for unavailable space
    function showUnavailablePopup(message) {
        const popup = document.getElementById('availability-unavailable');
        const popupMessage = popup.querySelector('p');
        popupMessage.textContent = message;

        // Show the pop-up
        popup.style.display = 'flex';

        // Close pop-up after 3 seconds
        setTimeout(function() {
            popup.style.display = 'none';
        }, 3000);
    }
});