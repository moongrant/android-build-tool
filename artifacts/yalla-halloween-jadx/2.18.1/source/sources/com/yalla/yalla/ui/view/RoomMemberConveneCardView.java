package com.yalla.yalla.ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.ui.view.RoomMemberConveneCardView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p515o0o0O00.o00O00;
import p601o0oo00Oo.o0OO0o00;
import p606o0oo0O.OooOo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.dj;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomMemberConveneCardView;", "Landroid/widget/LinearLayout;", "Lo0ooOOoo/dj;", "Oooo0o", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOoo/dj;", "binding", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMemberConveneCardView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f25110Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o0OO0o00 f25112Oooo0oO;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            RoomMemberConveneCardView.this.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o00O00.OooO0O0("召集进入房间 \nroomData:'" + RoomMemberConveneCardView.this.f25112Oooo0oO + '\'');
            OooOo.OooO0O0("102208");
            o0OO0o00 o0oo0o01 = RoomMemberConveneCardView.this.f25112Oooo0oO;
            if (o0oo0o01 != null) {
                RoomStateManager.INSTANCE.enterRoom(o0oo0o01.f48204OooO00o, EnterRoomParentPage.RoomMemberConveneCard);
            }
            RoomMemberConveneCardView.this.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<dj> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f25115Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberConveneCardView f25116Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, RoomMemberConveneCardView roomMemberConveneCardView) {
            super(0);
            this.f25115Oooo0o = context;
            this.f25116Oooo0oO = roomMemberConveneCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dj invoke() {
            dj djVarInflate = dj.inflate(LayoutInflater.from(this.f25115Oooo0o), this.f25116Oooo0oO, true);
            Intrinsics.checkNotNullExpressionValue(djVarInflate, "inflate(LayoutInflater.from(context), this, true)");
            return djVarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final dj getBinding() {
        return (dj) this.binding.getValue();
    }

    public final void OooO00o() {
        if (isShown()) {
            getBinding().f49204OooO0OO.clearAnimation();
            oOO00O.OooO00o(this);
        }
    }

    public final void OooO0O0(@NotNull o0OO0o00 cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        this.f25112Oooo0oO = cardData;
        cardData.f48209OooO0o0 = true;
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        int iOooO00o = OooOo00.OooO00o(1);
        int iOooO00o2 = OooOo00.OooO00o(8);
        oooO00o.f48434OooO0oo = null;
        oooO00o.f48430OooO0Oo = false;
        oooO00o.f48441OooOOOo = R.drawable.icon_picture_default;
        oooO00o.f48444OooOOoo = 2;
        oooO00o.f48431OooO0o = R.drawable.icon_picture_default;
        oooO00o.f48435OooOO0 = null;
        oooO00o.f48438OooOOO = -1;
        oooO00o.f48440OooOOOO = -1;
        oooO00o.f48454OooOoo0 = 2;
        oooO00o.f48453OooOoo = 0;
        oooO00o.f48447OooOo00 = 0;
        oooO00o.f48446OooOo0 = false;
        oooO00o.f48448OooOo0O = false;
        oooO00o.f48449OooOo0o = iOooO00o2;
        oooO00o.f48445OooOo = 0;
        oooO00o.f48451OooOoO0 = 0;
        oooO00o.f48450OooOoO = 0;
        oooO00o.f48452OooOoOO = 0;
        oooO00o.f48455OooOooO = iOooO00o;
        oooO00o.f48456OooOooo = -1;
        oooO00o.f48458Oooo00O = true;
        oooO00o.f48439OooOOO0 = false;
        oooO00o.f48429OooO0OO = cardData.f48205OooO0O0;
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(getBinding().f49207OooO0o0);
        getBinding().f49208OooO0oO.setText(cardData.f48206OooO0OO);
        getBinding().f49206OooO0o.setText("");
        AppCompatTextView appCompatTextView = getBinding().f49206OooO0o;
        String str = o000O0O0.OooO0OO(R.string.room_member_convene_card_info) + ' ';
        Intrinsics.checkNotNullParameter(str, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(str + "<img src= \"" + R.drawable.ic_room_membe_convene_tips_message + "\" />", new Html.ImageGetter() { // from class: o0o0O0o.oo00o
            @Override // android.text.Html.ImageGetter
            public final Drawable getDrawable(String source) {
                try {
                    Intrinsics.checkNotNullExpressionValue(source, "source");
                    Drawable drawableOooO0O0 = OooOOO.OooO0O0(Integer.parseInt(source));
                    drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getIntrinsicWidth(), drawableOooO0O0.getIntrinsicHeight());
                    return drawableOooO0O0;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }, null);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(textContent, { …ll\n        }\n    }, null)");
        appCompatTextView.append(spannedFromHtml);
        getBinding().f49202OooO00o.postInvalidate();
        getBinding().f49202OooO00o.postDelayed(new Runnable() { // from class: o0oo00Oo.o0OO0o
            @Override // java.lang.Runnable
            public final void run() {
                RoomMemberConveneCardView this$0 = this.f48203Oooo0o;
                int i = RoomMemberConveneCardView.f25110Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o();
            }
        }, 10000L);
        AppCompatTextView appCompatTextView2 = getBinding().f49204OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.join");
        Intrinsics.checkNotNullParameter(appCompatTextView2, "<this>");
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setDuration(Math.abs(300L));
        scaleAnimation.setRepeatCount(10);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setAnimationListener(null);
        appCompatTextView2.setAnimation(scaleAnimation);
        oOO00O.OooO(this);
        OooOo.OooO0O0("302010");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO0OO(context, this));
        ImageView imageView = getBinding().f49203OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        ConstraintLayout constraintLayout = getBinding().f49205OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layout");
        o00O0O.OooO0Oo(constraintLayout, new OooO0O0());
    }
}
