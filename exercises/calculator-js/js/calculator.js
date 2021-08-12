function setResult(id, message){
    return document.getElementById(id).innerHTML = message;
}

function calculator(expression) {
    let a = Number(document.getElementById("number1").value);
    let b = Number(document.getElementById("number2").value);
    let result;

    switch (expression) {
        case '1':
            result = a + b;
            break;
        case '2':
            result = a - b;
            break;
        case '3':
            result = a * b;
            break;
        case '4':
            result = a / b;
            if (b == 0) return setResult("result", "Error");
            break;

    }
    return setResult("result", result);

}