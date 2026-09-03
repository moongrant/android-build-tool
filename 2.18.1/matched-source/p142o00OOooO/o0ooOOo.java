package p142o00OOooO;

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
import p139o00OOOo0.oo00o;
import p168o00Ooo0.o00O0O;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p579o0oOoOOo.oOO00OO;
import p579o0oOoOOo.ooOOO0Oo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.pa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f31978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f31979OooO0O0;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f31978OooO00o = i;
        this.f31979OooO0O0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x047d  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        boolean z;
        TopicInfoModel topicInfoModel;
        Integer code2;
        boolean z2 = true;
        o00O0O o00o0o2 = null;
        switch (this.f31978OooO00o) {
            case 0:
                MainMomentFollowingFragment.m18initObserver$lambda20((MainMomentFollowingFragment) this.f31979OooO0O0, (MomentSendModel) obj);
                break;
            case 1:
                TopActivity this$0 = (TopActivity) this.f31979OooO0O0;
                TopRankData topRankData = (TopRankData) obj;
                TopActivity.OooO00o oooO00o = TopActivity.f22092ooOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (topRankData != null && (!StringsKt.isBlank(topRankData.getName()))) {
                    ConstraintLayout constraintLayout = this$0.OooOoo().f50087OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clBottom");
                    com.yalla.support.common.util.o00O0O.OooO(constraintLayout);
                    View view = this$0.OooOoo().f50091OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(view, "binding.shape");
                    com.yalla.support.common.util.o00O0O.OooO(view);
                    NetImageView netImageView = this$0.OooOoo().f50098OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(netImageView, "binding.userPhoto");
                    com.yalla.support.common.util.o00O0O.OooO(netImageView);
                    String str = this$0.f22095Ooooo0o;
                    Objects.requireNonNull(TopVM.INSTANCE);
                    if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this$0);
                        oooO00o2.OooO00o(OooO00o.OooO0oo());
                        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                        oooO00o2.f48427OooO00o = 0;
                        oooO00o2.OooO0o(this$0.OooOoo().f50098OooOOOo);
                    } else {
                        oO0O00.OooO00o oooO00o3 = new oO0O00.OooO00o(this$0);
                        oooO00o3.OooO00o(OooO00o.OooO00o());
                        oooO00o3.f48429OooO0OO = CloudImageUtilKt.imgFormat(topRankData.getImageUrl());
                        oooO00o3.f48427OooO00o = 0;
                        oooO00o3.OooO0o(this$0.OooOoo().f50098OooOOOo);
                    }
                    if (!Intrinsics.areEqual(topRankData.getHeadFrameUrl(), this$0.f22103o0OoOo0)) {
                        o00O0O o00o0o3 = this$0.f22102Ooooooo;
                        if (o00o0o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mHeaderFrameLoad");
                        } else {
                            o00o0o2 = o00o0o3;
                        }
                        o00o0o2.OooO00o(topRankData.getHeadFrameUrl());
                        this$0.f22103o0OoOo0 = topRankData.getHeadFrameUrl();
                    }
                    if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT) && StringsKt.isBlank(topRankData.getId())) {
                        ConstraintLayout constraintLayout2 = this$0.OooOoo().f50087OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.clBottom");
                        com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout2);
                        View view2 = this$0.OooOoo().f50091OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(view2, "binding.shape");
                        com.yalla.support.common.util.o00O0O.OooO00o(view2);
                    } else {
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                            this$0.OooOoo().f50099OooOOo0.setSex(2);
                            this$0.OooOoo().f50099OooOOo0.OooO0oO(false, 0);
                        } else {
                            UserTagView userTagView = this$0.OooOoo().f50099OooOOo0;
                            OooOOO oooOOO = OooOOO.f41216OooO00o;
                            Integer value = oooOOO.OooOOOo().getValue();
                            if (value == null) {
                                value = 2;
                            }
                            userTagView.setSex(value.intValue());
                            Pair<Boolean, Integer> value2 = oooOOO.OooOOO0().getValue();
                            Intrinsics.checkNotNull(value2);
                            Pair<Boolean, Integer> pair = value2;
                            this$0.OooOoo().f50099OooOOo0.OooO0oO(pair.getFirst().booleanValue(), pair.getSecond().intValue());
                        }
                        this$0.OooOoo().f50092OooOO0.setText(topRankData.getNum() != 0 ? String.valueOf(topRankData.getNum()) : "-");
                        this$0.OooOoo().f50099OooOOo0.setName(topRankData.getName());
                        if (Intrinsics.areEqual(topRankData.getType(), TopVM.TYPE_ROOM_GIFT)) {
                            this$0.OooOoo().f50099OooOOo0.setNameFlash(false);
                        } else {
                            UserTagView userTagView2 = this$0.OooOoo().f50099OooOOo0;
                            OooOOO oooOOO2 = OooOOO.f41216OooO00o;
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
                            UserTagView userTagView3 = this$0.OooOoo().f50099OooOOo0;
                            Pair<Integer, Integer> value5 = oooOOO2.OooO().getValue();
                            int iIntValue = value5 != null ? value5.getSecond().intValue() : 0;
                            Pair<Integer, Integer> value6 = oooOOO2.OooO().getValue();
                            userTagView3.OooO0OO(iIntValue, (value6 != null ? value6.getFirst().intValue() : 0) == VipState.Vip.getValue());
                        }
                        this$0.OooOoo().f50083OooO.setText(o0O0O00.OooO0Oo(topRankData.getNumber()));
                    }
                } else {
                    String str2 = this$0.f22095Ooooo0o;
                    Objects.requireNonNull(TopVM.INSTANCE);
                    if (!Intrinsics.areEqual(str2, TopVM.TYPE_ROOM_GIFT)) {
                        NetImageView netImageView2 = this$0.OooOoo().f50098OooOOOo;
                        Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.userPhoto");
                        com.yalla.support.common.util.o00O0O.OooO0O0(netImageView2);
                        this$0.OooOoo().f50092OooOO0.setText("-");
                        this$0.OooOoo().f50083OooO.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                    } else {
                        ConstraintLayout constraintLayout3 = this$0.OooOoo().f50087OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.clBottom");
                        com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout3);
                        View view3 = this$0.OooOoo().f50091OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(view3, "binding.shape");
                        com.yalla.support.common.util.o00O0O.OooO00o(view3);
                    }
                }
                break;
            case 2:
                PostDetailActivity this$1 = (PostDetailActivity) this.f31979OooO0O0;
                PostGiftResultModel result = (PostGiftResultModel) obj;
                PostDetailActivity.OooO00o oooO00o4 = PostDetailActivity.f22417o0O0O00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                MomentDetailModel momentDetailModel = this$1.f22420Ooooo0o;
                if (momentDetailModel != null && momentDetailModel.getId() == result.getPostId()) {
                    momentDetailModel.setTotalPropValue(result.getTotalPropValue());
                    LiveEventBus.get("POST_DETAIL_DATA_REFRESH").post(momentDetailModel);
                    this$1.Oooo00O().addSendGiftItem(result.getGiftId(), result.getGiftNum(), result.getPropImage());
                    break;
                }
                break;
            case 3:
                TopicDetailActivity context = (TopicDetailActivity) this.f31979OooO0O0;
                Response response = (Response) obj;
                TopicDetailActivity.OooO00o oooO00o5 = TopicDetailActivity.f22567o0OoOo0;
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
                            if (!Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                                if (activityOooO0O0 != null) {
                                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                                }
                            } else {
                                onLogin.invoke();
                            }
                            break;
                        }
                    } else if (state == 1) {
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.You_can_not_add_this_topic_to_your_posts_Please_contact_the_topic_host);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z2 = false;
                        }
                        if (!z2) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o001 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            } else {
                                o0o0oooOooO0O0.run();
                            }
                            break;
                        }
                    } else if (state == 2) {
                        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Topic_Disband);
                        ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                            z2 = false;
                        }
                        if (!z2) {
                            o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO2, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o002 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                            } else {
                                o0o0oooOooO0O1.run();
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                ooOOO0Oo this$2 = (ooOOO0Oo) this.f31979OooO0O0;
                Response response3 = (Response) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                if (response3.getIsSuccess() && response3.getData() != null) {
                    if (this$2.f46213OoooOoo) {
                        o0O00000.OooO0OO("Sign_in");
                    } else {
                        o0O00000.OooO0OO("Me_tasks_sign_in");
                    }
                    Object data2 = response3.getData();
                    Intrinsics.checkNotNull(data2);
                    SignInModel signInModel = (SignInModel) data2;
                    ConstraintLayout constraintLayout4 = this$2.OooOOOO().f50531OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "signInBinding.root");
                    com.yalla.support.common.util.o00O0O.OooO0O0(constraintLayout4);
                    this$2.OooOOO().f50434OooO0O0.removeAllViews();
                    this$2.OooOOO().f50434OooO0O0.addView(this$2.OooOOO0().f50275OooO00o);
                    pa paVarOooOOO0 = this$2.OooOOO0();
                    if (signInModel != null) {
                        long changeCoin = signInModel.getChangeCoin();
                        ImageView ivCoin = paVarOooOOO0.f50277OooO0OO;
                        Intrinsics.checkNotNullExpressionValue(ivCoin, "ivCoin");
                        if (changeCoin == 0) {
                            com.yalla.support.common.util.o00O0O.OooO00o(ivCoin);
                        } else {
                            com.yalla.support.common.util.o00O0O.OooO(ivCoin);
                        }
                        long changeCrystal = signInModel.getChangeCrystal();
                        ImageView ivCrystal = paVarOooOOO0.f50278OooO0Oo;
                        Intrinsics.checkNotNullExpressionValue(ivCrystal, "ivCrystal");
                        if (changeCrystal == 0) {
                            com.yalla.support.common.util.o00O0O.OooO00o(ivCrystal);
                        } else {
                            com.yalla.support.common.util.o00O0O.OooO(ivCrystal);
                        }
                        paVarOooOOO0.f50279OooO0o0.setText(this$2.f46208OoooOO0.getGoldCrystalTips(signInModel));
                    }
                    new OooO0O0(paVarOooOOO0.f50276OooO0O0, this$2.f46207OoooO, R.array.sign_caizhi, 32, false).f11342OooO0O0 = new oOO00OO(paVarOooOOO0, this$2);
                    SignTaskVM.loadTaskListData$default(this$2.f46208OoooOO0, 1, false, 2, null);
                    Object data3 = response3.getData();
                    Intrinsics.checkNotNull(data3);
                    if (Intrinsics.areEqual(((SignInModel) data3).isPopup(), "1")) {
                        oo00o oo00oVar = new oo00o(this$2.f46207OoooO);
                        String strOooO0OO3 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.enjoying_yalla);
                        TextView textView = oo00oVar.f31866OoooO;
                        if (textView != null) {
                            textView.setText("");
                            oo00oVar.f31866OoooO.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO3)) {
                                oo00oVar.f31866OoooO.setText(strOooO0OO3);
                                oo00oVar.f31866OoooO.setVisibility(0);
                            }
                        }
                        String strOooO0OO4 = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.tap_a_star_to_rate_it);
                        TextView textView2 = oo00oVar.f31869OoooOO0;
                        if (textView2 != null) {
                            textView2.setText("");
                            oo00oVar.f31869OoooOO0.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO4)) {
                                oo00oVar.f31869OoooOO0.setText(strOooO0OO4);
                                oo00oVar.f31869OoooOO0.setVisibility(0);
                            }
                        }
                        oo00oVar.show();
                    }
                } else {
                    if (this$2.f46213OoooOoo) {
                        o0O00000.OooO0OO("Sign_in_fail");
                    } else {
                        o0O00000.OooO0OO("Me_tasks_sign_fail");
                    }
                    Error error = response3.getError();
                    if ((error == null || (code2 = error.getCode()) == null || 1090 != code2.intValue()) ? false : true) {
                        this$2.OooOo00();
                    } else if (!((FragmentActivity) this$2.f46207OoooO).isFinishing()) {
                        this$2.OooOOo();
                    }
                }
                break;
            case 5:
                TreasureBoxFragment.m426onViewCreated$lambda1((TreasureBoxFragment) this.f31979OooO0O0, obj);
                break;
            default:
                Function1 tmp0 = (Function1) this.f31979OooO0O0;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke((Long) obj);
                break;
        }
    }
}
