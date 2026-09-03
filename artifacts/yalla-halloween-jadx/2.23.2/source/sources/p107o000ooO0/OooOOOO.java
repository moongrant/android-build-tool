package p107o000ooO0;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.OooOOO;
import androidx.paging.o0OOO0o;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o0000O0;
import p101o000oo.o0000O0O;
import p101o000oo.o0000oo;
import p101o000oo.oo0o0Oo;
import p101o000oo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyPagingItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,293:1\n76#2:294\n102#2,2:295\n76#2:297\n102#2,2:298\n*S KotlinDebug\n*F\n+ 1 LazyPagingItems.kt\nandroidx/paging/compose/LazyPagingItems\n*L\n119#1:294\n119#1:295,2\n191#1:297\n191#1:298,2\n*E\n"})
public final class OooOOOO<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f35803OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<o0OOO0o<T>> f35804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Oooo0 f35805OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f35806OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f35807OooO0Oo;

    public static final class OooO00o implements o0000O0 {
        @Override // p101o000oo.o0000O0
        public final void OooO00o(int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (i == 3) {
                Log.d("Paging", message);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("debug level ", i, " is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)"));
                }
                Log.v("Paging", message);
            }
        }

        @Override // p101o000oo.o0000O0
        public final boolean OooO0O0(int i) {
            return Log.isLoggable("Paging", i);
        }
    }

    static {
        o0000O0 oooO00o = o0000O0O.f35428OooO00o;
        if (oooO00o == null) {
            oooO00o = new OooO00o();
        }
        o0000O0O.f35428OooO00o = oooO00o;
    }

    public OooOOOO(@NotNull SharedFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f35804OooO00o = flow;
        Oooo0 oooo0 = new Oooo0(this, new Oooo000(this), Dispatchers.getMain(), flow instanceof SharedFlow ? (o0OOO0o) CollectionsKt.firstOrNull((List) flow.getReplayCache()) : null);
        this.f35805OooO0O0 = oooo0;
        this.f35806OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(oooo0.OooO0o0(), null, 2, null);
        oo0o0Oo value = oooo0.f10475OooOO0o.getValue();
        if (value == null) {
            OooOOO oooOOO = o00O0O.f35819OooO00o;
            value = new oo0o0Oo(oooOOO.f10254OooO00o, oooOOO.f10255OooO0O0, oooOOO.f10256OooO0OO, oooOOO, null);
        }
        this.f35807OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
    }

    @Nullable
    public final T OooO00o(int i) {
        this.f35805OooO0O0.OooO0O0(i);
        return (T) ((o0000oo) this.f35806OooO0OO.getValue()).get(i);
    }

    public final int OooO0O0() {
        return ((o0000oo) this.f35806OooO0OO.getValue()).size();
    }

    @NotNull
    public final oo0o0Oo OooO0OO() {
        return (oo0o0Oo) this.f35807OooO0Oo.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    public final void OooO0Oo() {
        boolean z;
        Oooo0 oooo0 = this.f35805OooO0O0;
        oooo0.getClass();
        o0000O0 o0000o1 = o0000O0O.f35428OooO00o;
        if (o0000o1 != null) {
            z = o0000o1.OooO0O0(3);
        }
        if (z) {
            o0000o1.OooO00o(3, "Refresh signal received");
        }
        oo0oOO0 oo0ooo0 = oooo0.f10468OooO0Oo;
        if (oo0ooo0 != null) {
            oo0ooo0.OooO0O0();
        }
    }
}
