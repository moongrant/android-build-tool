package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p413o0Oo0o0o.o0O00oO0;
import p562o0oOo000.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "number", "", "setData", "drawable", "setDataRes", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "OooO0o0", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "getSize", "()Lcom/yalla/yalla/ui/view/NumberSize$Size;", "setSize", "(Lcom/yalla/yalla/ui/view/NumberSize$Size;)V", "size", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class NumberView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE, to = 9)
    public int f29960OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NumberSize.Size size;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0OO() {
        int i;
        int i2 = this.f29960OooO0Oo;
        if (i2 < 0) {
            setVisibility(8);
            invalidate();
            return;
        }
        int i3 = NumberSize.f29958OooO00o;
        NumberSize.Size size = this.size;
        switch (size == null ? -1 : NumberSize.OooO00o.$EnumSwitchMapping$0[size.ordinal()]) {
            case 1:
                i = o0O00oO0.f46388OooO0o0[i2];
                break;
            case 2:
                i = o0O00oO0.f46387OooO0o[i2];
                break;
            case 3:
                i = o0O00oO0.f46389OooO0oO[i2];
                break;
            case 4:
                i = o0O00oO0.f46390OooO0oo[i2];
                break;
            case 5:
                i = o0O00oO0.f46382OooO[i2];
                break;
            case 6:
                i = o0O00oO0.f46386OooO0Oo[i2];
                break;
            default:
                i = o0O00oO0.f46387OooO0o[i2];
                break;
        }
        setDataRes(i);
    }

    @NotNull
    public final NumberSize.Size getSize() {
        return this.size;
    }

    public final void setData(@IntRange(from = ULong.MIN_VALUE, to = 9) int number) {
        this.f29960OooO0Oo = number;
        OooO0OO();
    }

    public final void setDataRes(@DrawableRes int drawable) {
        setVisibility(0);
        setImageResource(drawable);
        invalidate();
    }

    public final void setSize(@NotNull NumberSize.Size size) {
        Intrinsics.checkNotNullParameter(size, "<set-?>");
        this.size = size;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NumberView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.size = NumberSize.Size.H;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o00000.NumberView);
        int integer = typedArrayObtainStyledAttributes.getInteger(o00000.NumberView_numItemSize, 2);
        int i2 = NumberSize.f29958OooO00o;
        this.size = NumberSize.OooO00o(Integer.valueOf(integer));
        this.f29960OooO0Oo = typedArrayObtainStyledAttributes.getInteger(o00000.NumberView_numItemData, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO();
    }
}
