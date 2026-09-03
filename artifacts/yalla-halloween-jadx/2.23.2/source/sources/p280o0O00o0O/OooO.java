package p280o0O00o0O;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41063OooO00o;

    public OooO(float f) {
        this.f41063OooO00o = f;
    }

    @Override // p280o0O00o0O.OooOO0
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.min(this.f41063OooO00o, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && this.f41063OooO00o == ((OooO) obj).f41063OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41063OooO00o)});
    }
}
