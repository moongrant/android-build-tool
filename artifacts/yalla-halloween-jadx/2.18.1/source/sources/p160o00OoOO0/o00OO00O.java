package p160o00OoOO0;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O implements Comparator<Map.Entry<String, String>> {
    @Override // java.util.Comparator
    public final int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
        return entry.getKey().compareTo(entry2.getKey());
    }
}
