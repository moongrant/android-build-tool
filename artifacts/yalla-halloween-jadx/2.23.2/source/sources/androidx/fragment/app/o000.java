package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f5959OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5960OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5961OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5962OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5963OooO0oo;

    public o000(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5959OooO0Oo = i;
        this.f5961OooO0o0 = arrayList;
        this.f5960OooO0o = arrayList2;
        this.f5962OooO0oO = arrayList3;
        this.f5963OooO0oo = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f5959OooO0Oo; i++) {
            View view = (View) this.f5961OooO0o0.get(i);
            String str = (String) this.f5960OooO0o.get(i);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO.OooOo0O(view, str);
            ViewCompat.OooOOO.OooOo0O((View) this.f5962OooO0oO.get(i), (String) this.f5963OooO0oo.get(i));
        }
    }
}
