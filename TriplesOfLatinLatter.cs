using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TriplesOfLatinLatters
{
    class TriplesOfLatinLatter
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            for(int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    for (int k = 0; k < n; k++)
                    {
                        char firstL = (char)('a' + i);
                        char secondL = (char)('a' + j);
                        char thirdL = (char)('a' + k);
                        Console.WriteLine("{0}{1}{2}", firstL, secondL, thirdL);
                    }
                }
            }
        }
    }
}