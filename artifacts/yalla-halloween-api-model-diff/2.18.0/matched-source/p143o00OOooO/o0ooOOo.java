package p143o00OOooO;

import android.app.Activity;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.Function.OooO0O0;
import com.app.base.fragment.MainMomentFollowingFragment;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendShareModel;
import com.yalla.yalla.model.MomentSendShareType;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.PostGiftResultModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicVerifyState;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.TopActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.fragment.TreasureBoxFragment;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import com.yalla.yalla.ui.vm.main.TopVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00OO0O0.o0OOO0o;
import o00OOO.OooO00o;
import p140o00OOOo0.o00O0;
import p169o00Ooo0.o00O0O;
import p169o00Ooo0.o0O0O00;
import p255o00ooO0O.o00000O;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p500o0o00Oo0.OooOOO;
import p581o0oOoOOo.oOO00O0;
import p581o0oOoOOo.oOo0o0oO;
import p618o0oo0Ooo.oO0O000o;
import p651o0ooOOoo.oa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f32000OooO0O0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f31999OooO00o = i;
        this.f32000OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x047d  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        TopicInfoModel topicInfoModel;
        Integer code2;
        boolean z2 = true;
        o00O0O o00o0o2 = null;
        switch (this.f31999OooO00o) {
            case 0:
                MainMomentFollowingFragment.m18initObserver$lambda20((MainMomentFollowingFragment) this.f32000OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                TopActivity this$0 = (TopActivity) this.f32000OooO0O0;
                TopRankData topRankData = (TopRankData) obj;
                TopActivity.OooO00o oooO00o = TopActivity.f22111o00Ooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (topRankData != null && (!StringsKt.isBlank(topRankData.getName()))) {
                    ConstraintLayout constraintLayout = this$0.OooOoo().f50024OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clBottom");
                    com.yalla.support.common.util.o00O0O.OooO(constraintLayout);
                    View view = this$0.OooOoo().f50028OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(view, "binding.shape");
                    com.yalla.support.common.util.o00O0O.OooO(view);
                    NetImageView netImageView = this$0.OooOoo().f50035OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(netImageView, "binding.userPhoto");
                    com.yalla.support.common.util.o00O0O.OooO(netImageView);
                    String str = this$0.f22114OooooOo;
                    Objects.requireNonNull(TopVM.INSTANCE);
                    if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(this$0);
                        oooO00o2.OooO00o(OooO00o.OooO0oo());
                        oooO00o2.f48447OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                        oooO00o2.f48445OooO00o = 0;
                        oooO00o2.OooO0o(this$0.OooOoo().f50035OooOOOo);
                    } else {
                        oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(this$0);
                        oooO00o3.OooO00o(OooO00o.OooO00o());
                        oooO00o3.f48447OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                        oooO00o3.f48445OooO00o = 0;
                        oooO00o3.OooO0o(this$0.OooOoo().f50035OooOOOo);
                    }
                    if (!Intrinsics.areEqual(topRankData.getHeadFrameUrl(), this$0.f22120o00Oo0)) {
                        o00O0O o00o0o3 = this$0.f22119o00O0O;
                        if (o00o0o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameLoad");
                        } else {
                            o00o0o2 = o00o0o3;
                        }
                        o00o0o2.OooO00o(topRankData.getHeadFrameUrl());
                        this$0.f22120o00Oo0 = topRankData.getHeadFrameUrl();
                    }
                    if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT) && StringsKt.isBlank(topRankData.getId())) {
                        ConstraintLayout constraintLayout2 = this$0.OooOoo().f50024OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clBottom");
                        com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout2);
                        View view2 = this$0.OooOoo().f50028OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(view2, "binding.shape");
                        com.yalla.support.common.util.o00O0O.OooO00o(view2);
                    } else {
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                            this$0.OooOoo().f50036OooOOo0.setSex(2);
                            this$0.OooOoo().f50036OooOOo0.OooO0oO(false, 0);
                        } else {
                            UserTagView userTagView = this$0.OooOoo().f50036OooOOo0;
                            OooOOO oooOOO = OooOOO.f41235OooO00o;
                            Integer value = oooOOO.OooOOOo().getValue();
                            if (value == null) {
                                value = 2;
                            }
                            userTagView.setSex(value.intValue());
                            Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
                            Intrinsics.checkNotNull(value2);
                            Pair<Boolean, Integer> pair = value2;
                            this$0.OooOoo().f50036OooOOo0.OooO0oO(pair.getFirst().booleanValue(), pair.getSecond().intValue());
                        }
                        this$0.OooOoo().f50029OooOO0.setText(topRankData.getNum() != 0 ? String.valueOf(topRankData.getNum()) : "-");
                        this$0.OooOoo().f50036OooOOo0.setName(topRankData.getName());
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                            this$0.OooOoo().f50036OooOOo0.setNameFlash(false);
                        } else {
                            UserTagView userTagView2 = this$0.OooOoo().f50036OooOOo0;
                            OooOOO oooOOO2 = OooOOO.f41235OooO00o;
                            Pair<Integer, Integer> value3 = oooOOO2.OooO().getValue();
                            if (value3 != null && value3.getFirst().intValue() == VipState.Vip.getValue()) {
                                Pair<Integer, Integer> value4 = oooOOO2.OooO().getValue();
                                if ((value4 != null ? value4.getSecond().intValue() : 0) >= VipLevel.Vip4.getValue()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            userTagView2.setNameFlash(z);
                            UserTagView userTagView3 = this$0.OooOoo().f50036OooOOo0;
                            Pair<Integer, Integer> value5 = oooOOO2.OooO().getValue();
                            int iIntValue = value5 != null ? value5.getSecond().intValue() : 0;
                            Pair<Integer, Integer> value6 = oooOOO2.OooO().getValue();
                            userTagView3.OooO0OO(iIntValue, (value6 != null ? value6.getFirst().intValue() : 0) == VipState.Vip.getValue());
                        }
                        this$0.OooOoo().f50020OooO.setText(o0O0O00.OooO0Oo(topRankData.getNumber()));
                    }
                } else {
                    String str2 = this$0.f22114OooooOo;
                    Objects.requireNonNull(TopVM.INSTANCE);
                    if (!Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
                        NetImageView netImageView2 = this$0.OooOoo().f50035OooOOOo;
                        Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.userPhoto");
                        com.yalla.support.common.util.o00O0O.OooO0O0(netImageView2);
                        this$0.OooOoo().f50029OooOO0.setText("-");
                        this$0.OooOoo().f50020OooO.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    } else {
                        ConstraintLayout constraintLayout3 = this$0.OooOoo().f50024OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.clBottom");
                        com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout3);
                        View view3 = this$0.OooOoo().f50028OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(view3, "binding.shape");
                        com.yalla.support.common.util.o00O0O.OooO00o(view3);
                    }
                }
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f32000OooO0O0;
                PostGiftResultModel result = (PostGiftResultModel) obj;
                PostDetailActivity.OooO00o oooO00o4 = PostDetailActivity.f22436o000000O;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$1.f22439OooooOo;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getPostId()) {
                    momentDetailModel.setTotalPropValue(result.getTotalPropValue());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel);
                    this$1.Oooo00O().addSendGiftItem(result.getGiftId(), result.getGiftNum(), result.getPropImage());
                    break;
                }
                break;
            case 3:
                TopicDetailActivity context = (TopicDetailActivity) this.f32000OooO0O0;
                Response response = (Response) obj;
                TopicDetailActivity.OooO00o oooO00o5 = TopicDetailActivity.f22586o00Oo0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (response.getIsSuccess()) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    int state = ((TopicVerifyState) data).getState();
                    if (state == 0) {
                        Response response2 = (Response) context.Oooo000().getTopicDetailLiveData().getValue();
                        if (response2 != null && (topicInfoModel = (TopicInfoModel) response2.getData()) != null) {
                            Intrinsics.checkNotNullParameter(context, "context");
                            MomentSendShareModel sharePostModel = new MomentSendShareModel(MomentType.Topic.getValue());
                            sharePostModel.setSharePostType(MomentSendShareType.ShareTopic);
                            sharePostModel.setTopicInfoModel(topicInfoModel);
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intrinsics.checkNotNullParameter(sharePostModel, "sharePostModel");
                            MomentSendActivity.OooO00o.C0255OooO00o onLogin = new MomentSendActivity.OooO00o.C0255OooO00o(context, sharePostModel);
                            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                            if (!Intrinsics.areEqual(OooOOO.f41235OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                Activity activityOooO0O0 = o00000O.f34276OooO00o.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    o0OOO0o.OooO00o(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                                }
                            } else {
                                onLogin.invoke();
                            }
                            break;
                        }
                    } else if (state == 1) {
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.You_can_not_add_this_topic_to_your_posts_Please_contact_the_topic_host);
                        ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z2 = false;
                        }
                        if (!z2) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o001 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                            } else {
                                o0o0oooOooO0O0.run();
                            }
                            break;
                        }
                    } else if (state == 2) {
                        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Topic_Disband);
                        ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                            z2 = false;
                        }
                        if (!z2) {
                            o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o002 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                            } else {
                                o0o0oooOooO0O1.run();
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                oOo0o0oO this$2 = (oOo0o0oO) this.f32000OooO0O0;
                Response response3 = (Response) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (response3.getIsSuccess() && response3.getData() != null) {
                    if (this$2.f46212OooooO0) {
                        o0O00000.OooO0OO("Sign_in");
                    } else {
                        o0O00000.OooO0OO("Me_tasks_sign_in");
                    }
                    Object data2 = response3.getData();
                    Intrinsics.checkNotNull(data2);
                    SignInModel signInModel = (SignInModel) data2;
                    ConstraintLayout constraintLayout4 = this$2.OooOOOO().f50468OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "signInBinding.root");
                    com.yalla.support.common.util.o00O0O.OooO0O0(constraintLayout4);
                    this$2.OooOOO().f50371OooO0O0.removeAllViews();
                    this$2.OooOOO().f50371OooO0O0.addView(this$2.OooOOO0().f50212OooO00o);
                    oa oaVarOooOOO0 = this$2.OooOOO0();
                    if (signInModel != null) {
                        long changeCoin = signInModel.getChangeCoin();
                        ImageView ivCoin = oaVarOooOOO0.f50214OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(ivCoin, "ivCoin");
                        if (changeCoin == 0) {
                            com.yalla.support.common.util.o00O0O.OooO00o(ivCoin);
                        } else {
                            com.yalla.support.common.util.o00O0O.OooO(ivCoin);
                        }
                        long changeCrystal = signInModel.getChangeCrystal();
                        ImageView ivCrystal = oaVarOooOOO0.f50215OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(ivCrystal, "ivCrystal");
                        if (changeCrystal == 0) {
                            com.yalla.support.common.util.o00O0O.OooO00o(ivCrystal);
                        } else {
                            com.yalla.support.common.util.o00O0O.OooO(ivCrystal);
                        }
                        oaVarOooOOO0.f50216OooO0o0.setText(this$2.f46206OoooOOo.getGoldCrystalTips(signInModel));
                    }
                    new OooO0O0(oaVarOooOOO0.f50213OooO0O0, this$2.f46205OoooOOO, R.array.sign_caizhi, 32, false).f11358OooO0O0 = new oOO00O0(oaVarOooOOO0, this$2);
                    SignTaskVM.loadTaskListData$default(this$2.f46206OoooOOo, 1, false, 2, null);
                    Object data3 = response3.getData();
                    Intrinsics.checkNotNull(data3);
                    if (Intrinsics.areEqual(((SignInModel) data3).isPopup(), "1")) {
                        o00O0 o00o1 = new o00O0(this$2.f46205OoooOOO);
                        String strOooO0OO3 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.enjoying_yalla);
                        TextView textView = o00o1.f31835OoooOOO;
                        if (textView != null) {
                            textView.setText("");
                            o00o1.f31835OoooOOO.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO3)) {
                                o00o1.f31835OoooOOO.setText(strOooO0OO3);
                                o00o1.f31835OoooOOO.setVisibility(0);
                            }
                        }
                        String strOooO0OO4 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.tap_a_star_to_rate_it);
                        TextView textView2 = o00o1.f31836OoooOOo;
                        if (textView2 != null) {
                            textView2.setText("");
                            o00o1.f31836OoooOOo.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO4)) {
                                o00o1.f31836OoooOOo.setText(strOooO0OO4);
                                o00o1.f31836OoooOOo.setVisibility(0);
                            }
                        }
                        o00o1.show();
                    }
                } else {
                    if (this$2.f46212OooooO0) {
                        o0O00000.OooO0OO("Sign_in_fail");
                    } else {
                        o0O00000.OooO0OO("Me_tasks_sign_fail");
                    }
                    Error error = response3.getError();
                    if ((error == null || (code2 = error.getCode()) == null || 1090 != code2.intValue()) ? false : true) {
                        this$2.OooOo00();
                    } else if (!((FragmentActivity) this$2.f46205OoooOOO).isFinishing()) {
                        this$2.OooOOo();
                    }
                }
                break;
            case 5:
                TreasureBoxFragment.m426onViewCreated$lambda1((TreasureBoxFragment) this.f32000OooO0O0, obj);
                break;
            default:
                Function1 tmp0 = (Function1) this.f32000OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((Long) obj);
                break;
        }
    }
}
