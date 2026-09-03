package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import p096o000o0o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003e */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException();
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        oo000o oo000oVarOooO0OO = oo000o.OooO0OO(context);
        Objects.requireNonNull(oo000oVarOooO0OO);
        try {
            Trace.beginSection("Startup");
            oo000oVarOooO0OO.OooO00o(oo000oVarOooO0OO.f29300OooO0OO.getPackageManager().getProviderInfo(new ComponentName(oo000oVarOooO0OO.f29300OooO0OO.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            Trace.endSection();
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            throw new StartupException(e);
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
