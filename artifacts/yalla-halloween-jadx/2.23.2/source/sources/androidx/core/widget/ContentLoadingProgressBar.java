package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f5475OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.activity.OooOOO0 f5476OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f5477OooO0o0;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f5476OooO0Oo);
        removeCallbacks(this.f5477OooO0o0);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f5476OooO0Oo);
        removeCallbacks(this.f5477OooO0o0);
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5476OooO0Oo = new androidx.activity.OooOOO0(this, 1);
        this.f5477OooO0o0 = new OooO0o(this, 0);
    }
}
