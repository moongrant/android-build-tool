package p113o00O00Oo;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00O000.OooO0OO;
import o00O00OO.OooOO0;
import o00O00OO.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f36384OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000<PointF, PointF> f36385OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0 f36386OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f36387OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36388OooO0o0;

    public o0OoOo0(String str, Oooo000<PointF, PointF> oooo000, OooOO0 oooOO1, boolean z, boolean z2) {
        this.f36384OooO00o = str;
        this.f36385OooO0O0 = oooo000;
        this.f36386OooO0OO = oooOO1;
        this.f36387OooO0Oo = z;
        this.f36388OooO0o0 = z2;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new o00O000.OooOO0(lottieDrawable, oooO00o, this);
    }
}
