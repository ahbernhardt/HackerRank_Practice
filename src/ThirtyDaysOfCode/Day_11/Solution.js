function main() {
  let arr = [];
  for (let arr_i = 0; arr_i < 6; arr_i++) {
	  arr[arr_i] = readLine().split(' ');
	  arr[arr_i] = arr[arr_i].map(Number);
  }

  var sumArray = [];
  for (let row = 0; row < arr.length; row++) {
	for (let col = 0; col < arr[row].length; col++) {
	  var singleSum = 0;
	  if (arr[row] && arr[row + 1] && arr[row + 2]) {
		if (arr[row][col + 1] !== undefined && arr[row][col + 2] !== undefined) {
		  sumArray.push(
		  	arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
			             + arr[row + 1][col + 1]
			+ arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]);
		}
	  }
	}
  }
console.log(Math.max.apply(null, sumArray));
}
