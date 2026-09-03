package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

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
        o000O0o o000o0o2 = o000O0o.f5379OoooOOO;
        if (o000o0o2 != null && o000o0o2.f5382Oooo0o == view) {
            o000O0o.OooO0O0(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new o000O0o(view, charSequence);
            return;
        }
        o000O0o o000o0o3 = o000O0o.f5380OoooOOo;
        if (o000o0o3 != null && o000o0o3.f5382Oooo0o == view) {
            o000o0o3.OooO00o();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
