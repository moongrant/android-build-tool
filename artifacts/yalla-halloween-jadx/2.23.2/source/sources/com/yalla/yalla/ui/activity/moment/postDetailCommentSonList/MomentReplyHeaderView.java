package com.yalla.yalla.ui.activity.moment.postDetailCommentSonList;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.session.o0000O00;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
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
import p368o0OOo0Oo.Oooo000;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.oOOO00;
import p412o0Oo0o0O.o000O0o;
import p429o0OoOO.OooOo00;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.O0000000;
import p496o0o00Oo0.O0O0;
import p496o0o00Oo0.O0OO00;
import p496o0o00Oo0.Oo0000;
import p496o0o00Oo0.d;
import p496o0o00Oo0.g;
import p496o0o00Oo0.h;
import p496o0o00Oo0.i;
import p496o0o00Oo0.k;
import p496o0o00Oo0.oOOO00o0;
import p496o0o00Oo0.oOOO0O0o;
import p496o0o00Oo0.oOOO0OO0;
import p496o0o00Oo0.oOOO0OOO;
import p496o0o00Oo0.oOOOOo0O;
import p496o0o00Oo0.oOOOoo00;
import p496o0o00Oo0.oOOo0000;
import p496o0o00Oo0.oOOo0O00;
import p496o0o00Oo0.oOo0o00;
import p496o0o00Oo0.oo00;
import p496o0o00Oo0.oo000000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p566o0oOo0OO.o0O000O;
import p599o0oo00o.o00O0O;
import p605o0oo0O0O.o0O0O0Oo;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "setData", "", "showOriginal", "setShowOriginal", "", "selectType", "setSelectType", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "OooO0Oo", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "activity", "Lkotlin/Function1;", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentReplyHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,429:1\n283#2,2:430\n*S KotlinDebug\n*F\n+ 1 MomentReplyHeaderView.kt\ncom/yalla/yalla/ui/activity/moment/postDetailCommentSonList/MomentReplyHeaderView\n*L\n365#1:430,2\n*E\n"})
public final class MomentReplyHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final /* synthetic */ int f25998OooOO0O = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f25999OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MomentReplyActivity activity;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> itemListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oOOO00 f26002OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f26003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public MomentCommentDetailModel f26004OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f26005OooOO0;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26006OooO0Oo;

        public OooO00o(d function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26006OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26006OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26006OooO0Oo;
        }

        public final int hashCode() {
            return this.f26006OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26006OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f26007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f26008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentReplyHeaderView f26009OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f26010OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SVGAView sVGAView, MomentReplyHeaderView momentReplyHeaderView, MomentCommentDetailModel momentCommentDetailModel, TextView textView) {
            super(1);
            this.f26007OooO0Oo = sVGAView;
            this.f26009OooO0o0 = momentReplyHeaderView;
            this.f26008OooO0o = momentCommentDetailModel;
            this.f26010OooO0oO = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0oo0000.OooO00o.OooO0O0("203024");
            MomentReplyHeaderView momentReplyHeaderView = this.f26009OooO0o0;
            MomentReplyActivity activity = momentReplyHeaderView.getActivity();
            SVGAView sVGAView = this.f26007OooO0Oo;
            sVGAView.OooOO0O("svga/anim_moment_reward.svga", activity);
            sVGAView.OooOO0o();
            MomentCommentDetailModel momentCommentDetailModel = this.f26008OooO0o;
            momentCommentDetailModel.setSendProp(true);
            momentCommentDetailModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            String strOooO0o = o0O0O0Oo.OooO0o(momentCommentDetailModel.getPropNum(), false);
            TextView textView = this.f26010OooO0oO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(momentCommentDetailModel.isSendProp() ? o0OOO0o.color_FFA16C : o0OOO0o.color_666666));
            int i = o0O000O.f56394OooO0O0;
            o0O000O.OooO00o.OooO00o(momentReplyHeaderView.getActivity(), textView);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f26011OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentCommentDetailModel momentCommentDetailModel) {
            super(1);
            this.f26011OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            Intrinsics.checkNotNullParameter(apiError, "<anonymous parameter 0>");
            this.f26011OooO0Oo.setSendProp(false);
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
            MomentReplyHeaderView.this.f26005OooOO0 = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MomentReplyHeaderView(MomentReplyActivity activity) {
        super(activity, null, 0);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        oOOO00 oooo00Inflate = oOOO00.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(oooo00Inflate, "inflate(...)");
        this.f26002OooO0o0 = oooo00Inflate;
        this.f26003OooO0oO = 1;
        oooo00Inflate.f45127OooO0o.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0o00Oo0.oOOO00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = MomentReplyHeaderView.f25998OooOO0O;
                MomentReplyHeaderView this$0 = this.f49665OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentCommentDetailModel momentCommentDetailModel = this$0.f26004OooO0oo;
                if (!(momentCommentDetailModel != null && momentCommentDetailModel.isHide())) {
                    l.OooO0O0(this$0.f26004OooO0oo, this$0.activity);
                }
                return true;
            }
        });
        View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: o0o00Oo0.oOOO00Oo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i = MomentReplyHeaderView.f25998OooOO0O;
                MomentReplyHeaderView this$0 = this.f49666OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentCommentDetailModel momentCommentDetailModel = this$0.f26004OooO0oo;
                if (!(momentCommentDetailModel != null && momentCommentDetailModel.isHide())) {
                    l.OooO0O0(this$0.f26004OooO0oo, this$0.activity);
                }
                return true;
            }
        };
        FixTextView content = oooo00Inflate.f45124OooO0O0;
        content.setOnLongClickListener(onLongClickListener);
        ConstraintLayout layout = oooo00Inflate.f45127OooO0o;
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o000O.OooO(layout, new oOOo0O00(this));
        Intrinsics.checkNotNullExpressionValue(content, "content");
        o000O.OooO(content, new oOo0o00(this));
        NetImageView head = oooo00Inflate.f45126OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(head, "head");
        o000O.OooO(head, new oo000000(this));
        TextView contentOriginal = oooo00Inflate.f45125OooO0OO;
        Intrinsics.checkNotNullExpressionValue(contentOriginal, "contentOriginal");
        o000O.OooO(contentOriginal, new oo00(this));
        SVGAView praiseSvga = oooo00Inflate.f45132OooOO0O;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        o000O.OooO(praiseSvga, new O0000000(this));
        ImageView praiseIv = oooo00Inflate.f45131OooOO0;
        Intrinsics.checkNotNullExpressionValue(praiseIv, "praiseIv");
        o000O.OooO(praiseIv, new O0O0(this));
        TextView praiseCount = oooo00Inflate.f45122OooO;
        Intrinsics.checkNotNullExpressionValue(praiseCount, "praiseCount");
        o000O.OooO(praiseCount, new O0OO00(this));
        TextView rewardCount = oooo00Inflate.f45135OooOOO0;
        Intrinsics.checkNotNullExpressionValue(rewardCount, "rewardCount");
        o000O.OooO(rewardCount, new oOOO0OO0(this));
        SVGAView rewardSvga = oooo00Inflate.f45136OooOOOO;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        o000O.OooO(rewardSvga, new oOOO0OOO(this));
        ImageView rewardIv = oooo00Inflate.f45134OooOOO;
        Intrinsics.checkNotNullExpressionValue(rewardIv, "rewardIv");
        o000O.OooO(rewardIv, new oOOOoo00(this));
        TextView popular = oooo00Inflate.f45130OooO0oo;
        Intrinsics.checkNotNullExpressionValue(popular, "popular");
        o000O.OooO(popular, new oOOOOo0O(this));
        TextView latest = oooo00Inflate.f45128OooO0o0;
        Intrinsics.checkNotNullExpressionValue(latest, "latest");
        o000O.OooO(latest, new oOOo0000(this));
        content.setTextAlignment(5);
    }

    public static final void OooO0O0(MomentReplyHeaderView momentReplyHeaderView) {
        momentReplyHeaderView.getClass();
        g onLogin = new g(momentReplyHeaderView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0OO(MomentReplyHeaderView momentReplyHeaderView) {
        momentReplyHeaderView.getClass();
        k onLogin = new k(momentReplyHeaderView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public final void OooO0Oo(@NotNull MomentCommentDetailModel it, @NotNull SVGAView rewardSvga, @NotNull TextView tvRewardCount) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(rewardSvga, "rewardSvga");
        Intrinsics.checkNotNullParameter(tvRewardCount, "tvRewardCount");
        if (this.f26005OooOO0) {
            return;
        }
        this.f26005OooOO0 = true;
        it.setSendProp(true);
        MomentReplyActivity momentReplyActivity = this.activity;
        momentReplyActivity.OooOoO().commentSendProp(o0000O00.OooO00o(it.getId()), o0OoOo0.OooOOO(it.getUserid(), "")).observe(momentReplyActivity, new o000oOoO(new OooO0O0(rewardSvga, this, it, tvRewardCount), new OooO0OO(it), new OooO0o(), false));
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
        this.f26004OooO0oo = model;
        if (model == null || TextUtils.isEmpty(model.getUserid())) {
            return;
        }
        boolean zIsLocalMessageDiscolor = model.isLocalMessageDiscolor();
        oOOO00 oooo00 = this.f26002OooO0o0;
        if (zIsLocalMessageDiscolor) {
            oooo00.f45127OooO0o.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_EEFDFC));
        } else {
            oooo00.f45127OooO0o.setBackgroundColor(o0000.OooO00o(o0OOO0o.color_white));
        }
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
        oooO00o.OooO00o(d1.OooO0OO());
        oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(80, 80, model.getHeadurl());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(oooo00.f45126OooO0Oo);
        if (model.getRole() == 2) {
            ImageView role = oooo00.f45137OooOOOo;
            Intrinsics.checkNotNullExpressionValue(role, "role");
            o000O.OooOOOO(role);
        }
        MomentReplyActivity momentReplyActivity = this.activity;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getUserId()) : null), model.getUserid());
        UserTagView userTagView = oooo00.f45138OooOOo;
        userTagView.setAuthorComment(zAreEqual);
        userTagView.OooO0oO(model.getVip(), model.getVipLevel());
        userTagView.setSex(model.getSex());
        int i = o0OOO0o.color_333333_45;
        userTagView.setNameTextColor(i);
        userTagView.setNameTextSize(13.0f);
        String userid = model.getUserid();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (oOOO0O0o.OooO00o(userid) && Intrinsics.areEqual(o0O00oO0.OooOo().getValue(), Boolean.TRUE)) {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentReplyActivity, (Integer) o0O00oO0.OooO0oO().getValue(), (String) o0O00oO0.OooO0o0().getValue(), 8);
        } else {
            Intrinsics.checkNotNullExpressionValue(userTagView, "userTagView");
            UserTagView.OooOO0o(userTagView, momentReplyActivity, Integer.valueOf(model.getWealthLevel()), model.getWealthBadgeImage(), 8);
        }
        long jOooO = o0OoOo0.OooO(0L, model.getUserid());
        TextView tagView = userTagView.getNameText();
        String defaultValue = o0OoOo0.OooOOO(model.getNickname(), "");
        Oo0000 block = new Oo0000(this);
        Intrinsics.checkNotNullParameter(tagView, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        tagView.setTag(o0OO00O.tag_friend_memo_name_tag, Long.valueOf(jOooO));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o000O0o(jOooO, tagView, defaultValue, null, block), 2, null);
        if (oOOO0O0o.OooO00o(model.getUserid())) {
            Pair pair = (Pair) o0O00oO0.OooOO0().getValue();
            int iIntValue = pair != null ? ((Number) pair.getSecond()).intValue() : 0;
            Pair pair2 = (Pair) o0O00oO0.OooOO0().getValue();
            userTagView.OooO0Oo(iIntValue, (pair2 != null ? ((Number) pair2.getFirst()).intValue() : 0) == VipState.Vip.getValue(), momentReplyActivity);
        } else {
            userTagView.OooO0Oo(model.getKaVIPLv(), true, momentReplyActivity);
        }
        String strOooO0OO = o0000.OooO0OO(o000000.post_comment_sending);
        if (model.getId() >= 1) {
            strOooO0OO = o0O0O0o0.OooO0Oo(model.getCreateTime(), System.currentTimeMillis());
        }
        oooo00.f45139OooOOo0.setText(strOooO0OO);
        FixTextView fixTextView = oooo00.f45124OooO0O0;
        fixTextView.setVisibility(0);
        if (model.isHide()) {
            fixTextView.setText(o000000.comment_is_hidden);
            fixTextView.setTextColor(o0000.OooO00o(i));
        } else {
            o00O0O.OooO0OO(momentReplyActivity, model.getContent(), fixTextView, new oOOO00o0(this));
            fixTextView.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_85));
        }
        MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        mutableLiveData.observe((AppCompatActivity) context, new OooO00o(new d(this, model)));
        boolean z = model.isSendProp() && model.getPropNum() > 0;
        String strOooO0o = o0O0O0Oo.OooO0o(model.getPropNum(), false);
        TextView textView = oooo00.f45135OooOOO0;
        textView.setText(strOooO0o);
        textView.setTextColor(z ? o0000.OooO00o(o0OOO0o.color_333333) : o0000.OooO00o(o0OOO0o.color_333333_65));
        ImageView imageView = oooo00.f45134OooOOO;
        imageView.setVisibility(0);
        imageView.setImageResource(o0Oo0oo.ic_moment_comment_reward_gray);
        if (model.isSendProp()) {
            imageView.setImageResource(o0Oo0oo.ic_moment_comment_reward_color);
        }
        SVGAView rewardSvga = oooo00.f45136OooOOOO;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        rewardSvga.setVisibility(4);
        rewardSvga.f13231OooOoo0 = new h(this);
        rewardSvga.f13230OooOoo = new i(this);
    }

    public final void setItemListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.itemListener = function1;
    }

    public final void setSelectType(int selectType) {
        this.f26003OooO0oO = selectType;
        oOOO00 oooo00 = this.f26002OooO0o0;
        TextView textView = oooo00.f45130OooO0oo;
        int i = o0OOO0o.color_333333_65;
        textView.setTextColor(o0000.OooO00o(i));
        int i2 = o0Oo0oo.bg_tr00_r360;
        oooo00.f45130OooO0oo.setBackgroundResource(i2);
        int iOooO00o = o0000.OooO00o(i);
        TextView textView2 = oooo00.f45128OooO0o0;
        textView2.setTextColor(iOooO00o);
        textView2.setBackgroundResource(i2);
        int i3 = this.f26003OooO0oO;
        if (i3 == 0) {
            oooo00.f45128OooO0o0.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            oooo00.f45128OooO0o0.setBackgroundResource(o0Oo0oo.bg_ffffffff_r360);
        } else {
            if (i3 != 1) {
                return;
            }
            oooo00.f45130OooO0oo.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            oooo00.f45130OooO0oo.setBackgroundResource(o0Oo0oo.bg_ffffffff_r360);
        }
    }

    public final void setShowOriginal(boolean showOriginal) {
        oOOO00 oooo00 = this.f26002OooO0o0;
        if (showOriginal) {
            TextView contentOriginal = oooo00.f45125OooO0OO;
            Intrinsics.checkNotNullExpressionValue(contentOriginal, "contentOriginal");
            o000O.OooOOOO(contentOriginal);
        } else {
            TextView contentOriginal2 = oooo00.f45125OooO0OO;
            Intrinsics.checkNotNullExpressionValue(contentOriginal2, "contentOriginal");
            o000O.OooO0O0(contentOriginal2);
        }
    }
}
