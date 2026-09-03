package p280o0O00o0O;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f41064OooO00o;

    public OooO0OO(float f) {
        this.f41064OooO00o = f;
    }

    @Override // p280o0O00o0O.OooOO0
    public final float OooO00o(@NonNull RectF rectF) {
        return this.f41064OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO0OO) && this.f41064OooO00o == ((OooO0OO) obj).f41064OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f41064OooO00o)});
    }
}
