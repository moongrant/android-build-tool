package p194o00o0OO;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00 f38650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f38651OooO0o0;

    public o000OOo0(int i, o00 o00Var, boolean z) {
        this.f38650OooO0Oo = o00Var;
        this.f38651OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        o00 o00Var = this.f38650OooO0Oo;
        int i2 = o00Var.f38647OooO0o;
        if (i2 == o00Var.f38646OooO0Oo || i2 == (i = o00Var.f38648OooO0o0)) {
            return;
        }
        o00Var.f38647OooO0o = 0;
        int i3 = this.f38651OooO0o0;
        int[] iArr = o00Var.f38645OooO0OO;
        int i4 = iArr[i3];
        ImageView imageView = o00Var.f38643OooO00o;
        imageView.setImageResource(i4);
        int length = iArr.length - 1;
        long j = o00Var.f38649OooO0oO;
        if (i3 != length) {
            imageView.postDelayed(new o000OOo0(i3 + 1, o00Var, false), j);
        } else if (o00Var.f38644OooO0O0) {
            imageView.postDelayed(new o000OOo0(0, o00Var, true), j);
        } else {
            o00Var.f38647OooO0o = i;
        }
    }
}
