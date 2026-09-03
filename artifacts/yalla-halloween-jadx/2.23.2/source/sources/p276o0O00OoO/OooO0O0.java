package p276o0O00OoO;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Typeface f41024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f41025OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41026OooO0OO;

    public interface OooO00o {
        void OooO00o(Typeface typeface);
    }

    public OooO0O0(OooO00o oooO00o, Typeface typeface) {
        this.f41024OooO00o = typeface;
        this.f41025OooO0O0 = oooO00o;
    }

    @Override // p276o0O00OoO.OooOO0O
    public final void OooO00o(int i) {
        if (this.f41026OooO0OO) {
            return;
        }
        this.f41025OooO0O0.OooO00o(this.f41024OooO00o);
    }

    @Override // p276o0O00OoO.OooOO0O
    public final void OooO0O0(Typeface typeface, boolean z) {
        if (this.f41026OooO0OO) {
            return;
        }
        this.f41025OooO0O0.OooO00o(typeface);
    }
}
