package p027Oooo0o;

import androidx.compose.foundation.lazy.layout.OooO0O0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 extends Lambda implements Function1<OooO0O0.OooO00o<o00Ooo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f1989Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f1990Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ HashMap<Object, Integer> f1991Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(int i, int i2, HashMap<Object, Integer> map) {
        super(1);
        this.f1989Oooo0o = i;
        this.f1990Oooo0oO = i2;
        this.f1991Oooo0oo = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooO0O0.OooO00o<o00Ooo> oooO00o) {
        OooO0O0.OooO00o<o00Ooo> it = oooO00o;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<Integer, Object> function1 = it.f5795OooO0OO.f1983OooO00o;
        if (function1 != null) {
            if (function1 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int iMax = Math.max(this.f1989Oooo0o, it.f5793OooO00o);
            int iMin = Math.min(this.f1990Oooo0oO, (it.f5793OooO00o + it.f5794OooO0O0) - 1);
            if (iMax <= iMin) {
                while (true) {
                    this.f1991Oooo0oo.put(function1.invoke(Integer.valueOf(iMax - it.f5793OooO00o)), Integer.valueOf(iMax));
                    if (iMax == iMin) {
                        break;
                    }
                    iMax++;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
