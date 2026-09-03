package p034OoooO0O;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.ui.text.style.ResolvedTextDirection;
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
public final class Oooo0 extends Lambda implements Function1<OooOo, o00Ooo> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f3457Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ long f3458Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f3459Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ResolvedTextDirection f3460Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(long j, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        super(1);
        this.f3458Oooo0o = j;
        this.f3459Oooo0oO = z;
        this.f3460Oooo0oo = resolvedTextDirection;
        this.f3457Oooo = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00Ooo invoke(OooOo oooOo) {
        OooOo drawWithCache = oooOo;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        o0000oo o0000ooVarOooO0Oo = OooOo00.OooO0Oo(drawWithCache, OooOo00.OooO0Oo(drawWithCache.OooO0OO()) / 2.0f);
        long j = this.f3458Oooo0o;
        return drawWithCache.OooOOO(new Oooo000(this.f3459Oooo0oO, this.f3460Oooo0oo, this.f3457Oooo, o0000ooVarOooO0Oo, new o00000O(Build.VERSION.SDK_INT >= 29 ? o0ooOOo.f32150OooO00o.OooO00o(j, 5) : new PorterDuffColorFilter(o00000OO.OooO0oO(j), OooOOO0.OooO0O0(5)))));
    }
}
