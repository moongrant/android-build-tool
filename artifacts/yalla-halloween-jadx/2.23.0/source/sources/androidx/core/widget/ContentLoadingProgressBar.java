package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f5463OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f5464OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.compose.ui.platform.OooOo00 f5465OooO0o0;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f5464OooO0Oo);
        removeCallbacks(this.f5465OooO0o0);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5464OooO0Oo);
        removeCallbacks(this.f5465OooO0o0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.OooO0o] */
    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5464OooO0Oo = new Runnable() { // from class: androidx.core.widget.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                int i = ContentLoadingProgressBar.f5463OooO0o;
                this.f5523OooO0Oo.setVisibility(8);
            }
        };
        this.f5465OooO0o0 = new androidx.compose.ui.platform.OooOo00(this, 1);
    }
}
