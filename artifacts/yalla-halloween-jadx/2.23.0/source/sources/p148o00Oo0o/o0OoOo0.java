package p148o00Oo0o;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f37921OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f37922OooO0o0;

    public o0OoOo0(int i, o00O0O o00o0o2, boolean z) {
        this.f37921OooO0Oo = o00o0o2;
        this.f37922OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        o00O0O o00o0o2 = this.f37921OooO0Oo;
        int i2 = o00o0o2.f37844OooO0o;
        if (i2 == o00o0o2.f37843OooO0Oo || i2 == (i = o00o0o2.f37845OooO0o0)) {
            return;
        }
        o00o0o2.f37844OooO0o = 0;
        int i3 = this.f37922OooO0o0;
        int[] iArr = o00o0o2.f37842OooO0OO;
        int i4 = iArr[i3];
        ImageView imageView = o00o0o2.f37840OooO00o;
        imageView.setImageResource(i4);
        int length = iArr.length - 1;
        long j = o00o0o2.f37846OooO0oO;
        if (i3 != length) {
            imageView.postDelayed(new o0OoOo0(i3 + 1, o00o0o2, false), j);
        } else if (o00o0o2.f37841OooO0O0) {
            imageView.postDelayed(new o0OoOo0(0, o00o0o2, true), j);
        } else {
            o00o0o2.f37844OooO0o = i;
        }
    }
}
