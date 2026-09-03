package p032OoooO0;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOo00;
import p145o00Oo0.OooOOO0;
import p145o00Oo0.o00000O;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o0000oo;
import p145o00Oo0.o0ooOOo;
import p442o0OoOo0.OooOo;
import p442o0OoOo0.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Lambda implements Function1<OooOo, o00Ooo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f2945Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(long j) {
        super(1);
        this.f2945Oooo0o = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00Ooo invoke(OooOo oooOo) {
        OooOo drawWithCache = oooOo;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        float fOooO0Oo = OooOo00.OooO0Oo(drawWithCache.OooO0OO()) / 2.0f;
        o0000oo o0000ooVarOooO0Oo = p034OoooO0O.OooOo00.OooO0Oo(drawWithCache, fOooO0Oo);
        long j = this.f2945Oooo0o;
        return drawWithCache.OooOOO(new OooOOO(fOooO0Oo, o0000ooVarOooO0Oo, new o00000O(Build.VERSION.SDK_INT >= 29 ? o0ooOOo.f32150OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(o00000OO.OooO0oO(j), OooOOO0.OooO0O0(5)))));
    }
}
