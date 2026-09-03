package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000OO00;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0o00.OooO0o;
import p641o0ooOOOO.lb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftNumberView;", "Landroid/widget/LinearLayout;", "", "number", "", "setNumber", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class GiftNumberView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final lb f31007OooO0Oo;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftNumberView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setNumber(int number) {
        lb lbVar = this.f31007OooO0Oo;
        ImageView imageView = lbVar.f58385OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGiftNumberX");
        o000OO00.OooOOOO(imageView);
        if (number == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int i = number / 1000;
        if (i == 0) {
            lbVar.f58386OooO0o0.setVisibility(8);
        } else {
            lbVar.f58386OooO0o0.setVisibility(0);
            lbVar.f58386OooO0o0.setImageResource(OooO0o.f45169OooO0OO[i]);
        }
        int i2 = (number / 100) % 10;
        if (i2 == 0 && i == 0) {
            lbVar.f58382OooO0O0.setVisibility(8);
        } else {
            lbVar.f58382OooO0O0.setVisibility(0);
            lbVar.f58382OooO0O0.setImageResource(OooO0o.f45169OooO0OO[i2]);
        }
        int i3 = (number / 10) % 10;
        if (i3 == 0 && i2 == 0 && i == 0) {
            lbVar.f58384OooO0Oo.setVisibility(8);
        } else {
            lbVar.f58384OooO0Oo.setVisibility(0);
            lbVar.f58384OooO0Oo.setImageResource(OooO0o.f45169OooO0OO[i3]);
        }
        lbVar.f58383OooO0OO.setImageResource(OooO0o.f45169OooO0OO[number % 10]);
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
        lb lbVarInflate = lb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(lbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31007OooO0Oo = lbVarInflate;
    }
}
