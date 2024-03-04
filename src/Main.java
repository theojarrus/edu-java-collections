import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Lists
        List<String> stringList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        stringList.add("list10");
        stringList.add("list20");
        stringList.add("list30");
        stringList.remove("list10");
        System.out.println("List: " + stringList);

        // Queue
        Stack<String> stringStack = new Stack<>();
        stringStack.push("stack10");
        stringStack.push("stack20");
        stringStack.push("stack30");
        System.out.println("Stack: " + stringStack);
        String lastElement = stringStack.pop();
        System.out.println("Last Element: " + lastElement);
        System.out.println("Stack: " + stringStack);
        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("queue10");
        stringQueue.add("queue20");
        stringQueue.add("queue30");
        System.out.println("Queue: " + stringQueue);
        String firstElement = stringQueue.poll();
        System.out.println("First element: " + firstElement);
        System.out.println("Queue: " + stringQueue);

        // Set
        Set<String> stringHashSet = new HashSet<>();
        stringHashSet.add("stringHashSet30");
        stringHashSet.add("stringHashSet10");
        stringHashSet.add("stringHashSet40");
        stringHashSet.add("stringHashSet20");
        stringHashSet.add("stringHashSet10");
        System.out.println("HashSet: " + stringHashSet);
        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("stringTreeSet30");
        stringTreeSet.add("stringTreeSet10");
        stringTreeSet.add("stringTreeSet40");
        stringTreeSet.add("stringTreeSet20");
        stringTreeSet.add("stringTreeSet10");
        System.out.println("TreeSet: " + stringTreeSet);

        // Map
        Map<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("stringHashMap-key3", "stringHashMap-value3");
        stringHashMap.put("stringHashMap-key1", "stringHashMap-value1");
        stringHashMap.put("stringHashMap-key2", "stringHashMap-value2");
        stringHashMap.put("stringHashMap-key110", "stringHashMap-value110");
        stringHashMap.put("stringHashMap-key6", "stringHashMap-value6");
        System.out.println("HashMap: " + stringHashMap);
        Map<String, String> stringTreeMap = new TreeMap<>();
        stringTreeMap.put("stringTreeMap-key3", "stringTreeMap-value3");
        stringTreeMap.put("stringTreeMap-key1", "stringTreeMap-value1");
        stringTreeMap.put("stringTreeMap-key2", "stringTreeMap-value2");
        stringTreeMap.put("stringTreeMap-key110", "stringTreeMap-value110");
        stringTreeMap.put("stringTreeMap-key6", "stringTreeMap-value6");
        System.out.println("TreeMap: " + stringTreeMap);

        // SortedSet
        Set<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // return o1.getAge() - o2.getAge();
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        personTreeSet.add(new Person(3000));
        personTreeSet.add(new Person(1000));
        personTreeSet.add(new Person(2000));
        System.out.println(personTreeSet);
    }

    static class Person {

        private Integer age;

        public Person(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{age=" + age + "}";
        }
    }

    static class MyList<T> {

        private Object[] array = new Object[10];

        public void add(int index, T obejct) {
            array[index] = obejct;
        }

        public T get(int index) {
            return (T) array[index];
        }
    }
}
