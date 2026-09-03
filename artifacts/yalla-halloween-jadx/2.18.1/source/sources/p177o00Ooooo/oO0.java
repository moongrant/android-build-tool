package p177o00Ooooo;

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
import p159o00OoOO.o00O000;
import p186o00o00Oo.o0ooOOo;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oO0 implements o0ooOOo, ImageMoreView.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f32891OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f32892OooO0o0;

    public /* synthetic */ oO0(Object obj, int i) {
        this.f32891OooO0Oo = i;
        this.f32892OooO0o0 = obj;
    }

    @Override // com.app.base.view.imageMore.ImageMoreView.OooO0O0
    public final void OooO00o(int i) {
        MomentDetailView this$0 = (MomentDetailView) this.f32892OooO0o0;
        int i2 = MomentDetailView.f24937OoooooO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Moments_picture");
        Function1<? super PostDetailHeaderViewTag, Unit> function1 = this$0.com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String;
        if (function1 != null) {
            function1.invoke(PostDetailHeaderViewTag.PostDetailHideKeyboard);
        }
        MomentDetailModel momentDetailModel = this$0.f24941Oooo0oo;
        boolean z = momentDetailModel != null && momentDetailModel.getIsWaterMark();
        String string = "";
        if (z) {
            StringBuilder sb = new StringBuilder();
            MomentDetailModel momentDetailModel2 = this$0.f24941Oooo0oo;
            sb.append(momentDetailModel2 != null ? Long.valueOf(momentDetailModel2.getUserIdx()) : null);
            sb.append("");
            string = sb.toString();
        }
        String str = string;
        Object obj = this$0.f24939Oooo0o.f50243OooO0o0.OooO0Oo().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "binding.ivImageMoreViewI…tListUrl(false)[position]");
        this$0.OooOo0O((String) obj);
        ShowImageActivity.f22515o00o0O.OooO00o(this$0.getActivity(), i, this$0.f24939Oooo0o.f50243OooO0o0.OooO0Oo(), this$0.f24939Oooo0o.f50243OooO0o0.getAllImageViewList(), str, false);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        switch (this.f32891OooO0Oo) {
            case 0:
                oO0O000o oo0o000o = (oO0O000o) this.f32892OooO0o0;
                oo0o000o.f32898OoooOo0 = false;
                RoomUserInfoModel roomUserInfoModel = oo0o000o.f32901o000oOoO.getData().get(oo0o000o.f32901o000oOoO.getData().size() - 1);
                o00O000.OooO().OooOOo(roomUserInfoModel.getPriority(), 1, roomUserInfoModel.getUserId());
                break;
            default:
                JoinTopicListActivity this$0 = (JoinTopicListActivity) this.f32892OooO0o0;
                JoinTopicListActivity.OooO00o oooO00o = JoinTopicListActivity.f22299Oooooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOooo(true);
                break;
        }
    }
}
