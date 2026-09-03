package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000 f8480OooO00o = new o0000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000O0O f8481OooO0O0;

    static {
        o0000O0O o0000o0o2;
        try {
            o0000o0o2 = (o0000O0O) androidx.transition.OooO0O0.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o0000o0o2 = null;
        }
        f8481OooO0O0 = o0000o0o2;
    }

    public static void OooO00o(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }
}
