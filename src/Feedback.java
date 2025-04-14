class Feedback {

//    recieve the number of stars from the user and display it
    public void submitRating(int stars) {
        System.out.println("Submitted rating: " + stars + " stars");
    }

    //    recieve the review from the user and display it
    public void writeReview(String text) {
        System.out.println("Review submitted: " + text);
    }
}