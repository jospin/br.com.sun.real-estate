$(".active").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/city/active/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/city/list');

        }
    });
});

$(".inactive").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/city/inactive/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/city/list');
        }
    });
});
$(".delete").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/city/delete/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/city/list');
        }
    });
});
$(".edit").click(function(){
    var id = $(this).attr("rel");
    $(location).attr('href', '/admin/city/edit/' + id);
});