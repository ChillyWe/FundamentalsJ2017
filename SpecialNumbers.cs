using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SpecialNumbers
{
    class SpecialNumbers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int firstDigit = 0;
            int secDigit = 0;
            int sum = 0;
            
            for (int i = 1; i <= n; i++)
            {
                firstDigit = i;
                sum = firstDigit + secDigit;
                if (i > 10)
                {
                    firstDigit = i / 10;
                    secDigit = i % 10;
                    sum = firstDigit + secDigit;
                }
                if (sum == 5 || sum == 7 || sum == 11)
                {
                    Console.WriteLine("{0} -> True", i);
                    continue;
                }
                Console.WriteLine("{0} -> False", i);
            }
        }
    }
}