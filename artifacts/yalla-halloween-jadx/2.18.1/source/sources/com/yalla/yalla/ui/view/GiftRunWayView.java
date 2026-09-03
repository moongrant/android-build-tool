package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.ti;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/view/GiftRunWayView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/ui/view/GiftRunWayItemView;", "getGiftRunWayTop", "getGiftRunWayBottom", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GiftRunWayView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ti f24814Oooo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final GiftRunWayItemView getGiftRunWayBottom() {
        GiftRunWayItemView giftRunWayItemView = this.f24814Oooo0o.f50673OooO0O0;
        Intrinsics.checkNotNullExpressionValue(giftRunWayItemView, "binding.giftRunWayBottom");
        return giftRunWayItemView;
    }

    @NotNull
    public final GiftRunWayItemView getGiftRunWayTop() {
        GiftRunWayItemView giftRunWayItemView = this.f24814Oooo0o.f50674OooO0OO;
        Intrinsics.checkNotNullExpressionValue(giftRunWayItemView, "binding.giftRunWayTop");
        return giftRunWayItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftRunWayView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ti tiVarInflate = ti.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(tiVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24814Oooo0o = tiVarInflate;
    }
}
