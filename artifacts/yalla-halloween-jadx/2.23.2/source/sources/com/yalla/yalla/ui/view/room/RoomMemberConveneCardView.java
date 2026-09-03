package com.yalla.yalla.ui.view.room;

import android.content.Context;
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
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.ui.view.room.RoomMemberConveneCardView;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.l3;
import p423o0OoO0OO.oOO00O;
import p429o0OoOO.o0Oo0oo;
import p562o0oOo000.o000000;
import p570o0oOoO.o00000OO;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomMemberConveneCardView;", "Landroid/widget/LinearLayout;", "Lo0Oo0OOO/l3;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0Oo0OOO/l3;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomMemberConveneCardView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f30780OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00000OO f30782OooO0o0;

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

    @SourceDebugExtension({"SMAP\nRoomMemberConveneCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneCardView.kt\ncom/yalla/yalla/ui/view/room/RoomMemberConveneCardView$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,99:1\n1#2:100\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            RoomMemberConveneCardView roomMemberConveneCardView = RoomMemberConveneCardView.this;
            o0000O00.OooO0O0("召集进入房间 \nroomData:'" + roomMemberConveneCardView.f30782OooO0o0 + "'");
            o0oo0000.OooO00o.OooO0O0("102208");
            o00000OO o00000oo2 = roomMemberConveneCardView.f30782OooO0o0;
            if (o00000oo2 != null) {
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO0o0(o00000oo2.f56416OooO00o, EnterRoomParentPage.RoomMemberConveneCard);
            }
            roomMemberConveneCardView.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<l3> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30785OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomMemberConveneCardView f30786OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, RoomMemberConveneCardView roomMemberConveneCardView) {
            super(0);
            this.f30785OooO0Oo = context;
            this.f30786OooO0o0 = roomMemberConveneCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final l3 invoke() {
            l3 l3VarInflate = l3.inflate(LayoutInflater.from(this.f30785OooO0Oo), this.f30786OooO0o0, true);
            Intrinsics.checkNotNullExpressionValue(l3VarInflate, "inflate(...)");
            return l3VarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final l3 getBinding() {
        return (l3) this.binding.getValue();
    }

    public final void OooO00o() {
        if (isShown()) {
            getBinding().f44121OooO0OO.clearAnimation();
            o000O.OooO0O0(this);
        }
    }

    public final void OooO0O0(@NotNull o00000OO cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        this.f30782OooO0o0 = cardData;
        cardData.f56421OooO0o0 = true;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
        oooO00o.OooO00o(d1.OooO0Oo());
        oooO00o.OooO0O0(1, -1);
        oooO00o.OooO0o0(8);
        oooO00o.f43126OooO0OO = cardData.f56417OooO0O0;
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO0Oo(getBinding().f44124OooO0o0);
        getBinding().f44125OooO0oO.setText(cardData.f56418OooO0OO);
        getBinding().f44123OooO0o.setText("");
        AppCompatTextView appCompatTextView = getBinding().f44123OooO0o;
        String strOooO00o = OooOOOO.OooO00o(o0000.OooO0OO(o000000.room_member_convene_card_info), ZegoConstants.ZegoVideoDataAuxPublishingStream);
        int i = p562o0oOo000.o0Oo0oo.ic_room_membe_convene_tips_message;
        Intrinsics.checkNotNullParameter(strOooO00o, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(strOooO00o + "<img src= \"" + i + "\" />", new oOO00O(), null);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        appCompatTextView.append(spannedFromHtml);
        getBinding().f44119OooO00o.postInvalidate();
        getBinding().f44119OooO00o.postDelayed(new Runnable() { // from class: o000OOo.o00O0O
            @Override // java.lang.Runnable
            public final void run() {
                RoomMemberConveneCardView this$0 = (RoomMemberConveneCardView) this;
                int i2 = RoomMemberConveneCardView.f30780OooO0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO00o();
            }
        }, 10000L);
        AppCompatTextView join = getBinding().f44121OooO0OO;
        Intrinsics.checkNotNullExpressionValue(join, "join");
        Intrinsics.checkNotNullParameter(join, "<this>");
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setDuration(Math.abs(300L));
        scaleAnimation.setRepeatCount(10);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setAnimationListener(null);
        join.setAnimation(scaleAnimation);
        o000O.OooOOOO(this);
        o0oo0000.OooO00o.OooO0O0("302010");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomMemberConveneCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO0OO(context, this));
        ImageView close = getBinding().f44120OooO0O0;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        o000O.OooO0oo(close, new OooO00o());
        ConstraintLayout layout = getBinding().f44122OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o000O.OooO0oo(layout, new OooO0O0());
    }
}
