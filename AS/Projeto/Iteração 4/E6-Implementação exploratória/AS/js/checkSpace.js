document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById('availability-form');

    form.addEventListener('submit', function(event) {
        event.preventDefault();

        // Get form data
        const association = document.getElementById('company').value;
        const date = document.getElementById('date').value;
        const time = document.getElementById('time').value;
        const space = document.getElementById('space').value;
        const duration = document.getElementById('duration').value;

        // Simulate availability check (replace with actual logic)
        const isAvailable = checkAvailability(date, time);

        // Display availability result
        if (isAvailable) {
            showPopup(true);
        } else {
            showPopup(false);
        }
    });

    // Function to check availability
    function checkAvailability(date, time) {
        // Simulated unavailable time range (Monday to Friday, 9:00 AM to 5:00 PM)
        const unavailableTimeStart = new Date(date + 'T09:00');
        const unavailableTimeEnd = new Date(date + 'T17:00');
        const selectedTime = new Date(date + 'T' + time);

        return !(selectedTime >= unavailableTimeStart && selectedTime <= unavailableTimeEnd);
    }

    function showPopup(isAvailable) {
        const availablePopup = document.getElementById('availability-available');
        const unavailablePopup = document.getElementById('availability-unavailable');

        if (isAvailable) {
            unavailablePopup.style.display = 'none';
            availablePopup.style.display = 'block';
        } else {
            availablePopup.style.display = 'none';
            unavailablePopup.style.display = 'block';
        }

        // Hide the pop-up after 3 seconds
        setTimeout(function() {
            availablePopup.style.display = 'none';
            unavailablePopup.style.display = 'none';
        }, 3000);
    }
});
