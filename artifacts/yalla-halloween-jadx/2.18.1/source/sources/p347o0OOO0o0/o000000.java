package p347o0OOO0o0;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f38173OooO00o;

    public o000000(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.f38173OooO00o = f;
    }

    @Override // p347o0OOO0o0.o0ooOOo
    public final float OooO00o(@NonNull RectF rectF) {
        return rectF.height() * this.f38173OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000000) && this.f38173OooO00o == ((o000000) obj).f38173OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38173OooO00o)});
    }
}
