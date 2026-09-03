package p022Oooo00O;

import android.util.Size;
import androidx.media3.exoplayer.trackselection.OooO0O0;
import com.google.common.collect.o00000;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p425o0OoO0o.o000000;
import p425o0OoO0o.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OoOoOo implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f873OooO0Oo;

    public /* synthetic */ o0OoOoOo(int i) {
        this.f873OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f873OooO0Oo) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            default:
                List list = (List) obj;
                List list2 = (List) obj2;
                return o00000.OooO00o.OooO0oO(OooO0O0.OooOOO0.OooO0Oo((OooO0O0.OooOOO0) Collections.max(list, new o000OOo()), (OooO0O0.OooOOO0) Collections.max(list2, new o000OOo()))).OooO00o(list.size(), list2.size()).OooO0OO((OooO0O0.OooOOO0) Collections.max(list, new o000000()), (OooO0O0.OooOOO0) Collections.max(list2, new o000000()), new o000000()).OooO0o();
        }
    }
}
