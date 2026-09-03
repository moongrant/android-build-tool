package p484o0o000o0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00Oo0 f48657OooO0Oo = new o00Oo0();

    public o00Oo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo it = webPageInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        LiveEventBus.get("GiftSendDialogWealthLevelUnlock").post(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
