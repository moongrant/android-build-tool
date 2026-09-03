package p124o00O0o00;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p129o00O0oOo.o000Oo0;
import p225o00oOOo.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AssetManager f30984OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO00O<String> f30981OooO00o = new o00OO00O<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<o00OO00O<String>, Typeface> f30982OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, Typeface> f30983OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f30985OooO0o0 = ".ttf";

    public OooO0o(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f30984OooO0Oo = ((View) callback).getContext().getAssets();
        } else {
            o000Oo0.OooO0OO("LottieDrawable must be inside of a view for images to work.");
            this.f30984OooO0Oo = null;
        }
    }
}
