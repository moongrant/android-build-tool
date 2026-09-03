package p605o0oo0O0O;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import androidx.core.content.ContextCompat;
import com.code.android.util.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f57395OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Rect f57396OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f57397OooO0OO = new OooO00o();

    public class OooO00o implements Html.ImageGetter {
        public OooO00o() {
        }

        @Override // android.text.Html.ImageGetter
        public final Drawable getDrawable(String str) {
            o0oO0O0o o0oo0o0o2 = o0oO0O0o.this;
            Drawable drawableOooO0O0 = null;
            try {
                int iOooOO0O = o0O0O0Oo.OooOO0O(str);
                Context context = o0oo0o0o2.f57395OooO00o;
                Object obj = ContextCompat.f5281OooO00o;
                drawableOooO0O0 = ContextCompat.OooO0OO.OooO0O0(context, iOooOO0O);
                int iOooO00o = o0000O0.OooO00o(o0oo0o0o2.f57396OooO0O0.right);
                int iOooO00o2 = o0000O0.OooO00o(o0oo0o0o2.f57396OooO0O0.bottom);
                if (drawableOooO0O0 != null) {
                    drawableOooO0O0.setBounds(0, 0, iOooO00o, iOooO00o2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (OutOfMemoryError e2) {
                System.gc();
                e2.printStackTrace();
            }
            return drawableOooO0O0;
        }
    }

    public o0oO0O0o(Context context, Rect rect) {
        this.f57395OooO00o = context;
        this.f57396OooO0O0 = rect;
    }
}
