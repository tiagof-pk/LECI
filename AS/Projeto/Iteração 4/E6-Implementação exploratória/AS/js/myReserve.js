document.addEventListener('DOMContentLoaded', function() {
    let timerInterval;
    let seconds = 3600; // 60 minutes

    const timeDisplay = document.getElementById('time');
    const tempValue = document.getElementById('temp-value');
    const lumValue = document.getElementById('lum-value');
    const temperatureSlider = document.getElementById('temperature');
    const luminositySlider = document.getElementById('luminosity');

    function formatTime(seconds) {
        const mins = Math.floor(seconds / 60);
        const secs = seconds % 60;
        return `${String(mins).padStart(2, '0')}:${String(secs).padStart(2, '0')}`;
    }

    function updateTimer() {
        timeDisplay.textContent = formatTime(seconds);
    }

    function startTimer() {
        if (!timerInterval) {
            timerInterval = setInterval(function() {
                if (seconds > 0) {
                    seconds--;
                    updateTimer();
                } else {
                    clearInterval(timerInterval);
                    timerInterval = null;
                }
            }, 1000);
        }
    }

    startTimer();

    temperatureSlider.addEventListener('input', function() {
        tempValue.textContent = this.value;
    });

    luminositySlider.addEventListener('input', function() {
        lumValue.textContent = this.value;
    });

    document.getElementById('reserve-btn').addEventListener('click', function() {
        window.location.href = 'equipment_form.html';
    });

    document.getElementById('end-btn').addEventListener('click', function() {
        window.location.href = 'home.html';
    });

    document.getElementById('help-btn').addEventListener('click', function() {
        window.location.href = 'Helpdesk.html';
    });

    updateTimer();
});