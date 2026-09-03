package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentPowerSelectModel;
import com.yalla.yalla.model.MomentType;
import com.yalla.yalla.model.MomentTypePower;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.view.MomentDetailUserView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0000O;
import p254o00ooO0O.o000O0O0;
import p487o0o000oO.o0OOO0o;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oOO00O;
import p522o0o0O0o.oo0o0O0;
import p566o0oOo00O.o000000;
import p569o0oOo0OO.o000O00O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.pd;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010L\u001a\u00020K\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M\u0012\b\b\u0002\u0010O\u001a\u00020)¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R*\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=¨\u0006R"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailUserView;", "Landroid/widget/RelativeLayout;", "Lcom/yalla/yalla/model/MomentDetailModel;", "postDetail", "", "setUserInfo", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "Oooo", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "getMomentAdapterTag", "()Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "setMomentAdapterTag", "(Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;)V", "momentAdapterTag", "", "OoooO00", "Z", "isPostDetailPage", "()Z", "setPostDetailPage", "(Z)V", "", "OoooO0", "J", "getTopPostId", "()J", "setTopPostId", "(J)V", "topPostId", "", "OoooO0O", "Ljava/lang/String;", "getTopicOwnerId", "()Ljava/lang/String;", "setTopicOwnerId", "(Ljava/lang/String;)V", "topicOwnerId", "OoooO", "getMIsFromTopicDetail", "setMIsFromTopicDetail", "mIsFromTopicDetail", "", "OoooOO0", "I", "getMPosition", "()I", "setMPosition", "(I)V", "mPosition", "Lcom/yalla/yalla/model/MomentPowerSelectModel;", "o000oOoO", "Lkotlin/Lazy;", "getMSelectPostPowerModel", "()Lcom/yalla/yalla/model/MomentPowerSelectModel;", "mSelectPostPowerModel", "Lkotlin/Function0;", "OoooOOO", "Lkotlin/jvm/functions/Function0;", "getRootListener", "()Lkotlin/jvm/functions/Function0;", "setRootListener", "(Lkotlin/jvm/functions/Function0;)V", "rootListener", "OoooOOo", "getUserListener", "setUserListener", "userListener", "OoooOo0", "getFollowListener", "setFollowListener", "followListener", "OoooOoO", "getMoveListener", "setMoveListener", "moveListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailUserView extends RelativeLayout {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f24918OoooOoo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentAdapterTag momentAdapterTag;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final pd f24920Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public FragmentActivity f24921Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f24922Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public boolean mIsFromTopicDetail;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name and from kotlin metadata */
    public long topPostId;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    public boolean isPostDetailPage;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String topicOwnerId;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name and from kotlin metadata */
    public int mPosition;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> rootListener;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> userListener;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> followListener;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> moveListener;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy mSelectPostPowerModel;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            iArr[MomentAdapterTag.TopicDetailFragmentPopular.ordinal()] = 1;
            iArr[MomentAdapterTag.UserPostListActivity.ordinal()] = 2;
            iArr[MomentAdapterTag.MomentListFollowingFragment_Top.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MomentPowerSelectModel> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f24933Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MomentPowerSelectModel invoke() {
            return new MomentPowerSelectModel(MomentTypePower.Open.getValue());
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f24934Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentDetailUserView f24935Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentDetailModel momentDetailModel, MomentDetailUserView momentDetailUserView) {
            super(1);
            this.f24934Oooo0o = momentDetailModel;
            this.f24935Oooo0oO = momentDetailUserView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String str2 = str;
            int sex = this.f24934Oooo0o.getSex();
            if (sex == 0) {
                TextView textView = this.f24935Oooo0oO.f24920Oooo0o.f50300OooOOOO;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNameItem");
                oo0o0O0.OooO0oO(textView, OooOOO.OooO0O0(R.drawable.icon_female));
            } else if (sex == 1) {
                TextView textView2 = this.f24935Oooo0oO.f24920Oooo0o.f50300OooOOOO;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvNameItem");
                oo0o0O0.OooO0oO(textView2, OooOOO.OooO0O0(R.drawable.icon_male));
            } else if (sex == 2) {
                TextView textView3 = this.f24935Oooo0oO.f24920Oooo0o.f50300OooOOOO;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvNameItem");
                oo0o0O0.OooO0oO(textView3, null);
            }
            o0OOO0o.OooO0Oo();
            this.f24935Oooo0oO.f24920Oooo0o.f50300OooOOOO.setText(str2);
            if (this.f24934Oooo0o.getKaVipLv() > VipLevel.Vip0.getValue()) {
                this.f24935Oooo0oO.f24920Oooo0o.f50290OooO0Oo.setVisibility(0);
                this.f24935Oooo0oO.f24920Oooo0o.f50290OooO0Oo.setImageResource(VipLevel.INSTANCE.OooO00o(this.f24934Oooo0o.getKaVipLv()));
            } else {
                this.f24935Oooo0oO.f24920Oooo0o.f50290OooO0Oo.setVisibility(8);
            }
            return null;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentDetailModel momentDetailModel = MomentDetailUserView.this.f24922Oooo0oo;
            if (!oOO00O.OooO0OO(momentDetailModel != null ? Boolean.valueOf(momentDetailModel.getIsFollow()) : null)) {
                MomentDetailUserView.this.f24920Oooo0o.f50299OooOOO0.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailUserView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final MomentPowerSelectModel getMSelectPostPowerModel() {
        return (MomentPowerSelectModel) this.mSelectPostPowerModel.getValue();
    }

    private final void setUserInfo(MomentDetailModel postDetail) {
        this.f24920Oooo0o.f50289OooO0OO.setBackground(null);
        this.f24920Oooo0o.f50289OooO0OO.setImageDrawable(null);
        this.f24920Oooo0o.f50293OooO0oO.setImageDrawable(null);
        this.f24920Oooo0o.f50288OooO0O0.setVisibility(8);
        this.f24920Oooo0o.f50286OooO.setVisibility(8);
        this.f24920Oooo0o.f50304OooOOoo.setVisibility(8);
        this.f24920Oooo0o.f50304OooOOoo.setImageDrawable(null);
        this.f24920Oooo0o.f50294OooO0oo.setVisibility(8);
        this.f24920Oooo0o.f50300OooOOOO.setText("");
        this.f24920Oooo0o.f50298OooOOO.setVisibility(8);
        this.f24920Oooo0o.f50292OooO0o0.setVisibility(8);
        this.f24920Oooo0o.f50299OooOOO0.setVisibility(8);
        this.f24920Oooo0o.f50301OooOOOo.setText("");
        this.f24920Oooo0o.f50303OooOOo0.setText("");
        this.f24920Oooo0o.f50297OooOO0o.setText("");
        OooO00o();
        this.f24920Oooo0o.f50304OooOOoo.OooO0Oo(postDetail.getIsVIP(), postDetail.getNVipLv());
        this.f24920Oooo0o.f50294OooO0oo.setVisibility(postDetail.getRole() == 2 ? 0 : 8);
        if (!postDetail.getIsFeatured() || this.isPostDetailPage || this.momentAdapterTag == MomentAdapterTag.MomentListFeaturedFragment) {
            this.f24920Oooo0o.f50288OooO0O0.setVisibility(8);
        } else {
            this.f24920Oooo0o.f50288OooO0O0.setVisibility(0);
        }
        String str = this.topicOwnerId;
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        boolean zOooO00o = o0000O.OooO00o(oooOOO, str);
        long userId = postDetail.getUserId();
        Long value = oooOOO.OooOo().getValue();
        boolean z = value != null && userId == value.longValue();
        MomentAdapterTag momentAdapterTag = this.momentAdapterTag;
        int i = momentAdapterTag == null ? -1 : OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
        if (i == 1 ? (zOooO00o && postDetail.getId() == this.topPostId) || postDetail.getIsTop() : (i == 2 || i == 3) && ((z && postDetail.getId() == this.topPostId) || postDetail.getIsTop())) {
            ImageView imageView = this.f24920Oooo0o.f50286OooO;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivTopItem");
            o00O0O.OooO(imageView);
        }
        long userId2 = postDetail.getUserId();
        String defaultValue = postDetail.getNickName();
        OooO0OO block = new OooO0OO(postDetail, this);
        Intrinsics.checkNotNullParameter(this, "tagView");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(block, "block");
        setTag(R.id.tag_friend_memo_name_tag, Long.valueOf(userId2));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0o0O0O0.o00O0O.OooO0O0(userId2, defaultValue, this, block, null), 2, null);
        MomentAdapterTag momentAdapterTag2 = this.momentAdapterTag;
        MomentAdapterTag momentAdapterTag3 = MomentAdapterTag.MomentListFollowingFragment;
        if (momentAdapterTag2 != momentAdapterTag3) {
            Long value2 = oooOOO.OooOo().getValue();
            long userId3 = postDetail.getUserId();
            if (value2 == null || value2.longValue() != userId3) {
                OooO0OO();
            }
        }
        if (this.momentAdapterTag == momentAdapterTag3 && postDetail.getIsFriend() && !this.isPostDetailPage) {
            Long value3 = oooOOO.OooOo().getValue();
            long userId4 = postDetail.getUserId();
            if (value3 == null || value3.longValue() != userId4) {
                this.f24920Oooo0o.f50298OooOOO.setVisibility(0);
            }
        }
        MomentAdapterTag momentAdapterTag4 = this.momentAdapterTag;
        if (momentAdapterTag4 == MomentAdapterTag.TopicDetailFragmentPopular || momentAdapterTag4 == MomentAdapterTag.TopicDetailFragmentLatest) {
            this.f24920Oooo0o.f50292OooO0o0.setVisibility(8);
            if (postDetail.getPositionid() == 1) {
                this.f24920Oooo0o.f50292OooO0o0.setVisibility(0);
                this.f24920Oooo0o.f50292OooO0o0.setImageResource(R.drawable.ic_topic_owner);
            }
            if (postDetail.getPositionid() == 3) {
                this.f24920Oooo0o.f50292OooO0o0.setVisibility(0);
                this.f24920Oooo0o.f50292OooO0o0.setImageResource(R.drawable.ic_topic_manager);
            }
        }
        this.f24920Oooo0o.f50301OooOOOo.setText(o00O0.f48624OooO00o.OooO0Oo(postDetail.getCreateTime(), System.currentTimeMillis()) + " • ");
        if (postDetail.getType() == MomentType.YallaTeam.getValue()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(" • ");
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.MessageFragment_item_YallaTeam));
            this.f24920Oooo0o.f50303OooOOo0.setText(sbOooO0o0.toString());
        }
        if (postDetail.getIsEdited()) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(" • ");
            sbOooO0o1.append(o000O0O0.OooO0OO(R.string.Moment_Detail_Edit_Tag));
            this.f24920Oooo0o.f50297OooOO0o.setText(sbOooO0o1.toString());
        }
        getMSelectPostPowerModel().setPower(postDetail.getPower());
        this.f24920Oooo0o.f50293OooO0oO.setImageResource(getMSelectPostPowerModel().getResId());
        FragmentActivity fragmentActivity = this.f24921Oooo0oO;
        if (fragmentActivity != null) {
            this.f24920Oooo0o.f50302OooOOo.OooO0O0(postDetail.getMedal(), fragmentActivity);
        }
        if (this.momentAdapterTag == MomentAdapterTag.MomentEditRecord) {
            ImageView imageView2 = this.f24920Oooo0o.f50291OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivMoveItem");
            o00O0O.OooO00o(imageView2);
        } else {
            ImageView imageView3 = this.f24920Oooo0o.f50291OooO0o;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivMoveItem");
            o00O0O.OooO(imageView3);
        }
    }

    public final void OooO00o() {
        MomentAdapterTag momentAdapterTag;
        MomentDetailModel momentDetailModel = this.f24922Oooo0oo;
        if (momentDetailModel != null) {
            if (!momentDetailModel.getIsInRoom() || ((momentAdapterTag = this.momentAdapterTag) != MomentAdapterTag.MomentListFollowingFragment && momentAdapterTag != MomentAdapterTag.MomentListFollowingFragment_Top && momentAdapterTag != MomentAdapterTag.MomentListFollowingFragment_Recommend)) {
                this.f24920Oooo0o.f50296OooOO0O.OooOO0(false);
                this.f24920Oooo0o.f50296OooOO0O.setVisibility(8);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this.f24921Oooo0oO);
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(momentDetailModel.getHeadUrl());
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f24920Oooo0o.f50289OooO0OO);
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("setContentLayout mPosition = ");
            sbOooO0o0.append(this.mPosition);
            sbOooO0o0.append(", getIsInRoom = 在房");
            o00O00.OooOO0O(sbOooO0o0.toString());
            this.f24920Oooo0o.f50296OooOO0O.OooOO0(false);
            this.f24920Oooo0o.f50296OooOO0O.setVisibility(0);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.f24921Oooo0oO);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0O0(OooOo00.OooO00o(0.5f), OooOOO.OooO00o(R.color.color_00d8c9)));
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgFormat(momentDetailModel.getHeadUrl());
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(this.f24920Oooo0o.f50289OooO0OO);
            SVGAView sVGAView = this.f24920Oooo0o.f50296OooOO0O;
            Object context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            sVGAView.OooO0oo("svga/moment_user_inroom.svga", (LifecycleOwner) context);
            this.f24920Oooo0o.f50296OooOO0O.OooO();
        }
    }

    public final void OooO0O0(@NotNull FragmentActivity activity, @NotNull MomentDetailModel itemData) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        o00O00.OooO0O0("itemData = " + itemData);
        this.f24921Oooo0oO = activity;
        this.f24922Oooo0oo = itemData;
        setUserInfo(itemData);
    }

    public final void OooO0OO() {
        this.f24920Oooo0o.f50299OooOOO0.setVisibility(8);
        if (this.mIsFromTopicDetail) {
            this.f24920Oooo0o.f50299OooOOO0.setVisibility(8);
            return;
        }
        MomentAdapterTag momentAdapterTag = this.momentAdapterTag;
        OooO0o oooO0o = new OooO0o();
        int i = momentAdapterTag == null ? -1 : o000O00O.OooO00o.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
        if (i == 1 || i == 2) {
            oooO0o.invoke();
        }
    }

    @Nullable
    public final Function0<Unit> getFollowListener() {
        return this.followListener;
    }

    public final boolean getMIsFromTopicDetail() {
        return this.mIsFromTopicDetail;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    @Nullable
    public final MomentAdapterTag getMomentAdapterTag() {
        return this.momentAdapterTag;
    }

    @Nullable
    public final Function0<Unit> getMoveListener() {
        return this.moveListener;
    }

    @Nullable
    public final Function0<Unit> getRootListener() {
        return this.rootListener;
    }

    public final long getTopPostId() {
        return this.topPostId;
    }

    @NotNull
    public final String getTopicOwnerId() {
        return this.topicOwnerId;
    }

    @Nullable
    public final Function0<Unit> getUserListener() {
        return this.userListener;
    }

    public final void setFollowListener(@Nullable Function0<Unit> function0) {
        this.followListener = function0;
    }

    public final void setMIsFromTopicDetail(boolean z) {
        this.mIsFromTopicDetail = z;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMomentAdapterTag(@Nullable MomentAdapterTag momentAdapterTag) {
        this.momentAdapterTag = momentAdapterTag;
    }

    public final void setMoveListener(@Nullable Function0<Unit> function0) {
        this.moveListener = function0;
    }

    public final void setPostDetailPage(boolean z) {
        this.isPostDetailPage = z;
    }

    public final void setRootListener(@Nullable Function0<Unit> function0) {
        this.rootListener = function0;
    }

    public final void setTopPostId(long j) {
        this.topPostId = j;
    }

    public final void setTopicOwnerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.topicOwnerId = str;
    }

    public final void setUserListener(@Nullable Function0<Unit> function0) {
        this.userListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailUserView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailUserView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        pd pdVarInflate = pd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(pdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24920Oooo0o = pdVarInflate;
        this.topicOwnerId = "";
        this.mPosition = -1;
        this.mSelectPostPowerModel = LazyKt.lazy(OooO0O0.f24933Oooo0o);
        pdVarInflate.f50287OooO00o.setOnClickListener(new o000000(this, 1));
        pdVarInflate.f50295OooOO0.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o00OOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MomentDetailUserView this$0 = this.f48154Oooo0o;
                int i2 = MomentDetailUserView.f24918OoooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.userListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        pdVarInflate.f50299OooOOO0.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o00OOO0O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MomentDetailUserView this$0 = this.f48156Oooo0o;
                int i2 = MomentDetailUserView.f24918OoooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.followListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        pdVarInflate.f50291OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.o0o0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MomentDetailUserView this$0 = this.f48229Oooo0o;
                int i2 = MomentDetailUserView.f24918OoooOoo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0<Unit> function0 = this$0.moveListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }
}
