package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5990OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5991OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5992OooO0oo;

    public o0000OO0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5988OooO0Oo = i;
        this.f5990OooO0o0 = arrayList;
        this.f5989OooO0o = arrayList2;
        this.f5991OooO0oO = arrayList3;
        this.f5992OooO0oo = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f5988OooO0Oo; i++) {
            View view = (View) this.f5990OooO0o0.get(i);
            String str = (String) this.f5989OooO0o.get(i);
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOo0O(view, str);
            ViewCompat.OooOOO.OooOo0O((View) this.f5991OooO0oO.get(i), (String) this.f5992OooO0oo.get(i));
        }
    }
}
