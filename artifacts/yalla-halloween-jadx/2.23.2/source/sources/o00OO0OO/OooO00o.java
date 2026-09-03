package o00OO0OO;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import o00OOO0.OooOO0;
import p135o00OO0o0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AssetManager f37297OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O<String> f37294OooO00o = new o0OO00O<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f37295OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f37296OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f37298OooO0o0 = ".ttf";

    public OooO00o(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f37297OooO0Oo = ((View) callback).getContext().getAssets();
        } else {
            OooOO0.OooO0O0("LottieDrawable must be inside of a view for images to work.");
            this.f37297OooO0Oo = null;
        }
    }
}
