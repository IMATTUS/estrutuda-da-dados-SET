package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * Set<T> representa um conjunto de elementos, similar ao da Algebra
		 * Não admite repetição
		 * Os elementos não possuem posição
		 * Acesso, inserção e remoção de elementos são rapidos
		 * Oferece operações eficientes de conjunto: interseção, união, diferença
		 * Principais implementações:
		 * 	HashSet - mais rápido (Operações O(1)#! em tabela hash) e não ordenado
		 * 	TreeSet - mais lento(operações O(log(n)) em arvore rubro-negra) e ordenado pelo compareTo do 
		 * 		objeto ou do (Comparator)
		 * 	LinkedHashSet - velocidade intermediária e elements na ordem em que são adicionados
		 * 
		 * #! - O(1) -- é executado em 1 passo
		 * Set<T> é uma interface.
		 */
		
		Set<String> set = new HashSet<>();
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		
//		System.out.println(set.contains("Notebook"));
		
		set.remove("Tablet");

		
		for (String p : set) {
			System.out.println(p);
		}
		
		System.out.println("- - - - -");
		
		Set<String> tSet = new TreeSet<>();
		tSet.add("TV");
		tSet.add("Tablet");
		tSet.add("Notebook");
		
		tSet.removeIf(x->x.length()>=3);
		
		for (String p : tSet) {
			System.out.println(p);
		}
		
		System.out.println("= = = = =");
		
		Set<String> lSet = new LinkedHashSet<>();
		lSet.add("TV");
		lSet.add("Tablet");
		lSet.add("Notebook");
		
		lSet.removeIf(x->x.charAt(0)== 'T');
		
		for (String p : lSet) {
			System.out.println(p);
		}
		
		operacoesDeConjunto();
	}
	public static void operacoesDeConjunto() {
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}
}
