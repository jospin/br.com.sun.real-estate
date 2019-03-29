$(".active").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/state/active/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/state/list');

        }
    });
});

$(".inactive").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/state/inactive/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/state/list');
        }
    });
});
$(".delete").click(function(){
    var id = $(this).attr("rel");
    $.ajax({
        url: "/admin/state/delete/"+id,
        success: function( result ) {
            $(location).attr('href', '/admin/state/list');
        }
    });
});
$(".edit").click(function(){
    var id = $(this).attr("rel");
    $(location).attr('href', '/admin/state/edit/' + id);
});
