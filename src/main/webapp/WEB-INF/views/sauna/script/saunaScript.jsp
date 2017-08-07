<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'line', 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawChart);

	function drawChart() {

		var chartDiv = document.getElementById('chart_div');
		var thermals =eval('${thermals}');
		
		var data = new google.visualization.DataTable();
		data.addColumn('datetime', 'Time');
		data.addColumn('number', "Temperature");
		for (i = 0; i < thermals.length; i++) { 
			data.addRow([new Date(thermals[i].timeStamp),thermals[i].degree]);
		}
		var materialOptions = {
			chart : {
				title : 'Temperature in Pihasauna'
			},
			width : 900,
			height : 500,
			series : {
				// Gives each series an axis name that matches the Y-axis below.
				0 : {
					axis : 'Temps'
				},
			},
			axes : {
				// Adds labels to each axis; they don't have to match the axis names.
				y : {
					Temps : {
						label : 'Temperature (Celsius)'
					},
				}
			}
		};

		var materialChart = new google.charts.Line(chartDiv);
		materialChart.draw(data, materialOptions);

	}
</script>