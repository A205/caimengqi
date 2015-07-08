package homework.day3;

public class Army {
	private Weapon[] w ;

	 int num = 0;

	 public Army(int i) {
	 w = new Weapon[i];
	 }//定义数组w

	 public void addWeapon(Weapon weapon) {
	 if (num >= w.length) {
	 System.out.println("装备充足，不需添加");
	 } 
	 else {
	 w[num] = weapon;
	 num++;
	 }
	 }

	 public void attacAll() {
	 for (Weapon wea : w) {//wea 实际上取值为三种武器
	 if (wea != null) {
	 wea.attack();
	 }
	 }
	 }

	 public void moveAll() {
	 for (Weapon wea : w) {
	 if (wea != null) {
	 wea.move();
	 }
	 }
	 }

}
