package oo0o0Oo;

import Oooo000.o000O0;
import Oooo000.o000O00O;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOOo.c;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public final class OooO0OO implements c {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f53359OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f53360OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f53361OooO0OO;

    public OooO0OO(float f, float f2, long j) {
        this.f53359OooO00o = f;
        this.f53360OooO0O0 = f2;
        this.f53361OooO0OO = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof OooO0OO) {
            OooO0OO oooO0OO = (OooO0OO) obj;
            if (oooO0OO.f53359OooO00o == this.f53359OooO00o) {
                if ((oooO0OO.f53360OooO0O0 == this.f53360OooO0O0) && oooO0OO.f53361OooO0OO == this.f53361OooO0OO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iOooO00o = o000O00O.OooO00o(this.f53360OooO0O0, o000O00O.OooO00o(this.f53359OooO00o, 0, 31), 31);
        long j = this.f53361OooO0OO;
        return iOooO00o + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RotaryScrollEvent(verticalScrollPixels=");
        sbOooO0o0.append(this.f53359OooO00o);
        sbOooO0o0.append(",horizontalScrollPixels=");
        sbOooO0o0.append(this.f53360OooO0O0);
        sbOooO0o0.append(",uptimeMillis=");
        return o000O0.OooO0O0(sbOooO0o0, this.f53361OooO0OO, ')');
    }
}
