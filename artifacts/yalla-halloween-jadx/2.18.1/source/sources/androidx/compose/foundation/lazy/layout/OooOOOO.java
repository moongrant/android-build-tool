package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000OO00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public final class OooOOOO implements o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f5811OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<Object, Integer> f5812OooO0O0;

    public OooOOOO(@NotNull OooOOO0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.f5811OooO00o = factory;
        this.f5812OooO0O0 = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, java.lang.Integer>] */
    @Override // o0O0O00.o000OO00
    public final void OooO00o(@NotNull o000OO00.OooO00o slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        this.f5812OooO0O0.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object objOooO0O0 = this.f5811OooO00o.OooO0O0(it.next());
            Integer num = (Integer) this.f5812OooO0O0.get(objOooO0O0);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                this.f5812OooO0O0.put(objOooO0O0, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // o0O0O00.o000OO00
    public final boolean OooO0O0(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.areEqual(this.f5811OooO00o.OooO0O0(obj), this.f5811OooO00o.OooO0O0(obj2));
    }
}
