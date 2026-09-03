package p172o00OooO;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0O0 f32684Oooo0o;

    public o00O0(o00O0O0 o00o0o0) {
        this.f32684Oooo0o = o00o0o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText;
        o00O0O0 o00o0o0 = this.f32684Oooo0o;
        o00o0o0.f32689OooO0Oo = false;
        o00O0O0O o00o0o0o2 = o00o0o0.f32687OooO0O0;
        if (o00o0o0o2 == null || (editText = o00o0o0.f32686OooO00o) == null) {
            return;
        }
        o00o0o0o2.OooO0O0(editText.getText().toString());
    }
}
