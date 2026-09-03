package com.yalla.yalla.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p447o0OoOo0O.o0O0OOOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/NumberView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "number", "", "setData", "drawable", "setDataRes", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "OoooO", "Lcom/yalla/yalla/ui/view/NumberSize$Size;", "getSize", "()Lcom/yalla/yalla/ui/view/NumberSize$Size;", "setSize", "(Lcom/yalla/yalla/ui/view/NumberSize$Size;)V", "size", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attr", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class NumberView extends AppCompatImageView {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NumberSize.Size size;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @IntRange(from = ULong.MIN_VALUE, to = 9)
    public int f25047OoooO0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NumberView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void OooO0OO() {
        int i;
        int i2 = this.f25047OoooO0O;
        if (i2 < 0) {
            setVisibility(8);
            invalidate();
            return;
        }
        NumberSize.Size size = this.size;
        int i3 = size == null ? -1 : NumberSize.OooO00o.$EnumSwitchMapping$0[size.ordinal()];
        if (i3 == 1) {
            i = NumberSize.f25041OooO0O0[i2];
        } else if (i3 == 2) {
            i = NumberSize.f25042OooO0OO[i2];
        } else if (i3 == 3) {
            i = NumberSize.f25043OooO0Oo[i2];
        } else if (i3 != 4) {
            i = i3 != 5 ? NumberSize.f25042OooO0OO[i2] : NumberSize.f25044OooO0o[i2];
        } else {
            i = NumberSize.f25045OooO0o0[i2];
        }
        setDataRes(i);
    }

    @NotNull
    public final NumberSize.Size getSize() {
        return this.size;
    }

    public final void setData(@IntRange(from = ULong.MIN_VALUE, to = 9) int number) {
        this.f25047OoooO0O = number;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.size = NumberSize.Size.H;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o0O0OOOo.NumberView);
        this.size = NumberSize.f25040OooO00o.OooO00o(Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(1, 2)));
        this.f25047OoooO0O = typedArrayObtainStyledAttributes.getInteger(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO();
    }
}
