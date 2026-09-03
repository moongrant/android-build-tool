package com.yalla.yalla.ui.view.moment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0OO0O0;
import p423o0OoO0OO.o00O0OOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentDetailLikeHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "count", "", "setCount", "", "selectType", "setData", "Lkotlin/Function1;", "OooO0o0", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MomentDetailLikeHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f30580OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f30581OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> itemListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailLikeHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<Integer, Unit> getItemListener() {
        return this.itemListener;
    }

    public final void setCount(long count) {
        this.f30580OooO0Oo.f44594OooO0O0.setText(o0000O.OooO00o(o00O0OOO.OooO0O0(o000000.XXX_likes, this), o0O0O0Oo.OooO0o(count, false)));
    }

    public final void setData(int selectType) {
        this.f30581OooO0o = selectType;
        o0OO0O0 o0oo0o1 = this.f30580OooO0Oo;
        TextView textView = o0oo0o1.f44596OooO0Oo;
        int i = o0OOO0o.color_333333_65;
        textView.setTextColor(o0000.OooO00o(i));
        int i2 = o0Oo0oo.bg_tr00_r360;
        o0oo0o1.f44596OooO0Oo.setBackgroundResource(i2);
        int iOooO00o = o0000.OooO00o(i);
        TextView textView2 = o0oo0o1.f44595OooO0OO;
        textView2.setTextColor(iOooO00o);
        textView2.setBackgroundResource(i2);
        int i3 = this.f30581OooO0o;
        if (i3 == -1) {
            LinearLayoutCompat switchLayout = o0oo0o1.f44597OooO0o0;
            Intrinsics.checkNotNullExpressionValue(switchLayout, "switchLayout");
            o000O.OooO0O0(switchLayout);
        } else {
            if (i3 == 0) {
                LinearLayoutCompat switchLayout2 = o0oo0o1.f44597OooO0o0;
                Intrinsics.checkNotNullExpressionValue(switchLayout2, "switchLayout");
                o000O.OooOOOO(switchLayout2);
                o0oo0o1.f44595OooO0OO.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
                o0oo0o1.f44595OooO0OO.setBackgroundResource(o0Oo0oo.bg_ffffffff_r360);
                return;
            }
            if (i3 != 1) {
                return;
            }
            LinearLayoutCompat switchLayout3 = o0oo0o1.f44597OooO0o0;
            Intrinsics.checkNotNullExpressionValue(switchLayout3, "switchLayout");
            o000O.OooOOOO(switchLayout3);
            o0oo0o1.f44596OooO0Oo.setTextColor(o0000.OooO00o(o0OOO0o.color_333333));
            o0oo0o1.f44596OooO0Oo.setBackgroundResource(o0Oo0oo.bg_ffffffff_r360);
        }
    }

    public final void setItemListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.itemListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailLikeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentDetailLikeHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailLikeHeaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        o0OO0O0 o0oo0o0Inflate = o0OO0O0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo0o0Inflate, "inflate(...)");
        this.f30580OooO0Oo = o0oo0o0Inflate;
        LinearLayoutCompat switchLayout = o0oo0o0Inflate.f44597OooO0o0;
        Intrinsics.checkNotNullExpressionValue(switchLayout, "switchLayout");
        o000O.OooO0O0(switchLayout);
        setCount(0L);
        this.f30581OooO0o = -1;
    }
}
