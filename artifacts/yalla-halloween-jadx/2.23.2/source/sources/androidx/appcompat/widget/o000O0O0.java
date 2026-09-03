package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {

    @RequiresApi(26)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void OooO00o(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            OooO00o.OooO00o(view, charSequence);
            return;
        }
        o000OOo0 o000ooo1 = o000OOo0.f3311OooOOO;
        if (o000ooo1 != null && o000ooo1.f3314OooO0Oo == view) {
            o000OOo0.OooO0O0(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new o000OOo0(view, charSequence);
            return;
        }
        o000OOo0 o000ooo2 = o000OOo0.f3312OooOOOO;
        if (o000ooo2 != null && o000ooo2.f3314OooO0Oo == view) {
            o000ooo2.OooO00o();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
