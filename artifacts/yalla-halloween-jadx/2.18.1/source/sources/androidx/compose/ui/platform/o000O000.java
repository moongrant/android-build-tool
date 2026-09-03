package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Parcel f6434OooO00o;

    public o000O000(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f6434OooO00o = parcelObtain;
        byte[] bArrDecode = Base64.decode(string, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    public final int OooO00o() {
        return this.f6434OooO00o.dataAvail();
    }

    public final byte OooO0O0() {
        return this.f6434OooO00o.readByte();
    }

    public final long OooO0OO() {
        long jM674constructorimpl = ULong.m674constructorimpl(this.f6434OooO00o.readLong());
        o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
        return jM674constructorimpl;
    }

    public final float OooO0Oo() {
        return this.f6434OooO00o.readFloat();
    }

    public final long OooO0o0() {
        long j;
        byte bOooO0O0 = OooO0O0();
        if (bOooO0O0 == 1) {
            j = 4294967296L;
        } else {
            j = bOooO0O0 == 2 ? 8589934592L : 0L;
        }
        if (!o0000O0O.o00Ooo.OooO00o(j, 0L)) {
            return o0000O0O.o00Oo0.OooO0o0(j, OooO0Oo());
        }
        o0000O0O.o00O0O.OooO00o oooO00o = o0000O0O.o00O0O.f27323OooO0O0;
        return o0000O0O.o00O0O.f27325OooO0Oo;
    }
}
