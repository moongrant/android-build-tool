package o0O00o00;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41799OooO00o;

    public OooO0OO(float f) {
        this.f41799OooO00o = f;
    }

    @Override // o0O00o00.OooO0o
    public final float OooO00o(@NonNull RectF rectF) {
        return Math.min(this.f41799OooO00o, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO0OO) && this.f41799OooO00o == ((OooO0OO) obj).f41799OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41799OooO00o)});
    }
}
