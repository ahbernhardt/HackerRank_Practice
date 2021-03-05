class Student extends Person {
  // Write your constructor here
  constructor(firstName, lastName, id, scores) {
	super(firstName, lastName, id);
	this.scores = scores;
  }

  // Write your method here
  calculate() {
	var total = 0;
	for (var i = 0; i < this.scores.length; i++) {
	  total += this.scores[i]
	}
	var averageScore = (total / this.scores.length);
	if (averageScore <= 100 && averageScore >= 90) {
	  return 'O';
	} else if (averageScore < 90 && averageScore >= 80) {
	  return 'E';
	} else if (averageScore < 80 && averageScore >= 70) {
	  return 'A';
	} else if (averageScore < 70 && averageScore >= 55) {
	  return 'P';
	} else if (averageScore < 55 && averageScore >= 40) {
	  return 'D';
	} else if (averageScore < 40) {
	  return 'T';
	}
  }
}
