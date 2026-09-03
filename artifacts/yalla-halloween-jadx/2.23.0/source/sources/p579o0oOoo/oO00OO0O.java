package p579o0oOoo;

import com.code.android.uikit.svga.SVGAView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.oo000o;
import p519o0o0O0oO.f5;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00OO0O extends Lambda implements Function1<oo000o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f56555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f56556OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(f5 f5Var, SVGAView sVGAView) {
        super(1);
        this.f56555OooO0Oo = f5Var;
        this.f56556OooO0o0 = sVGAView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo000o oo000oVar) {
        oo000o oo000oVar2 = oo000oVar;
        Function0<Unit> function0 = this.f56555OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        SVGAView sVGAView = this.f56556OooO0o0;
        sVGAView.setVideoItem(oo000oVar2);
        sVGAView.OooO0Oo();
        return Unit.INSTANCE;
    }
}
