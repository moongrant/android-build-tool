package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f49473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49474OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(MomentMessageListActivity momentMessageListActivity, int i) {
        super(0);
        this.f49473OooO0Oo = momentMessageListActivity;
        this.f49474OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = MomentMessageListActivity.f25667OooOoOO;
        MomentMessageListActivity momentMessageListActivity = this.f49473OooO0Oo;
        momentMessageListActivity.OooOoO().deleteMsgItem(momentMessageListActivity.OooOoO0().getData(this.f49474OooO0o0).getMid());
        return Unit.INSTANCE;
    }
}
