/**
 * Created by Geek on 16/3/17.
 */
public class BuilderPattern {

    public static void main(String[] args) {

        Game footballGame = new Game.GameBuilder()
                            .homeTeam("Denver")
                            .awayTeam("Arizona")
                            .currentYardLine(10001)
                            .weather("Snow")
                            .stadium("Mile High")
                            .build();
    }

}

class Game {

    private String homeTeam;
    private String awayTeam;
    private int currentYardLine;
    private String weather;
    private String stadium;

    static final class GameBuilder {
        private String homeTeam;
        private String awayTeam;
        private int currentYardLine;
        private String weather;
        private String stadium;

        public GameBuilder() {

        }

        public GameBuilder homeTeam(String homeTeam) {
            this.homeTeam = homeTeam;
            return this;
        }

        public GameBuilder awayTeam(String awayTeam) {
            this.awayTeam = awayTeam;
            return this;
        }

        public GameBuilder currentYardLine(int currentYardLine) {
            this.currentYardLine = currentYardLine;
            return this;
        }

        public GameBuilder weather(String weather) {
            this.weather = weather;
            return this;
        }

        public GameBuilder stadium(String stadium) {
            this.stadium = stadium;
            return this;
        }


        public GameBuilder build(){

            if (this.homeTeam == null) {
                throw new IllegalStateException("home team cannot be null");
            }

            if (this.awayTeam == null) {
                throw new IllegalStateException("awayTeam cannot be null");
            }

            if (this.currentYardLine == 0) {
                throw new IllegalStateException("currentYardLine cannot be 0");
            }

            if (this.weather == null) {
                throw new IllegalStateException("weather cannot be null");
            }

            if (this.stadium == null) {
                throw new IllegalStateException("stadium cannot be null");
            }

            return this;
        }
    }


}