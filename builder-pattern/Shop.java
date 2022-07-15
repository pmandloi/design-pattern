public class Shop {
    public static void main(String[] args) {
        Phone pb = new PhoneBuilder()
                .processor("qualcomm")
                .ram(16)
                .build();
        System.out.println(pb);
    }
}

/*
-------- Output --------
Phone [ram = 16 processor = qualcomm screenSize = 0.0]

 */
