package p101o000oo;

import androidx.paging.o0O0O00;
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

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nInvalidateCallbackTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1855#2,2:90\n*S KotlinDebug\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n*L\n86#1:90,2\n*E\n"})
public final class o0000O00<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<T, Unit> f35423OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function0<Boolean> f35424OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ReentrantLock f35425OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f35426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f35427OooO0o0;

    public o0000O00(o0O0O00.OooO0OO callbackInvoker) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f35423OooO00o = callbackInvoker;
        this.f35424OooO0O0 = null;
        this.f35425OooO0OO = new ReentrantLock();
        this.f35426OooO0Oo = new ArrayList();
    }

    public final boolean OooO00o() {
        if (this.f35427OooO0o0) {
            return false;
        }
        ReentrantLock reentrantLock = this.f35425OooO0OO;
        reentrantLock.lock();
        try {
            if (this.f35427OooO0o0) {
                reentrantLock.unlock();
                return false;
            }
            this.f35427OooO0o0 = true;
            ArrayList arrayList = this.f35426OooO0Oo;
            List list = CollectionsKt.toList(arrayList);
            arrayList.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.f35423OooO00o.invoke(it.next());
                }
            }
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
