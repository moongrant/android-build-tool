package p171o00Ooo0o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Html;
import com.yalla.support.common.util.OooOo00;
import p168o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f32680OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Rect f32681OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f32682OooO0OO = new OooO00o();

    public class OooO00o implements Html.ImageGetter {
        public OooO00o() {
        }

        @Override // android.text.Html.ImageGetter
        public final Drawable getDrawable(String str) {
            Drawable drawableOooO0O0 = null;
            try {
                int iOooOO0o = o0O0O00.OooOO0o(str);
                Context context = OooOO0.this.f32680OooO00o;
                Object obj = o000O000.OooO00o.f28085OooO00o;
                drawableOooO0O0 = o000O000.OooO00o.OooO0OO.OooO0O0(context, iOooOO0o);
                int iOooO00o = OooOo00.OooO00o(OooOO0.this.f32681OooO0O0.right);
                int iOooO00o2 = OooOo00.OooO00o(OooOO0.this.f32681OooO0O0.bottom);
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

    public OooOO0(Context context, Rect rect) {
        this.f32680OooO00o = context;
        this.f32681OooO0O0 = rect;
    }
}
