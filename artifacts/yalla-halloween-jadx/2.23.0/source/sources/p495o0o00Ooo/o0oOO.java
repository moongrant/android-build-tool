package p495o0o00Ooo;

import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p572o0oOoOO0.oO000Oo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f48959OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(o00Oo00 o00oo00) {
        super(1);
        this.f48959OooO0Oo = o00oo00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        o00Oo00 o00oo00 = this.f48959OooO0Oo;
        if (o00oo00.OooO0OO().getLoadState() == BaseWebView.LoadState.Success) {
            oO000Oo0.OooO0OO(o00oo00.OooO0OO());
        }
        return Unit.INSTANCE;
    }
}
