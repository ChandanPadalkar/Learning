var h = 100;
var w = 200;

monthlySales = [
    { "month": 10, "sales": 20 },
    { "month": 20, "sales": 14 },
    { "month": 30, "sales": 20 },
    { "month": 40, "sales": 21 },
    { "month": 50, "sales": 15 },
    { "month": 60, "sales": 22 },
    { "month": 70, "sales": 9 },
    { "month": 80, "sales": 6 },
    { "month": 90, "sales": 23 },
    { "month": 100, "sales": 7 }
];

var svg = d3.select("body").append("svg").attrs({ width: w, height: h });

var drawLine = d3.line()
    .x(function (d) { return d.month * 2; })
    .y(function (d) { return d.sales; })
    .curve(d3.curveBasis);

var viz = svg.append("path")
    .attrs({
        d: drawLine(monthlySales),
        "stroke": "purple",
        "stroke-width": "2",
        "fill": "none"
    });