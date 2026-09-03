package p029Oooo0oO;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.OooO0O0;
import p028Oooo0o0.o00O000;
import p028Oooo0o0.o0O00O0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends Lambda implements Function2<OooO, OooO0O0, List<Integer>> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00O0o f2272Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f2273Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O000.OooO0o f2274Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(o0O00O0o o0o00o0o, o000O0Oo o000o0oo2, o00O000.OooO0o oooO0o) {
        super(2);
        this.f2272Oooo0o = o0o00o0o;
        this.f2273Oooo0oO = o000o0oo2;
        this.f2274Oooo0oo = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<Integer> invoke(OooO oooO, OooO0O0 oooO0O0) {
        OooO oooO2 = oooO;
        long j = oooO0O0.f27302OooO00o;
        Intrinsics.checkNotNullParameter(oooO2, "$this$null");
        if (!(OooO0O0.OooO0oo(j) != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        o0O00O0o o0o00o0o = this.f2272Oooo0o;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        List<Integer> mutableList = CollectionsKt.toMutableList((Collection) this.f2273Oooo0oO.OooO00o(oooO2, OooO0O0.OooO0oo(j) - oooO2.OoooooO(PaddingKt.OooO0O0(this.f2272Oooo0o, layoutDirection) + PaddingKt.OooO0OO(o0o00o0o, layoutDirection)), oooO2.OoooooO(this.f2274Oooo0oo.OooO00o())));
        int size = mutableList.size();
        for (int i = 1; i < size; i++) {
            mutableList.set(i, Integer.valueOf(mutableList.get(i - 1).intValue() + mutableList.get(i).intValue()));
        }
        return mutableList;
    }
}
