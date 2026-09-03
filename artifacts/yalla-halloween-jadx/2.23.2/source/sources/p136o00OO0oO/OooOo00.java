package p136o00OO0oO;

import android.graphics.Path;
import androidx.annotation.Nullable;
import androidx.compose.animation.OooO0o;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.OooO00o;
import o00OO0.OooO0OO;
import o00OO0.OooOO0O;
import p134o00OO0o.o00Ooo;
import p134o00OO0o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f37373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Path.FillType f37374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f37375OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00Ooo f37376OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f37377OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o0ooOOo f37378OooO0o0;

    public OooOo00(String str, boolean z, Path.FillType fillType, @Nullable o00Ooo o00ooo2, @Nullable o0ooOOo o0ooooo, boolean z2) {
        this.f37375OooO0OO = str;
        this.f37373OooO00o = z;
        this.f37374OooO0O0 = fillType;
        this.f37376OooO0Oo = o00ooo2;
        this.f37378OooO0o0 = o0ooooo;
        this.f37377OooO0o = z2;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, OooO00o oooO00o) {
        return new OooOO0O(lottieDrawable, oooO00o, this);
    }

    public final String toString() {
        return OooO0o.OooO00o(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f37373OooO00o, '}');
    }
}
