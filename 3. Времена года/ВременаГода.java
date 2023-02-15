public enum ВременаГода {
    ЗИМА(-8), ВЕСНА(13), ЛЕТО(25){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, ОСЕНЬ(15);

    private int СредняяТемпература;

    ВременаГода(int средняяТемпература) {
        СредняяТемпература = средняяТемпература;
    }

    public int getСредняяТемпература() {
        return СредняяТемпература;
    }
    public String getDescription() {
        return "Холодное время года";
    }
}
