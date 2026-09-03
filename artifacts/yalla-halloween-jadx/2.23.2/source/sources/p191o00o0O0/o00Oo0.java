package p191o00o0O0;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p396o0Oo00o0.OooOOO0;
import p396o0Oo00o0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00Oo0 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile boolean f38585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList<Class<? extends o00Oo0>> f38586OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f38587OooO0OO = LazyKt.lazy(new OooO00o());

    public static final class OooO00o extends Lambda implements Function0<CountDownLatch> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CountDownLatch invoke() {
            int size;
            ArrayList<Class<? extends o00Oo0>> arrayList = o00Oo0.this.f38586OooO0O0;
            if (arrayList == null) {
                size = 0;
            } else {
                Intrinsics.checkNotNull(arrayList);
                size = arrayList.size();
            }
            return new CountDownLatch(size);
        }
    }

    @NotNull
    public final void OooO00o(@NotNull Class... task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList<Class<? extends o00Oo0>> arrayList = this.f38586OooO0O0;
        arrayList.clear();
        arrayList.addAll(ArraysKt.toList(task));
    }

    public boolean OooO0O0() {
        return this instanceof OooOOO0;
    }

    public boolean OooO0OO() {
        return this instanceof OooOo00;
    }
}
