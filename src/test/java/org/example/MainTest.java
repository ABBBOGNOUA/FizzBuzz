package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

    /*
        *Définition des idées en notes papier
    	Lorsque je tape 1 L’appli me retourne le chiffre 1
    	Lorsque je tape 2 L’appli me retourne les chiffres ”1, 2”
    	Lorsque je tape 4 L’appli me retourne ” 1, 2, 4”
    	Les multiples de 3 renvoient Fizz
    	Les multiples de cinq renvoient Buzz
    	Les multiples de 3 et de cinq renvoient FizzBuzz
        Définition des idées en notes papier
    * */

    class MainTest {
        @Test
        public void lorsqueJeTape1AppliRenvoit1() {
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(1);

            //Then
                String resultAttendu = "1";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape2AppliMeRetourne1_2(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(2);

            //Then
                String resultAttendu = "1 2";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape3AppliMeRetourneFizz(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(3);

            //Then
                String resultAttendu = "Fizz 3";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape4AppliMeRetourne4(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(4);

            //Then
                String resultAttendu = "4";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape5AppliMeRetourne5(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(5);

            //Then
                String resultAttendu = "Buzz";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape6AppliMeRetourne6(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(6);

            //Then
                String resultAttendu = "Fizz 6";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape7AppliMeRetourne7(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(7);

            //Then
                String resultAttendu = "7";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape8AppliMeRetourne8(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(8);

            //Then
                String resultAttendu = "8";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape9AppliMeRetourne9(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(9);

            //Then
                String resultAttendu = "Fizz 9";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }

        @Test
        public void Lorsquejetape10AppliMeRetourne10(){
            //Given
                Main main = new Main();

            //When
                String result = main.fizzBuzz(10);

            //Then
                String resultAttendu = "Buzz 10";
                Assertions.assertThat(result).isEqualTo(resultAttendu);
        }
}