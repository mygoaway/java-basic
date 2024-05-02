package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "범죄도시4";
        movieReview1.review = "재밌습니다";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "범죄도시3";
        movieReview2.review = "재미없었습니다.";

        MovieReview[] movieReviews = {movieReview1, movieReview2};
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목 : " + movieReview.title + ", 영화 리뷰 : " + movieReview.review);
        }
    }
}
