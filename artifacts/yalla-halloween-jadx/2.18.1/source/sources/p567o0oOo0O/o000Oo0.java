package p567o0oOo0O;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.app.base.framework.view.textView.ViewLocation;
import com.app.base.view.FixTextView;
import com.facebook.appevents.AppEventsConstants;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o000O000.OooO00o;
import o0o0000.OooOo;
import p162o00OoOOo.o0;
import p168o00Ooo0.o0O0O00;
import p173o00OooO0.o0o0Oo;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o00O0O;
import p566o0oOo00O.o0000;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends OooO0OO<PostCommentSonModel> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final /* synthetic */ int f45440OooO0oO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f45441OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f45442OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f45443OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00Oo00.OooO0O0 f45444OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AppCompatActivity f45445OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public MomentVM f45446OooO0o0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f45447OooO00o;

        static {
            int[] iArr = new int[ViewLocation.values().length];
            f45447OooO00o = iArr;
            try {
                iArr[ViewLocation.top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45447OooO00o[ViewLocation.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45447OooO00o[ViewLocation.bottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45447OooO00o[ViewLocation.other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RelativeLayout f45448OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public LinearLayout f45449OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public NetImageView f45450OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public UserTagView f45451OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public FixTextView f45452OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public TextView f45453OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f45454OooO0oO;

        public class OooO00o extends o00Oo0 {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public PostCommentSonModel f45456Oooo;

            public OooO00o(PostCommentSonModel postCommentSonModel) {
                this.f45456Oooo = postCommentSonModel;
            }

            @Override // p654o0ooo.o00Oo0
            public final void OooO00o(View view) {
                o00Oo00.OooO0O0 oooO0O0;
                int id = view.getId();
                if (id == R.id.item_post_detail_comment_son_list_head_iv) {
                    UserInfoActivity.f23452o0ooOO0.OooO00o((Activity) o000Oo0.this.getContext(), this.f45456Oooo.getUserid() + "");
                    return;
                }
                if ((id == R.id.item_post_detail_comment_son_list_userTagView || id == R.id.item_post_detail_comment_son_list_time_tv || id == R.id.item_post_detail_comment_son_list_edit_content || id == R.id.item_post_detail_comment_son_list_view_line || id == R.id.item_post_detail_comment_son_list_item_layout || id == R.id.item_post_detail_comment_son_list_content_layout) && (oooO0O0 = o000Oo0.this.f45444OooO0Oo) != null) {
                    oooO0O0.OooO0O0(this.f45456Oooo, -1, AbsListenerTag.Default);
                }
            }
        }

        /* JADX INFO: renamed from: o0oOo0O.o000Oo0$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public class ViewOnLongClickListenerC0412OooO0O0 implements View.OnLongClickListener {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public PostCommentSonModel f45458Oooo0o;

            public ViewOnLongClickListenerC0412OooO0O0(PostCommentSonModel postCommentSonModel) {
                this.f45458Oooo0o = postCommentSonModel;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                o00Oo00.OooO0O0 oooO0O0;
                int id = view.getId();
                if ((id != R.id.item_post_detail_comment_son_list_head_iv && id != R.id.item_post_detail_comment_son_list_userTagView && id != R.id.item_post_detail_comment_son_list_time_tv && id != R.id.item_post_detail_comment_son_list_edit_content && id != R.id.item_post_detail_comment_son_list_view_line && id != R.id.item_post_detail_comment_son_list_content_layout && id != R.id.item_post_detail_comment_son_list_item_layout) || (oooO0O0 = o000Oo0.this.f45444OooO0Oo) == null) {
                    return true;
                }
                oooO0O0.OooO0O0(this.f45458Oooo0o, -1, AbsListenerTag.Null);
                return true;
            }
        }

        public OooO0O0(OooO0o oooO0o) {
            this.f45448OooO00o = (RelativeLayout) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_item_layout);
            this.f45450OooO0OO = (NetImageView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_head_iv);
            this.f45451OooO0Oo = (UserTagView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_userTagView);
            this.f45449OooO0O0 = (LinearLayout) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_content_layout);
            this.f45453OooO0o0 = (TextView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_time_tv);
            this.f45452OooO0o = (FixTextView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_edit_content);
            this.f45454OooO0oO = oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_view_line);
        }

        public final void OooO00o(ViewLocation viewLocation, PostCommentSonModel postCommentSonModel) {
            int i = OooO00o.f45447OooO00o[viewLocation.ordinal()];
            if (i == 1 || i == 2) {
                if (postCommentSonModel.isLocalMessageDiscolor()) {
                    this.f45448OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_D7FBF8));
                } else {
                    this.f45448OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_f5f5f5));
                }
                this.f45454OooO0oO.setVisibility(0);
                return;
            }
            if (i == 3 || i == 4) {
                if (postCommentSonModel.isLocalMessageDiscolor()) {
                    this.f45448OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_D7FBF8));
                } else {
                    this.f45448OooO00o.setBackgroundColor(OooOOO.OooO00o(R.color.color_f5f5f5));
                }
                this.f45454OooO0oO.setVisibility(8);
            }
        }
    }

    public o000Oo0(AppCompatActivity appCompatActivity, String str, String str2) {
        super((Context) appCompatActivity, R.layout.item_post_detail_comment_son_list, false);
        this.f45445OooO0o = appCompatActivity;
        this.f45442OooO0O0 = str;
        this.f45443OooO0OO = str2;
        this.f45441OooO00o = OooOo00.OooO00o(32.0f);
        this.f45446OooO0o0 = new MomentVM();
    }

    public static void OooO00o(final o000Oo0 o000oo1, final PostCommentSonModel postCommentSonModel, final SVGAView sVGAView, final TextView textView) {
        Objects.requireNonNull(o000oo1);
        postCommentSonModel.setSendProp(true);
        o000oo1.f45446OooO0o0.commentSendProp(postCommentSonModel.getId() + "", postCommentSonModel.getUserid() + "").observe((LifecycleOwner) o000oo1.getContext(), new OooOo(new Function1() { // from class: o0oOo0O.o0000O0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context;
                int i;
                o000Oo0 o000oo2 = this.f45415Oooo0o;
                SVGAView sVGAView2 = sVGAView;
                PostCommentSonModel postCommentSonModel2 = postCommentSonModel;
                TextView textView2 = textView;
                RewardCommentResultModel rewardCommentResultModel = (RewardCommentResultModel) obj;
                Objects.requireNonNull(o000oo2);
                o0O00000.OooO0OO("Monents_commentFlower_success");
                sVGAView2.OooO0oo("svga/anim_moment_reward.svga", (LifecycleOwner) o000oo2.getContext());
                sVGAView2.OooO();
                postCommentSonModel2.setSendProp(true);
                postCommentSonModel2.setPropNum(rewardCommentResultModel.getTotalPropNum());
                p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().setValue(Long.valueOf(rewardCommentResultModel.getCoinBalance()));
                textView2.setText(o0O0O00.OooO0oO(postCommentSonModel2.getPropNum(), false));
                if (postCommentSonModel2.isSendProp()) {
                    context = o000oo2.getContext();
                    i = R.color.color_FFA16C;
                } else {
                    context = o000oo2.getContext();
                    i = R.color.color_666666;
                }
                textView2.setTextColor(OooO00o.OooO0O0(context, i));
                oo00oO.OooO00o.f53312OooO0OO.OooO00o(o000oo2.f45445OooO0o, textView2);
                return null;
            }
        }, new o0(postCommentSonModel, 1), new Function1() { // from class: o0oOo0O.o0000O0O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = o000Oo0.f45440OooO0oO;
                return null;
            }
        }, false));
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
        Context context;
        int i;
        OooO0o oooO0o = (OooO0o) oooO00o;
        final PostCommentSonModel postCommentSonModel = (PostCommentSonModel) obj;
        if (postCommentSonModel == null || postCommentSonModel.getUserid() < 1) {
            return;
        }
        final OooO0O0 oooO0O0 = new OooO0O0(oooO0o);
        oooO0O0.f45454OooO0oO.setVisibility(0);
        oooO0O0.f45451OooO0Oo.OooO00o();
        oooO0O0.f45452OooO0o.setText("");
        oooO0O0.f45452OooO0o.setVisibility(8);
        o00O00.OooO0O0("setData PostCommentSonModel = " + postCommentSonModel);
        oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
        oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
        oooO00o2.OooO0OO(1, OooOOO.OooO00o(R.color.color_e2e2e2));
        String headurl = postCommentSonModel.getHeadurl();
        int i2 = this.f45441OooO00o;
        oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(headurl, i2, i2);
        oooO00o2.f48427OooO00o = 0;
        oooO00o2.OooO0o(oooO0O0.f45450OooO0OO);
        oooO0O0.f45451OooO0Oo.OooO0o(postCommentSonModel.getVip(), postCommentSonModel.getVipLevel());
        o00O0O o00o0o2 = o00O0O.f42677OooO00o;
        oooO0O0.f45451OooO0Oo.setName(o00o0o2.OooO0O0(postCommentSonModel.getUserid(), postCommentSonModel.getNickname()));
        oooO0O0.f45451OooO0Oo.setAuthor(this.f45442OooO0O0.equals(postCommentSonModel.getUserid() + ""));
        oooO0O0.f45451OooO0Oo.setKaVip(postCommentSonModel.kaVIPLv);
        long userid = postCommentSonModel.getUserid();
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        if (userid == oooOOO.OooOo().getValue().longValue()) {
            oooO0O0.f45451OooO0Oo.OooO0OO(oooOOO.OooO().getValue().getSecond().intValue(), oooOOO.OooO().getValue().getFirst().intValue() == VipState.Vip.getValue());
        } else {
            oooO0O0.f45451OooO0Oo.setKaVip(postCommentSonModel.kaVIPLv);
        }
        if (postCommentSonModel.getId() < 1) {
            oooO0O0.f45453OooO0o0.setText(o000O0O0.OooO0OO(R.string.post_comment_sending));
        } else {
            oooO0O0.f45453OooO0o0.setText(o00O0.f48624OooO00o.OooO0Oo(postCommentSonModel.getCreateTime(), System.currentTimeMillis()));
        }
        if (postCommentSonModel.getContent() != null) {
            oooO0O0.f45452OooO0o.setVisibility(0);
            o0o0Oo.OooO0O0(getContext(), postCommentSonModel.getContent(), oooO0O0.f45452OooO0o, new o000O00O(postCommentSonModel));
            if (!TextUtils.isEmpty(postCommentSonModel.getParentUserName()) && !AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(postCommentSonModel.getParentUserId())) {
                oooO0O0.f45452OooO0o.getEditableText().insert(0, p522o0o0O0o.o00O0.OooO0oo(p016OooOoO0.OooOo00.OooO0Oo(o00o0o2.OooO0O0(OooO.OooO0o(postCommentSonModel.getParentUserId()), postCommentSonModel.getParentUserName()), ": "), Integer.valueOf(R.color.color_00d8c9), new Function0() { // from class: o0oOo0O.o000O00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        o000Oo0.OooO0O0 oooO0O1 = oooO0O0;
                        PostCommentSonModel postCommentSonModel2 = postCommentSonModel;
                        Objects.requireNonNull(oooO0O1);
                        UserInfoActivity.f23452o0ooOO0.OooO00o((Activity) o000Oo0.this.getContext(), postCommentSonModel2.getParentUserId() + "");
                        return null;
                    }
                }));
                oooO0O0.f45452OooO0o.getEditableText().insert(0, p522o0o0O0o.o00O0.OooO0oo(o000O0O0.OooO0OO(R.string.Reply_to) + ": ", Integer.valueOf(R.color.color_333333), null));
            }
        }
        OooO0O0.OooO00o oooO00o3 = oooO0O0.new OooO00o(postCommentSonModel);
        oooO0O0.f45448OooO00o.setOnClickListener(oooO00o3);
        oooO0O0.f45450OooO0OO.setOnClickListener(oooO00o3);
        oooO0O0.f45449OooO0O0.setOnClickListener(oooO00o3);
        oooO0O0.f45451OooO0Oo.setOnClickListener(oooO00o3);
        oooO0O0.f45453OooO0o0.setOnClickListener(oooO00o3);
        oooO0O0.f45452OooO0o.setOnClickListener(oooO00o3);
        oooO0O0.f45454OooO0oO.setOnClickListener(oooO00o3);
        OooO0O0.ViewOnLongClickListenerC0412OooO0O0 viewOnLongClickListenerC0412OooO0O0 = oooO0O0.new ViewOnLongClickListenerC0412OooO0O0(postCommentSonModel);
        oooO0O0.f45449OooO0O0.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        oooO0O0.f45450OooO0OO.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        oooO0O0.f45451OooO0Oo.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        oooO0O0.f45453OooO0o0.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        oooO0O0.f45452OooO0o.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        oooO0O0.f45454OooO0oO.setOnLongClickListener(viewOnLongClickListenerC0412OooO0O0);
        int layoutPosition = oooO0o.getLayoutPosition() - getHeaderLayoutCount();
        if (getData().size() == 1) {
            oooO0O0.OooO00o(ViewLocation.other, postCommentSonModel);
        } else if (layoutPosition == 0) {
            oooO0O0.OooO00o(ViewLocation.top, postCommentSonModel);
        } else if (getData().size() - 1 == layoutPosition) {
            oooO0O0.OooO00o(ViewLocation.bottom, postCommentSonModel);
        } else {
            oooO0O0.OooO00o(ViewLocation.middle, postCommentSonModel);
        }
        TextView textView = (TextView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_praiseCount);
        PraiseView praiseView = (PraiseView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_praiseIv);
        textView.setText(o0O0O00.OooO0oO(postCommentSonModel.getPraiseNum(), false));
        praiseView.OooO0OO(postCommentSonModel.isPraise() && postCommentSonModel.getPraiseNum() > 0);
        if (!postCommentSonModel.isPraise() || postCommentSonModel.getPraiseNum() <= 0) {
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), R.color.color_54000000));
        } else {
            textView.setTextColor(o000O000.OooO00o.OooO0O0(getContext(), R.color.color_FE6C6C));
        }
        o0000OO0 o0000oo1 = new o0000OO0(this, postCommentSonModel, praiseView, oooO0o);
        praiseView.setOnClickListener(o0000oo1);
        textView.setOnClickListener(o0000oo1);
        boolean z = postCommentSonModel.isSendProp() && postCommentSonModel.getPropNum() > 0;
        TextView textView2 = (TextView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_rewardCount);
        final SVGAView sVGAView = (SVGAView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_reward_svga);
        final ImageView imageView = (ImageView) oooO0o.OooO0Oo(R.id.item_post_detail_comment_son_list_reward_iv);
        textView2.setText(o0O0O00.OooO0oO(postCommentSonModel.getPropNum(), false));
        if (z) {
            context = getContext();
            i = R.color.color_FFA16C;
        } else {
            context = getContext();
            i = R.color.color_666666;
        }
        textView2.setTextColor(o000O000.OooO00o.OooO0O0(context, i));
        imageView.setVisibility(0);
        imageView.setImageResource(R.drawable.icon_reward_gray);
        if (postCommentSonModel.isSendProp()) {
            imageView.setImageResource(R.drawable.icon_reward_red);
        }
        sVGAView.setVisibility(4);
        sVGAView.f21008Ooooo00 = new o0000(sVGAView, imageView, 1);
        sVGAView.f21009Ooooo0o = new Function0() { // from class: o0oOo0O.o0000oo
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SVGAView sVGAView2 = sVGAView;
                ImageView imageView2 = imageView;
                sVGAView2.setVisibility(0);
                imageView2.setVisibility(4);
                return null;
            }
        };
        o000O0o o000o0o2 = new o000O0o(this, postCommentSonModel, sVGAView, textView2);
        textView2.setOnClickListener(o000o0o2);
        sVGAView.setOnClickListener(o000o0o2);
        imageView.setOnClickListener(o000o0o2);
    }
}
