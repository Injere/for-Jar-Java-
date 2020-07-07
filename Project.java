import java.util.*; // import java.util.HashMap; import java.util.Map;
//класс project не имеет main так как является библиотекой 
public class Project extends Words{
		
	
	Map<Words, Words> dictionary = new HashMap<WordEn, WordRu>(); // создание словаря
	
	
	Iterator iterator = dictionary.keySet().iterator();
		while(iterator.hasNext(){
			
			Object key   = iterator.next();
			
			//Проверяем на существование ключ 
			
				if(key==null){
					System.out.print("may");
					dictionary.put(super.wordGet(), super.wordGetRu()); //заполняем
					
				}
				else{
					System.out.print("the key is used"); // ключ уже используется, заполнение невозможно
				}
			
			
			
		}
		
		/* метод на получение значения по ключу (поиск)*/
		
		public String getV(Object key){
			if(key!=null)
			String Val = dictionary.get(key);
			return Vall; // возвращаем значение
			else{
				
				System.out.println("key == null");
				return("0");// временная заглушка
			}
			
		}
		
		public void delV(Object key){
			if(key!=null)
			(dictionary.get(key)).remove(); // получаем значение значение и удаляем (проверить на правильность написания)
			
			else{
				
				System.out.println("keyDel == null"); //ключа нет - удалять нечего!
			}
			
		}
		
		public void AllV(){
			System.out.println(dictionary);
		}
		
		
	}
	
	
		

/*
Words- класс реализующий интерфейс Dictionary
*/
protected class Words implements Dictionary {

	private String word;
	private String wordR;
	
	/*
	Создание констурктора принимающего ключ-значение
	*/
	public Words(String value, String vakueof){ 
		
		this.word = value;
		this.wordR = valueof;
		
	}
	
	public String wordGet(){
		return word
	}
	
	public String wordGetRu(){
		
		return wordR;
	}
	
}


/*Интерфейс Dictionary 
*/
interface Dictionary{
	/*
		метод получения изначального слова
	*/
	default String wordGet(){
		
		System.out.println("key-default");
	}
	/*
		метод получения перевода слова
	*/
	default String wordGetRu(){
		System.out.println("value-default");
	}
	
	
}


