def score = 0,throwNum=0,frameNum=0,frameMark=1,g={Character.digit(it,10)},s=args[0].replaceAll("-", "")
for (; frameNum < 10; throwNum++) {
    score += s.charAt(throwNum) == 'X' ? 10 + ((s.charAt(throwNum + 1) == 'X' ? 10 + (s.charAt(throwNum + 2) == 'X' ? 10 : g(s.charAt(throwNum + 2))) : (s.charAt(throwNum + 2) == '/' ? 10 : (g(s.charAt(throwNum + 1)) + g(s.charAt(throwNum + 2)))))) : (s.charAt(throwNum) == '/' ? (10 - g(s.charAt(throwNum - 1))) + (s.charAt(throwNum + 1) == 'X' ? 10 : g(s.charAt(throwNum + 1))) : g(s.charAt(throwNum)));
    frameNum += s.charAt(throwNum) == 'X' ? (frameMark = 1) : (s.charAt(throwNum) == '/' ? (frameMark = 1) :((frameMark == 0 && throwNum > 0 && s.charAt(throwNum - 1) != 'X' && s.charAt(throwNum - 1) != '/') ? frameMark = 1 : (frameMark = 0)));
}
print (score)