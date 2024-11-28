package br.com.matheus;

public class Demo {
    public static void main(String[] args) {
        Class<Tabela> tabelaClass = Tabela.class;

        if (tabelaClass.isAnnotationPresent(AnnotationTabela.class)) {
            AnnotationTabela annotation = tabelaClass.getAnnotation(AnnotationTabela.class);

            String nomeTabela = annotation.nomeTabela();

            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("!!!!");
        }
    }
}
