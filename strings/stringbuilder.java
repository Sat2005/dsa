public class stringbuilder {

    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific position
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Replace a substring
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // Delete a substring
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Set length to truncate or expand
        sb.setLength(5);
        System.out.println("After setting length to 5: " + sb);

        // Capacity of the StringBuilder
        System.out.println("Current capacity: " + sb.capacity());
        
        // Ensuring capacity
        sb.ensureCapacity(50); // Increases capacity to at least 50 if less
        System.out.println("After ensuring capacity: " + sb.capacity());
    }
}
