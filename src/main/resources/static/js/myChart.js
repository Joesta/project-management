
// chartData schema --> "[{\"label\":\"COMPLETED\",\"value\":1},{\"label\":\"INPROGRESS\",\"value\":2},{\"label\":\"NOTSTARTED\",\"value\":1}]"
var arrJson = decodeHtml(chartData);
// convert JSON into javaScrpt object
var arrChartData = JSON.parse(arrJson);

var labels = [];
var data = [];

for(var i = 0; i < arrChartData.length; i ++) {
	labels[i] = arrChartData[i].label;
	data[i] = arrChartData[i].value;
}

console.log('labels', labels);
console.log('data', data);

// For a pie chart
new Chart(document.getElementById("myPieChart"), {
	type: 'pie',
	  data: {
        labels: labels,
        datasets: [{
            label: '# of Votes',
            data: data,
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',

            ],
            borderColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
            ],
            borderWidth: 1
        }]
    },
	options: options
});

function decodeHtml(html) {
	var txt = document.createElement("textarea");
	txt.innerHTML = html;
	return txt.value;
}