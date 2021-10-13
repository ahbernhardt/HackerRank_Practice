'use strict';

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
 * Complete the 'minimumBribes' function below.
 *
 * The function accepts INTEGER_ARRAY q as parameter.
 */

function minimumBribes(q) {
    let countBribes = []
    let high = 0;

    for (let i = 0; i < q.length; i++) {
        let val = q[i]
        countBribes[val] = 0
        high = Math.max(val, high)  // update the highest value encountered

        if (val < high) {
            // if current value < high value, increment value for all countBrides indices > val
            for (let j=val+1; j < countBribes.length; j++) {
                countBribes[j]++
                if (countBribes[j] > 2) {
                    console.log("Too chaotic")
                    return;
                }
            }
        }
    }
    const sum = countBribes.reduce((a,b) => a + b, 0)  // sum
    console.log(sum);

}

function main() {
    const t = parseInt(readLine().trim(), 10);

    for (let tItr = 0; tItr < t; tItr++) {
        const n = parseInt(readLine().trim(), 10);

        const q = readLine().replace(/\s+$/g, '').split(' ').map(qTemp => parseInt(qTemp, 10));

        minimumBribes(q);
    }
}
