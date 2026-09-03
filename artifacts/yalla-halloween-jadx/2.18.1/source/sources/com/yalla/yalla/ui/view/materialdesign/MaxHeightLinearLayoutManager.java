package com.yalla.yalla.ui.view.materialdesign;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.yalla.support.common.util.OooOo00;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/view/materialdesign/MaxHeightLinearLayoutManager;", "Lcom/yalla/yalla/ui/view/materialdesign/FixLinearLayoutManager;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MaxHeightLinearLayoutManager extends FixLinearLayoutManager {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f25237Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightLinearLayoutManager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25237Oooo0o = OooOo00.OooO00o(352);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void setMeasuredDimension(@Nullable Rect rect, int i, int i2) {
        super.setMeasuredDimension(rect, i, View.MeasureSpec.makeMeasureSpec(this.f25237Oooo0o, Integer.MIN_VALUE));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightLinearLayoutManager(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f25237Oooo0o = OooOo00.OooO00o(352);
    }
}
