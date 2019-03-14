# Compito per il 13/03/2019
> Esercizio 38 pagina A258

Si intendono gestire mediante un programma java i vagoni che compongono un treno.
Per ogni vagone si hanno alcuni attributi fondamentali:
* codice;
* peso a vuoto;
* azienda costruttrice;
* anno di costruzione;

Per i vagoni passeggeri si devono inoltre memorizzare:
* classe;
* numero di posti disponidili;
* numero di posti occupati;

Mentre per i vagoni merci:
* volume di carico;
* peso massimo di carico;
* peso effettivo di carico;

Per la composzione di un treno è fondamentale la gestione del peso dei vagoni, che nel caso dei carri
merci è di immediata determinazione, mentre per le carrozze passeggeri deve esssere stimato
considerando un peso medio per occupante di 65 kg (valore che potrebbe essere necessario modificare).

dopo aver disegnato il diagramma UML delle classi della soluzione proposta e averlo implementato in linguaggio java,
codificare una classe java *Treno* con uno o più metodi per l'aggiunta di vagoni: la classe dovrà prevedere un metodo
che restituisca il peso complessivo del treno esclusa/e la/e motrice/i.
