public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria myAccount = new ContaBancaria();
        myAccount.setNumeroConta(123);
        myAccount.setSaldo(1000);
        myAccount.titular = "João";

        System.out.println("Número da Conta: " + myAccount.getNumeroConta());
        System.out.println("Saldo: " + myAccount.getSaldo());
        System.out.println("Titular: " + myAccount.titular);

        myAccount.setSaldo(1500);
        System.out.println("Novo Saldo: " + myAccount.getSaldo());
    }
}
