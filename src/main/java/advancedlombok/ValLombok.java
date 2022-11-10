package advancedlombok;

import lombok.val;

public class ValLombok {

    public static void main(String[] args) {
        val crmContracts = new CrmContracts();
        val numbers = crmContracts.getNumbers();
        val name = "Adam Nowak";
        var name2 = "Kamil Nowak";
        name2 = "safasfafs";

    }

}
