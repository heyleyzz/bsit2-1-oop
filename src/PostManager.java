import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int sum = 0;
        for (int n : interactions) sum += n;
        return sum;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        if (engagementScore >= 500) return "Popular";
        if (engagementScore >= 100) return "Good";
        if (engagementScore >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        String[] fixed = new String[5];
        if (hashtags != null) {
            for (int i = 0; i < Math.min(hashtags.length, 5); i++) {
                fixed[i] = hashtags[i];
            }
        }
        Set<String> unique = new LinkedHashSet<>();
        for (String tag : fixed) {
            if (tag != null && !tag.trim().isEmpty()) {
                unique.add(tag.trim());
            }
        }
        return new ArrayList<>(unique);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts,
                                                HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        for (String title : posts) {
            if (postEngagement.containsKey(title) && postEngagement.get(title) > 500) {
                trending.add(title);
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        return new HashSet<>(Arrays.asList(authors));
    }
}