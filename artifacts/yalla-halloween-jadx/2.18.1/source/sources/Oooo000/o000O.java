package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f863OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f864OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.o0000O0O<Float> f865OooO0OO;

    public o000O(float f, long j, p023Oooo00O.o0000O0O o0000o0o2, DefaultConstructorMarker defaultConstructorMarker) {
        this.f863OooO00o = f;
        this.f864OooO0O0 = j;
        this.f865OooO0OO = o0000o0o2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O)) {
            return false;
        }
        o000O o000o = (o000O) obj;
        if (!Intrinsics.areEqual((Object) Float.valueOf(this.f863OooO00o), (Object) Float.valueOf(o000o.f863OooO00o))) {
            return false;
        }
        long j = this.f864OooO0O0;
        long j2 = o000o.f864OooO0O0;
        o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f865OooO0OO, o000o.f865OooO0OO);
    }

    public final int hashCode() {
        return this.f865OooO0OO.hashCode() + ((p145o00Oo0.o00O00.OooO0OO(this.f864OooO0O0) + (Float.floatToIntBits(this.f863OooO00o) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Scale(scale=");
        sbOooO0o0.append(this.f863OooO00o);
        sbOooO0o0.append(", transformOrigin=");
        sbOooO0o0.append((Object) p145o00Oo0.o00O00.OooO0Oo(this.f864OooO0O0));
        sbOooO0o0.append(", animationSpec=");
        sbOooO0o0.append(this.f865OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
