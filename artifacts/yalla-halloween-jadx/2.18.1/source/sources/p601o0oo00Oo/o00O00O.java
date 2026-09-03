package p601o0oo00Oo;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0000O0O.o00O0O;
import o0000O0O.o00Oo0;
import o0000O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00O00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f48114OooO0Oo = o00Oo0.OooO0OO(1);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f48115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f48116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f48117OooO0OO;

    public o00O00O(long j, long j2) {
        long j3 = f48114OooO0Oo;
        this.f48115OooO00o = j;
        this.f48116OooO0O0 = j2;
        this.f48117OooO0OO = j3;
        if (!((o00Oo0.OooO0Oo(j) || o00Oo0.OooO0Oo(j2)) ? false : true)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (!o00Ooo.OooO00o(o00O0O.OooO0O0(j), o00O0O.OooO0O0(j2))) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Cannot perform operation for ");
            sbOooO0o0.append((Object) o00Ooo.OooO0O0(o00O0O.OooO0O0(j)));
            sbOooO0o0.append(" and ");
            sbOooO0o0.append((Object) o00Ooo.OooO0O0(o00O0O.OooO0O0(j2)));
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        if (!(Float.compare(o00O0O.OooO0OO(j), o00O0O.OooO0OO(j2)) < 0)) {
            throw new IllegalArgumentException(("min should be less than max, " + this).toString());
        }
        if (o00O0O.OooO0OO(j3) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            return;
        }
        throw new IllegalArgumentException(("step should be greater than 0, " + this).toString());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O00O)) {
            return false;
        }
        o00O00O o00o00o2 = (o00O00O) obj;
        return o00O0O.OooO00o(this.f48115OooO00o, o00o00o2.f48115OooO00o) && o00O0O.OooO00o(this.f48116OooO0O0, o00o00o2.f48116OooO0O0) && o00O0O.OooO00o(this.f48117OooO0OO, o00o00o2.f48117OooO0OO);
    }

    public final int hashCode() {
        return o00O0O.OooO0Oo(this.f48117OooO0OO) + ((o00O0O.OooO0Oo(this.f48116OooO0O0) + (o00O0O.OooO0Oo(this.f48115OooO00o) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("FontSizeRange(min=");
        sbOooO0o0.append((Object) o00O0O.OooO0o0(this.f48115OooO00o));
        sbOooO0o0.append(", max=");
        sbOooO0o0.append((Object) o00O0O.OooO0o0(this.f48116OooO0O0));
        sbOooO0o0.append(", step=");
        sbOooO0o0.append((Object) o00O0O.OooO0o0(this.f48117OooO0OO));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
