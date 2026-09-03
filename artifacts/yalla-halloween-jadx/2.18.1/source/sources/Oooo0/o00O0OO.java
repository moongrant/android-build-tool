package Oooo0;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import java.util.Objects;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00O;
import p028Oooo0o0.o0O00O0o;

/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalFoundationApi
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f669OooO0O0;

    public o00O0OO() {
        long jOooO0OO = p145o00Oo0.o00000OO.OooO0OO(4284900966L);
        float f = 0;
        o0O00O o0o00o2 = new o0O00O(f, f, f, f);
        this.f668OooO00o = jOooO0OO;
        this.f669OooO0O0 = o0o00o2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(o00O0OO.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        o00O0OO o00o0oo2 = (o00O0OO) obj;
        return p145o00Oo0.o00000O0.OooO0Oo(this.f668OooO00o, o00o0oo2.f668OooO00o) && Intrinsics.areEqual(this.f669OooO0O0, o00o0oo2.f669OooO0O0);
    }

    public final int hashCode() {
        long j = this.f668OooO00o;
        o00Oo0.o00000O0.OooO00o oooO00o = p145o00Oo0.o00000O0.f32063OooO0O0;
        return this.f669OooO0O0.hashCode() + (ULong.m686hashCodeimpl(j) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("OverscrollConfiguration(glowColor=");
        sbOooO0o0.append((Object) p145o00Oo0.o00000O0.OooOO0(this.f668OooO00o));
        sbOooO0o0.append(", drawPadding=");
        sbOooO0o0.append(this.f669OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
