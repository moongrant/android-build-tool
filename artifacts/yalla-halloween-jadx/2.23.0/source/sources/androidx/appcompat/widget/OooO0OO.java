package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ActionBarContainer f2966OooO00o;

    public OooO0OO(ActionBarContainer actionBarContainer) {
        this.f2966OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2966OooO00o;
        if (actionBarContainer.f2701OooOO0O) {
            Drawable drawable = actionBarContainer.f2700OooOO0;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2699OooO0oo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f2694OooO;
        if (drawable3 == null || !actionBarContainer.f2702OooOO0o) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f2966OooO00o;
        if (actionBarContainer.f2701OooOO0O) {
            if (actionBarContainer.f2700OooOO0 != null) {
                actionBarContainer.f2699OooO0oo.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2699OooO0oo;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
