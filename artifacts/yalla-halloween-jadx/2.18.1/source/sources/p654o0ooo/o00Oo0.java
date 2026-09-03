package p654o0ooo;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00Oo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f51171Oooo0oo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f51170Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f51169Oooo0o = 500;

    public abstract void OooO00o(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f51171Oooo0oo != view || Math.abs(jCurrentTimeMillis - this.f51170Oooo0oO) > this.f51169Oooo0o) {
            this.f51171Oooo0oo = view;
            this.f51170Oooo0oO = jCurrentTimeMillis;
            OooO00o(view);
        }
    }
}
