package p597o0oo00o0;

import android.os.Handler;
import android.widget.EditText;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static OooOOO f56845OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public EditText f56846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOOO f56847OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f56848OooO0OO = 1000;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f56849OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Handler f56851OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooOO0O f56850OooO0o = null;

    public static OooOOO OooO0O0() {
        if (f56845OooO0oO == null) {
            f56845OooO0oO = new OooOOO();
        }
        return f56845OooO0oO;
    }

    public final void OooO00o() {
        if (this.f56846OooO00o != null) {
            this.f56846OooO00o = null;
        }
        if (this.f56847OooO0O0 != null) {
            this.f56847OooO0O0 = null;
        }
        Handler handler = this.f56851OooO0o0;
        if (handler != null) {
            handler.removeCallbacks(this.f56850OooO0o);
            this.f56851OooO0o0 = null;
        }
        if (this.f56850OooO0o != null) {
            this.f56850OooO0o = null;
        }
        this.f56849OooO0Oo = false;
        this.f56848OooO0OO = 800L;
    }

    public final void OooO0OO(EditText editText, OooOOOO oooOOOO) {
        OooO00o();
        if (editText != null) {
            this.f56846OooO00o = editText;
            this.f56848OooO0OO = 800L;
            this.f56847OooO0O0 = oooOOOO;
            this.f56849OooO0Oo = false;
            this.f56851OooO0o0 = new Handler();
            this.f56850OooO0o = new OooOO0O(this);
            this.f56846OooO00o.addTextChangedListener(new OooOOO0(this));
        }
    }
}
