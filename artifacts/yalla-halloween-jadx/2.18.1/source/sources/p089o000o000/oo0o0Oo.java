package p089o000o000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<T, Unit> f29108OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function0<Boolean> f29109OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f29110OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final List<T> f29111OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f29112OooO0o0;

    public oo0o0Oo(Function1 callbackInvoker) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f29108OooO00o = callbackInvoker;
        this.f29109OooO0O0 = null;
        this.f29110OooO0OO = new ReentrantLock();
        this.f29111OooO0Oo = new ArrayList();
    }

    public final void OooO00o() {
        if (this.f29112OooO0o0) {
            return;
        }
        ReentrantLock reentrantLock = this.f29110OooO0OO;
        reentrantLock.lock();
        try {
            if (this.f29112OooO0o0) {
                reentrantLock.unlock();
                return;
            }
            this.f29112OooO0o0 = true;
            List list = CollectionsKt.toList(this.f29111OooO0Oo);
            this.f29111OooO0Oo.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (list != null) {
                Function1<T, Unit> function1 = this.f29108OooO00o;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    function1.invoke(it.next());
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
