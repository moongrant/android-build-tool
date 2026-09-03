package p290o0O0OOoo;

import android.support.v4.media.OooO00o;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static SparseArray<Priority> f35705OooO00o = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static HashMap<Priority, Integer> f35706OooO0O0;

    static {
        HashMap<Priority, Integer> map = new HashMap<>();
        f35706OooO0O0 = map;
        map.put(Priority.DEFAULT, 0);
        f35706OooO0O0.put(Priority.VERY_LOW, 1);
        f35706OooO0O0.put(Priority.HIGHEST, 2);
        for (Priority priority : f35706OooO0O0.keySet()) {
            f35705OooO00o.append(f35706OooO0O0.get(priority).intValue(), priority);
        }
    }

    public static int OooO00o(@NonNull Priority priority) {
        Integer num = f35706OooO0O0.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority OooO0O0(int i) {
        Priority priority = f35705OooO00o.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(OooO00o.OooO00o("Unknown Priority for value ", i));
    }
}
