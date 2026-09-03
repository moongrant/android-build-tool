package p023Oooo00O;

import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O0o<T> implements oo000o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O00<T> f1074OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RepeatMode f1075OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f1076OooO0OO;

    public o000O0o(o0000O00 o0000o00, RepeatMode repeatMode, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.f1074OooO00o = o0000o00;
        this.f1075OooO0O0 = repeatMode;
        this.f1076OooO0OO = j;
    }

    @Override // p023Oooo00O.oo000o
    @NotNull
    public final <V extends o0O0O00> o00OOO00<V> OooO00o(@NotNull o00OO0O0<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new oo00oO(this.f1074OooO00o.OooO00o((o00OO0O0) converter), this.f1075OooO0O0, this.f1076OooO0OO, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o000O0o) {
            o000O0o o000o0o2 = (o000O0o) obj;
            if (Intrinsics.areEqual(o000o0o2.f1074OooO00o, this.f1074OooO00o) && o000o0o2.f1075OooO0O0 == this.f1075OooO0O0) {
                if (o000o0o2.f1076OooO0OO == this.f1076OooO0OO) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1075OooO0O0.hashCode() + (this.f1074OooO00o.hashCode() * 31)) * 31;
        long j = this.f1076OooO0OO;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
