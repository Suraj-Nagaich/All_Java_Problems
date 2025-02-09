package aboutjava;

class SectionE extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <100; i++) {
			System.out.println("Section Bakwas h!");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		SectionE obj = new SectionE();
		obj.start();
		obj.join();
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <100; i++) {
			System.out.println("Section E Badiya h!");
		}
	}

}
