package p538o0o0Oo0;

import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43905Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f43906Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(MomentMessageListActivity momentMessageListActivity, int i) {
        super(0);
        this.f43905Oooo0o = momentMessageListActivity;
        this.f43906Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentMessageListActivity momentMessageListActivity = this.f43905Oooo0o;
        MomentMessageListActivity.OooO00o oooO00o = MomentMessageListActivity.f22334OoooooO;
        momentMessageListActivity.OooOooo().deleteMsgItem(this.f43905Oooo0o.OooOooO().getData(this.f43906Oooo0oO).getMid());
        return Unit.INSTANCE;
    }
}
