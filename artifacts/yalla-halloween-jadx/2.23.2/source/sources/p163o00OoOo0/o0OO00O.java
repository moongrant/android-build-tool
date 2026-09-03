package p163o00OoOo0;

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
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements o0O0O00<Uri, Drawable> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final p154o00Oo0oo.o0OO00O<Resources.Theme> f38104OooO0O0 = new p154o00Oo0oo.o0OO00O<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, p154o00Oo0oo.o0OO00O.f37828OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38105OooO00o;

    public o0OO00O(Context context) {
        this.f38105OooO00o = context.getApplicationContext();
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull Uri uri, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    @Override // p154o00Oo0oo.o0O0O00
    @Nullable
    public final /* bridge */ /* synthetic */ o00oOoo<Drawable> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        return OooO0OO(uri, oo0o0oo);
    }

    @Nullable
    public final o00oOoo OooO0OO(@NonNull Uri uri, @NonNull oo0o0Oo oo0o0oo) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.f38105OooO00o;
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
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) oo0o0oo.OooO0OO(f38104OooO0O0) : null;
        Drawable drawableOooO00o = theme == null ? o0ooOOo.OooO00o(context, contextCreatePackageContext, identifier, null) : o0ooOOo.OooO00o(context, context, identifier, theme);
        if (drawableOooO00o != null) {
            return new o0Oo0oo(drawableOooO00o);
        }
        return null;
    }
}
