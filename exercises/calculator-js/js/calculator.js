function calculator(expression) {
    let a = setNumber('number1');
    let b = setNumber('number2');
    return selectOperation(expression, a, b);
}

function selectOperation(expression, num1, num2) {
    let result;
    let operation;

    switch (expression) {
        case '1':
            result = sum(num1, num2);
            operation = '+';
            break;
        case '2':
            result = substract(num1, num2);
            operation = '-';
            break;
        case '3':
            result = multiplication(num1, num2);
            operation = '*';
            break;
        case '4':
            if (divitionIsInfinity(num2) === true) {return setResult('result', 'Error');}
            result = divition(num1, num2);
            operation = '/';
            break;
        case '5':
            result = Math.pow(num1, num2);
            operation = '^';
            break;
    }
    result = operationDescription(operation, num1, num2) + result;
    return setResult('result', result);
}

// Setters
function setNumber(elementId) {
    return Number(document.getElementById(elementId).value);
}

function setResult(id, message) {
    return document.getElementById(id).innerHTML = message;
}

// Check to avoid infinity as a result
function divitionIsInfinity(num) {
    if (num === 0) return true;
}

// Operations
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

function operationDescription(operation, num1, num2) {
    return num1 + ' ' + operation + ' ' + num2 + ' = ';
}