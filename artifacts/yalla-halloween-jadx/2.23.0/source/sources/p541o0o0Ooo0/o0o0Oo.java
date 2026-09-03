package p541o0o0Ooo0;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes5.dex */
public final class o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f55775OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bitmap f55776OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f55777OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f55778OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f55779OooO0o0;

    public o0o0Oo(Bitmap bitmap) {
        this.f55776OooO0O0 = bitmap;
        this.f55775OooO00o = null;
        this.f55777OooO0OO = null;
        this.f55778OooO0Oo = false;
        bitmap.getWidth();
        bitmap.getHeight();
        this.f55779OooO0o0 = false;
    }

    public o0o0Oo(@NonNull Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f55776OooO0O0 = null;
        this.f55775OooO00o = uri;
        this.f55777OooO0OO = null;
        this.f55778OooO0Oo = true;
    }

    public o0o0Oo(int i) {
        this.f55776OooO0O0 = null;
        this.f55775OooO00o = null;
        this.f55777OooO0OO = Integer.valueOf(i);
        this.f55778OooO0Oo = true;
    }
}
