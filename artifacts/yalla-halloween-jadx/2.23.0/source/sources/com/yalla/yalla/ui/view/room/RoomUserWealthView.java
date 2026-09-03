package com.yalla.yalla.ui.view.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p362o0OOo0O.OooOO0;
import p417o0OoO0.o000O0;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.yb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomUserWealthView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0ooOOOO/yb;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/yb;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomUserWealthView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    public static final class OooO00o extends Lambda implements Function0<yb> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f31336OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserWealthView f31337OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, RoomUserWealthView roomUserWealthView) {
            super(0);
            this.f31336OooO0Oo = context;
            this.f31337OooO0o0 = roomUserWealthView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yb invoke() {
            yb ybVarInflate = yb.inflate(LayoutInflater.from(this.f31336OooO0Oo), this.f31337OooO0o0, true);
            Intrinsics.checkNotNullExpressionValue(ybVarInflate, "inflate(LayoutInflater.from(context), this, true)");
            return ybVarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserWealthView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final yb getBinding() {
        return (yb) this.binding.getValue();
    }

    public final void OooO0O0(@Nullable MixedRoomActivity mixedRoomActivity, int i, @NotNull String wealthBg, @NotNull String wealthImg) {
        Intrinsics.checkNotNullParameter(wealthBg, "wealthBg");
        Intrinsics.checkNotNullParameter(wealthImg, "wealthImg");
        getBinding().f59416OooO0O0.setImageDrawable(null);
        getBinding().f59417OooO0OO.setImageDrawable(null);
        SVGAView sVGAView = getBinding().f59417OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svga");
        o000OO00.OooO0O0(sVGAView);
        o000OO00.OooO0O0(this);
        if (i >= 1) {
            o000OO00.OooOOOO(this);
            if (wealthImg.length() > 0) {
                SVGAView it = getBinding().f59417OooO0OO;
                it.clearAnimation();
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o000OO00.OooOOOO(it);
                it.OooOO0O(wealthImg, mixedRoomActivity);
                it.OooOO0o();
            } else {
                getBinding().f59417OooO0OO.setImageResource(oO00OOO.ic_gift_type_not_up_wealth);
            }
            getBinding().f59418OooO0Oo.setText(o0000O.OooO00o(o000O0.OooO0O0(oO00OOo0.wealth_lv_xxx, this), String.valueOf(i)));
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
            int i2 = oO00OOO.ic_profile_bg_default;
            oooO00o.f43923OooOOOo = i2;
            oooO00o.f43913OooO0o = i2;
            oooO00o.f43936OooOoo0 = 2;
            oooO00o.OooO0o0(7);
            oooO00o.f43911OooO0OO = wealthBg;
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(getBinding().f59416OooO0O0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserWealthView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomUserWealthView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserWealthView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
    }
}
