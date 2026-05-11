object Main {
// Function, output int
def calculateScore(word: String): Int = {
  var score = 0

  for (c <- word) {
    if(c != 'a') score += 1
  }

  score
}

def wordScore(word: String): Int = {
  word.count(c => c != 'a')
}

def main(args: Array[String]): Unit = {

  println(calculateScore("hallo")) // returns 4, because no a
  println(wordScore("hallo")) // returns 4, because no a

}
}