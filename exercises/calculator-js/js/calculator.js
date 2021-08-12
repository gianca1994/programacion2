function calculator(expression) {
    let a = setNumber("number1");
    let b = setNumber("number2");
    return selectOperation(expression, a, b);
}

function selectOperation(expression, num1, num2) {
    let result;

    switch (expression) {
        case '1':
            result = sum(num1, num2);
            break;
        case '2':
            result = substract(num1, num2);
            break;
        case '3':
            result = multiplication(num1, num2);
            break;
        case '4':
            if (num2 === 0) return setResult("result", "Error");
            result = divition(num1, num2);
            break;

    }
    return setResult("result", result);
}

function setNumber(elementId) {
    return Number(document.getElementById(elementId).value);
}

function setResult(id, message) {
    return document.getElementById(id).innerHTML = message;
}

function sum(num1, num2) {
    return num1 + num2;
}

function substract(num1, num2) {
    return num1 - num2;
}

function multiplication(num1, num2) {
    return num1 * num2;
}

function divition(num1, num2) {
    return num1 / num2;
}