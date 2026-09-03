package p280o0O00o0O;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f41065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f41066OooO0O0;

    public OooO0o(float f, @NonNull OooOO0 oooOO1) {
        while (oooOO1 instanceof OooO0o) {
            oooOO1 = ((OooO0o) oooOO1).f41065OooO00o;
            f += ((OooO0o) oooOO1).f41066OooO0O0;
        }
        this.f41065OooO00o = oooOO1;
        this.f41066OooO0O0 = f;
    }

    @Override // p280o0O00o0O.OooOO0
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f41065OooO00o.OooO00o(rectF) + this.f41066OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return this.f41065OooO00o.equals(oooO0o.f41065OooO00o) && this.f41066OooO0O0 == oooO0o.f41066OooO0O0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41065OooO00o, Float.valueOf(this.f41066OooO0O0)});
    }
}
