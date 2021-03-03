function factorial(n) {
  var result = 0;
  if (n <= 1) {
	return 1;
  } else {
	result = n * factorial(n - 1);
  }
  return result;
}
