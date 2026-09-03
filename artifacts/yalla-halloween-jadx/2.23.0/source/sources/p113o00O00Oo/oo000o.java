package p113o00O00Oo;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00O000.OooO0OO;
import o00O000.o000oOoO;
import o00O00OO.OooO0O0;
import o00O00OO.OooOO0;
import o00O00OO.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f36392OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000<PointF, PointF> f36393OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000<PointF, PointF> f36394OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f36395OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36396OooO0o0;

    public oo000o(String str, Oooo000 oooo000, OooOO0 oooOO1, OooO0O0 oooO0O0, boolean z) {
        this.f36392OooO00o = str;
        this.f36393OooO0O0 = oooo000;
        this.f36394OooO0OO = oooOO1;
        this.f36395OooO0Oo = oooO0O0;
        this.f36396OooO0o0 = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o000oOoO(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f36393OooO0O0 + ", size=" + this.f36394OooO0OO + '}';
    }
}
