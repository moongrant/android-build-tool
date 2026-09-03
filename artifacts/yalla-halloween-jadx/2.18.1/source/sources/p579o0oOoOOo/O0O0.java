package p579o0oOoOOo;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ O0000000 f45894Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(O0000000 o0000000) {
        super(0);
        this.f45894Oooo0o = o0000000;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        O0000000 o0000000 = this.f45894Oooo0o;
        LinearLayout linearLayout = o0000000.OooOO0O().f49784OooOOo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llUserSelect");
        o0000000.OooOOOO(linearLayout);
        return Unit.INSTANCE;
    }
}
