package p601o0oo00Oo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.ui.view.MomentSendTitleTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p169o00Ooo00.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendTitleTask f48197Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO000o(MomentSendTitleTask momentSendTitleTask) {
        super(0);
        this.f48197Oooo0o = momentSendTitleTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentSendModel momentSendModel = this.f48197Oooo0o.f24989Oooo0oO;
        if (momentSendModel != null) {
            OooOOOO oooOOOO = OooOOOO.f32671OooO00o;
            OooOOOO.OooO0OO(momentSendModel);
            LiveEventBus.get("Post_send_delete").post(momentSendModel);
        }
        return Unit.INSTANCE;
    }
}
