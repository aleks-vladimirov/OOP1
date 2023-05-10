package bg.jug.oop1.session4;

import java.util.HashMap;
import java.util.Map;

class _2MultipleGenericClass {

    static class Triplet<Key, Value, Translation> {

        private Key key;

        private Value value;

        private Translation translation;

        public void set(Key key, Value value, Translation translation) {
            this.key = key;
            this.value = value;
            this.translation = translation;
        }
        public Translation getTranslation() {
            return this.translation;
        }

        public Translation getTranslation(Key key) {
            if(this.key.equals(key)) {
                return this.translation;
            } else {
                return null;
            }

        }

    }

    public static void main(String[] args) {
        Map<String, String> nameAddressCache = new HashMap<>();

        nameAddressCache.put("key", "Java Academy");
        nameAddressCache.put("banica", "баница");
        nameAddressCache.put("lyutenica", "лютеница");
        System.out.println("HashMap value for the key 'key' " + nameAddressCache.get("key"));

        Triplet<String, String, String> triplet = new Triplet<>();

        triplet.set("BG dish", "banica", "баница");
        System.out.println(triplet.getTranslation());

        System.out.println(triplet.getTranslation("BG dish"));
        System.out.println(triplet.getTranslation("грешен ключ"));



    }
}
