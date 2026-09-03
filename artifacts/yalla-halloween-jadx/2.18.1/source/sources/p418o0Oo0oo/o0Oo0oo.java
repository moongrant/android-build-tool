package p418o0Oo0oo;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import java.util.List;
import kotlin.collections.CollectionsKt;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f39741OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39742OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39744OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f39745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39746OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39747OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f39748OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f39749OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public List<OooOo00> f39750OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public OooOOOO f39751OooOO0O;

    public o0Oo0oo(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f39742OooO00o = j;
        this.f39743OooO0O0 = j2;
        this.f39744OooO0OO = j3;
        this.f39745OooO0Oo = z;
        this.f39747OooO0o0 = j4;
        this.f39746OooO0o = j5;
        this.f39748OooO0oO = z2;
        this.f39749OooO0oo = i;
        this.f39741OooO = j6;
        this.f39751OooOO0O = new OooOOOO(z3, z3);
    }

    public final void OooO00o() {
        OooOOOO oooOOOO = this.f39751OooOO0O;
        oooOOOO.f39654OooO0O0 = true;
        oooOOOO.f39653OooO00o = true;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<OooOo00> OooO0O0() {
        List<OooOo00> list = this.f39750OooOO0;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final boolean OooO0OO() {
        OooOOOO oooOOOO = this.f39751OooOO0O;
        return oooOOOO.f39654OooO0O0 || oooOOOO.f39653OooO00o;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PointerInputChange(id=");
        sbOooO0o0.append((Object) o0OOO0o.OooO0O0(this.f39742OooO00o));
        sbOooO0o0.append(", uptimeMillis=");
        sbOooO0o0.append(this.f39743OooO0O0);
        sbOooO0o0.append(", position=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39744OooO0OO));
        sbOooO0o0.append(", pressed=");
        sbOooO0o0.append(this.f39745OooO0Oo);
        sbOooO0o0.append(", previousUptimeMillis=");
        sbOooO0o0.append(this.f39747OooO0o0);
        sbOooO0o0.append(", previousPosition=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39746OooO0o));
        sbOooO0o0.append(", previousPressed=");
        sbOooO0o0.append(this.f39748OooO0oO);
        sbOooO0o0.append(", isConsumed=");
        sbOooO0o0.append(OooO0OO());
        sbOooO0o0.append(", type=");
        sbOooO0o0.append((Object) o0000O00.OooO00o(this.f39749OooO0oo));
        sbOooO0o0.append(", historical=");
        sbOooO0o0.append(OooO0O0());
        sbOooO0o0.append(",scrollDelta=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39741OooO));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public o0Oo0oo(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, false, i, j6);
        this.f39750OooOO0 = list;
    }
}
