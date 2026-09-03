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
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0OOooO0;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentDetailListTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "position", "", "setData", "Lkotlin/Function1;", "OooO0o0", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MomentDetailListTitleView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OOooO0 f30583OooO0Oo;

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
        o0OOooO0 o0ooooo0 = this.f30583OooO0Oo;
        TextView textView = o0ooooo0.f44647OooO0O0;
        int i = o0OOO0o.color_333333_65;
        textView.setTextColor(o0000.OooO00o(i));
        o0ooooo0.f44650OooO0o.setTextColor(o0000.OooO00o(i));
        o0ooooo0.f44649OooO0Oo.setTextColor(o0000.OooO00o(i));
        ImageView commentLine = o0ooooo0.f44648OooO0OO;
        Intrinsics.checkNotNullExpressionValue(commentLine, "commentLine");
        o000O.OooO0O0(commentLine);
        ImageView likeLine = o0ooooo0.f44652OooO0oO;
        Intrinsics.checkNotNullExpressionValue(likeLine, "likeLine");
        o000O.OooO0O0(likeLine);
        ImageView giftLine = o0ooooo0.f44651OooO0o0;
        Intrinsics.checkNotNullExpressionValue(giftLine, "giftLine");
        o000O.OooO0O0(giftLine);
        if (position == 0) {
            o0ooooo0.f44647OooO0O0.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            ImageView commentLine2 = o0ooooo0.f44648OooO0OO;
            Intrinsics.checkNotNullExpressionValue(commentLine2, "commentLine");
            o000O.OooOOOO(commentLine2);
            return;
        }
        if (position == 1) {
            o0ooooo0.f44650OooO0o.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            ImageView likeLine2 = o0ooooo0.f44652OooO0oO;
            Intrinsics.checkNotNullExpressionValue(likeLine2, "likeLine");
            o000O.OooOOOO(likeLine2);
            return;
        }
        if (position != 2) {
            return;
        }
        o0ooooo0.f44649OooO0Oo.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
        ImageView giftLine2 = o0ooooo0.f44651OooO0o0;
        Intrinsics.checkNotNullExpressionValue(giftLine2, "giftLine");
        o000O.OooOOOO(giftLine2);
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
        o0OOooO0 o0ooooo0Inflate = o0OOooO0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0ooooo0Inflate, "inflate(...)");
        this.f30583OooO0Oo = o0ooooo0Inflate;
        TextView comment = o0ooooo0Inflate.f44647OooO0O0;
        Intrinsics.checkNotNullExpressionValue(comment, "comment");
        o000O.OooO(comment, new OooO00o());
        TextView like = o0ooooo0Inflate.f44650OooO0o;
        Intrinsics.checkNotNullExpressionValue(like, "like");
        o000O.OooO(like, new OooO0O0());
        TextView gift = o0ooooo0Inflate.f44649OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(gift, "gift");
        o000O.OooO(gift, new OooO0OO());
    }
}
