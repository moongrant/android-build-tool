package p029Oooo0oO;

import androidx.compose.foundation.lazy.layout.OooOo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO implements o0O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ boolean f2334OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ List<Integer> f2335OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo f2336OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f2337OooO0Oo;

    public o00O0OOO(boolean z, List<Integer> list, OooOo oooOo, int i) {
        this.f2334OooO00o = z;
        this.f2335OooO0O0 = list;
        this.f2336OooO0OO = oooOo;
        this.f2337OooO0Oo = i;
    }

    @Override // p029Oooo0oO.o0O00O
    @NotNull
    public final o0oOOo OooO00o(int i, @NotNull o0O00o0[] items, @NotNull List<o000OO0O> spans, int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(spans, "spans");
        return new o0oOOo(i, items, spans, this.f2334OooO00o, this.f2335OooO0O0.size(), this.f2336OooO0OO.getLayoutDirection(), i2, this.f2337OooO0Oo, null);
    }
}
