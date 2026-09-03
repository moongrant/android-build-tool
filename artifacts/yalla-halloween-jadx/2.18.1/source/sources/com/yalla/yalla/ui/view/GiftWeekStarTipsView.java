package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.GiftPropTypeUser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.yi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftWeekStarTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Oooo0o", "I", "getType", "()I", "setType", "(I)V", "type", "Lkotlin/Function0;", "", "Oooo0oO", "Lkotlin/jvm/functions/Function0;", "getRootClickListener", "()Lkotlin/jvm/functions/Function0;", "setRootClickListener", "(Lkotlin/jvm/functions/Function0;)V", "rootClickListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftWeekStarTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> rootClickListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            Function0<Unit> rootClickListener = GiftWeekStarTipsView.this.getRootClickListener();
            if (rootClickListener != null) {
                rootClickListener.invoke();
            }
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
            Function0<Unit> rootClickListener = GiftWeekStarTipsView.this.getRootClickListener();
            if (rootClickListener != null) {
                rootClickListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function0<Unit> getRootClickListener() {
        return this.rootClickListener;
    }

    public final int getType() {
        return this.type;
    }

    public final void setRootClickListener(@Nullable Function0<Unit> function0) {
        this.rootClickListener = function0;
    }

    public final void setType(int i) {
        this.type = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWeekStarTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        yi yiVarInflate = yi.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(yiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.type = GiftPropTypeUser.Hot.getValue();
        ImageView imageView = yiVarInflate.f51052OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.weeklyGiftsStar");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        TextView textView = yiVarInflate.f51051OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.weeklyGifts");
        o00O0O.OooO0Oo(textView, new OooO0O0());
    }
}
