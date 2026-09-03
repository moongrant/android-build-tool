package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.a3;
import p413o0Oo0o0o.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftNumberView;", "Landroid/widget/LinearLayout;", "", "number", "", "setNumber", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftNumberView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final a3 f30462OooO0Oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setNumber(int number) {
        a3 a3Var = this.f30462OooO0Oo;
        ImageView ivGiftNumberX = a3Var.f43723OooO0o;
        Intrinsics.checkNotNullExpressionValue(ivGiftNumberX, "ivGiftNumberX");
        o000O.OooOOOO(ivGiftNumberX);
        if (number == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int i = number / 1000;
        if (i == 0) {
            a3Var.f43724OooO0o0.setVisibility(8);
        } else {
            a3Var.f43724OooO0o0.setVisibility(0);
            a3Var.f43724OooO0o0.setImageResource(o0O00oO0.f46385OooO0OO[i]);
        }
        int i2 = (number / 100) % 10;
        if (i2 == 0 && i == 0) {
            a3Var.f43720OooO0O0.setVisibility(8);
        } else {
            a3Var.f43720OooO0O0.setVisibility(0);
            a3Var.f43720OooO0O0.setImageResource(o0O00oO0.f46385OooO0OO[i2]);
        }
        int i3 = (number / 10) % 10;
        if (i3 == 0 && i2 == 0 && i == 0) {
            a3Var.f43722OooO0Oo.setVisibility(8);
        } else {
            a3Var.f43722OooO0Oo.setVisibility(0);
            a3Var.f43722OooO0Oo.setImageResource(o0O00oO0.f46385OooO0OO[i3]);
        }
        a3Var.f43721OooO0OO.setImageResource(o0O00oO0.f46385OooO0OO[number % 10]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftNumberView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        a3 a3VarInflate = a3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(a3VarInflate, "inflate(...)");
        this.f30462OooO0Oo = a3VarInflate;
    }
}
