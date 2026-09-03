package o00OO0OO;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o000oOoO;
import java.util.HashMap;
import java.util.Map;
import o00OOO0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f37299OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37300OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f37301OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, o000oOoO> f37302OooO0OO;

    public OooO0O0(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f37301OooO0O0 = str;
        } else {
            this.f37301OooO0O0 = str.concat("/");
        }
        if (callback instanceof View) {
            this.f37300OooO00o = ((View) callback).getContext();
            this.f37302OooO0OO = map;
        } else {
            OooOO0.OooO0O0("LottieDrawable must be inside of a view for images to work.");
            this.f37302OooO0OO = new HashMap();
            this.f37300OooO00o = null;
        }
    }

    public final void OooO00o(@Nullable Bitmap bitmap, String str) {
        synchronized (f37299OooO0Oo) {
            this.f37302OooO0OO.get(str).f11969OooO0Oo = bitmap;
        }
    }
}
