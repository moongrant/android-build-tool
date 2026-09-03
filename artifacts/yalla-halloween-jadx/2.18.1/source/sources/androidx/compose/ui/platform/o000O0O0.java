package androidx.compose.ui.platform;

import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public Parcel f6438OooO00o;

    public o000O0O0() {
        Parcel parcelObtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
        this.f6438OooO00o = parcelObtain;
    }

    public final void OooO00o(byte b) {
        this.f6438OooO00o.writeByte(b);
    }

    public final void OooO0O0(float f) {
        this.f6438OooO00o.writeFloat(f);
    }

    public final void OooO0OO(long j) {
        long jOooO0O0 = o0000O0O.o00O0O.OooO0O0(j);
        byte b = 0;
        if (!o0000O0O.o00Ooo.OooO00o(jOooO0O0, 0L)) {
            if (o0000O0O.o00Ooo.OooO00o(jOooO0O0, 4294967296L)) {
                b = 1;
            } else if (o0000O0O.o00Ooo.OooO00o(jOooO0O0, 8589934592L)) {
                b = 2;
            }
        }
        OooO00o(b);
        if (o0000O0O.o00Ooo.OooO00o(o0000O0O.o00O0O.OooO0O0(j), 0L)) {
            return;
        }
        OooO0O0(o0000O0O.o00O0O.OooO0OO(j));
    }

    public final void OooO0Oo(long j) {
        this.f6438OooO00o.writeLong(j);
    }
}
