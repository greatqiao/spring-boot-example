
var getDatas = function () {

    $.ajax({
        url: "/girl/Girls",
        type: "POST",
        data: {},
        dataType: "json",
        success: function (result) {
            var rd = result;
            $('#mytable').bootstrapTable({
                columns:[{
                    "field":"id",
                    "title":"姓名",
                    "align":"center"
                },{
                    "field":"age",
                    "title":"年龄",
                    "align":"center"
                },{
                    "field":"cupSize",
                    "title":"hehe",
                    "align":"center"
                }],
                data: rd
            });

            $.each(rd,function (i,obj) {
                i;
                obj;

            })

        },
        error: function () {
            alert("error")
        }


    });
}

var init = function(){
    $('#table1').bootstrapTable({
        columns:[{
            "field":"name",
            "title":"名称",
            "align":"center"
        },{
            "field":"money",
            "title":"金额",
            "align":"center"
        },{
            "field":"copy",
            "title":"份数",
            "align":"center"
        }]
    });
}


jQuery(document).ready(function () {
    init();
})
