package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.RoomDatabase;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f7949Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final OooO f7950Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0o f7951Oooo0oO;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f7950Oooo0o);
        removeCallbacks(this.f7951Oooo0oO);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f7950Oooo0o);
        removeCallbacks(this.f7951Oooo0oO);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.OooO0o] */
    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.f7950Oooo0o = new OooO(this, 0);
        this.f7951Oooo0oO = new Runnable() { // from class: androidx.core.widget.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        ContentLoadingProgressBar contentLoadingProgressBar = (ContentLoadingProgressBar) this;
                        int i2 = ContentLoadingProgressBar.f7949Oooo0oo;
                        Objects.requireNonNull(contentLoadingProgressBar);
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                    default:
                        RoomDatabase.OooO0o oooO0o = ((androidx.room.OooO0O0) this).f9287Oooo0o;
                        Collections.emptyList();
                        oooO0o.OooO00o();
                        break;
                }
            }
        };
    }
}
