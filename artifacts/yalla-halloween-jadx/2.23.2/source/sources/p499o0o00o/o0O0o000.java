package p499o0o00o;

import com.yalla.yalla.ui.view.webView.BaseWebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p576o0oOoOOo.oOO00O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f49945OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(oo0OOoo oo0oooo) {
        super(1);
        this.f49945OooO0Oo = oo0oooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        oo0OOoo oo0oooo = this.f49945OooO0Oo;
        if (oo0oooo.OooO0OO().getLoadState() == BaseWebView.LoadState.Success) {
            oOO00O0.OooO0OO(oo0oooo.OooO0OO());
        }
        return Unit.INSTANCE;
    }
}
