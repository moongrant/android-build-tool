package o0O00o00;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41805OooO00o;

    public OooOo00(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f41805OooO00o = f;
    }

    @Override // o0O00o00.OooO0o
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f41805OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooOo00) && this.f41805OooO00o == ((OooOo00) obj).f41805OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41805OooO00o)});
    }
}
