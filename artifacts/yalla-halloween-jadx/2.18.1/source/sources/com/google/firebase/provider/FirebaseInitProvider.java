package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import p351o0OOOOo.OooOOO;
import p351o0OOOOo.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, o0OOOOo.OooOOO>] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        OooOOO oooOOOOooO0o;
        Context context = getContext();
        synchronized (OooOOO.f38259OooOO0) {
            if (OooOOO.f38261OooOO0o.containsKey("[DEFAULT]")) {
                oooOOOOooO0o = OooOOO.OooO0OO();
            } else {
                Oooo000 oooo000OooO00o = Oooo000.OooO00o(context);
                if (oooo000OooO00o == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    oooOOOOooO0o = null;
                } else {
                    oooOOOOooO0o = OooOOO.OooO0o(context, oooo000OooO00o);
                }
            }
        }
        if (oooOOOOooO0o == null) {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            return false;
        }
        Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
        return false;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
