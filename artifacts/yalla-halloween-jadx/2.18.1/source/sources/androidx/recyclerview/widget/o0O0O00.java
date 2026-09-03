package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RecyclerView.Oooo000 f9196OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f9197OooO0O0 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f9198OooO0OO = new Rect();

    public o0O0O00(RecyclerView.Oooo000 oooo000) {
        this.f9196OooO00o = oooo000;
    }

    public static o0O0O00 OooO00o(RecyclerView.Oooo000 oooo000, int i) {
        if (i == 0) {
            return new o0OO00O(oooo000);
        }
        if (i == 1) {
            return new oo0o0Oo(oooo000);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int OooO();

    public abstract int OooO0O0(View view);

    public abstract int OooO0OO(View view);

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o();

    public abstract int OooO0o0(View view);

    public abstract int OooO0oO();

    public abstract int OooO0oo();

    public abstract int OooOO0();

    public abstract int OooOO0O();

    public abstract int OooOO0o();

    public abstract int OooOOO(View view);

    public final int OooOOO0() {
        if (Integer.MIN_VALUE == this.f9197OooO0O0) {
            return 0;
        }
        return OooOO0o() - this.f9197OooO0O0;
    }

    public abstract int OooOOOO(View view);

    public abstract void OooOOOo(int i);
}
