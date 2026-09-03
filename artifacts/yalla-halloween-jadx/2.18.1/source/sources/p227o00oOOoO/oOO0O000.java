package p227o00oOOoO;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class oOO0O000 implements o00000O0<Uri, Drawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33878OooO00o;

    public oOO0O000(Context context) {
        this.f33878OooO00o = context.getApplicationContext();
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull Uri uri, @NonNull o00000 o00000Var) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // p217o00oO00o.o00000O0
    @Nullable
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public final o00OOOO0<Drawable> OooO00o(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (authority.equals(this.f33878OooO00o.getPackageName())) {
            contextCreatePackageContext = this.f33878OooO00o;
        } else {
            try {
                contextCreatePackageContext = this.f33878OooO00o.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(this.f33878OooO00o.getPackageName())) {
                    throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
                }
                contextCreatePackageContext = this.f33878OooO00o;
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
                throw new IllegalArgumentException("Failed to find resource id for: " + uri);
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
            }
        }
        Drawable drawableOooO00o = oOO00OO.OooO00o(this.f33878OooO00o, contextCreatePackageContext, identifier, null);
        if (drawableOooO00o != null) {
            return new oOO0(drawableOooO00o);
        }
        return null;
    }
}
