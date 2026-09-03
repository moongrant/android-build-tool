package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p649o0ooOOoo.si;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftNumberView;", "Landroid/widget/LinearLayout;", "", "number", "", "setNumber", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftNumberView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final si f24802Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final int[] f24803Oooo0oO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setNumber(int number) {
        ImageView imageView = this.f24802Oooo0o.f50627OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGiftNumberX");
        oOO00O.OooO(imageView);
        if (number == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int i = number / 1000;
        if (i == 0) {
            this.f24802Oooo0o.f50628OooO0o0.setVisibility(8);
        } else {
            this.f24802Oooo0o.f50628OooO0o0.setVisibility(0);
            this.f24802Oooo0o.f50628OooO0o0.setImageResource(this.f24803Oooo0oO[i]);
        }
        int i2 = (number / 100) % 10;
        if (i2 == 0 && i == 0) {
            this.f24802Oooo0o.f50624OooO0O0.setVisibility(8);
        } else {
            this.f24802Oooo0o.f50624OooO0O0.setVisibility(0);
            this.f24802Oooo0o.f50624OooO0O0.setImageResource(this.f24803Oooo0oO[i2]);
        }
        int i3 = (number / 10) % 10;
        if (i3 == 0 && i2 == 0 && i == 0) {
            this.f24802Oooo0o.f50626OooO0Oo.setVisibility(8);
        } else {
            this.f24802Oooo0o.f50626OooO0Oo.setVisibility(0);
            this.f24802Oooo0o.f50626OooO0Oo.setImageResource(this.f24803Oooo0oO[i3]);
        }
        this.f24802Oooo0o.f50625OooO0OO.setImageResource(this.f24803Oooo0oO[number % 10]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        si siVarInflate = si.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(siVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24802Oooo0o = siVarInflate;
        this.f24803Oooo0oO = new int[]{R.drawable.ic_gift_num0, R.drawable.ic_gift_num1, R.drawable.ic_gift_num2, R.drawable.ic_gift_num3, R.drawable.ic_gift_num4, R.drawable.ic_gift_num5, R.drawable.ic_gift_num6, R.drawable.ic_gift_num7, R.drawable.ic_gift_num8, R.drawable.ic_gift_num9};
    }
}
