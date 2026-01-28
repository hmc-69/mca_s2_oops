class cpu {
    int price = 65000;

    class processor {
        int cores = 4;
        String manufacturer = "AMD";
    }

    static class Ram {
        int memory = 32;
        String manufacturer = "Samsung";
    }
}

public class Main {
    public static void main(String[] args) {
        cpu c1 = new cpu();
        System.out.println("Price: "+c1.price);
        cpu.processor p = c1.new processor();
        cpu.Ram r = new cpu.Ram();
        System.out.println("Processor cores: " + p.cores);
        System.out.println("Processor Manufacturer: " + p.manufacturer);
        System.out.println("RAM Memory: " + r.memory);
        System.out.println("RAM Manufacturer: " + r.manufacturer);
    }
}

