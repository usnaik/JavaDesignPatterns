package com.usn.patterns.builder;

public class BuilderPattern {
	
    static class Coffee {
    	
        private Coffee(Builder builder) {
            this.type = builder.type;
            this.sugar = builder.sugar;
            this.milk = builder.milk;
            this.size = builder.size;
        }

        private String type;
        private boolean sugar;
        private boolean milk;
        private String size;

        public static class Builder {
        	
            private String type;
            private boolean sugar;
            private boolean milk;
            private String size;

            public Builder(String type) {
                this.type = type;
            }

            public Builder sugar(boolean value) {
                this.sugar = value;
                return this;
            }

            public Builder milk(boolean value) {
                this.milk = value;
                return this;
            }

            public Builder size(String value) {
                this.size = value;
                return this;
            }

            public Coffee build() {
                return new Coffee(this);
            }
        }

        @Override
        public String toString() {
            return String.format("Coffee [type=%s, sugar=%s, milk=%s, size=%s]", this.type, sugar, milk, size);
        }

    }

    public static void main(String[] args) {
        Coffee coffee1 = new BuilderPattern.Coffee.Builder("Mocha").milk(true).sugar(false).size("Large").build();
        Coffee coffee2 = new BuilderPattern.Coffee.Builder("Cuppa").milk(true).sugar(true).size("Medium").build();
        System.out.println(coffee1);
        System.out.println(coffee2);

        Coffee coffee3 = new BuilderPattern.Coffee.Builder("Espresso").build();
        System.out.println(coffee3);

    }
}