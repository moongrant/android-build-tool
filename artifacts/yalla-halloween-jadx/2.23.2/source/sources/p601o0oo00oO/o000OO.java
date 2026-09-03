package p601o0oo00oO;

import android.os.Handler;
import android.widget.EditText;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static o000OO f57378OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public EditText f57379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0000O f57380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f57381OooO0OO = 1000;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f57382OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Handler f57384OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000O0 f57383OooO0o = null;

    public static o000OO OooO0O0() {
        if (f57378OooO0oO == null) {
            f57378OooO0oO = new o000OO();
        }
        return f57378OooO0oO;
    }

    public final void OooO00o() {
        if (this.f57379OooO00o != null) {
            this.f57379OooO00o = null;
        }
        if (this.f57380OooO0O0 != null) {
            this.f57380OooO0O0 = null;
        }
        Handler handler = this.f57384OooO0o0;
        if (handler != null) {
            handler.removeCallbacks(this.f57383OooO0o);
            this.f57384OooO0o0 = null;
        }
        if (this.f57383OooO0o != null) {
            this.f57383OooO0o = null;
        }
        this.f57382OooO0Oo = false;
        this.f57381OooO0OO = 800L;
    }

    public final void OooO0OO(EditText editText, o0000O o0000o2) {
        OooO00o();
        if (editText != null) {
            this.f57379OooO00o = editText;
            this.f57381OooO0OO = 800L;
            this.f57380OooO0O0 = o0000o2;
            this.f57382OooO0Oo = false;
            this.f57384OooO0o0 = new Handler();
            this.f57383OooO0o = new o0000O0(this);
            this.f57379OooO00o.addTextChangedListener(new o0000O0O(this));
        }
    }
}
