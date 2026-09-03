package p478o0o000O0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooOO0O f47629OooO0Oo = new OooOO0O();

    public OooOO0O() {
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
