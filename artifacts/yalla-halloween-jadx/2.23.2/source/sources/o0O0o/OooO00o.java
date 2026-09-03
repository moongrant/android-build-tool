package o0O0o;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SparseArray<Priority> f41714OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap<Priority, Integer> f41715OooO0O0;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f41715OooO0O0 = map;
        map.put(Priority.DEFAULT, 0);
        map.put(Priority.VERY_LOW, 1);
        map.put(Priority.HIGHEST, 2);
        for (Priority priority : map.keySet()) {
            f41714OooO00o.append(f41715OooO0O0.get(priority).intValue(), priority);
        }
    }

    public static int OooO00o(@NonNull Priority priority) {
        Integer num = f41715OooO0O0.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority OooO0O0(int i) {
        Priority priority = f41714OooO00o.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Unknown Priority for value ", i));
    }
}
