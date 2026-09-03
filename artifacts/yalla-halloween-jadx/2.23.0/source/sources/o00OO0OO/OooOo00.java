package o00OO0OO;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.o0000O0O;
import java.io.IOException;
import java.util.List;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements o00000O0<Uri, Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O<Resources.Theme> f37261OooO0O0 = new o000000O<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, o000000O.f36726OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37262OooO00o;

    public OooOo00(Context context) {
        this.f37262OooO00o = context.getApplicationContext();
    }

    @Override // p126o00O0oOo.o00000O0
    @Nullable
    public final /* bridge */ /* synthetic */ o0000<Drawable> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return OooO0OO(uri, o00000Var);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull Uri uri, @NonNull o00000 o00000Var) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Nullable
    public final o0000 OooO0OO(@NonNull Uri uri, @NonNull o00000 o00000Var) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f37262OooO00o;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(o0000O0O.OooO00o("Failed to obtain context or unrecognized Uri format for: ", uri), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(o0000O0O.OooO00o("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(o0000O0O.OooO00o("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(o0000O0O.OooO00o("Unrecognized Uri format: ", uri), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) o00000Var.OooO0OO(f37261OooO0O0) : null;
        Drawable drawableOooO00o = theme == null ? OooOOO0.OooO00o(context, contextCreatePackageContext, identifier, null) : OooOOO0.OooO00o(context, context, identifier, theme);
        if (drawableOooO00o != null) {
            return new OooOOOO(drawableOooO00o);
        }
        return null;
    }
}
