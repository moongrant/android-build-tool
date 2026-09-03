package p509o0o00oo;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f41890OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bitmap f41891OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Integer f41892OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f41893OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41894OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41895OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f41896OooO0oO;

    public OooOo00(Bitmap bitmap) {
        this.f41891OooO0O0 = bitmap;
        this.f41890OooO00o = null;
        this.f41892OooO0OO = null;
        this.f41893OooO0Oo = false;
        this.f41895OooO0o0 = bitmap.getWidth();
        this.f41894OooO0o = bitmap.getHeight();
        this.f41896OooO0oO = false;
    }

    public OooOo00(@NonNull Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.f41891OooO0O0 = null;
        this.f41890OooO00o = uri;
        this.f41892OooO0OO = null;
        this.f41893OooO0Oo = true;
    }

    public OooOo00(int i) {
        this.f41891OooO0O0 = null;
        this.f41890OooO00o = null;
        this.f41892OooO0OO = Integer.valueOf(i);
        this.f41893OooO0Oo = true;
    }
}
