
(function(){
	
var columnar1 = echarts.init(document.getElementById("columnar1"));

option = {
	
	title: {
		text: "柱状图",
		x:'left'
	},
	
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            type : 'category',
            data : ['森和小区', '福慧安家园', '奥林水榭', '水岸林邸', '流曲嘉园', '莱茵左岸', '维纳小区','其他'],
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'直接访问',
            type:'bar',
            barWidth: '60%',
            data:[201, 156, 158, 234, 245, 198, 220,100]
        }
    ]
};

columnar1.setOption(option);
})();

(function(){

    var columnar1 = echarts.init(document.getElementById("columnar2"));

    option = {

        title: {
            text: "柱状图",
            x:'left'
        },

        color: ['#3398DB'],
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data : ['55-65', '65-75', '75-85', '85以上'],
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'直接访问',
                type:'bar',
                barWidth: '60%',
                data:[789, 432, 210, 81]
            }
        ]
    };

    columnar1.setOption(option);
})();
(function(){

    var columnar1 = echarts.init(document.getElementById("columnar3"));

    option = {

        title: {
            text: "柱状图",
            x:'left'
        },

        color: ['#3398DB'],
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data : ['男', '女'],
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'直接访问',
                type:'bar',
                barWidth: '60%',
                data:[870, 642]
            }
        ]
    };

    columnar1.setOption(option);
})();

