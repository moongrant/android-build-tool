package com.yalla.yalla.ui.view.gift;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GifRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "OooO0Oo", "Z", "isLongClickPreview", "()Z", "setLongClickPreview", "(Z)V", "Lkotlin/Function2;", "Landroid/view/MotionEvent;", "", "OooO0o0", "Lkotlin/jvm/functions/Function2;", "getLongClickPreviewListener", "()Lkotlin/jvm/functions/Function2;", "setLongClickPreviewListener", "(Lkotlin/jvm/functions/Function2;)V", "longClickPreviewListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GifRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    public boolean isLongClickPreview;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final int[] f30440OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super Boolean, ? super MotionEvent, Unit> longClickPreviewListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifRecyclerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        Function2<? super Boolean, ? super MotionEvent, Unit> function2;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean z = false;
        if (action == 1) {
            Function2<? super Boolean, ? super MotionEvent, Unit> function3 = this.longClickPreviewListener;
            if (function3 != null) {
                function3.invoke(Boolean.FALSE, motionEvent);
            }
            this.isLongClickPreview = false;
            getParent().requestDisallowInterceptTouchEvent(false);
            return super.dispatchTouchEvent(motionEvent);
        }
        if (action != 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (!this.isLongClickPreview) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i = this.f30440OooO0o[1];
        int height = getHeight() + i;
        int y = (int) motionEvent.getY();
        if (i <= y && y <= height) {
            z = true;
        }
        if (z && (function2 = this.longClickPreviewListener) != null) {
            function2.invoke(Boolean.TRUE, motionEvent);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Nullable
    public final Function2<Boolean, MotionEvent, Unit> getLongClickPreviewListener() {
        return this.longClickPreviewListener;
    }

    public final void setLongClickPreview(boolean z) {
        this.isLongClickPreview = z;
    }

    public final void setLongClickPreviewListener(@Nullable Function2<? super Boolean, ? super MotionEvent, Unit> function2) {
        this.longClickPreviewListener = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GifRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GifRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = {0, 0};
        this.f30440OooO0o = iArr;
        getLocationOnScreen(iArr);
    }
}
