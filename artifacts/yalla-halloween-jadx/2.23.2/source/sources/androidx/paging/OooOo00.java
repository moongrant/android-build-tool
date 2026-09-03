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

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMutableCombinedLoadStateCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1#2:169\n230#3,5:170\n1855#4,2:175\n*S KotlinDebug\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n*L\n96#1:170,5\n106#1:175,2\n*E\n"})
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Function1<p101o000oo.oo0o0Oo, Unit>> f10266OooO00o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<p101o000oo.oo0o0Oo> f10267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final StateFlow<p101o000oo.oo0o0Oo> f10268OooO0OO;

    public OooOo00() {
        MutableStateFlow<p101o000oo.oo0o0Oo> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f10267OooO0O0 = MutableStateFlow;
        this.f10268OooO0OO = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final p101o000oo.oo0o0Oo OooO00o(OooOo00 oooOo00, p101o000oo.oo0o0Oo oo0o0oo, OooOOO oooOOO, OooOOO oooOOO2) {
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO1;
        OooOOO0 oooOOO3;
        oooOo00.getClass();
        OooOOO0 oooOOO4 = OooOOO0.OooO0OO.f10261OooO0OO;
        if (oo0o0oo == null || (oooOOO0 = oo0o0oo.f35618OooO00o) == null) {
            oooOOO0 = oooOOO4;
        }
        OooOOO0 oooOOO5 = oooOOO.f10254OooO00o;
        OooOOO0 oooOOO0OooO0O0 = OooO0O0(oooOOO0, oooOOO5, oooOOO5, oooOOO2 != null ? oooOOO2.f10254OooO00o : null);
        if (oo0o0oo == null || (oooOOO1 = oo0o0oo.f35619OooO0O0) == null) {
            oooOOO1 = oooOOO4;
        }
        OooOOO0 oooOOO6 = oooOOO2 != null ? oooOOO2.f10255OooO0O0 : null;
        OooOOO0 oooOOO7 = oooOOO.f10254OooO00o;
        OooOOO0 oooOOO0OooO0O1 = OooO0O0(oooOOO1, oooOOO7, oooOOO.f10255OooO0O0, oooOOO6);
        if (oo0o0oo != null && (oooOOO3 = oo0o0oo.f35620OooO0OO) != null) {
            oooOOO4 = oooOOO3;
        }
        return new p101o000oo.oo0o0Oo(oooOOO0OooO0O0, oooOOO0OooO0O1, OooO0O0(oooOOO4, oooOOO7, oooOOO.f10256OooO0OO, oooOOO2 != null ? oooOOO2.f10256OooO0OO : null), oooOOO, oooOOO2);
    }

    public static OooOOO0 OooO0O0(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2, OooOOO0 oooOOO3) {
        if (oooOOO3 == null) {
            return oooOOO2;
        }
        return (!(oooOOO0 instanceof OooOOO0.OooO0O0) || ((oooOOO1 instanceof OooOOO0.OooO0OO) && (oooOOO3 instanceof OooOOO0.OooO0OO)) || (oooOOO3 instanceof OooOOO0.OooO00o)) ? oooOOO3 : oooOOO0;
    }

    public final void OooO0OO(Function1<? super p101o000oo.oo0o0Oo, p101o000oo.oo0o0Oo> function1) {
        MutableStateFlow<p101o000oo.oo0o0Oo> mutableStateFlow;
        p101o000oo.oo0o0Oo value;
        p101o000oo.oo0o0Oo oo0o0ooInvoke;
        do {
            mutableStateFlow = this.f10267OooO0O0;
            value = mutableStateFlow.getValue();
            p101o000oo.oo0o0Oo oo0o0oo = value;
            oo0o0ooInvoke = function1.invoke(oo0o0oo);
            if (Intrinsics.areEqual(oo0o0oo, oo0o0ooInvoke)) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(value, oo0o0ooInvoke));
        if (oo0o0ooInvoke != null) {
            Iterator<Function1<p101o000oo.oo0o0Oo, Unit>> it = this.f10266OooO00o.iterator();
            while (it.hasNext()) {
                it.next().invoke(oo0o0ooInvoke);
            }
        }
    }
}
