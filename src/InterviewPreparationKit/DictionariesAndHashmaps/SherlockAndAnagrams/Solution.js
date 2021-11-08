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


function sherlockAndAnagrams(s) {
    let count = 0;
    let anagram = [];

    // finding anagram pairs
    for (let i = 0; i < s.length; i++) {
        for (let j = i + 1; j < s.length + 1; j++) {
            anagram.push(s.slice(i, j).split("").sort().join(""));
        }
    }

    // counting how many pairs in the anagram collection
    for(let i=0; i < anagram.length-1;i++){
        for(let j=i+1;j<anagram.length;j++){
            if(anagram[i]==anagram[j]) count++
        }
    }
    return count
}

function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

    const q = parseInt(readLine().trim(), 10);

    for (let qItr = 0; qItr < q; qItr++) {
        const s = readLine();

        const result = sherlockAndAnagrams(s);

        ws.write(result + '\n');
    }

    ws.end();
}
