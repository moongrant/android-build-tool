package p136o00OO0oO;

import androidx.compose.foundation.layout.OooO0O0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00OO0.OooO0OO;
import o00OO0.o00O0O;
import p134o00OO0o.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f37380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0o0Oo f37381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f37382OooO0Oo;

    public Oooo000(String str, int i, oo0o0Oo oo0o0oo, boolean z) {
        this.f37379OooO00o = str;
        this.f37380OooO0O0 = i;
        this.f37381OooO0OO = oo0o0oo;
        this.f37382OooO0Oo = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o00O0O(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f37379OooO00o);
        sb.append(", index=");
        return OooO0O0.OooO00o(sb, this.f37380OooO0O0, '}');
    }
}
