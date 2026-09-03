package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f47836OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f47837OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(MomentMessageListActivity momentMessageListActivity, int i) {
        super(0);
        this.f47836OooO0Oo = momentMessageListActivity;
        this.f47837OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentMessageListActivity.f26116OooOoOO;
        MomentMessageListActivity momentMessageListActivity = this.f47836OooO0Oo;
        momentMessageListActivity.OooOoO().deleteMsgItem(momentMessageListActivity.OooOoO0().getData(this.f47837OooO0o0).getMid());
        return Unit.INSTANCE;
    }
}
