package o000O00O;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nInvalidateCallbackTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n*L\n86#1:90,2\n*E\n"})
public final class o0OOO0o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<T, Unit> f34656OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function0<Boolean> f34657OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f34658OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f34659OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34660OooO0o0;

    public o0OOO0o(androidx.paging.o0O0O00.OooO0OO callbackInvoker) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f34656OooO00o = callbackInvoker;
        this.f34657OooO0O0 = null;
        this.f34658OooO0OO = new ReentrantLock();
        this.f34659OooO0Oo = new ArrayList();
    }

    public final boolean OooO00o() {
        if (this.f34660OooO0o0) {
            return false;
        }
        ReentrantLock reentrantLock = this.f34658OooO0OO;
        reentrantLock.lock();
        try {
            if (this.f34660OooO0o0) {
                reentrantLock.unlock();
                return false;
            }
            this.f34660OooO0o0 = true;
            ArrayList arrayList = this.f34659OooO0Oo;
            List list = CollectionsKt.toList(arrayList);
            arrayList.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f34656OooO00o.invoke(it.next());
                }
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
