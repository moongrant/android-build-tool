package com.yalla.yalla.ui.view.materialdesign;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O0;
import com.yalla.yalla.ui.activity.room.ExploreCountryRoomListActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/view/materialdesign/MaxHeightFixGridLayoutManager;", "Lcom/yalla/yalla/ui/view/materialdesign/FixGridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MaxHeightFixGridLayoutManager extends FixGridLayoutManager {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f31073OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFixGridLayoutManager(@NotNull ExploreCountryRoomListActivity context) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31073OooOO0o = o0000O0.OooO00o(316);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
    public final void setMeasuredDimension(@Nullable Rect rect, int i, int i2) {
        super.setMeasuredDimension(rect, i, View.MeasureSpec.makeMeasureSpec(this.f31073OooOO0o, Integer.MIN_VALUE));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaxHeightFixGridLayoutManager(@NotNull Context context, @NotNull AttributeSet attrs, int i, int i2) {
        super(context, attrs, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f31073OooOO0o = o0000O0.OooO00o(316);
    }
}
