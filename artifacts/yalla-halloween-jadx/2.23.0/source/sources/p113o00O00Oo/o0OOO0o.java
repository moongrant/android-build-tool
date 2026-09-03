package p113o00O00Oo;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import o00O000.OooO0OO;
import o00O000.OooOO0O;
import o00O00OO.OooO00o;
import o00O00OO.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f36375OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path.FillType f36376OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f36377OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final OooO00o f36378OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f36379OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0o f36380OooO0o0;

    public o0OOO0o(String str, boolean z, Path.FillType fillType, @Nullable OooO00o oooO00o, @Nullable OooO0o oooO0o, boolean z2) {
        this.f36377OooO0OO = str;
        this.f36375OooO00o = z;
        this.f36376OooO0O0 = fillType;
        this.f36378OooO0Oo = oooO00o;
        this.f36380OooO0o0 = oooO0o;
        this.f36379OooO0o = z2;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new OooOO0O(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return androidx.compose.animation.OooO0o.OooO00o(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f36375OooO00o, '}');
    }
}
