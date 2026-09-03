package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo extends CoroutineDispatcher {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f6411OoooOOO = new OooO0OO();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy<CoroutineContext> f6412OoooOOo = LazyKt.lazy(OooO00o.f6424Oooo0o);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final ThreadLocal<CoroutineContext> f6413OoooOo0 = new OooO0O0();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Choreographer f6415Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Handler f6416Oooo0oO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f6418OoooO;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f6421OoooO0O;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final o0000 f6423o000oOoO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Object f6417Oooo0oo = new Object();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Runnable> f6414Oooo = new ArrayDeque<>();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public List<Choreographer.FrameCallback> f6420OoooO00 = new ArrayList();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public List<Choreographer.FrameCallback> f6419OoooO0 = new ArrayList();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final OooO0o f6422OoooOO0 = new OooO0o();

    public static final class OooO00o extends Lambda implements Function0<CoroutineContext> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6424Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() {
            Choreographer choreographer = Looper.myLooper() == Looper.getMainLooper() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new o00000OO(null));
            Intrinsics.checkNotNullExpressionValue(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerOooO00o = o000O00O.OooOO0O.OooO00o(Looper.getMainLooper());
            Intrinsics.checkNotNullExpressionValue(handlerOooO00o, "createAsync(Looper.getMainLooper())");
            o0000Ooo o0000ooo = new o0000Ooo(choreographer, handlerOooO00o);
            return o0000ooo.plus(o0000ooo.f6423o000oOoO);
        }
    }

    public static final class OooO0O0 extends ThreadLocal<CoroutineContext> {
        @Override // java.lang.ThreadLocal
        public final CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerOooO00o = o000O00O.OooOO0O.OooO00o(looperMyLooper);
            Intrinsics.checkNotNullExpressionValue(handlerOooO00o, "createAsync(\n           …d\")\n                    )");
            o0000Ooo o0000ooo = new o0000Ooo(choreographer, handlerOooO00o);
            return o0000ooo.plus(o0000ooo.f6423o000oOoO);
        }
    }

    public static final class OooO0OO {
    }

    public static final class OooO0o implements Choreographer.FrameCallback, Runnable {
        public OooO0o() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            o0000Ooo.this.f6416Oooo0oO.removeCallbacks(this);
            o0000Ooo.OooO00o(o0000Ooo.this);
            o0000Ooo o0000ooo = o0000Ooo.this;
            synchronized (o0000ooo.f6417Oooo0oo) {
                if (o0000ooo.f6418OoooO) {
                    o0000ooo.f6418OoooO = false;
                    List<Choreographer.FrameCallback> list = o0000ooo.f6420OoooO00;
                    o0000ooo.f6420OoooO00 = o0000ooo.f6419OoooO0;
                    o0000ooo.f6419OoooO0 = list;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).doFrame(j);
                    }
                    list.clear();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0000Ooo.OooO00o(o0000Ooo.this);
            o0000Ooo o0000ooo = o0000Ooo.this;
            synchronized (o0000ooo.f6417Oooo0oo) {
                if (o0000ooo.f6420OoooO00.isEmpty()) {
                    o0000ooo.f6415Oooo0o.removeFrameCallback(this);
                    o0000ooo.f6418OoooO = false;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public o0000Ooo(Choreographer choreographer, Handler handler) {
        this.f6415Oooo0o = choreographer;
        this.f6416Oooo0oO = handler;
        this.f6423o000oOoO = new o0000(choreographer);
    }

    public static final void OooO00o(o0000Ooo o0000ooo) {
        Runnable runnableRemoveFirstOrNull;
        boolean z;
        do {
            synchronized (o0000ooo.f6417Oooo0oo) {
                runnableRemoveFirstOrNull = o0000ooo.f6414Oooo.removeFirstOrNull();
            }
            while (runnableRemoveFirstOrNull != null) {
                runnableRemoveFirstOrNull.run();
                synchronized (o0000ooo.f6417Oooo0oo) {
                    runnableRemoveFirstOrNull = o0000ooo.f6414Oooo.removeFirstOrNull();
                }
            }
            synchronized (o0000ooo.f6417Oooo0oo) {
                z = false;
                if (o0000ooo.f6414Oooo.isEmpty()) {
                    o0000ooo.f6421OoooO0O = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo2062dispatch(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this.f6417Oooo0oo) {
            this.f6414Oooo.addLast(block);
            if (!this.f6421OoooO0O) {
                this.f6421OoooO0O = true;
                this.f6416Oooo0oO.post(this.f6422OoooOO0);
                if (!this.f6418OoooO) {
                    this.f6418OoooO = true;
                    this.f6415Oooo0o.postFrameCallback(this.f6422OoooOO0);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
