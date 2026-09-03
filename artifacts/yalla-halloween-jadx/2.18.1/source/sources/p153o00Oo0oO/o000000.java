package p153o00Oo0oO;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 {
    @NotNull
    public static final Map<String, String> OooO00o(@Nullable List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (String str : list) {
                linkedHashMap.put(str, str);
            }
        }
        return linkedHashMap;
    }
}
