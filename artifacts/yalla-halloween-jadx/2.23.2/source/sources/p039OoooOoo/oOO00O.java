package p039OoooOoo;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o000OO.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o00O000o> f1733OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo0 f1734OooO0O0;

    public oOO00O(@NonNull List list, @NonNull o000O0 o000o0) {
        OooOOO0.OooO0O0((list.isEmpty() && o000o0 == o000OOo0.f1632OooO00o) ? false : true, "No preferred quality and fallback strategy.");
        this.f1733OooO00o = Collections.unmodifiableList(new ArrayList(list));
        this.f1734OooO0O0 = o000o0;
    }

    @NonNull
    public static oOO00O OooO00o(@NonNull o00O000o o00o000o2) {
        o000O0 o000o0 = o000OOo0.f1632OooO00o;
        OooOOO0.OooO0o0(o000o0, "fallbackStrategy cannot be null");
        OooOOO0.OooO0O0(o00O000o.f1646OooO0oo.contains(o00o000o2), "Invalid quality: " + o00o000o2);
        return new oOO00O(Collections.singletonList(o00o000o2), o000o0);
    }

    @NonNull
    public static oOO00O OooO0O0(@NonNull List list, @NonNull o000O0 o000o0) {
        OooOOO0.OooO0o0(list, "qualities cannot be null");
        OooOOO0.OooO0O0(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o00O000o o00o000o2 = (o00O000o) it.next();
            OooOOO0.OooO0O0(o00O000o.f1646OooO0oo.contains(o00o000o2), "qualities contain invalid quality: " + o00o000o2);
        }
        return new oOO00O(list, o000o0);
    }

    @NonNull
    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f1733OooO00o + ", fallbackStrategy=" + this.f1734OooO0O0 + "}";
    }
}
