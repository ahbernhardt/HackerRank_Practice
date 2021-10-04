'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

function countingValleys(steps, path) {
    // Write your code here
    let seaLevel = 0;
    let temp = [];
    for (let ch of [...path]){
        if (ch === "U"){
            seaLevel += 1;
        } else if (ch === "D"){
            seaLevel -= 1;
        }
        if (!temp.length && seaLevel <= 0) {
            temp.push(seaLevel);
        } else if (temp[temp.length - 1] === 0 && seaLevel < 0) {
            temp.push(seaLevel);
        } else if (temp[temp.length - 1] < 0 && seaLevel === 0) {
            temp.push(seaLevel);
        }
    }
    if (temp.length === 0) return 0;
    let ans = temp.filter((t) => t !== 0).length;
    return ans;

}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const steps = parseInt(readLine().trim(), 10);

    const path = readLine();

    const result = countingValleys(steps, path);

    ws.write(result + '\n');

    ws.end();
}
