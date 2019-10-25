function save_row(no){
    var parameter_val=document.getElementById("parameter_text"+no).value;
    var product_val=document.getElementById("product_text"+no).value;

    document.getElementById("parameter_row"+no).innerHTML=name_val;
    document.getElementById("product_row"+no).innerHTML=product_val;

    document.getElementById("edit_button"+no).style.display="block";
    document.getElementById("save_button"+no).style.display="none";
}

function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}


function add_row()
{
    var new_parameter=document.getElementById("new_parameter").value;
    var new_product=document.getElementById("new_product").value;

    var table=document.getElementById("data_table");
    var table_len=(table.rows.length)-1;
    var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='parameter_row"+table_len+"'>"+new_parameter+"</td><td id='product_row"+table_len"'>"+new_product+"</td><td><input type='button' id='edit_button"+table_len+"' value='Edit' class='edit' onclick='edit_row("+table_len+")'> <input type='button' id='save_button"+table_len+"' value='Save' class='save' onclick='save_row("+table_len+")'> <input type='button' value='Delete' class='delete' onclick='delete_row("+table_len+")'></td></tr>";

    document.getElementById("new_parameter").value="";
    document.getElementById("new_product").value="";
}