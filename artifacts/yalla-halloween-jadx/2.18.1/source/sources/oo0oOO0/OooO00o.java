package oo0oOO0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Paint {
    public OooO00o() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(@NonNull LocaleList localeList) {
    }

    public OooO00o(int i) {
        super(i);
    }

    public OooO00o(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public OooO00o(int i, PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
