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

function checkMagazine(magazine, note) {
    let i;
    const map = {}; //create map
    let replicable = true;
    for (i of magazine ) { //magazine string
        map[i] = (map[i] || 0) + 1;
    }
    for (i of note ) { //note string
        map[i] = (map[i] || 0) - 1;
    }
    for ( i in map ) { //checking note to magazine
        if ( map[i] < 0 ) {
            replicable = false;
            break;
        }
    }
    console.log(replicable ? 'Yes' : 'No');
}

function main() {
    const firstMultipleInput = readLine().replace(/\s+$/g, '').split(' ');

    const m = parseInt(firstMultipleInput[0], 10);

    const n = parseInt(firstMultipleInput[1], 10);

    const magazine = readLine().replace(/\s+$/g, '').split(' ');

    const note = readLine().replace(/\s+$/g, '').split(' ');

    checkMagazine(magazine, note);
}
