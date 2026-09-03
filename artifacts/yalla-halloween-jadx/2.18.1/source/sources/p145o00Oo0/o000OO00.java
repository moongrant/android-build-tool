package p145o00Oo0;

import Oooo000.OooO0O0;
import androidx.compose.runtime.Immutable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ULong;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f32105OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o000OO00 f32106OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f32107OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32108OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f32109OooO0OO;

    public static final class OooO00o {
    }

    static {
        long jOooO0OO = o00000OO.OooO0OO(4278190080L);
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        f32106OooO0o0 = new o000OO00(jOooO0OO, OooO.f30392OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public o000OO00(long j, long j2, float f) {
        this.f32107OooO00o = j;
        this.f32108OooO0O0 = j2;
        this.f32109OooO0OO = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OO00)) {
            return false;
        }
        o000OO00 o000oo01 = (o000OO00) obj;
        if (o00000O0.OooO0Oo(this.f32107OooO00o, o000oo01.f32107OooO00o) && OooO.OooO00o(this.f32108OooO0O0, o000oo01.f32108OooO0O0)) {
            return (this.f32109OooO0OO > o000oo01.f32109OooO0OO ? 1 : (this.f32109OooO0OO == o000oo01.f32109OooO0OO ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f32107OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return Float.floatToIntBits(this.f32109OooO0OO) + ((OooO.OooO0o0(this.f32108OooO0O0) + (ULong.m686hashCodeimpl(j) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Shadow(color=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f32107OooO00o));
        sbOooO0o0.append(", offset=");
        sbOooO0o0.append((Object) OooO.OooO(this.f32108OooO0O0));
        sbOooO0o0.append(", blurRadius=");
        return OooO0O0.OooO00o(sbOooO0o0, this.f32109OooO0OO, ')');
    }
}
