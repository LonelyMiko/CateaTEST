import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<?> findDuplicates(@NotNull List<?> elements) {
        List<Object> duplicates = new ArrayList<>();
        int elementsLength = elements.size();
        for (int i = 0; i < elementsLength; i++) {
            for (Object element : elements) {
                if (elements.get(i) == element && !duplicates.contains(element)) {
                    duplicates.add(elements.get(i));
                }
            }
        }
        return duplicates;
    }
}
