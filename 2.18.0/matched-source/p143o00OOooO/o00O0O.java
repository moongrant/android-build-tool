package p143o00OOooO;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.app.base.fragment.FriendsListFragment;
import com.app.base.fragment.room.RoomInfoProfileFragment;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.view.tips.TipsBubbleView;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.model.FaqTag;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.BaseWebView;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.fragment.TopicPostPopularFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.util.NetWork;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p164o00OoOo.o00O00OO;
import p169o00Ooo0.oo000o;
import p489o0o000oO.o0OOO0o;
import p489o0o000oO.o0ooOOo;
import p524o0o0O0o.o00OO000;
import p560o0oOOoo.o00O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31983OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31984OooO0O0;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f31983OooO00o = i;
        this.f31984OooO0O0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z = false;
        switch (this.f31983OooO00o) {
            case 0:
                ((FriendsListFragment) this.f31984OooO0O0).lambda$initObserver$0((Long) obj);
                break;
            case 1:
                RoomInfoProfileFragment.m81initDataObserver$lambda9((RoomInfoProfileFragment) this.f31984OooO0O0, (String) obj);
                break;
            case 2:
                final o00O00OO this$0 = (o00O00OO) this.f31984OooO0O0;
                Boolean it = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (it.booleanValue()) {
                    com.yalla.support.common.util.o00O0O.OooO(this$0.f32545OooO0Oo);
                } else {
                    com.yalla.support.common.util.o00O0O.OooO00o(this$0.f32545OooO0Oo);
                }
                boolean zBooleanValue = it.booleanValue();
                View viewFindViewById = this$0.f32542OooO00o.findViewById(R.id.rv_mic);
                final LinearLayout linearLayout = (LinearLayout) this$0.f32542OooO00o.findViewById(R.id.v_room_content);
                final Ref.IntRef intRef = new Ref.IntRef();
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = -viewFindViewById.getBottom();
                if (!zBooleanValue) {
                    intRef.element = linearLayout.getPaddingTop();
                    intRef2.element = 0;
                }
                if (intRef.element != intRef2.element) {
                    TipsBubbleView tipsBubbleView = this$0.f32549OooO0oo;
                    final int paddingTop = tipsBubbleView != null ? tipsBubbleView.getPaddingTop() : 0;
                    final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(intRef.element, intRef2.element);
                    valueAnimatorOfInt.setDuration(this$0.f32551OooOO0O);
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o00OoOo.o00O00
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ValueAnimator valueAnimator2 = valueAnimatorOfInt;
                            LinearLayout contentView = linearLayout;
                            Ref.IntRef start = intRef;
                            Ref.IntRef end = intRef2;
                            o00O00OO this$1 = this$0;
                            int i = paddingTop;
                            Intrinsics.checkNotNullParameter(start, "$start");
                            Intrinsics.checkNotNullParameter(end, "$end");
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Object animatedValue = valueAnimator2.getAnimatedValue();
                            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) animatedValue).intValue();
                            Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
                            o00O0O.OooO0o(contentView, iIntValue);
                            int i2 = start.element;
                            if (i2 > end.element) {
                                TipsBubbleView tipsBubbleView2 = this$1.f32549OooO0oo;
                                if (tipsBubbleView2 != null) {
                                    o00O0O.OooO0o(tipsBubbleView2, i + iIntValue);
                                    return;
                                }
                                return;
                            }
                            TipsBubbleView tipsBubbleView3 = this$1.f32549OooO0oo;
                            if (tipsBubbleView3 != null) {
                                o00O0O.OooO0o(tipsBubbleView3, i - (i2 - iIntValue));
                            }
                        }
                    });
                    valueAnimatorOfInt.start();
                    break;
                }
                break;
            case 3:
                AccountProtectionActivity this$1 = (AccountProtectionActivity) this.f31984OooO0O0;
                int i = AccountProtectionActivity.f21730Oooooo0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOooo().getAccountPrivacy();
                break;
            case 4:
                PostDetailActivity this$2 = (PostDetailActivity) this.f31984OooO0O0;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooOooO().f50528OooOOo.Oooo00o(true, true, true);
                break;
            case 5:
                TopicDetailActivity this$3 = (TopicDetailActivity) this.f31984OooO0O0;
                OnTopPostForTopicModel onTopPostForTopicModel = (OnTopPostForTopicModel) obj;
                TopicDetailActivity.OooO00o oooO00o2 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                TopicInfoModel value = this$3.Oooo000().getTopicDetailLocal().getValue();
                if (value != null && onTopPostForTopicModel.getTopicId() == value.getId()) {
                    z = true;
                }
                if (z) {
                    this$3.Oooo000().getDeletePostId().postValue(Long.valueOf(onTopPostForTopicModel.getPostId()));
                }
                break;
            case 6:
                o00O0O0O this$4 = (o00O0O0O) this.f31984OooO0O0;
                Intrinsics.checkNotNullParameter(this$4, "this$0");
                if (this$4.OooO0OO().getLoadState() == BaseWebView.LoadState.Success) {
                    o00OO000.OooO0OO(this$4.OooO0OO());
                }
                break;
            case 7:
                PremiumActivity context = (PremiumActivity) this.f31984OooO0O0;
                String url = (String) obj;
                PremiumActivity.OooO00o oooO00o3 = PremiumActivity.f23379o0Oo0oo;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
                    Intrinsics.checkNotNullExpressionValue(url, "url");
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f21237OoooO00 = url;
                    webPageInfo.OooO00o("isReply", FeedbackType.Suggestions);
                    webPageInfo.OooO00o("region", String.valueOf(oo000o.OooO0O0()));
                    o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
                    webPageInfo.OooO00o("appVersion", o0ooOOo.OooO0O0());
                    StringBuilder sb = new StringBuilder();
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40953OooO00o;
                    sb.append(o0OOO0o.OooO0O0());
                    sb.append(' ');
                    sb.append(o0OOO0o.OooO0OO());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, sb.toString());
                    webPageInfo.OooO00o("sysVersion", o0OOO0o.OooO0Oo());
                    webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
                    webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.RechargeOrSubscription.getValue()));
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            case 8:
                TopicPostPopularFragment.m414initObserve$lambda5((TopicPostPopularFragment) this.f31984OooO0O0, (Long) obj);
                break;
            default:
                MainRoomRecommendFragment.m484onLazyInit$lambda1((MainRoomRecommendFragment) this.f31984OooO0O0, (Boolean) obj);
                break;
        }
    }
}
