package o000O00O;

import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f34425OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final androidx.recyclerview.widget.OooOo.OooO<T> f34426OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.recyclerview.widget.o0ooOOo f34427OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f34428OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f34429OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f34430OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO f34431OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO0o f34432OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f34433OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final SharedFlow f34434OooOO0;

    /* JADX INFO: renamed from: o000O00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0398OooO00o implements o0OO00O {
        @Override // o000O00O.o0OO00O
        public final void OooO00o(int i, @NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (i == 2) {
                Log.v("Paging", message, null);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(OooO0OO.OooO00o.OooO00o("debug level ", i, " is requested but Paging only supports default logging for level 2 (DEBUG) or level 3 (VERBOSE)"));
                }
                Log.d("Paging", message, null);
            }
        }

        @Override // o000O00O.o0OO00O
        public final boolean OooO0O0(int i) {
            return Log.isLoggable("Paging", i);
        }
    }

    static {
        o0OO00O c0398OooO00o = oo0o0Oo.f34666OooO00o;
        if (c0398OooO00o == null) {
            c0398OooO00o = new C0398OooO00o();
        }
        oo0o0Oo.f34666OooO00o = c0398OooO00o;
    }

    @JvmOverloads
    public OooO00o(@NotNull androidx.recyclerview.widget.OooOo.OooO diffCallback, @NotNull androidx.recyclerview.widget.OooO0O0 updateCallback, @NotNull CoroutineContext mainDispatcher, @NotNull CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.f34426OooO00o = diffCallback;
        this.f34427OooO0O0 = updateCallback;
        this.f34428OooO0OO = mainDispatcher;
        this.f34429OooO0Oo = workerDispatcher;
        OooO oooO = new OooO(this);
        this.f34431OooO0o0 = oooO;
        OooO0o oooO0o = new OooO0o(this, oooO, mainDispatcher);
        this.f34432OooO0oO = oooO0o;
        this.f34433OooO0oo = new AtomicInteger(0);
        this.f34425OooO = FlowKt.filterNotNull(oooO0o.f7381OooOO0o);
        this.f34434OooOO0 = FlowKt.asSharedFlow(oooO0o.f7382OooOOO0);
    }
}
