package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.marquee.MarqueeText;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.pb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR?\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftTypeNotUpTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "OooO0o0", "I", "getTypeUser", "()I", "setTypeUser", "(I)V", "typeUser", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "type", "", "OooO0o", "Lkotlin/jvm/functions/Function1;", "getViewListener", "()Lkotlin/jvm/functions/Function1;", "setViewListener", "(Lkotlin/jvm/functions/Function1;)V", "viewListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GiftTypeNotUpTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final pb f31039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> viewListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public int typeUser;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            Integer num;
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            GiftTypeNotUpTipsView giftTypeNotUpTipsView = GiftTypeNotUpTipsView.this;
            int typeUser = giftTypeNotUpTipsView.getTypeUser();
            if (typeUser == GiftPropTypeUser.Member.getValue()) {
                num = 1;
            } else if (typeUser == GiftPropTypeUser.Premium.getValue()) {
                num = 2;
            } else if (typeUser == GiftPropTypeUser.Vip.getValue()) {
                num = 3;
            } else {
                GiftPropTypeUser.Wealth.getValue();
                num = null;
            }
            if (num != null) {
                o0OO000.OooO0O0("102213", MapsKt.hashMapOf(new Pair("target", Integer.valueOf(num.intValue()))));
            }
            Function1<Integer, Unit> viewListener = giftTypeNotUpTipsView.getViewListener();
            if (viewListener != null) {
                viewListener.invoke(Integer.valueOf(giftTypeNotUpTipsView.getTypeUser()));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final int getTypeUser() {
        return this.typeUser;
    }

    @Nullable
    public final Function1<Integer, Unit> getViewListener() {
        return this.viewListener;
    }

    public final void setTypeUser(int i) {
        this.typeUser = i;
    }

    public final void setViewListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.viewListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftTypeNotUpTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftTypeNotUpTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        pb pbVarInflate = pb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(pbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31039OooO0Oo = pbVarInflate;
        this.typeUser = GiftPropTypeUser.Hot.getValue();
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = o000O0.f10354OooO00o;
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        o000O0.f10354OooO00o = context;
        ConstraintLayout constraintLayout = pbVarInflate.f58629OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        o000OO00.OooO0oo(constraintLayout, new OooO00o());
        MarqueeText marqueeText = pbVarInflate.f58628OooO;
        Intrinsics.checkNotNullExpressionValue(marqueeText, "binding.tvInfo");
        MarqueeText.OooOO0o(marqueeText);
    }
}
