public class Deck {
    // 1. 定義一個裝住 52 張牌嘅 Array
    private Card[] cards;

    // Constructor: 當你 new Deck() 嗰陣，呢度會自動執行
    public Deck() {
        // 2. 初始化 Array 長度為 52
        this.cards = new Card[13 * Suite.values().length];
        int index = 0;

        // 3. 用 Nested Loop 產生 52 張牌
        // 外層 Loop 執 4 個花色 (Suite)
        for (Suite s : Suite.values()) {
            // 內層 Loop 執 13 個點數 (Rank 1-13)
            for (int r = 1; r <= 13; r++) {
                this.cards[index] = new Card(r, s);
                index++;
            }
        }
    }

    // Getter 俾人睇到副牌
    public Card[] getCards() {
        return this.cards;
    }

    public static void main(String[] args) {
        Deck d1 = new Deck(); // 呢度會 call 上面個 Constructor
        
        // 試吓印第一張同最後一張牌出嚟睇吓
        System.out.println(d1.getCards()[0].getRank() + " of " + d1.getCards()[0].getSuite());
        System.out.println(d1.getCards()[51].getRank() + " of " + d1.getCards()[51].getSuite());
    }
}