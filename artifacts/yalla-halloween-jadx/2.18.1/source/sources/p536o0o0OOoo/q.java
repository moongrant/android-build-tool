package p536o0o0OOoo;

import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends Lambda implements Function1<MomentDetailModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43841Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f43842Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PrivateChatActivity privateChatActivity, String str) {
        super(1);
        this.f43841Oooo0o = privateChatActivity;
        this.f43842Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentDetailModel momentDetailModel) {
        MomentDetailModel momentDetailModel2 = momentDetailModel;
        if (momentDetailModel2 == null) {
            ToastUtil.f12567OooO00o.OooO0O0(this.f43841Oooo0o.getResources().getString(R.string.dynami_del));
        } else {
            PostDetailActivity.f22417o0O0O00.OooO00o(this.f43841Oooo0o, momentDetailModel2, false, -1, null, false, MomentAdapterTag.PrivateChat, false, this.f43842Oooo0oO);
        }
        return Unit.INSTANCE;
    }
}
