package p172o00OooO;

import android.os.Handler;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static o00O0O0 f32685OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public EditText f32686OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00O0O0O f32687OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f32688OooO0OO = 1000;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f32689OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Handler f32691OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O0 f32690OooO0o = null;

    public static o00O0O0 OooO0O0() {
        if (f32685OooO0oO == null) {
            f32685OooO0oO = new o00O0O0();
        }
        return f32685OooO0oO;
    }

    public final void OooO00o() {
        if (this.f32686OooO00o != null) {
            this.f32686OooO00o = null;
        }
        if (this.f32687OooO0O0 != null) {
            this.f32687OooO0O0 = null;
        }
        Handler handler = this.f32691OooO0o0;
        if (handler != null) {
            handler.removeCallbacks(this.f32690OooO0o);
            this.f32691OooO0o0 = null;
        }
        if (this.f32690OooO0o != null) {
            this.f32690OooO0o = null;
        }
        this.f32689OooO0Oo = false;
        this.f32688OooO0OO = 800L;
    }

    public final void OooO0OO(EditText editText, o00O0O0O o00o0o0o2) {
        OooO00o();
        if (editText != null) {
            this.f32686OooO00o = editText;
            this.f32688OooO0OO = 800L;
            this.f32687OooO0O0 = o00o0o0o2;
            this.f32689OooO0Oo = false;
            this.f32691OooO0o0 = new Handler();
            this.f32690OooO0o = new o00O0(this);
            this.f32686OooO00o.addTextChangedListener(new o00O0O00(this));
        }
    }
}
