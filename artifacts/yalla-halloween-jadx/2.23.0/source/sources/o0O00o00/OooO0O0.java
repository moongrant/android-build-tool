package o0O00o00;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f41797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f41798OooO0O0;

    public OooO0O0(float f, @NonNull OooO0o oooO0o) {
        while (oooO0o instanceof OooO0O0) {
            oooO0o = ((OooO0O0) oooO0o).f41797OooO00o;
            f += ((OooO0O0) oooO0o).f41798OooO0O0;
        }
        this.f41797OooO00o = oooO0o;
        this.f41798OooO0O0 = f;
    }

    @Override // o0O00o00.OooO0o
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f41797OooO00o.OooO00o(rectF) + this.f41798OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0O0)) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        return this.f41797OooO00o.equals(oooO0O0.f41797OooO00o) && this.f41798OooO0O0 == oooO0O0.f41798OooO0O0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41797OooO00o, Float.valueOf(this.f41798OooO0O0)});
    }
}
