package com.yalla.yalla.ui.activity.moment.postDetailCommentSonList;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.impl.o00OOO00;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.UserTagView;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p203o00o0o0o.o00O0OO0;
import p362o0OOo0O.OooOO0;
import p377o0OOoOo.o0000OO0;
import p406o0Oo0Ooo.oOO0OO0O;
import p427o0OoOO00.OooOo;
import p464o0Oooo.o000000O;
import p484o0o00O.Oooo0;
import p484o0o00O.o00000;
import p484o0o00O.o00000OO;
import p484o0o00O.o0000oo;
import p484o0o00O.o000oOoO;
import p484o0o00O.o00O0O;
import p484o0o00O.o00Oo0;
import p484o0o00O.o00oO0o;
import p484o0o00O.o0O0O00;
import p484o0o00O.o0OO00O;
import p484o0o00O.o0OOO0o;
import p484o0o00O.o0Oo0oo;
import p484o0o00O.o0OoOo0;
import p484o0o00O.o0ooOOo;
import p484o0o00O.oo000o;
import p484o0o00O.oo0o0Oo;
import p543o0oO0O00.OooO;
import p559o0oOo00.OooOOO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p590o0oo0.OooOOOO;
import p595o0oo00Oo.o0000Ooo;
import p641o0ooOOOO.w6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "setData", "", "showOriginal", "setShowOriginal", "", "selectType", "setSelectType", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "OooO0Oo", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "activity", "Lkotlin/Function1;", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView\n*L\n365#1:430,2\n*E\n"})
public final class MomentReplyHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f26450OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f26451OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MomentReplyActivity activity;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> itemListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final w6 f26454OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f26455OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public MomentCommentDetailModel f26456OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f26457OooOO0;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26458OooO0Oo;

        public OooO00o(o00000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26458OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26458OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26458OooO0Oo;
        }

        public final int hashCode() {
            return this.f26458OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26458OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f26459OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f26460OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyHeaderView f26461OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f26462OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SVGAView sVGAView, MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel, TextView textView) {
            super(1);
            this.f26459OooO0Oo = sVGAView;
            this.f26461OooO0o0 = momentReplyHeaderView;
            this.f26460OooO0o = momentCommentDetailModel;
            this.f26462OooO0oO = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0OO000.OooO00o("203024");
            MomentReplyHeaderView momentReplyHeaderView = this.f26461OooO0o0;
            MomentReplyActivity activity = momentReplyHeaderView.getActivity();
            SVGAView sVGAView = this.f26459OooO0Oo;
            sVGAView.OooOO0O("svga/anim_moment_reward.svga", activity);
            sVGAView.OooOO0o();
            MomentCommentDetailModel momentCommentDetailModel = this.f26460OooO0o;
            momentCommentDetailModel.setSendProp(true);
            momentCommentDetailModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            String strOooO0o = OooOOOO.OooO0o(momentCommentDetailModel.getPropNum(), false);
            TextView textView = this.f26462OooO0oO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(momentCommentDetailModel.isSendProp() ? oO00O0o.color_FFA16C : oO00O0o.color_666666));
            int i = OooOOO.f56177OooO0O0;
            OooOOO.OooO00o.OooO00o(momentReplyHeaderView.getActivity(), textView);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f26463OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentCommentDetailModel momentCommentDetailModel) {
            super(1);
            this.f26463OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            Intrinsics.checkNotNullParameter(apiError, "<anonymous parameter 0>");
            this.f26463OooO0Oo.setSendProp(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
            ApiResult<RewardCommentResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyHeaderView.this.f26457OooOO0 = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MomentReplyHeaderView(MomentReplyActivity activity) {
        super(activity, null, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        w6 w6VarInflate = w6.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(w6VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f26454OooO0o0 = w6VarInflate;
        this.f26455OooO0oO = 1;
        w6VarInflate.f59158OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00O.OooOo00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = MomentReplyHeaderView.f26450OooOO0O;
                MomentReplyHeaderView this$0 = this.f47710OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentCommentDetailModel momentCommentDetailModel = this$0.f26456OooO0oo;
                if (!(momentCommentDetailModel != null && momentCommentDetailModel.isHide())) {
                    Oooo000 onLogin = new Oooo000(this$0);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i2 = LoginActivity.f25186OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                }
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: o0o00O.OooOo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = MomentReplyHeaderView.f26450OooOO0O;
                MomentReplyHeaderView this$0 = this.f47709OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentCommentDetailModel momentCommentDetailModel = this$0.f26456OooO0oo;
                if (!(momentCommentDetailModel != null && momentCommentDetailModel.isHide())) {
                    o00Ooo onLogin = new o00Ooo(this$0);
                    Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                        onLogin.invoke();
                    } else {
                        Activity activityOooO0O0 = OooO0O0.OooO0O0();
                        if (activityOooO0O0 != null) {
                            int i2 = LoginActivity.f25186OooOo0O;
                            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                        }
                    }
                }
                return true;
            }
        };
        FixTextView fixTextView = w6VarInflate.f59155OooO0O0;
        fixTextView.setOnLongClickListener(onLongClickListener);
        ConstraintLayout constraintLayout = w6VarInflate.f59158OooO0o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layout");
        o000OO00.OooO(constraintLayout, new oo000o(this));
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.content");
        o000OO00.OooO(fixTextView, new o00oO0o(this));
        NetImageView netImageView = w6VarInflate.f59157OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head");
        o000OO00.OooO(netImageView, new o0ooOOo(this));
        TextView textView = w6VarInflate.f59156OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.contentOriginal");
        o000OO00.OooO(textView, new o0OOO0o(this));
        SVGAView sVGAView = w6VarInflate.f59163OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        o000OO00.OooO(sVGAView, new o0Oo0oo(this));
        ImageView imageView = w6VarInflate.f59162OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIv");
        o000OO00.OooO(imageView, new o0OO00O(this));
        TextView textView2 = w6VarInflate.f59153OooO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.praiseCount");
        o000OO00.OooO(textView2, new oo0o0Oo(this));
        TextView textView3 = w6VarInflate.f59166OooOOO0;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.rewardCount");
        o000OO00.OooO(textView3, new Oooo0(this));
        SVGAView sVGAView2 = w6VarInflate.f59167OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.rewardSvga");
        o000OO00.OooO(sVGAView2, new o000oOoO(this));
        ImageView imageView2 = w6VarInflate.f59165OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rewardIv");
        o000OO00.OooO(imageView2, new o0OoOo0(this));
        TextView textView4 = w6VarInflate.f59161OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.popular");
        o000OO00.OooO(textView4, new o00O0O(this));
        TextView textView5 = w6VarInflate.f59159OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.latest");
        o000OO00.OooO(textView5, new o00Oo0(this));
        fixTextView.setTextAlignment(5);
    }

    public static final void OooO0O0(MomentReplyHeaderView momentReplyHeaderView) {
        momentReplyHeaderView.getClass();
        o00000OO onLogin = new o00000OO(momentReplyHeaderView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0OO(MomentReplyHeaderView momentReplyHeaderView) {
        momentReplyHeaderView.getClass();
        o0000oo onLogin = new o0000oo(momentReplyHeaderView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public final void OooO0Oo(@NotNull MomentCommentDetailModel it, @NotNull SVGAView rewardSvga, @NotNull TextView tvRewardCount) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(rewardSvga, "rewardSvga");
        Intrinsics.checkNotNullParameter(tvRewardCount, "tvRewardCount");
        if (this.f26457OooOO0) {
            return;
        }
        this.f26457OooOO0 = true;
        it.setSendProp(true);
        MomentReplyActivity momentReplyActivity = this.activity;
        momentReplyActivity.OooOoO().commentSendProp(oo0ooO.OooO00o(it.getId()), com.code.android.util.o0OoOo0.OooOOO(it.getUserid(), "")).observe(momentReplyActivity, new o0000OO0(new OooO0O0(rewardSvga, this, it, tvRewardCount), new OooO0OO(it), new OooO0o(), false));
    }

    @NotNull
    public final MomentReplyActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function1<Integer, Unit> getItemListener() {
        return this.itemListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(@Nullable MomentCommentDetailModel model) {
        this.f26456OooO0oo = model;
        if (model == null || TextUtils.isEmpty(model.getUserid())) {
            return;
        }
        boolean zIsLocalMessageDiscolor = model.isLocalMessageDiscolor();
        w6 w6Var = this.f26454OooO0o0;
        if (zIsLocalMessageDiscolor) {
            w6Var.f59158OooO0o.setBackgroundColor(o0000.OooO00o(oO00O0o.color_EEFDFC));
        } else {
            w6Var.f59158OooO0o.setBackgroundColor(o0000.OooO00o(oO00O0o.color_white));
        }
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
        oooO00o.OooO00o(OooO.OooO0OO());
        oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(80, 80, model.getHeadurl());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(w6Var.f59157OooO0Oo);
        if (model.getRole() == 2) {
            ImageView imageView = w6Var.f59168OooOOOo;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.role");
            o000OO00.OooOOOO(imageView);
        }
        MomentReplyActivity momentReplyActivity = this.activity;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getUserId()) : null), model.getUserid());
        UserTagView userTagView = w6Var.f59169OooOOo;
        userTagView.setAuthorComment(zAreEqual);
        userTagView.OooO0oO(model.getVip(), model.getVipLevel());
        userTagView.setSex(model.getSex());
        int i = oO00O0o.color_333333_45;
        userTagView.setNameTextColor(i);
        userTagView.setNameTextSize(13.0f);
        String userid = model.getUserid();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (o00OOO00.OooO0O0(userid) && Intrinsics.areEqual(o000000O.OooOo().getValue(), Boolean.TRUE)) {
            Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagView");
            UserTagView.OooOO0o(userTagView, momentReplyActivity, (Integer) o000000O.OooO0oO().getValue(), (String) o000000O.OooO0o0().getValue(), 8);
        } else {
            Intrinsics.checkNotNullExpressionValue(userTagView, "binding.userTagView");
            UserTagView.OooOO0o(userTagView, momentReplyActivity, Integer.valueOf(model.getWealthLevel()), model.getWealthBadgeImage(), 8);
        }
        long jOooO = com.code.android.util.o0OoOo0.OooO(0L, model.getUserid());
        TextView tagView = userTagView.getNameText();
        String defaultValue = com.code.android.util.o0OoOo0.OooOOO(model.getNickname(), "");
        o0O0O00 block = new o0O0O00(this);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(oO00O0oO.tag_friend_memo_name_tag, Long.valueOf(jOooO));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0OO0O(jOooO, tagView, defaultValue, null, block), 2, null);
        if (o00OOO00.OooO0O0(model.getUserid())) {
            Pair pair = (Pair) o000000O.OooOO0().getValue();
            int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
            Pair pair2 = (Pair) o000000O.OooOO0().getValue();
            userTagView.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), momentReplyActivity);
        } else {
            userTagView.OooO0Oo(model.getKaVIPLv(), true, momentReplyActivity);
        }
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_comment_sending);
        if (model.getId() >= 1) {
            strOooO0OO = p601o0oo0O0.o0000oo.OooO0Oo(model.getCreateTime(), System.currentTimeMillis());
        }
        w6Var.f59170OooOOo0.setText(strOooO0OO);
        FixTextView fixTextView = w6Var.f59155OooO0O0;
        fixTextView.setVisibility(0);
        if (model.isHide()) {
            fixTextView.setText(oO00OOo0.comment_is_hidden);
            fixTextView.setTextColor(o0000.OooO00o(i));
        } else {
            o0000Ooo.OooO0OO(momentReplyActivity, model.getContent(), fixTextView, new o00O0OO0(this));
            fixTextView.setTextColor(o0000.OooO00o(oO00O0o.color_333333_85));
        }
        MutableLiveData<Integer> mutableLiveData = OooOo.f45669OooO00o;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context, new OooO00o(new o00000(this, model)));
        boolean z = model.isSendProp() && model.getPropNum() > 0;
        String strOooO0o = OooOOOO.OooO0o(model.getPropNum(), false);
        TextView textView = w6Var.f59166OooOOO0;
        textView.setText(strOooO0o);
        textView.setTextColor(z ? o0000.OooO00o(oO00O0o.color_333333) : o0000.OooO00o(oO00O0o.color_333333_65));
        ImageView imageView2 = w6Var.f59165OooOOO;
        imageView2.setVisibility(0);
        imageView2.setImageResource(oOo00OO0.ic_moment_comment_reward_gray);
        if (model.isSendProp()) {
            imageView2.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
        }
        SVGAView sVGAView = w6Var.f59167OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.rewardSvga");
        sVGAView.setVisibility(4);
        sVGAView.f10171OooOoo0 = new p484o0o00O.o0000Ooo(this);
        sVGAView.f10170OooOoo = new p484o0o00O.o0000(this);
    }

    public final void setItemListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.itemListener = function1;
    }

    public final void setSelectType(int selectType) {
        this.f26455OooO0oO = selectType;
        w6 w6Var = this.f26454OooO0o0;
        TextView textView = w6Var.f59161OooO0oo;
        int i = oO00O0o.color_333333_65;
        textView.setTextColor(o0000.OooO00o(i));
        int i2 = oOo00OO0.bg_tr00_r360;
        w6Var.f59161OooO0oo.setBackgroundResource(i2);
        int iOooO00o = o0000.OooO00o(i);
        TextView textView2 = w6Var.f59159OooO0o0;
        textView2.setTextColor(iOooO00o);
        textView2.setBackgroundResource(i2);
        int i3 = this.f26455OooO0oO;
        if (i3 == 0) {
            w6Var.f59159OooO0o0.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
            w6Var.f59159OooO0o0.setBackgroundResource(oOo00OO0.bg_ffffffff_r360);
        } else {
            if (i3 != 1) {
                return;
            }
            w6Var.f59161OooO0oo.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
            w6Var.f59161OooO0oo.setBackgroundResource(oOo00OO0.bg_ffffffff_r360);
        }
    }

    public final void setShowOriginal(boolean showOriginal) {
        w6 w6Var = this.f26454OooO0o0;
        if (showOriginal) {
            TextView textView = w6Var.f59156OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.contentOriginal");
            o000OO00.OooOOOO(textView);
        } else {
            TextView textView2 = w6Var.f59156OooO0OO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.contentOriginal");
            o000OO00.OooO0O0(textView2);
        }
    }
}
