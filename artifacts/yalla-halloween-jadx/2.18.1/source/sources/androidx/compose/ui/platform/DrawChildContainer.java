package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.umeng.analytics.pro.d;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "getChildCount", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 6, 0})
public class DrawChildContainer extends ViewGroup {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f6281Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawChildContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClipChildren(false);
        setTag(p048OoooooO.o0oOO.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void OooO00o(@NotNull p145o00Oo0.o0O0O00 canvas, @NotNull View view, long j) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(view, "view");
        Canvas canvas2 = p145o00Oo0.OooOOOO.f32049OooO00o;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        super.drawChild(((p145o00Oo0.OooOOO) canvas).f32046OooO00o, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int childCount = super.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.f6281Oooo0o = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f6281Oooo0o = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f6281Oooo0o) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
