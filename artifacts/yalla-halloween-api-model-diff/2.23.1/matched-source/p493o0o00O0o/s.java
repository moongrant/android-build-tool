package p493o0o00O0o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import oO0OO.o00000OO;
import p416o0Oo0oO.oO0Oo0oo;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49456OooO0o0;

    public /* synthetic */ s(Object obj, int i) {
        this.f49455OooO0Oo = i;
        this.f49456OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        GiftPropModel.CustomPropDetail customPropDetail;
        int i = this.f49455OooO0Oo;
        Object obj2 = this.f49456OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                int i2 = TopicDetailActivity.f25856OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TopicInfoModel value = this$0.OooOoo0().getTopicDetailLocal().getValue();
                if (value != null && onTopPostForTopicModel.getTopicId() == value.getId()) {
                    TopicInfoModel value2 = this$0.OooOoo0().getTopicDetailLocal().getValue();
                    if (value2 != null) {
                        value2.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    Response response = (Response) this$0.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        topicInfoModel.setTopDyId(onTopPostForTopicModel.getPostId());
                    }
                    this$0.OooOoo0().getTopDyId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            default:
                o00000OO this$1 = (o00000OO) obj2;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                GiftPropModel giftPropModel = this$1.f58879OooOOo;
                boolean z = giftPropModel != null && Intrinsics.areEqual(giftPropModel, giftView.getF29934OooO0o0());
                GiftView giftView2 = this$1.f58880OooOOo0;
                if (giftView2 != null) {
                    giftView2.setSelectedGift(false);
                }
                this$1.f58879OooOOo = null;
                this$1.f58880OooOOo0 = giftView;
                if (giftView != null) {
                    giftView.setSelectedGift(true);
                }
                this$1.f58879OooOOo = giftView.getF29934OooO0o0();
                GiftPropModel f29934OooO0o0 = giftView.getF29934OooO0o0();
                if ((f29934OooO0o0 != null && f29934OooO0o0.isAllSiteGift()) && this$1.f58878OooOOOo > 17) {
                    this$1.OooOoO(1);
                }
                this$1.OooOOo0().f44512OooOo0O.setData(this$1.f58879OooOOo);
                if (!z) {
                    GiftPropModel giftPropModel2 = this$1.f58879OooOOo;
                    if (!(giftPropModel2 != null && giftPropModel2.isCustomMade())) {
                        ConstraintLayout customGiftWarnContainer = this$1.OooOOo0().f44494OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer, "customGiftWarnContainer");
                        if (o000O.OooO0o0(customGiftWarnContainer)) {
                            oO0Oo0oo oo0oo0ooOooO0Oo = o00Oo0.OooO0Oo();
                            oo0oo0ooOooO0Oo.getClass();
                            oo0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + oo0oO0.OooOOo0().getValue(), true);
                            ConstraintLayout customGiftWarnContainer2 = this$1.OooOOo0().f44494OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer2, "customGiftWarnContainer");
                            o000O.OooO0O0(customGiftWarnContainer2);
                        }
                    } else {
                        GiftPropModel giftPropModel3 = this$1.f58879OooOOo;
                        if ((giftPropModel3 == null || (customPropDetail = giftPropModel3.getCustomPropDetail()) == null || customPropDetail.isFirstOpenCustomMade()) ? false : true) {
                            oO0Oo0oo oo0oo0ooOooO0Oo2 = o00Oo0.OooO0Oo();
                            oo0oo0ooOooO0Oo2.getClass();
                            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                            if (!oo0oo0ooOooO0Oo2.OooO0O0("neverShowCustomMadeGiftWarn" + oo0oO0.OooOOo0().getValue(), false)) {
                                ConstraintLayout customGiftWarnContainer3 = this$1.OooOOo0().f44494OooO0Oo;
                                Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer3, "customGiftWarnContainer");
                                o000O.OooOOOO(customGiftWarnContainer3);
                            }
                        }
                    }
                }
                break;
        }
    }
}
