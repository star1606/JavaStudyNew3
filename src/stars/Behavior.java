package stars;

import stars.protoss.Dragoon;
import stars.protoss.Zealot;

//�߻� Ŭ������ ����
//�߻� �޼��常 ���� ����!
//���� ���ε��� ��ηθ� ���!   �������̽�: ��ηθ� ���   // �߻�Ŭ���� : ��ü�� ���Ұ���

public interface Behavior {
	public abstract void move(); // �̵��� �ٸ����ʾƼ� �ٷ� ����

	void repair(); // interface ������ public abstract ��������

	void attack(Behavior unit); // ������ �߻�ȭ�ؾ���

}
