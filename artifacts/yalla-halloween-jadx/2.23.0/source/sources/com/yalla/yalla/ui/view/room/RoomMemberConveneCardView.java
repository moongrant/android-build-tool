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
import com.code.android.util.o000OO00;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
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
import o000O0O0.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p417o0OoO0.o0000O0;
import p427o0OoOO00.o0OOO0o;
import p543o0oO0O00.OooO;
import p557o0oOo.OooOo00;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.wb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomMemberConveneCardView;", "Landroid/widget/LinearLayout;", "Lo0ooOOOO/wb;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/wb;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomMemberConveneCardView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f31321OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOo00 f31323OooO0o0;

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
            OooOOO0.OooO0O0("召集进入房间 \nroomData:'" + roomMemberConveneCardView.f31323OooO0o0 + "'");
            o0OO000.OooO00o("102208");
            OooOo00 oooOo00 = roomMemberConveneCardView.f31323OooO0o0;
            if (oooOo00 != null) {
                MutableState mutableState = o0OOO0o.f45698OooO00o;
                o0OOO0o.OooO0o0(oooOo00.f56168OooO00o, EnterRoomParentPage.RoomMemberConveneCard);
            }
            roomMemberConveneCardView.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<wb> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f31326OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomMemberConveneCardView f31327OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, RoomMemberConveneCardView roomMemberConveneCardView) {
            super(0);
            this.f31326OooO0Oo = context;
            this.f31327OooO0o0 = roomMemberConveneCardView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final wb invoke() {
            wb wbVarInflate = wb.inflate(LayoutInflater.from(this.f31326OooO0Oo), this.f31327OooO0o0, true);
            Intrinsics.checkNotNullExpressionValue(wbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
            return wbVarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomMemberConveneCardView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final wb getBinding() {
        return (wb) this.binding.getValue();
    }

    public final void OooO00o() {
        if (isShown()) {
            getBinding().f59213OooO0OO.clearAnimation();
            o000OO00.OooO0O0(this);
        }
    }

    public final void OooO0O0(@NotNull OooOo00 cardData) {
        Intrinsics.checkNotNullParameter(cardData, "cardData");
        this.f31323OooO0o0 = cardData;
        cardData.f56173OooO0o0 = true;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
        oooO00o.OooO00o(OooO.OooO0Oo());
        oooO00o.OooO0O0(1, -1);
        oooO00o.OooO0o0(8);
        oooO00o.f43911OooO0OO = cardData.f56169OooO0O0;
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(getBinding().f59216OooO0o0);
        getBinding().f59217OooO0oO.setText(cardData.f56170OooO0OO);
        getBinding().f59215OooO0o.setText("");
        AppCompatTextView appCompatTextView = getBinding().f59215OooO0o;
        String strOooO00o = OooOOOO.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_card_info), ZegoConstants.ZegoVideoDataAuxPublishingStream);
        int i = oOo00OO0.ic_room_membe_convene_tips_message;
        Intrinsics.checkNotNullParameter(strOooO00o, "<this>");
        Spanned spannedFromHtml = Html.fromHtml(strOooO00o + "<img src= \"" + i + "\" />", new o0000O0(), null);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(textContent, { …ll\n        }\n    }, null)");
        appCompatTextView.append(spannedFromHtml);
        getBinding().f59211OooO00o.postInvalidate();
        getBinding().f59211OooO00o.postDelayed(new o00Oo0(this, 2), 10000L);
        AppCompatTextView appCompatTextView2 = getBinding().f59213OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.join");
        Intrinsics.checkNotNullParameter(appCompatTextView2, "<this>");
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.75f, 1.0f, 0.75f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new AccelerateInterpolator());
        scaleAnimation.setDuration(Math.abs(300L));
        scaleAnimation.setRepeatCount(10);
        scaleAnimation.setRepeatMode(2);
        scaleAnimation.setAnimationListener(null);
        appCompatTextView2.setAnimation(scaleAnimation);
        o000OO00.OooOOOO(this);
        o0OO000.OooO00o("302010");
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
        ImageView imageView = getBinding().f59212OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.close");
        o000OO00.OooO0oo(imageView, new OooO00o());
        ConstraintLayout constraintLayout = getBinding().f59214OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layout");
        o000OO00.OooO0oo(constraintLayout, new OooO0O0());
    }
}
