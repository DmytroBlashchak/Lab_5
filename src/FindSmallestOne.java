public class FindSmallestOne {
    public void finder(int firstNum, int secondNum, int thirdNum) {
        System.out.println("Your numbers is: " +"\nfirst one is: " +firstNum +"\n"+ "second one is: " +secondNum +"\n"+"third one is: " +thirdNum);
        int smalleststart = Math.min(secondNum,firstNum);
        int smallestend= Math.min(smalleststart,thirdNum);
        System.out.println("Your smallest number is: "+smallestend+"\n");
    }
}