package p590o0oOooo0;

import com.code.android.uikit.svga.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.o00Ooo;
import p650o0ooo.g5;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO00o0 extends Lambda implements Function1<o00Ooo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f57230OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f57231OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(g5 g5Var, SVGAView sVGAView) {
        super(1);
        this.f57230OooO0Oo = g5Var;
        this.f57231OooO0o0 = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00Ooo o00ooo2) {
        o00Ooo o00ooo3 = o00ooo2;
        Function0<Unit> function0 = this.f57230OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        SVGAView sVGAView = this.f57231OooO0o0;
        sVGAView.setVideoItem(o00ooo3);
        sVGAView.OooO0Oo();
        return Unit.INSTANCE;
    }
}
