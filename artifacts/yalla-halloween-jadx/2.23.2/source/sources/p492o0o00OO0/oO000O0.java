package p492o0o00OO0;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.view.GiftView;
import kotlin.jvm.internal.Intrinsics;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p414o0Oo0oO.oO0Oo0oo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p511o0o0O.o00000OO;
import p562o0oOo000.o0Oo0oo;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO000O0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49368OooO0o0;

    public /* synthetic */ oO000O0(Object obj, int i) {
        this.f49367OooO0Oo = i;
        this.f49368OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        GiftPropModel.CustomPropDetail customPropDetail;
        int i = this.f49367OooO0Oo;
        Object obj2 = this.f49368OooO0o0;
        switch (i) {
            case 0:
                TopicDetailActivity this$0 = (TopicDetailActivity) obj2;
                String str = (String) obj;
                int i2 = TopicDetailActivity.f25854OooOoOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long currentTopicUserId = this$0.OooOoo0().getCurrentTopicUserId();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l != null && currentTopicUserId == l.longValue()) {
                    Response response = (Response) this$0.OooOoo0().getTopicDetailLiveData().getValue();
                    TopicInfoModel topicInfoModel = response != null ? (TopicInfoModel) response.getData() : null;
                    if (topicInfoModel != null) {
                        Intrinsics.checkNotNull(str);
                        topicInfoModel.setImage(str);
                    }
                    Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(this$0);
                    int iOooO00o = o0000O0.OooO00o(55);
                    oooO00o.f43126OooO0OO = OooO0OO.OooO0o0(OooO0OO.OooO0oo(iOooO00o, iOooO00o, str));
                    oooO00o.f43124OooO00o = 0;
                    oooO00o.OooO00o(d1.OooO0oO());
                    oooO00o.OooO0o0(12);
                    oooO00o.OooO0Oo(this$0.OooOoOO().f45018OooO0oO.f45287OooO0o0);
                    Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(this$0);
                    oooO00o2.f43126OooO0OO = OooO0OO.OooO00o(50, str);
                    oooO00o2.f43124OooO00o = 0;
                    int i3 = o0Oo0oo.icon_topic_detail_bg;
                    oooO00o2.f43138OooOOOo = i3;
                    oooO00o2.f43128OooO0o = i3;
                    oooO00o2.OooO0Oo(this$0.OooOoOO().f45018OooO0oO.f45285OooO0Oo);
                }
                break;
            default:
                o00000OO this$1 = (o00000OO) obj2;
                GiftView giftView = (GiftView) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                GiftPropModel giftPropModel = this$1.f50968OooOOo;
                boolean z = giftPropModel != null && Intrinsics.areEqual(giftPropModel, giftView.getF29924OooO0o0());
                GiftView giftView2 = this$1.f50969OooOOo0;
                if (giftView2 != null) {
                    giftView2.setSelectedGift(false);
                }
                this$1.f50968OooOOo = null;
                this$1.f50969OooOOo0 = giftView;
                if (giftView != null) {
                    giftView.setSelectedGift(true);
                }
                this$1.f50968OooOOo = giftView.getF29924OooO0o0();
                GiftPropModel f29924OooO0o0 = giftView.getF29924OooO0o0();
                if ((f29924OooO0o0 != null && f29924OooO0o0.isAllSiteGift()) && this$1.f50967OooOOOo > 17) {
                    this$1.OooOoO(1);
                }
                this$1.OooOOo0().f44522OooOo0O.setData(this$1.f50968OooOOo);
                if (!z) {
                    GiftPropModel giftPropModel2 = this$1.f50968OooOOo;
                    if (!(giftPropModel2 != null && giftPropModel2.isCustomMade())) {
                        ConstraintLayout customGiftWarnContainer = this$1.OooOOo0().f44504OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer, "customGiftWarnContainer");
                        if (o000O.OooO0o0(customGiftWarnContainer)) {
                            oO0Oo0oo oo0oo0ooOooO0Oo = o00Ooo.OooO0Oo();
                            oo0oo0ooOooO0Oo.getClass();
                            oo0oo0ooOooO0Oo.OooO0o("neverShowCustomMadeGiftWarn" + o0O00oO0.OooOOo0().getValue(), true);
                            ConstraintLayout customGiftWarnContainer2 = this$1.OooOOo0().f44504OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(customGiftWarnContainer2, "customGiftWarnContainer");
                            o000O.OooO0O0(customGiftWarnContainer2);
                        }
                    } else {
                        GiftPropModel giftPropModel3 = this$1.f50968OooOOo;
                        if ((giftPropModel3 == null || (customPropDetail = giftPropModel3.getCustomPropDetail()) == null || customPropDetail.isFirstOpenCustomMade()) ? false : true) {
                            oO0Oo0oo oo0oo0ooOooO0Oo2 = o00Ooo.OooO0Oo();
                            oo0oo0ooOooO0Oo2.getClass();
                            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                            if (!oo0oo0ooOooO0Oo2.OooO0O0("neverShowCustomMadeGiftWarn" + o0O00oO0.OooOOo0().getValue(), false)) {
                                ConstraintLayout customGiftWarnContainer3 = this$1.OooOOo0().f44504OooO0Oo;
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
