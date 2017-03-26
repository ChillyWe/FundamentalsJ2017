using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RefactorVolumeOfPiramid
{
    class RefactorVolumeOfPiramid
    {
        static void Main(string[] args)
        {
            
            Console.Write("Length: ");
            double length = double.Parse(Console.ReadLine());
            Console.Write("Width: ");
            double width = double.Parse(Console.ReadLine());
            Console.Write("Heigth: ");
            double h = double.Parse(Console.ReadLine());
            double V = (length + width + h) / 3;
            Console.WriteLine("Pyramid Volume: {0:F2}", V);
        }
    }
}