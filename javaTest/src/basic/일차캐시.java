package basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class 일차캐시 {
    // public int solution(int cacheSize, String[] cities) {
    // }

  public static class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
      super(capacity, 0.75f, true);
      this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry <K, V> eldest) {
      return size() > capacity;
    }
  }

    public static int solution(int cacheSize, String[] cities) {
      int answer = 0;
      LRUCache<String, Integer> cache = new LRUCache<>(cacheSize);

      int i = 0;
      for (String city: cities){
        city = city.toLowerCase();
        if (cache.containsKey(city)){
          answer += 1;
        }else{
          answer += 5;
        }

        cache.put(city, 0);
        System.out.println(" " + i + " : " + city + " : " + cache);
        i++;
      }

      System.out.println(cache);
      return answer;
  }

  public static void main(String[] args) {
    String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
    int cacheSize = 2;
    int answer = solution(cacheSize, cities);
    System.out.println(answer);
  }
}
