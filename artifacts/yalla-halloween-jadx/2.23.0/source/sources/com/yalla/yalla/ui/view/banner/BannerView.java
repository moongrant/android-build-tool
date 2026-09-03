package com.yalla.yalla.ui.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import androidx.recyclerview.widget.oo000o;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/view/banner/BannerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "OooO0o0", "F", "getSpeed", "()F", "setSpeed", "(F)V", "speed", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BannerView extends RecyclerView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public BannerView$initView$1 f30827OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public float speed;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float getSpeed() {
        return this.speed;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return true;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.recyclerview.widget.RecyclerView$Oooo000, com.yalla.yalla.ui.view.banner.BannerView$initView$1] */
    @JvmOverloads
    public BannerView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.speed = 400.0f;
        ?? r3 = new LinearLayoutManager(context) { // from class: com.yalla.yalla.ui.view.banner.BannerView$initView$1

            public static final class OooO00o extends oo000o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final /* synthetic */ BannerView f30830OooO00o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO00o(Context context, BannerView bannerView) {
                    super(context);
                    this.f30830OooO00o = bannerView;
                }

                @Override // androidx.recyclerview.widget.oo000o
                public final float calculateSpeedPerPixel(@NotNull DisplayMetrics displayMetrics) {
                    Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
                    BannerView bannerView = this.f30830OooO00o;
                    return (bannerView.getSpeed() / bannerView.getHeight()) / displayMetrics.scaledDensity;
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.Oooo000
            public final void smoothScrollToPosition(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.o0OOO0o state, int i2) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(state, "state");
                OooO00o oooO00o = new OooO00o(recyclerView.getContext(), this);
                oooO00o.setTargetPosition(i2);
                startSmoothScroll(oooO00o);
            }
        };
        this.f30827OooO0Oo = r3;
        setLayoutManager(r3);
        new o000OOo().attachToRecyclerView(this);
    }

    public /* synthetic */ BannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
