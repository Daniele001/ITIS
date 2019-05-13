class EroeCattivo extends Male {
    private String nome;
    private int energiaVitale;

    EroeCattivo(String nome, int energiaVitale) {
        setNome(nome);
        try {
            setEnergiaVitale(energiaVitale);
        } catch (IllegalArgumentException e){
            System.out.println("ERRORE!! Inserisci un valore compreso tra 1 e 10");
            setEnergiaVitale(k.nextInt());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEnergiaVitale(int energiaVitale) {
        if(energiaVitale >= 1 && energiaVitale <= 10)
            this.energiaVitale = energiaVitale;
        else
            throw new IllegalArgumentException();
    }

    public int getEnergiaVitale() {
        return energiaVitale;
    }

    @Override
    public int calcolaForza() {
        this.forza = (50 * energiaVitale) + (50 * esperienza);
        super.forzaCombattimento += this.forza;
        return this.forza;
    }
}