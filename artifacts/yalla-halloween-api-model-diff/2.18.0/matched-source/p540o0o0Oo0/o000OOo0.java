package p540o0o0Oo0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo0 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f43954Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(PostDetailActivity postDetailActivity) {
        super(2);
        this.f43954Oooo = postDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (zBooleanValue) {
            LiveEventBus.get("POST_DETAIL_REFRESH_CLOSE_HEADER_OR_FOOTER").post(Boolean.TRUE);
            PostDetailActivity postDetailActivity = this.f43954Oooo;
            PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
            postDetailActivity.OooOooO().f50530OooOOoo.setVisibility(0);
            this.f43954Oooo.Oooo0o(true);
        } else {
            PostDetailActivity postDetailActivity2 = this.f43954Oooo;
            PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22436o000000O;
            postDetailActivity2.OooOooO().f50530OooOOoo.setVisibility(8);
            this.f43954Oooo.OooOooO().f50520OooO0oo.setImageResource(R.drawable.icon_emoji);
            this.f43954Oooo.Oooo0o(false);
        }
        PostDetailActivity postDetailActivity3 = this.f43954Oooo;
        if (!postDetailActivity3.f22444o000000) {
            postDetailActivity3.Oooo000().keyBoardPanelSwitchHelper(zBooleanValue);
        }
        return Unit.INSTANCE;
    }
}
