package p601o0oo00oO;

import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO f57376OooO0Oo;

    public o0000O0(o000OO o000oo2) {
        this.f57376OooO0Oo = o000oo2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        o000OO o000oo2 = this.f57376OooO0Oo;
        o000oo2.f57382OooO0Oo = false;
        o0000O o0000o2 = o000oo2.f57380OooO0O0;
        if (o0000o2 == null || (editText = o000oo2.f57379OooO00o) == null) {
            return;
        }
        o0000o2.OooO00o(editText.getText().toString());
    }
}
