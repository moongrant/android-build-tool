package p556o0oOOoo0;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0O0Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f56156OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bitmap f56157OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f56158OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f56159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f56160OooO0o0;

    public oO0O0Oo0(Bitmap bitmap) {
        this.f56157OooO0O0 = bitmap;
        this.f56156OooO00o = null;
        this.f56158OooO0OO = null;
        this.f56159OooO0Oo = false;
        bitmap.getWidth();
        bitmap.getHeight();
        this.f56160OooO0o0 = false;
    }

    public oO0O0Oo0(@NonNull Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f56157OooO0O0 = null;
        this.f56156OooO00o = uri;
        this.f56158OooO0OO = null;
        this.f56159OooO0Oo = true;
    }

    public oO0O0Oo0(int i) {
        this.f56157OooO0O0 = null;
        this.f56156OooO00o = null;
        this.f56158OooO0OO = Integer.valueOf(i);
        this.f56159OooO0Oo = true;
    }
}
