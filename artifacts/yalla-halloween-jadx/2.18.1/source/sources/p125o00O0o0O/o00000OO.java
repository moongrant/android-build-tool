package p125o00O0o0O;

import Oooo000.Oooo0;
import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import p118o00O0Oo.OooOOOO;
import p123o00O0o0.OooOO0;
import p123o00O0o0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f31013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path.FillType f31014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f31015OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooOO0 f31016OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f31017OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooOOO f31018OooO0o0;

    public o00000OO(String str, boolean z, Path.FillType fillType, @Nullable OooOO0 oooOO1, @Nullable OooOOO oooOOO, boolean z2) {
        this.f31015OooO0OO = str;
        this.f31013OooO00o = z;
        this.f31014OooO0O0 = fillType;
        this.f31016OooO0Oo = oooOO1;
        this.f31018OooO0o0 = oooOOO;
        this.f31017OooO0o = z2;
    }

    @Override // p125o00O0o0O.o000OOo
    public final p118o00O0Oo.OooOO0 OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooOOOO(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return Oooo0.OooO0O0(OooO00o.OooO00o.OooO0o0("ShapeFill{color=, fillEnabled="), this.f31013OooO00o, '}');
    }
}
