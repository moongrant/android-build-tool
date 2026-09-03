package p136o00OO0oO;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import java.util.Arrays;
import java.util.List;
import o00OO0.OooO0OO;
import o00OO0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37370OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO> f37371OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f37372OooO0OO;

    public OooOo(List list, String str, boolean z) {
        this.f37370OooO00o = str;
        this.f37371OooO0O0 = list;
        this.f37372OooO0OO = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooO0o(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f37370OooO00o + "' Shapes: " + Arrays.toString(this.f37371OooO0O0.toArray()) + '}';
    }
}
