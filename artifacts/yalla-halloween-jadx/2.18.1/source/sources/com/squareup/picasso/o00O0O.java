package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f19820OooO00o;

    public o00O0O(Context context) {
        this.f19820OooO00o = context;
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        if (oooo0.f19771OooO0o0 != 0) {
            return true;
        }
        return "android.resource".equals(oooo0.f19769OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.f19820OooO00o;
        StringBuilder sb = o00oO0o.f19821OooO00o;
        if (oooo0.f19771OooO0o0 != 0 || (uri2 = oooo0.f19769OooO0Oo) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No package provided: ");
                sbOooO0o0.append(oooo0.f19769OooO0Oo);
                throw new FileNotFoundException(sbOooO0o0.toString());
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Unable to obtain resources for package: ");
                sbOooO0o1.append(oooo0.f19769OooO0Oo);
                throw new FileNotFoundException(sbOooO0o1.toString());
            }
        }
        int identifier = oooo0.f19771OooO0o0;
        if (identifier == 0 && (uri = oooo0.f19769OooO0Oo) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("No package provided: ");
                sbOooO0o2.append(oooo0.f19769OooO0Oo);
                throw new FileNotFoundException(sbOooO0o2.toString());
            }
            List<String> pathSegments = oooo0.f19769OooO0Oo.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("No path segments: ");
                sbOooO0o3.append(oooo0.f19769OooO0Oo);
                throw new FileNotFoundException(sbOooO0o3.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0("Last path segment is not a resource ID: ");
                    sbOooO0o4.append(oooo0.f19769OooO0Oo);
                    throw new FileNotFoundException(sbOooO0o4.toString());
                }
            } else {
                if (pathSegments.size() != 2) {
                    StringBuilder sbOooO0o5 = OooO00o.OooO00o.OooO0o0("More than two path segments: ");
                    sbOooO0o5.append(oooo0.f19769OooO0Oo);
                    throw new FileNotFoundException(sbOooO0o5.toString());
                }
                identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
        }
        BitmapFactory.Options optionsOooO0Oo = o0OoOo0.OooO0Oo(oooo0);
        if (optionsOooO0Oo != null && optionsOooO0Oo.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, identifier, optionsOooO0Oo);
            o0OoOo0.OooO0O0(oooo0.f19772OooO0oO, oooo0.f19773OooO0oo, optionsOooO0Oo, oooo0);
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, identifier, optionsOooO0Oo);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        Objects.requireNonNull(bitmapDecodeResource, "bitmap == null");
        return new o0OoOo0.OooO00o(bitmapDecodeResource, null, loadedFrom, 0);
    }
}
