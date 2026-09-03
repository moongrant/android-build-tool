package p280o0O00o0O;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41072OooO00o;

    public Oooo000(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f41072OooO00o = f;
    }

    @Override // p280o0O00o0O.OooOO0
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f41072OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oooo000) && this.f41072OooO00o == ((Oooo000) obj).f41072OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41072OooO00o)});
    }
}
