package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p641o0ooOOOO.x2;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentDetailListTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "position", "", "setData", "Lkotlin/Function1;", "OooO0o0", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MomentDetailListTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final x2 f31124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> itemListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailListTitleView momentDetailListTitleView = MomentDetailListTitleView.this;
            momentDetailListTitleView.setData(0);
            Function1<Integer, Unit> itemListener = momentDetailListTitleView.getItemListener();
            if (itemListener != null) {
                itemListener.invoke(0);
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
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailListTitleView momentDetailListTitleView = MomentDetailListTitleView.this;
            momentDetailListTitleView.setData(1);
            Function1<Integer, Unit> itemListener = momentDetailListTitleView.getItemListener();
            if (itemListener != null) {
                itemListener.invoke(1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailListTitleView momentDetailListTitleView = MomentDetailListTitleView.this;
            momentDetailListTitleView.setData(2);
            Function1<Integer, Unit> itemListener = momentDetailListTitleView.getItemListener();
            if (itemListener != null) {
                itemListener.invoke(2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailListTitleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<Integer, Unit> getItemListener() {
        return this.itemListener;
    }

    public final void setData(int position) {
        x2 x2Var = this.f31124OooO0Oo;
        TextView textView = x2Var.f59236OooO0O0;
        int i = oO00O0o.color_333333_65;
        textView.setTextColor(o0000.OooO00o(i));
        x2Var.f59239OooO0o.setTextColor(o0000.OooO00o(i));
        x2Var.f59238OooO0Oo.setTextColor(o0000.OooO00o(i));
        ImageView imageView = x2Var.f59237OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.commentLine");
        o000OO00.OooO0O0(imageView);
        ImageView imageView2 = x2Var.f59241OooO0oO;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.likeLine");
        o000OO00.OooO0O0(imageView2);
        ImageView imageView3 = x2Var.f59240OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.giftLine");
        o000OO00.OooO0O0(imageView3);
        if (position == 0) {
            x2Var.f59236OooO0O0.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
            ImageView imageView4 = x2Var.f59237OooO0OO;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.commentLine");
            o000OO00.OooOOOO(imageView4);
            return;
        }
        if (position == 1) {
            x2Var.f59239OooO0o.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
            ImageView imageView5 = x2Var.f59241OooO0oO;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.likeLine");
            o000OO00.OooOOOO(imageView5);
            return;
        }
        if (position != 2) {
            return;
        }
        x2Var.f59238OooO0Oo.setTextColor(o0000.OooO00o(oO00O0o.color_333333));
        ImageView imageView6 = x2Var.f59240OooO0o0;
        Intrinsics.checkNotNullExpressionValue(imageView6, "binding.giftLine");
        o000OO00.OooOOOO(imageView6);
    }

    public final void setItemListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.itemListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailListTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentDetailListTitleView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailListTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        x2 x2VarInflate = x2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(x2VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31124OooO0Oo = x2VarInflate;
        TextView textView = x2VarInflate.f59236OooO0O0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.comment");
        o000OO00.OooO(textView, new OooO00o());
        TextView textView2 = x2VarInflate.f59239OooO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.like");
        o000OO00.OooO(textView2, new OooO0O0());
        TextView textView3 = x2VarInflate.f59238OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.gift");
        o000OO00.OooO(textView3, new OooO0OO());
    }
}
