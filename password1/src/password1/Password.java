package password1;

import java.util.Scanner;

public class Password
{
      public static void main(String[] args)
      {
         //���� ��� ������������
         String password;
         Scanner input = new Scanner(System.in);
         System.out.print("����������, �������� ������: ");
         password = input.nextLine();

         //�������� ������ ������
         while( (password.length() < 6) || (password.length() > 10) )
         {
            System.out.print("���� ������ ������ ��������� �� 6 �� 10 ��������. �������� ��� ���: ");
            password = input.nextLine();
         }

         //��������, �������� �� ������ ����� / �����
         /*����� ����� �������� ��� */

         //������������� ���������� �������
         String password2;
         System.out.print("\n����������, ������� ���� ������ ��� ��� ��� �������������: ");
         password2 = input.nextLine();

         while( !password2.equals(password) )
         {
            System.out.print("��� ������ �� ���������. �������� ��� ���: ");
            password2 = input.nextLine();
         }
         	System.out.print("");
         	input.close(); 
      }
}