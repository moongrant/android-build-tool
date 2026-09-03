package p423o0OoO0OO;

import android.graphics.drawable.Drawable;
import android.text.Html;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oOO00O implements Html.ImageGetter {
    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        try {
            Intrinsics.checkNotNull(str);
            Drawable drawableOooO0O0 = o0000.OooO0O0(Integer.parseInt(str));
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getIntrinsicWidth(), drawableOooO0O0.getIntrinsicHeight());
            return drawableOooO0O0;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
