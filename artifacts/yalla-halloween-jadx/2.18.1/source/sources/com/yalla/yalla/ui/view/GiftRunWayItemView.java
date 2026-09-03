package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.GiftAnimationModel;
import com.app.base.model.LuckyInstancesModel;
import com.google.android.gms.common.ConnectionResult;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p557o0oOOoOo.oO00O0o0;
import p601o0oo00Oo.oOO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ui;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftRunWayItemView;", "Landroid/widget/LinearLayout;", "", "string", "", "setText", "Lo0oOOoOo/oO00O0o0;", "roomGiftAnimation", "setRoomGiftAnimation", "Lcom/app/base/model/GiftAnimationModel;", "giftAnimationModel", "setData", "Landroid/text/Spanned;", "htmlStr", "mRoomGiftAnimation", "Lo0oOOoOo/oO00O0o0;", "getMRoomGiftAnimation", "()Lo0oOOoOo/oO00O0o0;", "setMRoomGiftAnimation", "(Lo0oOOoOo/oO00O0o0;)V", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftRunWayItemView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f24804Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ui f24805Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public oO00O0o0 f24806Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public GiftAnimationModel f24807Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f24808OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f24809OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f24810OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final OooO00o f24811OoooO0O;

    @SuppressLint({"HandlerLeak"})
    public static final class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == GiftRunWayItemView.this.f24804Oooo) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj).longValue();
                GiftRunWayItemView giftRunWayItemView = GiftRunWayItemView.this;
                if (giftRunWayItemView.f24809OoooO0 == jLongValue) {
                    TextView textView = giftRunWayItemView.f24805Oooo0o.f50759OooO0oO;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContentTips");
                    o00O0O.OooO00o(textView);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayItemView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void clearAnimation() {
        if (this.f24806Oooo0oO != null) {
            this.f24805Oooo0o.f50758OooO0o0.clearAnimation();
        }
        this.f24805Oooo0o.f50757OooO0o.clearAnimation();
    }

    @Nullable
    /* JADX INFO: renamed from: getMRoomGiftAnimation, reason: from getter */
    public final oO00O0o0 getF24806Oooo0oO() {
        return this.f24806Oooo0oO;
    }

    public final void setData(@Nullable GiftAnimationModel giftAnimationModel) {
        this.f24807Oooo0oo = giftAnimationModel;
        this.f24805Oooo0o.f50758OooO0o0.setBackground(null);
        this.f24805Oooo0o.f50754OooO0O0.setImageDrawable(null);
        this.f24805Oooo0o.f50760OooO0oo.setText("");
        this.f24805Oooo0o.f50752OooO.setText("");
        this.f24805Oooo0o.f50755OooO0OO.setImageDrawable(null);
        this.f24805Oooo0o.f50752OooO.setTextColor(OooOOO.OooO00o(R.color.color_FAE976));
        TextView textView = this.f24805Oooo0o.f50759OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContentTips");
        o00O0O.OooO00o(textView);
        LinearLayout linearLayout = this.f24805Oooo0o.f50753OooO00o;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.root");
        o00O0O.OooO00o(linearLayout);
        GiftAnimationModel giftAnimationModel2 = this.f24807Oooo0oo;
        if (giftAnimationModel2 != null) {
            LinearLayout linearLayout2 = this.f24805Oooo0o.f50753OooO00o;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.root");
            o00O0O.OooO(linearLayout2);
            GiftRunWayNumberView giftRunWayNumberView = this.f24805Oooo0o.f50757OooO0o;
            Intrinsics.checkNotNullExpressionValue(giftRunWayNumberView, "binding.layoutCount");
            o00O0O.OooO(giftRunWayNumberView);
            oO00O0o0 oo00o0o0 = this.f24806Oooo0oO;
            if (oo00o0o0 != null) {
                LinearLayout linearLayout3 = this.f24805Oooo0o.f50758OooO0o0;
                Intrinsics.checkNotNull(oo00o0o0);
                linearLayout3.startAnimation(oo00o0o0.f44672OooO0O0);
            }
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(giftAnimationModel2.giftUrl);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f24805Oooo0o.f50755OooO0OO);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(giftAnimationModel2.fromUserHead, OooOo00.OooO00o(38), true);
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o(this.f24805Oooo0o.f50754OooO0O0);
            p520o0o0O0O0.o00O0O o00o0o2 = p520o0o0O0O0.o00O0O.f42677OooO00o;
            String str = giftAnimationModel2.fromUserId;
            Intrinsics.checkNotNullExpressionValue(str, "it.fromUserId");
            long j = Long.parseLong(str);
            String str2 = giftAnimationModel2.fromUserName;
            Intrinsics.checkNotNullExpressionValue(str2, "it.fromUserName");
            this.f24805Oooo0o.f50760OooO0oo.setText(o00o0o2.OooO0O0(j, str2));
            Long l = giftAnimationModel2.toUserId;
            Intrinsics.checkNotNullExpressionValue(l, "it.toUserId");
            long jLongValue = l.longValue();
            String str3 = giftAnimationModel2.toUserName;
            Intrinsics.checkNotNullExpressionValue(str3, "it.toUserName");
            this.f24805Oooo0o.f50752OooO.setText(o00o0o2.OooO0O0(jLongValue, str3));
            this.f24805Oooo0o.f50752OooO.setTextColor(OooOOO.OooO00o(R.color.color_FAE976));
            int i = giftAnimationModel2.type;
            if (i == 7) {
                this.f24805Oooo0o.f50756OooO0Oo.setImageResource(R.drawable.icon_send_all_run_gift_bg);
            } else if (i != 8) {
                this.f24805Oooo0o.f50756OooO0Oo.setImageResource(R.drawable.bg_round_tr85);
            } else {
                this.f24805Oooo0o.f50756OooO0Oo.setImageResource(R.drawable.icon_send_all_run_gift_bg2);
            }
        }
    }

    public final void setMRoomGiftAnimation(@Nullable oO00O0o0 oo00o0o0) {
        this.f24806Oooo0oO = oo00o0o0;
    }

    public final void setRoomGiftAnimation(@Nullable oO00O0o0 roomGiftAnimation) {
        this.f24806Oooo0oO = roomGiftAnimation;
    }

    public final void setText(@Nullable Spanned htmlStr) {
        if (htmlStr != null) {
            setText(htmlStr.toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setText(String string) {
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f24805Oooo0o.f50757OooO0o.removeAllViews();
        this.f24805Oooo0o.f50757OooO0o.setNumber(string);
        oO00O0o0 oo00o0o0 = this.f24806Oooo0oO;
        if (oo00o0o0 != null) {
            GiftRunWayNumberView giftRunWayNumberView = this.f24805Oooo0o.f50757OooO0o;
            Intrinsics.checkNotNull(oo00o0o0);
            giftRunWayNumberView.startAnimation(oo00o0o0.f44674OooO0Oo);
        }
        try {
            Integer showNumber = Integer.valueOf(string);
            GiftAnimationModel giftAnimationModel = this.f24807Oooo0oo;
            if (giftAnimationModel == null || !giftAnimationModel.isLuckyflag() || com.yalla.support.common.util.OooO0OO.OooO00o(giftAnimationModel.luckyinstances)) {
                return;
            }
            int size = giftAnimationModel.luckyinstances.size();
            int i = this.f24810OoooO00;
            if (size <= i || giftAnimationModel.luckyinstances.get(i) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(showNumber, "showNumber");
            if (showNumber.intValue() >= giftAnimationModel.luckyinstances.get(this.f24810OoooO00).getLnumtime()) {
                LuckyInstancesModel luckyInstancesModel = giftAnimationModel.luckyinstances.get(this.f24810OoooO00);
                String strOooO00o = OooOo.OooO00o(OooOo.OooO00o(OooOOO.OooO0OO(R.string.lucky_gift_runway_tips), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLmultiple() + "</b></font> "), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLreward() + "</b></font> ");
                this.f24805Oooo0o.f50752OooO.setTextColor(OooOOO.OooO00o(R.color.white));
                ImageView imageView = this.f24805Oooo0o.f50756OooO0Oo;
                if (imageView != null && !this.f24808OoooO) {
                    this.f24808OoooO = true;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(200);
                    imageView.startAnimation(alphaAnimation);
                    alphaAnimation.setAnimationListener(new oOO00O(imageView));
                }
                TextView textView = this.f24805Oooo0o.f50759OooO0oO;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContentTips");
                o00O0O.OooO(textView);
                this.f24805Oooo0o.f50759OooO0oO.setText(Html.fromHtml(strOooO00o));
                this.f24810OoooO00++;
                this.f24809OoooO0++;
                Message message = new Message();
                message.what = this.f24804Oooo;
                message.obj = Long.valueOf(this.f24809OoooO0);
                this.f24811OoooO0O.sendMessageDelayed(message, this.f24804Oooo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ui uiVarInflate = ui.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24805Oooo0o = uiVarInflate;
        this.f24804Oooo = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f24809OoooO0 = -1L;
        this.f24811OoooO0O = new OooO00o();
    }
}
