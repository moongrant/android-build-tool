package o0O00o00;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41796OooO00o;

    public OooO00o(float f) {
        this.f41796OooO00o = f;
    }

    @Override // o0O00o00.OooO0o
    public final float OooO00o(@NonNull RectF rectF) {
        return this.f41796OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO00o) && this.f41796OooO00o == ((OooO00o) obj).f41796OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41796OooO00o)});
    }
}
