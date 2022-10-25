$(document).ready(function () {
    $("#load1").click(function () {
        $("#mydiv").load("./demo_test.txt", function (resp, status, xhr) {
            console.log(resp);
            console.log(status);
            console.log(xhr);
        })
    })
    $("#load2").click(function () {
        $("#mydiv").load("./jquery/hello?name=里斯", function (resp, status, xhr) {
            console.log(resp);
            console.log(status);
            console.log(xhr);
        })
    })
    let data = {
        name: "张三",
        say: "我叫你一声你敢答应码"
    }
    $("#load3").click(function () {
        $("#mydiv").load("./jquery/hello", data, function (resp, status, xhr) {
            console.log(resp);
            console.log(status);
            console.log(xhr);
        })
    })
    $("#load4").click(function () {
        $.get("./jquery/hello?name=里斯", function (resp, status, xhr) {
            if (status == "success") {
                $("#p1").text(resp)
            }
            console.log(resp);
            console.log(status);
            console.log(xhr);
        })
    })

    $("#load5").click(function () {
        $.post("./jquery/hello", data, function (resp, status, xhr) {
            if (status == "success") {
                $("#p1").text(resp)
            }
            console.log(resp);
            console.log(status);
            console.log(xhr);
        })
    })

    $("#load6").click(function () {
        $.ajax({
                async: true,
                url: "./jquery/hello?name=里斯",
                type: "get",
                success: function (res) {
                    $("#p1").text(res)
                },
                error: function (res) {
                    $("#p1").text("请求失败")
                }
            }
        )
    })

    $("#load7").click(function () {
        $.ajax({
                async: true,
                url: "./jquery/hell",
                data: data,
                type: "post",
                success: function (res) {
                    $("#p1").text(res)
                },
                error: function (res) {
                    $("#p2").text("请求失败")
                }
            }
        )
    })
})