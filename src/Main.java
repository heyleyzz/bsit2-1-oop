import java.util.*;

public class Main {
    public static void Main(String[] args) {
        PostManager pm = new PostManager();

        // Sample post
        String title = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagement);

        // Hashtags
        String[] hashtags = { "#java", "#coding", "#programming", "#java", "#tips" };
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);

        // Posts + engagement
        ArrayList<String> posts = new ArrayList<>(Arrays.asList(
                "Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"
        ));
        HashMap<String, Integer> engagementMap = new HashMap<>();
        engagementMap.put("Java Programming Tips", engagement);
        engagementMap.put("Advanced Java Tutorial", 800);
        engagementMap.put("Spring Boot Guide", 1200);

        LinkedList<String> trending = pm.findTrendingPosts(posts, engagementMap);

        // Authors
        HashSet<String> authors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        // Final formatted output
        System.out.println("=== Social Media Post Manager ===");
        pm.displayPostStats(title, engagement, category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + authors);
    }
}
