enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String,val idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun matriculados():Unit{
        inscritos.forEach{ i-> println(" Aluno: ${i.nome} idade: ${i.idade}")}
    }
}

fun main() {
    val rafael: Usuario = Usuario("Rafael", 27)
    val arquitetura :ConteudoEducacional = ConteudoEducacional("Arquitetura de software", 60, Nivel.BASICO)
    var formacaoList: List<ConteudoEducacional> = listOf<ConteudoEducacional>(arquitetura)
    val java: Formacao = Formacao("JAVA MBA", formacaoList)
    
    java.matricular(rafael)
    println(java)
    java.matriculados()
 
}