package p124o00O0o00;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooO0O0;
import com.airbnb.lottie.OooOo;
import java.util.HashMap;
import java.util.Map;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f30976OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f30977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f30978OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f30979OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, OooOo> f30980OooO0Oo;

    public OooO(Drawable.Callback callback, String str, OooO0O0 oooO0O0, Map<String, OooOo> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f30978OooO0O0 = str;
        } else {
            this.f30978OooO0O0 = str + '/';
        }
        if (callback instanceof View) {
            this.f30977OooO00o = ((View) callback).getContext();
            this.f30980OooO0Oo = map;
            this.f30979OooO0OO = oooO0O0;
        } else {
            o000Oo0.OooO0OO("LottieDrawable must be inside of a view for images to work.");
            this.f30980OooO0Oo = new HashMap();
            this.f30977OooO00o = null;
        }
    }

    public final Bitmap OooO00o(String str, @Nullable Bitmap bitmap) {
        synchronized (f30976OooO0o0) {
            this.f30980OooO0Oo.get(str).f10077OooO0Oo = bitmap;
        }
        return bitmap;
    }
}
