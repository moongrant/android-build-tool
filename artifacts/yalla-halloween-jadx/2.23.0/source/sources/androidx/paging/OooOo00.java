package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMutableCombinedLoadStateCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1#2:169\n230#3,5:170\n1855#4,2:175\n*S KotlinDebug\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n*L\n96#1:170,5\n106#1:175,2\n*E\n"})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function1<o000O00O.OooOo, Unit>> f7172OooO00o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<o000O00O.OooOo> f7173OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final StateFlow<o000O00O.OooOo> f7174OooO0OO;

    public OooOo00() {
        MutableStateFlow<o000O00O.OooOo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f7173OooO0O0 = MutableStateFlow;
        this.f7174OooO0OO = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final o000O00O.OooOo OooO00o(OooOo00 oooOo00, o000O00O.OooOo oooOo, OooOOO oooOOO, OooOOO oooOOO2) {
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO1;
        OooOOO0 oooOOO3;
        oooOo00.getClass();
        OooOOO0 oooOOO4 = OooOOO0.OooO0OO.f7167OooO0OO;
        if (oooOo == null || (oooOOO0 = oooOo.f34455OooO00o) == null) {
            oooOOO0 = oooOOO4;
        }
        OooOOO0 oooOOO5 = oooOOO.f7160OooO00o;
        OooOOO0 oooOOO0OooO0O0 = OooO0O0(oooOOO0, oooOOO5, oooOOO5, oooOOO2 != null ? oooOOO2.f7160OooO00o : null);
        if (oooOo == null || (oooOOO1 = oooOo.f34456OooO0O0) == null) {
            oooOOO1 = oooOOO4;
        }
        OooOOO0 oooOOO6 = oooOOO2 != null ? oooOOO2.f7161OooO0O0 : null;
        OooOOO0 oooOOO7 = oooOOO.f7160OooO00o;
        OooOOO0 oooOOO0OooO0O1 = OooO0O0(oooOOO1, oooOOO7, oooOOO.f7161OooO0O0, oooOOO6);
        if (oooOo != null && (oooOOO3 = oooOo.f34457OooO0OO) != null) {
            oooOOO4 = oooOOO3;
        }
        return new o000O00O.OooOo(oooOOO0OooO0O0, oooOOO0OooO0O1, OooO0O0(oooOOO4, oooOOO7, oooOOO.f7162OooO0OO, oooOOO2 != null ? oooOOO2.f7162OooO0OO : null), oooOOO, oooOOO2);
    }

    public static OooOOO0 OooO0O0(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2, OooOOO0 oooOOO3) {
        if (oooOOO3 == null) {
            return oooOOO2;
        }
        return (!(oooOOO0 instanceof OooOOO0.OooO0O0) || ((oooOOO1 instanceof OooOOO0.OooO0OO) && (oooOOO3 instanceof OooOOO0.OooO0OO)) || (oooOOO3 instanceof OooOOO0.OooO00o)) ? oooOOO3 : oooOOO0;
    }

    public final void OooO0OO(Function1<? super o000O00O.OooOo, o000O00O.OooOo> function1) {
        MutableStateFlow<o000O00O.OooOo> mutableStateFlow;
        o000O00O.OooOo value;
        o000O00O.OooOo oooOoInvoke;
        do {
            mutableStateFlow = this.f7173OooO0O0;
            value = mutableStateFlow.getValue();
            o000O00O.OooOo oooOo = value;
            oooOoInvoke = function1.invoke(oooOo);
            if (Intrinsics.areEqual(oooOo, oooOoInvoke)) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(value, oooOoInvoke));
        if (oooOoInvoke != null) {
            Iterator<Function1<o000O00O.OooOo, Unit>> it = this.f7172OooO00o.iterator();
            while (it.hasNext()) {
                it.next().invoke(oooOoInvoke);
            }
        }
    }
}
