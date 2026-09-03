package p347o0OOO0o0;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f38178OooO00o;

    public oo000o(float f) {
        this.f38178OooO00o = f;
    }

    @Override // p347o0OOO0o0.o0ooOOo
    public final float OooO00o(@NonNull RectF rectF) {
        return this.f38178OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo000o) && this.f38178OooO00o == ((oo000o) obj).f38178OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38178OooO00o)});
    }
}
