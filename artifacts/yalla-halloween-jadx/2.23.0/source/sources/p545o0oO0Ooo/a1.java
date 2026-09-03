package p545o0oO0Ooo;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a1 extends f1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Typeface f55809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f55810OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f55811OooO0OO;

    public interface OooO00o {
        void OooO00o(Typeface typeface);
    }

    public a1(OooO00o oooO00o, Typeface typeface) {
        this.f55809OooO00o = typeface;
        this.f55810OooO0O0 = oooO00o;
    }

    @Override // p545o0oO0Ooo.f1
    public final void OooO00o(int i) {
        if (this.f55811OooO0OO) {
            return;
        }
        this.f55810OooO0O0.OooO00o(this.f55809OooO00o);
    }

    @Override // p545o0oO0Ooo.f1
    public final void OooO0O0(Typeface typeface, boolean z) {
        if (this.f55811OooO0OO) {
            return;
        }
        this.f55810OooO0O0.OooO00o(typeface);
    }
}
