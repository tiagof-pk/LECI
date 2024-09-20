document.addEventListener('DOMContentLoaded', function() {
    // Get all reservation elements
    const reservations = document.querySelectorAll('.reservation');

    // Add click event listener to each reservation
    reservations.forEach(function(reservation) {
        reservation.addEventListener('click', function() {
            // Get reservation details
            const space = reservation.querySelector('p:nth-child(2)').textContent;
            const date = reservation.querySelector('p:nth-child(3)').textContent;
            const time = reservation.querySelector('p:nth-child(4)').textContent;

            // Display reservation details in popup
            showReservationPopup(space, date, time);
        });
    });

    // Function to display reservation details in popup
    function showReservationPopup(space, date, time) {
        const popup = document.getElementById('reservation-popup');
        const popupContent = document.getElementById('popup-content');

        // Set reservation details in popup
        popupContent.innerHTML = `
            <p><strong>Space:</strong> ${space}</p>
            <p><strong>Date:</strong> ${date}</p>
            <p><strong>Time:</strong> ${time}</p>
        `;

        // Show the popup
        popup.style.display = 'block';
    }

    // Close popup when close button is clicked
    const closeBtn = document.querySelector('.close-btn');
    closeBtn.addEventListener('click', function() {
        const popup = document.getElementById('reservation-popup');
        popup.style.display = 'none';
    });
});