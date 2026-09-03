package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.widget.o00000O0;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
public final class o00Oo0<T> implements OooO0O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OOo<OooO0O0.OooO00o<T>> f5841OooO00o = new o000OOo<>(new OooO0O0.OooO00o[16]);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f5842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0.OooO00o<T> f5843OooO0OO;

    public final void OooO00o(int i, T t) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("size should be >=0, but was ", i).toString());
        }
        if (i == 0) {
            return;
        }
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(this.f5842OooO0O0, i, t);
        this.f5842OooO0O0 += i;
        this.f5841OooO00o.OooO0O0(oooO00o);
    }

    public final void OooO0O0(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f5842OooO0O0) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index ", i, ", size ");
        sbOooO00o.append(this.f5842OooO0O0);
        throw new IndexOutOfBoundsException(sbOooO00o.toString());
    }

    public final void OooO0OO(int i, int i2, @NotNull Function1<? super OooO0O0.OooO00o<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        OooO0O0(i);
        OooO0O0(i2);
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + ')').toString());
        }
        int iOooO0O0 = OooO0OO.OooO0O0(this.f5841OooO00o, i);
        int i3 = this.f5841OooO00o.f3662Oooo0o[iOooO0O0].f5793OooO00o;
        while (i3 <= i2) {
            OooO0O0.OooO00o<T> oooO00o = this.f5841OooO00o.f3662Oooo0o[iOooO0O0];
            block.invoke(oooO00o);
            i3 += oooO00o.f5794OooO0O0;
            iOooO0O0++;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.OooO0O0
    @NotNull
    public final OooO0O0.OooO00o<T> get(int i) {
        OooO0O0(i);
        OooO0O0.OooO00o<T> oooO00o = this.f5843OooO0OO;
        if (oooO00o != null) {
            int i2 = oooO00o.f5793OooO00o;
            boolean z = false;
            if (i < oooO00o.f5794OooO0O0 + i2 && i2 <= i) {
                z = true;
            }
            if (z) {
                return oooO00o;
            }
        }
        o000OOo<OooO0O0.OooO00o<T>> o000ooo2 = this.f5841OooO00o;
        OooO0O0.OooO00o<T> oooO00o2 = o000ooo2.f3662Oooo0o[OooO0OO.OooO0O0(o000ooo2, i)];
        this.f5843OooO0OO = oooO00o2;
        return oooO00o2;
    }

    @Override // androidx.compose.foundation.lazy.layout.OooO0O0
    public final int getSize() {
        return this.f5842OooO0O0;
    }
}
