package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0Oo0oo f5001Oooo0o;

    public FitWindowsLinearLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        o0Oo0oo o0oo0oo2 = this.f5001Oooo0o;
        if (o0oo0oo2 != null) {
            o0oo0oo2.OooO00o();
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(o0Oo0oo o0oo0oo2) {
        this.f5001Oooo0o = o0oo0oo2;
    }

    public FitWindowsLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
