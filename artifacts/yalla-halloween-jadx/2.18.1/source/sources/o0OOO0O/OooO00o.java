package o0OOO0O;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o extends OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Typeface f38032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC0374OooO00o f38033OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f38034OooO0OO;

    /* JADX INFO: renamed from: o0OOO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0374OooO00o {
        void OooO00o(Typeface typeface);
    }

    public OooO00o(InterfaceC0374OooO00o interfaceC0374OooO00o, Typeface typeface) {
        this.f38032OooO00o = typeface;
        this.f38033OooO0O0 = interfaceC0374OooO00o;
    }

    @Override // o0OOO0O.OooOO0
    public final void OooO00o(int i) {
        Typeface typeface = this.f38032OooO00o;
        if (this.f38034OooO0OO) {
            return;
        }
        this.f38033OooO0O0.OooO00o(typeface);
    }

    @Override // o0OOO0O.OooOO0
    public final void OooO0O0(Typeface typeface, boolean z) {
        if (this.f38034OooO0OO) {
            return;
        }
        this.f38033OooO0O0.OooO00o(typeface);
    }
}
