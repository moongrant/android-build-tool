package o00O00O;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import o00O0.OooOO0;
import oOO00O.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AssetManager f36332OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO0<String> f36329OooO00o = new OooOOO0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f36330OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f36331OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f36333OooO0o0 = ".ttf";

    public OooO00o(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f36332OooO0Oo = ((View) callback).getContext().getAssets();
        } else {
            OooOO0.OooO0O0("LottieDrawable must be inside of a view for images to work.");
            this.f36332OooO0Oo = null;
        }
    }
}
