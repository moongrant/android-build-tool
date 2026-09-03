package p147o00Oo00o;

import android.view.View;
import com.billy.android.swipe.OooOOO0;
import o00Oo00.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends OooOOO0 {
    public o0OOO0o() {
        this.f12906OooOOoo = new OooO00o();
    }

    @Override // com.billy.android.swipe.OooOOO0
    public final void OooOO0() {
        super.OooOO0();
        View contentView = this.f12889OooO00o.getContentView();
        if (contentView != null) {
            contentView.setTranslationX(0.0f);
            contentView.setTranslationY(0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0020  */
    /* JADX WARN: Code duplicated, block: B:17:0x0023  */
    /* JADX WARN: Code duplicated, block: B:24:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x003c  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.billy.android.swipe.OooOOO0
    public final void OooOO0O(int i, int i2) {
        boolean z;
        View contentView = this.f12889OooO00o.getContentView();
        if (contentView != null) {
            if (i >= 0) {
                if ((this.f12901OooOOO0 & 1) != 0) {
                    contentView.setTranslationX(i);
                } else if (i <= 0) {
                    if ((this.f12901OooOOO0 & 2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        contentView.setTranslationX(i);
                    }
                }
            } else if (i <= 0) {
                if ((this.f12901OooOOO0 & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    contentView.setTranslationX(i);
                }
            }
            if (i2 >= 0) {
                if (!((this.f12901OooOOO0 & 4) != 0)) {
                    if (i2 <= 0) {
                        return;
                    }
                    if (!((this.f12901OooOOO0 & 8) != 0)) {
                        return;
                    }
                }
            } else {
                if (i2 <= 0) {
                    return;
                }
                if (!((this.f12901OooOOO0 & 8) != 0)) {
                    return;
                }
            }
            contentView.setTranslationY(i2);
        }
    }
}
