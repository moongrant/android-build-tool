package o0000O0;

import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27252OooO00o;

    public OooO0O0(long j) {
        this.f27252OooO00o = j;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        if (!(j != o00000O0.f32062OooO)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    @Override // o0000O0.OooOOO0
    public final long OooO00o() {
        return this.f27252OooO00o;
    }

    @Override // o0000O0.OooOOO0
    public final /* synthetic */ OooOOO0 OooO0O0(OooOOO0 oooOOO0) {
        return OooOO0O.OooO00o(this, oooOOO0);
    }

    @Override // o0000O0.OooOOO0
    public final /* synthetic */ OooOOO0 OooO0OO(Function0 function0) {
        return OooOO0O.OooO0O0(this, function0);
    }

    @Override // o0000O0.OooOOO0
    @Nullable
    public final void OooO0Oo() {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO0O0) && o00000O0.OooO0Oo(this.f27252OooO00o, ((OooO0O0) obj).f27252OooO00o);
    }

    public final int hashCode() {
        long j = this.f27252OooO00o;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ColorStyle(value=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f27252OooO00o));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
