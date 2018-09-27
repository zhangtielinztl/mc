//折线图堆叠
(function(){

    var myChart = echarts.init(document.getElementById("Stack"));

    option = {
        title: {
            text: '用户统计'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data:['老人','医生','亲人']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: ['2018-09-10','2018-09-11','2018-09-12','2018-09-13','2018-09-14']
        },
        yAxis: {
            type: 'value'
        },
        series: [
            {
                name:'老人',
                type:'line',
                stack: '总量',
                data:[362, 214, 356, 365, 215]
            },
            {
                name:'医生',
                type:'line',
                stack: '总量',
                data:[50, 63, 56, 79, 65]
            },
            {
                name:'亲人',
                type:'line',
                stack: '总量',
                data:[800, 860, 936, 567, 856]
            }
        ]
    };

    myChart.setOption(option);
})();
(function(){

    var pie4= echarts.init(document.getElementById("pie0"));

    option = {
        title : {
            text: '用户角色统计',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['老人','亲人','社区','医生']
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:1520, name:'老人'},
                    {value:4019, name:'亲人'},
                    {value:8, name:'社区'},
                    {value:313, name:'医生'},

                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };

    pie4.setOption(option);
})();

