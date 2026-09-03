package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ActionBarContainer f5073OooO00o;

    public OooO0O0(ActionBarContainer actionBarContainer) {
        this.f5073OooO00o = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f5073OooO00o;
        if (actionBarContainer.f4801OoooO) {
            Drawable drawable = actionBarContainer.f4804OoooO0O;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4803OoooO00;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f5073OooO00o;
        Drawable drawable3 = actionBarContainer2.f4802OoooO0;
        if (drawable3 == null || !actionBarContainer2.f4805OoooOO0) {
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
        ActionBarContainer actionBarContainer = this.f5073OooO00o;
        if (actionBarContainer.f4801OoooO) {
            if (actionBarContainer.f4804OoooO0O != null) {
                actionBarContainer.f4803OoooO00.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f4803OoooO00;
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
