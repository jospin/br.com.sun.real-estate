$(".active").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/country/active/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/country/list');

        }
    });
});

$(".inactive").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/country/inactive/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/country/list');
        }
    });
});
$(".delete").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/country/delete/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/country/list');
        }
    });
});
$(".edit").click(function(){
    var id = $(this).attr("rel");
    $(location).attr('href', '/admin/country/edit/' + id);
});