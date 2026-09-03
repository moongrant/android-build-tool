package p089o000o000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f28711OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f28712OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function1<OooOo, Unit>> f28713OooO0O0 = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o000000 f28714OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public o000000 f28715OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public o000000O f28716OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public o000000 f28717OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o000000O f28718OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OooOo> f28719OooO0oo;

    public o00000OO() {
        o000000.OooO0OO oooO0OO = o000000.OooO0OO.f28699OooO0OO;
        this.f28714OooO0OO = oooO0OO;
        this.f28715OooO0Oo = oooO0OO;
        this.f28717OooO0o0 = oooO0OO;
        o000000O.OooO00o oooO00o = o000000O.f28700OooO0Oo;
        this.f28716OooO0o = o000000O.f28701OooO0o0;
        MutableStateFlow<OooOo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f28719OooO0oo = MutableStateFlow;
        this.f28711OooO = FlowKt.filterNotNull(MutableStateFlow);
    }

    public final o000000 OooO00o(o000000 o000000Var, o000000 o000000Var2, o000000 o000000Var3, o000000 o000000Var4) {
        if (o000000Var4 == null) {
            return o000000Var3;
        }
        return (!(o000000Var instanceof o000000.OooO0O0) || ((o000000Var2 instanceof o000000.OooO0OO) && (o000000Var4 instanceof o000000.OooO0OO)) || (o000000Var4 instanceof o000000.OooO00o)) ? o000000Var4 : o000000Var;
    }

    public final OooOo OooO0O0() {
        if (this.f28712OooO00o) {
            return new OooOo(this.f28714OooO0OO, this.f28715OooO0Oo, this.f28717OooO0o0, this.f28716OooO0o, this.f28718OooO0oO);
        }
        return null;
    }

    public final void OooO0OO() {
        o000000 o000000Var = this.f28714OooO0OO;
        o000000 o000000Var2 = this.f28716OooO0o.f28702OooO00o;
        o000000O o000000o2 = this.f28718OooO0oO;
        this.f28714OooO0OO = OooO00o(o000000Var, o000000Var2, o000000Var2, o000000o2 != null ? o000000o2.f28702OooO00o : null);
        o000000 o000000Var3 = this.f28715OooO0Oo;
        o000000O o000000o3 = this.f28716OooO0o;
        o000000 o000000Var4 = o000000o3.f28702OooO00o;
        o000000 o000000Var5 = o000000o3.f28703OooO0O0;
        o000000O o000000o4 = this.f28718OooO0oO;
        this.f28715OooO0Oo = OooO00o(o000000Var3, o000000Var4, o000000Var5, o000000o4 != null ? o000000o4.f28703OooO0O0 : null);
        o000000 o000000Var6 = this.f28717OooO0o0;
        o000000O o000000o5 = this.f28716OooO0o;
        o000000 o000000Var7 = o000000o5.f28702OooO00o;
        o000000 o000000Var8 = o000000o5.f28704OooO0OO;
        o000000O o000000o6 = this.f28718OooO0oO;
        this.f28717OooO0o0 = OooO00o(o000000Var6, o000000Var7, o000000Var8, o000000o6 != null ? o000000o6.f28704OooO0OO : null);
        OooOo oooOoOooO0O0 = OooO0O0();
        if (oooOoOooO0O0 != null) {
            this.f28719OooO0oo.setValue(oooOoOooO0O0);
            Iterator<T> it = this.f28713OooO0O0.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(oooOoOooO0O0);
            }
        }
    }
}
