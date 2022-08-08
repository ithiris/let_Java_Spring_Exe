package CollectionSortExe;

import java.util.Comparator;

// Helper class implementing Comparator interface
class SortByRoll implements Comparator<Student> {
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.rollNo - b.rollNo;
    }
}
