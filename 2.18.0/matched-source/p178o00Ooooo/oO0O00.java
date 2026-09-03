package p178o00Ooooo;

import com.app.base.view.imageMore.ImageMoreView;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.moment.JoinTopicListActivity;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p160o00OoOO.o00O000;
import p187o00o00Oo.o0ooOOo;
import p393o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0O00 implements o0ooOOo, ImageMoreView.OooO0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f32916Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f32917OoooO00;

    public /* synthetic */ oO0O00(Object obj, int i) {
        this.f32916Oooo = i;
        this.f32917OoooO00 = obj;
    }

    @Override // com.app.base.view.imageMore.ImageMoreView.OooO0O0
    public final void OooO00o(int i) {
        MomentDetailView this$0 = (MomentDetailView) this.f32917OoooO00;
        int i2 = MomentDetailView.f24956ooOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Moments_picture");
        Function1<? super PostDetailHeaderViewTag, Unit> function1 = this$0.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String;
        if (function1 != null) {
            function1.invoke(PostDetailHeaderViewTag.PostDetailHideKeyboard);
        }
        MomentDetailModel momentDetailModel = this$0.f24959OoooO0;
        boolean z = momentDetailModel != null && momentDetailModel.getIsWaterMark();
        String string = "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel2 = this$0.f24959OoooO0;
            sb.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserIdx()) : null);
            sb.append("");
            string = sb.toString();
        }
        String str = string;
        Object obj = this$0.f24957Oooo.f50180OooO0o0.OooO0Oo().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "binding.ivImageMoreViewI…tListUrl(false)[position]");
        this$0.OooOo0O((String) obj);
        ShowImageActivity.f22534o00oO0o.OooO00o(this$0.getActivity(), i, this$0.f24957Oooo.f50180OooO0o0.OooO0Oo(), this$0.f24957Oooo.f50180OooO0o0.getAllImageViewList(), str, false);
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32916Oooo) {
            case 0:
                oO0O00o0 oo0o00o0 = (oO0O00o0) this.f32917OoooO00;
                oo0o00o0.f32926Ooooo00 = false;
                RoomUserInfoModel roomUserInfoModel = oo0o00o0.f32923OoooOo0.getData().get(oo0o00o0.f32923OoooOo0.getData().size() - 1);
                o00O000.OooO().OooOOo(roomUserInfoModel.getPriority(), 1, roomUserInfoModel.getUserId());
                break;
            default:
                JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f32917OoooO00;
                JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22318Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
        }
    }
}
