package p263o00ooo;

import OooO00o.OooO00o;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000O0;
import p191o00o0O.o0OOO0o;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends o000OO0O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public o00000O f34898OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final long f34899OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f34900OoooO0O = 1.0f;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final long f34901OoooOO0;

    public o000O0Oo(long j) {
        this.f34899OoooO0 = j;
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f34901OoooOO0 = OooOo00.f30418OooO0Oo;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f34900OoooO0O = f;
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f34898OoooO = o00000o;
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        return this.f34901OoooOO0;
    }

    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        o0OOO0o.OooOO0(o0oo0oo2, this.f34899OoooO0, 0L, 0L, this.f34900OoooO0O, null, this.f34898OoooO, 0, 86, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000O0Oo) && o00000O0.OooO0Oo(this.f34899OoooO0, ((o000O0Oo) obj).f34899OoooO0);
    }

    public final int hashCode() {
        long j = this.f34899OoooO0;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ColorPainter(color=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f34899OoooO0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
