// 先定義 Suite Enum
enum Suite {
    DIAMOND, CLUB, HEART, SPADE
}

public class Card {
    private int rank; // 1-13
    private Suite suite; // 修正：用 Suite Enum 而唔係 char

    // Constructor
    public Card(int rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    // Getter
    public int getRank() {
        return this.rank;
    }

    public Suite getSuite() {
        return this.suite;
    }

    // 只有一個 main method
    public static void main(String[] args) {
        // 建立一張 A 階磚 (假設 1 是 A)
        Card c1 = new Card(1, Suite.DIAMOND);
        System.out.println("Rank: " + c1.getRank());   // 輸出: 1
        System.out.println("Suite: " + c1.getSuite()); // 輸出: DIAMOND
    }
}
