package password1;

import java.util.Scanner;

public class Password
{
      public static void main(String[] args)
      {
         //ввод для пользователя
         String password;
         Scanner input = new Scanner(System.in);
         System.out.print("Пожалуйста, создайте пароль: ");
         password = input.nextLine();

         //проверка длинны пароля
         while( (password.length() < 6) || (password.length() > 10) )
         {
            System.out.print("Этот пароль должен содержать от 6 до 10 символов. Попробуй еще раз: ");
            password = input.nextLine();
         }

         //Проверка, содержат ли пароли цифры / буквы
         /*Здесь нужно добавить код */

         //Подтверждение совпадения паролей
         String password2;
         System.out.print("\nПожалуйста, введите свой пароль еще раз для подтверждения: ");
         password2 = input.nextLine();

         while( !password2.equals(password) )
         {
            System.out.print("Эти пароли не совпадают. Попробуй еще раз: ");
            password2 = input.nextLine();
         }
         	System.out.print("");
         	input.close(); 
      }
}