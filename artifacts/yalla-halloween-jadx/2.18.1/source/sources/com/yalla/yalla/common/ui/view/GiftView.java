package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.GiftPropTypeUser;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p649o0ooOOoo.n9;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*B\u001b\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b)\u0010-B#\b\u0016\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020\u000e¢\u0006\u0004\b)\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001b¨\u00060"}, d2 = {"Lcom/yalla/yalla/common/ui/view/GiftView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "selected", "", "setSelectedGift", "Lcom/yalla/yalla/model/GiftPropModel;", "getData", "Lo0ooOOoo/n9;", "Oooo0o", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOoo/n9;", "binding", "", "Oooo0oO", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "Oooo0oo", "Z", "getShowFullSite", "()Z", "setShowFullSite", "(Z)V", "showFullSite", "Landroidx/lifecycle/LifecycleOwner;", "OoooO0O", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "lifecycleOwner", "isInRoom", "setInRoom", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public String f20940Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    public boolean showFullSite;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f20944OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public String f20945OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public LifecycleOwner lifecycleOwner;

    public static final class OooO00o extends Lambda implements Function0<n9> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final n9 invoke() {
            n9 n9VarInflate = n9.inflate(LayoutInflater.from(GiftView.this.getContext()), GiftView.this, true);
            Intrinsics.checkNotNullExpressionValue(n9VarInflate, "inflate(\n            Lay…           true\n        )");
            return n9VarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final n9 getBinding() {
        return (n9) this.binding.getValue();
    }

    public final void OooO0O0(@Nullable GiftPropModel giftPropModel, int i, @NotNull GiftPropTypeShow showIn) {
        Intrinsics.checkNotNullParameter(showIn, "showIn");
        this.f20944OoooO0 = giftPropModel;
        if (giftPropModel == null) {
            View view = getBinding().f50080OooO0o;
            Intrinsics.checkNotNullExpressionValue(view, "binding.selectBg");
            o00O0O.OooO0O0(view);
            getBinding().f50078OooO0OO.setImageDrawable(null);
            getBinding().f50078OooO0OO.OooO0Oo();
            getBinding().f50078OooO0OO.clearAnimation();
            getBinding().f50077OooO0O0.setImageDrawable(null);
            getBinding().f50081OooO0o0.setText("");
            getBinding().f50079OooO0Oo.setImageDrawable(null);
            return;
        }
        this.f20945OoooO00 = StringsKt.trim((CharSequence) giftPropModel.getImageUrl()).toString();
        if (giftPropModel.isAllSiteGift()) {
            this.f20940Oooo = OooO.OooO00o(new StringBuilder(), (String) StringsKt__StringsKt.split$default(giftPropModel.getImageUrl(), new String[]{".png"}, false, 0, 6, (Object) null).get(0), ".svga");
        }
        SVGAView sVGAView = getBinding().f50078OooO0OO;
        sVGAView.f21010OooooO0 = R.drawable.icon_gift_default_gray;
        sVGAView.OooO0oo(this.f20945OoooO00, null);
        getBinding().f50081OooO0o0.setText(com.yalla.support.common.util.OooO.OooO0oo(Integer.valueOf(giftPropModel.getPrice()), ""));
        if (giftPropModel.isCoin()) {
            getBinding().f50081OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.color_coin));
            getBinding().f50077OooO0O0.setImageResource(R.drawable.coin_little);
        } else {
            getBinding().f50077OooO0O0.setImageResource(R.drawable.icon_crystal_main_slide);
            getBinding().f50081OooO0o0.setTextColor(o000O0O0.OooO00o(R.color.color_crystal));
        }
        getBinding().f50079OooO0Oo.setImageDrawable(null);
        ImageView imageView = getBinding().f50079OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGiftTag");
        o00O0O.OooO00o(imageView);
        TextView textView = getBinding().f50082OooO0oO;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvGiftTag");
        o00O0O.OooO00o(textView);
        if (i == GiftPropTypeUser.Premium.getValue()) {
            ImageView imageView2 = getBinding().f50079OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivGiftTag");
            oOO00O.OooO(imageView2);
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_nobillity);
            return;
        }
        if (i == GiftPropTypeUser.Vip.getValue()) {
            ImageView imageView3 = getBinding().f50079OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.ivGiftTag");
            oOO00O.OooO(imageView3);
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_vip);
            return;
        }
        if (i == GiftPropTypeUser.Member.getValue()) {
            if (giftPropModel.getSendLvLimit() > 0) {
                TextView textView2 = getBinding().f50082OooO0oO;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvGiftTag");
                oOO00O.OooO(textView2);
                getBinding().f50082OooO0oO.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.LV_XXX), String.valueOf(giftPropModel.getSendLvLimit())));
                getBinding().f50082OooO0oO.setBackgroundResource(R.drawable.bg_round_gift_member_tag_h13);
                return;
            }
            return;
        }
        ImageView imageView4 = getBinding().f50079OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivGiftTag");
        oOO00O.OooO(imageView4);
        if (giftPropModel.getIsSoundEffect()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_sound_effect);
            if (showIn != GiftPropTypeShow.InRoom) {
                ImageView imageView5 = getBinding().f50079OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(imageView5, "binding.ivGiftTag");
                o00O0O.OooO00o(imageView5);
                return;
            }
            return;
        }
        if (giftPropModel.getIsDyEffect()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_dy_effect);
            return;
        }
        if (giftPropModel.isAllSiteGift()) {
            if (this.showFullSite) {
                getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_diamond);
            }
            if (showIn != GiftPropTypeShow.InRoom) {
                ImageView imageView6 = getBinding().f50079OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(imageView6, "binding.ivGiftTag");
                o00O0O.OooO00o(imageView6);
                return;
            }
            return;
        }
        if (giftPropModel.getIsWeek()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_week);
            return;
        }
        if (giftPropModel.getIsLuck()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_luck);
            return;
        }
        if (giftPropModel.isBlind()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_blind);
        } else if (giftPropModel.isCustomMade()) {
            getBinding().f50079OooO0Oo.setImageResource(R.mipmap.ic_gift_tag_custom_made);
        } else if (giftPropModel.getIsHot()) {
            getBinding().f50079OooO0Oo.setImageResource(R.drawable.ic_gift_tag_activity);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getData, reason: from getter */
    public final GiftPropModel getF20944OoooO0() {
        return this.f20944OoooO0;
    }

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final int getPosition() {
        return this.position;
    }

    public final boolean getShowFullSite() {
        return this.showFullSite;
    }

    public final void setInRoom(boolean z) {
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setSelectedGift(boolean selected) {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null) {
            if (!selected) {
                View view = getBinding().f50080OooO0o;
                Intrinsics.checkNotNullExpressionValue(view, "binding.selectBg");
                o00O0O.OooO0O0(view);
                if (StringsKt.isBlank(this.f20940Oooo)) {
                    getBinding().f50078OooO0OO.clearAnimation();
                    return;
                } else {
                    getBinding().f50078OooO0OO.OooO0oo(this.f20945OoooO00, lifecycleOwner);
                    return;
                }
            }
            View view2 = getBinding().f50080OooO0o;
            Intrinsics.checkNotNullExpressionValue(view2, "binding.selectBg");
            oOO00O.OooO(view2);
            if (!StringsKt.isBlank(this.f20940Oooo)) {
                getBinding().f50078OooO0OO.clearAnimation();
                getBinding().f50078OooO0OO.OooO0oo(this.f20940Oooo, lifecycleOwner);
                getBinding().f50078OooO0OO.OooO();
            } else {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(300L);
                scaleAnimation.setRepeatMode(2);
                scaleAnimation.setRepeatCount(Integer.MAX_VALUE);
                scaleAnimation.setInterpolator(new AccelerateInterpolator());
                getBinding().f50078OooO0OO.startAnimation(scaleAnimation);
            }
        }
    }

    public final void setShowFullSite(boolean z) {
        this.showFullSite = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o());
        this.position = -1;
        this.showFullSite = true;
        this.f20940Oooo = "";
        this.f20945OoooO00 = "";
    }
}
