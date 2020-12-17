public class NumeroAbundante {

 

    public boolean numeroAb(int n)

    {

        int aux= numeroAb(n,1,0);

        if (aux>n)

        {

            return true;

        }else

        {

            return false;

        }

    }

    private int numeroAb(int n,int divi,int suma)

    {

        if (divi<n)

        {

            if (n%divi==0)

            {

                return numeroAb(n,divi+1,suma+divi);

            }else

            {

                return numeroAb(n,divi+1,suma);

            }

        }else

        {

            return suma;

        }

    }

}