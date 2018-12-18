
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

jQuery(document).ready(function () {
    getDatas();
})
