package p113o00O00Oo;

import androidx.compose.foundation.layout.OooO0O0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00O000.OooO0OO;
import o00O000.o00O0O;
import o00O00OO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f36371OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f36372OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f36373OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36374OooO0Oo;

    public o0OO00O(String str, int i, OooOOO0 oooOOO0, boolean z) {
        this.f36371OooO00o = str;
        this.f36372OooO0O0 = i;
        this.f36373OooO0OO = oooOOO0;
        this.f36374OooO0Oo = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o00O0O(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f36371OooO00o);
        sb.append(", index=");
        return OooO0O0.OooO00o(sb, this.f36372OooO0O0, '}');
    }
}
