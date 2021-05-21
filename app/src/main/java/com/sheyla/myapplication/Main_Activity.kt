package com.sheyla.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class Fibonacci : AppCompatActivity() {

    lateinit var resultado: TextView
    //lateinit var nome: EditText
    // lateinit var adicionarNome: Button
    // lateinit var listaNomes: TextView

    // var nomesCadastrados = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numeros = listOf(0, 1, 1)

       // nome = findViewById(R.id.PersonName)
       // adicionarNome = findViewById(R.id.imageButton)

        resultado = findViewById(R.id.resultado)

//     adicionarNome.setOnClickListener{
//
//            val nomePerson = nome.text.toString()
//
//            //INICIALIZAR O COMPONETE
//            if (nomePerson.isNotEmpty()) {
//                cadastrarNome(nomePerson)
//            } else {
//                nome.error = "Digite um nome válido!"
//            }
//        }
//
//
//        fun cadastrarNome(nome: String) {
//
//            listaNomes.visibility = View.VISIBLE
//
//            var exibirNomes = ""
//
//            nomesCadastrados.add(nome)
//
//            for (adicionar in nomesCadastrados) {
//               exibirNomes += "Olá, $adicionar.\n"
//            }
//
//            listaNomes.text = exibirNomes
//        }


        var soma = 0
        var segundaSoma = 0
        var terceiraSoma = 0


        for (numeroIndividual in numeros) {
            soma = numeroIndividual - 2
            soma += numeroIndividual
        }

        for (segundaPosicao in numeros) {
            segundaSoma = segundaPosicao - 1
            segundaSoma += segundaPosicao
        }

        for (terceiraPosicao in numeros) {
            terceiraSoma = terceiraPosicao - 1
            terceiraSoma += terceiraPosicao
        }

        resultado.text = "Olá o resultado é: $soma, $segundaSoma, $terceiraSoma"

//        var nums = 0
//        val serie = (0, 1, 1)
//
//        while (nums < serie.last) {
//            println(serie.elementAt(nums))
//
//            nums++
//        }
//    }

//    public class Fibonacci {
//        public static void main(String[] args) {
//            int a = 1;
//            int b = 0;
//            int aux;
//            for(int i = 0; i < 30; i++){
//                System.out.println(a);
//                aux = a;
//                a = a + b;
//                b = aux;
//            }
//        }
//    }


//    object Fibonacci {
//        init {
//            var a = 0
//            var b = 1
//            var i = 0
//            while (i < 15) {
//                print("$a ")
//                b += a
//                a = b - a
//                i++
//            }
//            System.exit(0)
//        }
//    }


//    fun main() {
//        val sequence = sequence {
//            val start = 0
//            yield(start)
//            yieldAll(1..5 step 2)
//            yieldAll(generateSequence(8) { it * 3 })
//        }
//
//        println(sequence.take(3).toList())
//
//    }
//
//
//    private tailrec fun fibonacci(n: Int, a: Int = 0, b: Int = 1): Int =
//        when (n) {
//            0 -> a
//            1 -> b
//            else -> fibonacci(n - 1, b, a + b)
//        }

    }
}




