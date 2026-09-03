package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8466Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f8467Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8468Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8469Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8470OoooO00;

    public o0000O0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f8467Oooo0o = i;
        this.f8468Oooo0oO = arrayList;
        this.f8469Oooo0oo = arrayList2;
        this.f8466Oooo = arrayList3;
        this.f8470OoooO00 = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.f8467Oooo0o; i++) {
            View view = (View) this.f8468Oooo0oO.get(i);
            String str = (String) this.f8469Oooo0oo.get(i);
            WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOo0O(view, str);
            ViewCompat.OooOOO.OooOo0O((View) this.f8466Oooo.get(i), (String) this.f8470OoooO00.get(i));
        }
    }
}
