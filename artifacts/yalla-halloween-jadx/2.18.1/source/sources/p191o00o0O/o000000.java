package p191o00o0O;

import OooO00o.OooO00o;
import Oooo000.o000O00O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o000Oo0;
import p145o00Oo0.o00O000;
import p145o00Oo0.o00oOoo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f33060OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f33061OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33062OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33063OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o000Oo0 f33064OooO0o0;

    public o000000(float f, float f2, int i, int i2, o000Oo0 o000oo1, int i3) {
        f = (i3 & 1) != 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        o000oo1 = (i3 & 16) != 0 ? null : o000oo1;
        this.f33060OooO00o = f;
        this.f33061OooO0O0 = f2;
        this.f33062OooO0OO = i;
        this.f33063OooO0Oo = i2;
        this.f33064OooO0o0 = o000oo1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000000)) {
            return false;
        }
        o000000 o000000Var = (o000000) obj;
        if (!(this.f33060OooO00o == o000000Var.f33060OooO00o)) {
            return false;
        }
        if (!(this.f33061OooO0O0 == o000000Var.f33061OooO0O0)) {
            return false;
        }
        if (this.f33062OooO0OO == o000000Var.f33062OooO0OO) {
            return (this.f33063OooO0Oo == o000000Var.f33063OooO0Oo) && Intrinsics.areEqual(this.f33064OooO0o0, o000000Var.f33064OooO0o0);
        }
        return false;
    }

    public final int hashCode() {
        int iOooO00o = (((o000O00O.OooO00o(this.f33061OooO0O0, Float.floatToIntBits(this.f33060OooO00o) * 31, 31) + this.f33062OooO0OO) * 31) + this.f33063OooO0Oo) * 31;
        o000Oo0 o000oo1 = this.f33064OooO0o0;
        return iOooO00o + (o000oo1 != null ? o000oo1.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Stroke(width=");
        sbOooO0o0.append(this.f33060OooO00o);
        sbOooO0o0.append(", miter=");
        sbOooO0o0.append(this.f33061OooO0O0);
        sbOooO0o0.append(", cap=");
        sbOooO0o0.append((Object) o00oOoo.OooO00o(this.f33062OooO0OO));
        sbOooO0o0.append(", join=");
        sbOooO0o0.append((Object) o00O000.OooO00o(this.f33063OooO0Oo));
        sbOooO0o0.append(", pathEffect=");
        sbOooO0o0.append(this.f33064OooO0o0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
