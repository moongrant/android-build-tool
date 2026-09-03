package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.appcompat.widget.o0000O0O;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21375OooO00o;

    public o0ooOOo(Context context) {
        this.f21375OooO00o = context;
    }

    @Override // com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        if (o00ooo2.f21323OooO0o0 != 0) {
            return true;
        }
        return "android.resource".equals(o00ooo2.f21321OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        Resources resources;
        int identifier;
        StringBuilder sb = o000000O.f21300OooO00o;
        int i = o00ooo2.f21323OooO0o0;
        Uri uri = o00ooo2.f21321OooO0Oo;
        Context context = this.f21375OooO00o;
        if (i != 0 || uri == null) {
            resources = context.getResources();
        } else {
            String authority = uri.getAuthority();
            if (authority == null) {
                throw new FileNotFoundException(o0000O0O.OooO00o("No package provided: ", uri));
            }
            try {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new FileNotFoundException(o0000O0O.OooO00o("Unable to obtain resources for package: ", uri));
            }
        }
        int i2 = o00ooo2.f21323OooO0o0;
        if (i2 == 0 && uri != null) {
            String authority2 = uri.getAuthority();
            if (authority2 == null) {
                throw new FileNotFoundException(o0000O0O.OooO00o("No package provided: ", uri));
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                throw new FileNotFoundException(o0000O0O.OooO00o("No path segments: ", uri));
            }
            if (pathSegments.size() == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused2) {
                    throw new FileNotFoundException(o0000O0O.OooO00o("Last path segment is not a resource ID: ", uri));
                }
            } else {
                if (pathSegments.size() != 2) {
                    throw new FileNotFoundException(o0000O0O.OooO00o("More than two path segments: ", uri));
                }
                identifier = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
            }
            i2 = identifier;
        }
        BitmapFactory.Options optionsOooO0OO = o00oO0o.OooO0OO(o00ooo2);
        if (optionsOooO0OO != null && optionsOooO0OO.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i2, optionsOooO0OO);
            o00oO0o.OooO00o(o00ooo2.f21324OooO0oO, o00ooo2.f21325OooO0oo, optionsOooO0OO.outWidth, optionsOooO0OO.outHeight, optionsOooO0OO, o00ooo2);
        }
        return new o00oO0o.OooO00o(BitmapFactory.decodeResource(resources, i2, optionsOooO0OO), Picasso.LoadedFrom.DISK);
    }
}
