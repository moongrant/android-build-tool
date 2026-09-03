package p101o000oo;

import android.util.Log;
import androidx.recyclerview.widget.OooO0O0;
import androidx.recyclerview.widget.Oooo000;
import androidx.recyclerview.widget.o0OOO0o;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Flow<oo0o0Oo> f35485OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Oooo000.OooO<T> f35486OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f35487OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f35488OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f35489OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f35490OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00Ooo f35491OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f35492OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f35493OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final SharedFlow f35494OooOO0;

    public static final class OooO00o implements o0000O0 {
        @Override // p101o000oo.o0000O0
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

    @JvmOverloads
    public o000oOoO(@NotNull Oooo000.OooO diffCallback, @NotNull OooO0O0 updateCallback, @NotNull CoroutineContext mainDispatcher, @NotNull CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.f35486OooO00o = diffCallback;
        this.f35487OooO0O0 = updateCallback;
        this.f35488OooO0OO = mainDispatcher;
        this.f35489OooO0Oo = workerDispatcher;
        o00Ooo o00ooo2 = new o00Ooo(this);
        this.f35491OooO0o0 = o00ooo2;
        o00Oo0 o00oo1 = new o00Oo0(this, o00ooo2, mainDispatcher);
        this.f35492OooO0oO = o00oo1;
        this.f35493OooO0oo = new AtomicInteger(0);
        this.f35485OooO = FlowKt.filterNotNull(o00oo1.f10475OooOO0o);
        this.f35494OooOO0 = FlowKt.asSharedFlow(o00oo1.f10476OooOOO0);
    }
}
