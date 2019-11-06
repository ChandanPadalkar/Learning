var width = 300;
var height = 200;
var padding = 2;
var dataset = [5, 10, 15, 20, 25, 11, 25, 18, 7];
var svg = d3.select("body").append("svg").attr("width", width).attr("height", height);

// svg.selectAll("rect")
//     .data(dataset)
//     .enter()        //to create rect element
//     .append("rect")
//     .attr("x", function (d, i) {
//         return i * (width / dataset.length);        //i: index, d: data in the dataset
//     })
//     .attr("y", function (d) {
//         return height - (d * 4);    //to draw chart from bottom to top, if y=0 then it will be top to down
//     })
//     .attr("width", width / dataset.length - padding)    //padding is used to keep gap between bars

//     .attr("height", function (d) {
//         return d * 4;       //multiplied by 4 to increase height of bars i.e. rectangle
//     })
//     .attr("fill", function (d) {
//         return "rgb(0, 0," + (d * 10) + ")";
//     })

function colorPicker(v) {
    if (v <= 20) { return "#666666"; }
    else if (v > 20) { return "#FF0033"; }
}
// using multi-value map - include d3-selection-multi.v1.min.js
svg.selectAll("rect").data(dataset).enter().append("rect")
    .attrs({
        x: function (d, i) { return i * (width / dataset.length); },
        y: function (d) { return height - (d * 4); },
        width: width / dataset.length - padding,
        height: function (d) { return d * 4; },
        fill: function (d) { return colorPicker(d); }
    });

//text on chart
svg.selectAll("text").data(dataset).enter().append("text")
    .text(function (d) { return d; })
    .attrs({
        "text-anchor": "middle",
        x: function (d, i) { return i * (width / dataset.length) + (width / dataset.length - padding) / 2; },
        y: function (d) { return height - (d * 4) + 14; },
        "font-family": "sans-serif",
        "font-size": "12",
        "fill": "white"
    });