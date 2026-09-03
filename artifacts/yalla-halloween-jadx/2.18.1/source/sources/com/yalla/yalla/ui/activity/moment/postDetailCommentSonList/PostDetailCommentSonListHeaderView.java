package com.yalla.yalla.ui.activity.moment.postDetailCommentSonList;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.app.base.base.activity.BaseActivity;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.abs.AbsView.AbsView;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.model.PraiseCommentResultModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.PostDetailCommentSonListHeaderView;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import o00OO0O0.o0OOO0o;
import o00Oo00.OooO0OO;
import o0o0000.OooOo;
import p142o00OOooO.OooOO0O;
import p168o00Ooo0.o0O0O00;
import p176o00OoooO.oO00OOOo;
import p254o00ooO0O.o00000O;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public class PostDetailCommentSonListHeaderView extends AbsView<PostCommentDetailModel, AbsListenerTag> implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public NetImageView f22726OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public UserTagView f22727OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public TextView f22728OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public TextView f22729OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f22730OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TextView f22731Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ImageView f22732Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public TextView f22733OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public PraiseView f22734OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public TextView f22735OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public ImageView f22736Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public SVGAView f22737Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22738OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f22739Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public LinearLayout f22740o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public MomentVM f22741o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public AppCompatActivity f22742o00Oo0;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public String f22743o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public OooO0OO<Integer> f22744ooOO;

    public PostDetailCommentSonListHeaderView(AppCompatActivity appCompatActivity, String str) {
        super(appCompatActivity);
        this.f22738OoooooO = false;
        this.f22739Ooooooo = 0;
        this.f22742o00Oo0 = appCompatActivity;
        this.f22743o0OoOo0 = str;
        this.f22739Ooooooo = OooOo00.OooO00o(36.0f);
        this.f22741o00O0O = new MomentVM();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO(final SVGAView sVGAView, final TextView textView) {
        ((PostCommentDetailModel) this.f11708Oooo).setSendProp(true);
        this.f22741o00O0O.commentSendProp(((PostCommentDetailModel) this.f11708Oooo).getId() + "", ((PostCommentDetailModel) this.f11708Oooo).getUserid()).observe((LifecycleOwner) this.f11711Oooo0oo, new OooOo(new Function1() { // from class: o0o0OoO.o0O0000O
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context;
                int i;
                PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView = this.f44190Oooo0o;
                SVGAView sVGAView2 = sVGAView;
                TextView textView2 = textView;
                RewardCommentResultModel rewardCommentResultModel = (RewardCommentResultModel) obj;
                Objects.requireNonNull(postDetailCommentSonListHeaderView);
                o0O00000.OooO0OO("Monents_commentFlower_success");
                sVGAView2.OooO0oo("svga/anim_moment_reward.svga", (LifecycleOwner) postDetailCommentSonListHeaderView.f11711Oooo0oo);
                sVGAView2.OooO();
                ((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).setSendProp(true);
                ((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).setPropNum(rewardCommentResultModel.getTotalPropNum());
                OooOOO.f41216OooO00o.OooO0OO().setValue(Long.valueOf(rewardCommentResultModel.getCoinBalance()));
                textView2.setText(o0O0O00.OooO0oO(((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).getPropNum(), false));
                if (((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).isSendProp()) {
                    context = postDetailCommentSonListHeaderView.f11715OoooO0O;
                    i = R.color.color_FFA16C;
                } else {
                    context = postDetailCommentSonListHeaderView.f11715OoooO0O;
                    i = R.color.color_666666;
                }
                textView2.setTextColor(OooO00o.OooO0O0(context, i));
                oo00oO.OooO00o.f53312OooO0OO.OooO00o(postDetailCommentSonListHeaderView.f22742o00Oo0, textView2);
                return null;
            }
        }, new Function1() { // from class: o0o0OoO.o0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((PostCommentDetailModel) this.f44180Oooo0o.f11708Oooo).setSendProp(false);
                return null;
            }
        }, OooOO0O.f31893Oooo0oo, false));
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final int OooO0OO() {
        return R.layout.item_post_detail_comment_son_list_header;
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0Oo() {
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o() {
        this.f22740o000oOoO = (LinearLayout) OooO0O0(R.id.item_post_detail_comment_son_list_header_bg_layout);
        this.f22726OoooOOO = (NetImageView) OooO0O0(R.id.item_post_detail_comment_son_list_header_head_iv);
        this.f22727OoooOOo = (UserTagView) OooO0O0(R.id.item_post_detail_comment_son_list_header_userTagView);
        this.f22728OoooOo0 = (TextView) OooO0O0(R.id.item_post_detail_comment_son_list_header_time_tv);
        this.f22729OoooOoO = (TextView) OooO0O0(R.id.item_post_detail_comment_son_list_header_edit_content);
        this.f22730OoooOoo = (TextView) OooO0O0(R.id.item_post_detail_comment_son_list_header_edit_content_original);
        this.f22731Ooooo00 = (TextView) OooO0O0(R.id.item_post_detail_comment_header_hou_name);
        this.f22732Ooooo0o = (ImageView) OooO0O0(R.id.item_post_detail_comment_header_hou_image);
        this.f22733OooooO0 = (TextView) OooO0O0(R.id.item_post_detail_comment_son_list_header_praiseCount);
        this.f22734OooooOO = (PraiseView) OooO0O0(R.id.item_post_detail_comment_son_list_header_praiseIv);
        this.f22735OooooOo = (TextView) OooO0O0(R.id.item_post_detail_comment_son_list_header_rewardCount);
        this.f22737Oooooo0 = (SVGAView) OooO0O0(R.id.item_post_detail_comment_son_list_header_reward_svga);
        this.f22736Oooooo = (ImageView) OooO0O0(R.id.item_post_detail_comment_son_list_header_reward_iv);
        this.f22737Oooooo0.setVisibility(4);
        SVGAView sVGAView = this.f22737Oooooo0;
        sVGAView.f21008Ooooo00 = new Function0() { // from class: o0o0OoO.o0oOO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView = this.f44196Oooo0o;
                postDetailCommentSonListHeaderView.f22737Oooooo0.setVisibility(4);
                postDetailCommentSonListHeaderView.f22736Oooooo.setVisibility(0);
                postDetailCommentSonListHeaderView.f22736Oooooo.setImageResource(R.drawable.icon_reward_red);
                return null;
            }
        };
        sVGAView.f21009Ooooo0o = new Function0() { // from class: o0o0OoO.o0O00o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView = this.f44193Oooo0o;
                postDetailCommentSonListHeaderView.f22737Oooooo0.setVisibility(0);
                postDetailCommentSonListHeaderView.f22736Oooooo.setVisibility(4);
                return null;
            }
        };
        this.f22740o000oOoO.setOnLongClickListener(this);
        this.f22726OoooOOO.setOnLongClickListener(this);
        this.f22727OoooOOo.setOnLongClickListener(this);
        this.f22728OoooOo0.setOnLongClickListener(this);
        this.f22729OoooOoO.setOnLongClickListener(this);
        this.f22730OoooOoo.setOnLongClickListener(this);
        OooOO0O(this.f22738OoooooO);
    }

    @Override // com.app.base.framework.abs.AbsView.AbsView
    public final void OooO0o0() {
        this.f22729OoooOoO.setVisibility(8);
        this.f22727OoooOOo.OooO00o();
        this.f22729OoooOoO.setText("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOO0() {
        this.f22733OooooO0.setText(o0O0O00.OooO0oO(((PostCommentDetailModel) this.f11708Oooo).getPraiseNum(), false));
        if (((PostCommentDetailModel) this.f11708Oooo).isPraise()) {
            this.f22733OooooO0.setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_FE6C6C));
        } else {
            this.f22733OooooO0.setTextColor(com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_54000000));
        }
    }

    public final void OooOO0O(boolean z) {
        if (z) {
            this.f22732Ooooo0o.setImageResource(R.drawable.icon_comment_list_hot);
            this.f22731Ooooo00.setText(R.string.Popular);
        } else {
            this.f22732Ooooo0o.setImageResource(R.drawable.icon_comment_list_new);
            this.f22731Ooooo00.setText(R.string.Latest);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        int id = view.getId();
        if (id == R.id.item_post_detail_comment_son_list_header_head_iv) {
            UserInfoActivity.f23452o0ooOO0.OooO00o(this.f11711Oooo0oo, ((PostCommentDetailModel) this.f11708Oooo).getUserid());
            return;
        }
        if (id == R.id.item_post_detail_comment_son_list_header_bg_layout || id == R.id.item_post_detail_comment_son_list_header_userTagView || id == R.id.item_post_detail_comment_son_list_header_time_tv || id == R.id.item_post_detail_comment_son_list_header_edit_content) {
            OooO0oO(AbsListenerTag.Default);
            return;
        }
        if (id == R.id.item_post_detail_comment_son_list_header_edit_content_original) {
            OooO0oO(AbsListenerTag.Cancel);
            return;
        }
        if (id == R.id.item_post_detail_comment_header_hou_name || id == R.id.item_post_detail_comment_header_hou_image) {
            boolean z = !this.f22738OoooooO;
            this.f22738OoooooO = z;
            OooOO0O(z);
            OooO0OO<Integer> oooO0OO = this.f22744ooOO;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(Integer.valueOf(this.f22738OoooooO ? 1 : 0));
                return;
            }
            return;
        }
        if (id == R.id.item_post_detail_comment_son_list_header_praiseCount || id == R.id.item_post_detail_comment_son_list_header_praiseIv) {
            Function0 onLogin = new Function0() { // from class: o0o0OoO.o0O0o
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView = this.f44194Oooo0o;
                    boolean zIsPraise = ((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).isPraise();
                    LiveData<ApiResult<PraiseCommentResultModel>> liveDataCommentPraise = postDetailCommentSonListHeaderView.f22741o00O0O.commentPraise(((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).getId() + "", zIsPraise ? 1 : 0);
                    AppCompatActivity appCompatActivity = postDetailCommentSonListHeaderView.f22742o00Oo0;
                    final int i = zIsPraise ? 1 : 0;
                    liveDataCommentPraise.observe(appCompatActivity, new OooOo(new Function1() { // from class: o0o0OoO.o0O00000
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView2 = postDetailCommentSonListHeaderView;
                            PraiseCommentResultModel praiseCommentResultModel = (PraiseCommentResultModel) obj;
                            postDetailCommentSonListHeaderView2.f22734OooooOO.OooO0Oo(i == 0);
                            ((PostCommentDetailModel) postDetailCommentSonListHeaderView2.f11708Oooo).setPraiseNum(praiseCommentResultModel.getNum());
                            PostCommentDetailModel postCommentDetailModel = (PostCommentDetailModel) postDetailCommentSonListHeaderView2.f11708Oooo;
                            postCommentDetailModel.setPraise(!postCommentDetailModel.isPraise());
                            postDetailCommentSonListHeaderView2.OooOO0();
                            return null;
                        }
                    }, null, null, false));
                    return null;
                }
            };
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O0 != null) {
                LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                return;
            }
            return;
        }
        if (id == R.id.item_post_detail_comment_son_list_header_reward_iv || id == R.id.item_post_detail_comment_son_list_header_reward_svga || id == R.id.item_post_detail_comment_son_list_header_rewardCount) {
            Function0 onLogin2 = new Function0() { // from class: o0o0OoO.o0oOOo
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView = this.f44197Oooo0o;
                    Objects.requireNonNull(postDetailCommentSonListHeaderView);
                    o0O00000.OooO0OO("Monents_commentFlower");
                    if (OooOOO.f41216OooO00o.OooOo().getValue().toString().equals(((PostCommentDetailModel) postDetailCommentSonListHeaderView.f11708Oooo).getUserid())) {
                        ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
                        Activity activity = postDetailCommentSonListHeaderView.f11711Oooo0oo;
                        oooO0O0.OooO0O0(activity != null ? activity.getString(R.string.send_reward_self) : null);
                    } else {
                        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                        if (OooOOO0.OooO().OooOO0O()) {
                            postDetailCommentSonListHeaderView.OooO(postDetailCommentSonListHeaderView.f22737Oooooo0, postDetailCommentSonListHeaderView.f22735OooooOo);
                        } else {
                            oO00OOOo.OooO00o((BaseActivity) postDetailCommentSonListHeaderView.f11711Oooo0oo, new Function0() { // from class: o0o0OoO.oo00oO
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    PostDetailCommentSonListHeaderView postDetailCommentSonListHeaderView2 = postDetailCommentSonListHeaderView;
                                    postDetailCommentSonListHeaderView2.OooO(postDetailCommentSonListHeaderView2.f22737Oooooo0, postDetailCommentSonListHeaderView2.f22735OooooOo);
                                    return null;
                                }
                            });
                        }
                    }
                    return null;
                }
            };
            Intrinsics.checkNotNullParameter(onLogin2, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin2.invoke();
                return;
            }
            Activity activityOooO0O1 = o00000O.f34254OooO00o.OooO0O0();
            if (activityOooO0O1 != null) {
                LoginActivity.OooO00o oooO00o2 = LoginActivity.f21752OooooO0;
                o0OOO0o.OooO0O0(activityOooO0O1, d.R, activityOooO0O1, LoginActivity.class);
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int id = view.getId();
        if (id != R.id.item_post_detail_comment_son_list_header_head_iv && id != R.id.item_post_detail_comment_son_list_header_userTagView && id != R.id.item_post_detail_comment_son_list_header_bg_layout && id != R.id.item_post_detail_comment_son_list_header_time_tv && id != R.id.item_post_detail_comment_son_list_header_edit_content_original && id != R.id.item_post_detail_comment_son_list_header_edit_content) {
            return true;
        }
        OooO0oO(AbsListenerTag.Null);
        return true;
    }
}
