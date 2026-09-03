package p113o00O00Oo;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import java.util.Arrays;
import java.util.List;
import o00O000.OooO0OO;
import o00O000.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f36381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<o00O0O> f36382OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f36383OooO0OO;

    public o0Oo0oo(List list, String str, boolean z) {
        this.f36381OooO00o = str;
        this.f36382OooO0O0 = list;
        this.f36383OooO0OO = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooO0o(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f36381OooO00o + "' Shapes: " + Arrays.toString(this.f36382OooO0O0.toArray()) + '}';
    }
}
