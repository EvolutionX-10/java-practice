public class Main {
	public static void main(String[] args) {
		Container con = new Container();
		Producer p = new Producer(con);;
		Consumer c = new Consumer(con);
		p.setName("Producer");
		c.setName("Consumer");
		c.start();
		p.start();
	}
}
