package p466o0Oooo0o;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oo00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f46886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f46887OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f46885OooO0Oo = 500;

    public abstract void OooO00o(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f46886OooO0o != view || Math.abs(jCurrentTimeMillis - this.f46887OooO0o0) > this.f46885OooO0Oo) {
            this.f46886OooO0o = view;
            this.f46887OooO0o0 = jCurrentTimeMillis;
            OooO00o(view);
        }
    }
}
