
const citySelect = document.getElementById("city");
const dateInput = document.getElementById("date");

const selectedCity = document.getElementById("selectedCity");
const selectedDate = document.getElementById("selectedDate");

citySelect.addEventListener("change", function () {
    selectedCity.textContent = citySelect.value;
});

dateInput.addEventListener("change", function () {
    selectedDate.textContent = dateInput.value;
});
