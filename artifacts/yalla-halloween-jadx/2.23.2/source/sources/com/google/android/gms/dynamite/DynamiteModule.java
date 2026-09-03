package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import io.agora.rtc.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p263o00ooo0O.o00O0;
import p263o00ooo0O.o00O00O;
import p263o00ooo0O.o00O00o0;
import p263o00ooo0O.oOO00O;
import p263o00ooo0O.oo00o;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static Boolean f14843OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static String f14844OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static boolean f14845OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static Boolean f14846OooO0o = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static int f14847OooO0o0 = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static zzq f14850OooOO0 = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static zzr f14851OooOO0O = null;

    @KeepForSdk
    public static final int REMOTE = 1;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f14852OooO00o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ThreadLocal f14848OooO0oO = new ThreadLocal();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final oo00o f14849OooO0oo = new oo00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f14842OooO = new OooO00o();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new OooO0O0();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new OooO0OO();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new OooO0o();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new OooO();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new OooOO0();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new OooOO0O();

    @NonNull
    public static final VersionPolicy zza = new OooOOO0();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f14852OooO00o = context;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:45:0x00a6, B:46:0x00ad, B:62:0x00cf, B:64:0x00d4, B:65:0x00d5, B:66:0x00dc), top: B:72:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x00dd, TryCatch #5 {all -> 0x00dd, blocks: (B:45:0x00a6, B:46:0x00ad, B:62:0x00cf, B:64:0x00d4, B:65:0x00d5, B:66:0x00dc), top: B:72:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    public static int OooO00o(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception e;
        boolean z3;
        Cursor cursor = null;
        try {
            boolean z4 = true;
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f14849OooO0oo.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z5 = false;
                        int i = cursorQuery.getInt(0);
                        if (i > 0) {
                            synchronized (DynamiteModule.class) {
                                f14844OooO0OO = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    f14847OooO0o0 = cursorQuery.getInt(columnIndex);
                                }
                                int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                if (columnIndex2 >= 0) {
                                    z3 = cursorQuery.getInt(columnIndex2) != 0;
                                    f14845OooO0Oo = z3;
                                } else {
                                    z3 = false;
                                }
                            }
                            o00O0 o00o1 = (o00O0) f14848OooO0oO.get();
                            if (o00o1 == null || o00o1.f40394OooO00o != null) {
                                z4 = false;
                            } else {
                                o00o1.f40394OooO00o = cursorQuery;
                            }
                            cursor = z4 ? null : cursorQuery;
                            z5 = z3;
                        } else {
                            cursor = cursorQuery;
                        }
                        if (!z2 || !z5) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                        try {
                            try {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof LoadingException) {
                                    throw e;
                                }
                                throw new LoadingException("V2 version check failed", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (e instanceof LoadingException) {
                        throw e;
                    }
                    throw new LoadingException("V2 version check failed", e);
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
            throw new LoadingException("Failed to connect to dynamite module ContentResolver.");
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @GuardedBy("DynamiteModule.class")
    public static void OooO0O0(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            f14851OooOO0O = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean OooO0OO(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f14846OooO0o)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f14846OooO0o == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f14846OooO0o = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & Constants.ERR_WATERMARK_READ) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f14845OooO0Oo = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    @Nullable
    public static zzq OooO0Oo(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f14850OooOO0;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    f14850OooOO0 = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0213 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:102:0x021b A[Catch: all -> 0x0223, TRY_ENTER, TryCatch #2 {, blocks: (B:29:0x00bf, B:31:0x00c5, B:32:0x00c7, B:102:0x021b, B:103:0x0222), top: B:149:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02ac A[Catch: all -> 0x02ed, TryCatch #6 {all -> 0x02ed, blocks: (B:3:0x002d, B:7:0x0076, B:12:0x007e, B:15:0x0084, B:26:0x00ba, B:108:0x0227, B:109:0x0231, B:111:0x0233, B:113:0x0235, B:114:0x023c, B:132:0x02ac, B:133:0x02bf, B:116:0x023e, B:118:0x025c, B:120:0x026a, B:130:0x02a4, B:131:0x02ab, B:134:0x02c0, B:135:0x02ec), top: B:150:0x002d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0084 A[Catch: all -> 0x02ed, TRY_LEAVE, TryCatch #6 {all -> 0x02ed, blocks: (B:3:0x002d, B:7:0x0076, B:12:0x007e, B:15:0x0084, B:26:0x00ba, B:108:0x0227, B:109:0x0231, B:111:0x0233, B:113:0x0235, B:114:0x023c, B:132:0x02ac, B:133:0x02bf, B:116:0x023e, B:118:0x025c, B:120:0x026a, B:130:0x02a4, B:131:0x02ab, B:134:0x02c0, B:135:0x02ec), top: B:150:0x002d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5 A[Catch: all -> 0x0223, TryCatch #2 {, blocks: (B:29:0x00bf, B:31:0x00c5, B:32:0x00c7, B:102:0x021b, B:103:0x0222), top: B:149:0x00bf }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0169 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0174 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0193 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019a A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a2 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b1 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bb A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01cb A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e0 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0203 A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TRY_ENTER, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020b A[Catch: all -> 0x0226, LoadingException -> 0x0232, RemoteException -> 0x0234, TryCatch #7 {RemoteException -> 0x0234, LoadingException -> 0x0232, all -> 0x0226, blocks: (B:28:0x00be, B:34:0x00ca, B:36:0x00d1, B:37:0x00ec, B:41:0x00f2, B:43:0x00fa, B:45:0x00fe, B:46:0x010b, B:53:0x011a, B:55:0x0120, B:57:0x0147, B:59:0x014f, B:60:0x0156, B:61:0x015d, B:56:0x0134, B:64:0x0160, B:65:0x0161, B:66:0x0168, B:67:0x0169, B:68:0x0170, B:71:0x0173, B:72:0x0174, B:74:0x0193, B:76:0x019a, B:78:0x01a2, B:84:0x01da, B:86:0x01e0, B:96:0x0203, B:97:0x020a, B:79:0x01b1, B:80:0x01b8, B:82:0x01bb, B:83:0x01cb, B:98:0x020b, B:99:0x0212, B:100:0x0213, B:101:0x021a, B:106:0x0225), top: B:153:0x00be }] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x02ac, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x00d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x0174, please report this as an issue */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i;
        Boolean bool;
        zzq zzqVarOooO0Oo;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        o00O0 o00o1;
        Cursor cursor;
        zzr zzrVar;
        o00O0 o00o2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        ThreadLocal threadLocal = f14848OooO0oO;
        o00O0 o00o3 = (o00O0) threadLocal.get();
        o00O0 o00o4 = new o00O0(0);
        threadLocal.set(o00o4);
        oo00o oo00oVar = f14849OooO0oo;
        long jLongValue = ((Long) oo00oVar.get()).longValue();
        try {
            oo00oVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, f14842OooO);
            Log.i("DynamiteModule", "Considering local module " + str + CertificateUtil.DELIMITER + selectionResultSelectModule.localVersion + " and remote module " + str + CertificateUtil.DELIMITER + selectionResultSelectModule.remoteVersion);
            int i2 = selectionResultSelectModule.selection;
            if (i2 != 0) {
                if (i2 != -1) {
                    if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(context.getApplicationContext());
                            if (jLongValue == 0) {
                                oo00oVar.remove();
                            } else {
                                oo00oVar.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = o00o4.f40394OooO00o;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(o00o3);
                            return dynamiteModule2;
                        }
                        if (i2 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i2);
                        }
                        try {
                            i = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (OooO0OO(context)) {
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                    bool = f14843OooO0O0;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = f14851OooOO0O;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    o00o2 = (o00O0) threadLocal.get();
                                    if (o00o2 != null || o00o2.f40394OooO00o == null) {
                                        throw new LoadingException("No result cursor");
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = o00o2.f40394OooO00o;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(f14847OooO0o0 >= 2);
                                    }
                                    if (boolValueOf.booleanValue()) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context");
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    zzqVarOooO0Oo = OooO0Oo(context);
                                    if (zzqVarOooO0Oo != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.");
                                    }
                                    iZze = zzqVarOooO0Oo.zze();
                                    if (iZze >= 3) {
                                        o00o1 = (o00O0) threadLocal.get();
                                        if (o00o1 != null) {
                                            throw new LoadingException("No cached result cursor holder");
                                        }
                                        iObjectWrapperZzh = zzqVarOooO0Oo.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(o00o1.f40394OooO00o));
                                    } else if (iZze == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZzh = zzqVarOooO0Oo.zzj(ObjectWrapper.wrap(context), str, i);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZzh = zzqVarOooO0Oo.zzh(ObjectWrapper.wrap(context), str, i);
                                    }
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                    if (objUnwrap != null) {
                                        throw new LoadingException("Failed to load remote module.");
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                }
                                if (jLongValue == 0) {
                                    oo00oVar.remove();
                                } else {
                                    oo00oVar.set(Long.valueOf(jLongValue));
                                }
                                cursor = o00o4.f40394OooO00o;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(o00o3);
                                return dynamiteModule;
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th);
                            }
                        } catch (LoadingException e3) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                            int i3 = selectionResultSelectModule.localVersion;
                            if (i3 == 0 || versionPolicy.selectModule(context, str, new OooOOO(i3)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e3);
                            }
                            Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                            DynamiteModule dynamiteModule3 = new DynamiteModule(context.getApplicationContext());
                            if (jLongValue == 0) {
                                f14849OooO0oo.remove();
                            } else {
                                f14849OooO0oo.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = o00o4.f40394OooO00o;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f14848OooO0oO.set(o00o3);
                            return dynamiteModule3;
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i2 = -1;
                    if (i2 == 1) {
                    }
                    if (i2 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        DynamiteModule dynamiteModule4 = new DynamiteModule(context.getApplicationContext());
                        if (jLongValue == 0) {
                            oo00oVar.remove();
                        } else {
                            oo00oVar.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = o00o4.f40394OooO00o;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(o00o3);
                        return dynamiteModule4;
                    }
                    if (i2 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2);
                    }
                    i = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (OooO0OO(context)) {
                            throw new LoadingException("Remote loading disabled");
                        }
                        bool = f14843OooO0O0;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                            synchronized (DynamiteModule.class) {
                                zzrVar = f14851OooOO0O;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                o00o2 = (o00O0) threadLocal.get();
                                if (o00o2 != null) {
                                }
                                throw new LoadingException("No result cursor");
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                        zzqVarOooO0Oo = OooO0Oo(context);
                        if (zzqVarOooO0Oo != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.");
                        }
                        iZze = zzqVarOooO0Oo.zze();
                        if (iZze >= 3) {
                            o00o1 = (o00O0) threadLocal.get();
                            if (o00o1 != null) {
                                throw new LoadingException("No cached result cursor holder");
                            }
                            iObjectWrapperZzh = zzqVarOooO0Oo.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(o00o1.f40394OooO00o));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarOooO0Oo.zzj(ObjectWrapper.wrap(context), str, i);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarOooO0Oo.zzh(ObjectWrapper.wrap(context), str, i);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.");
                        }
                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            oo00oVar.remove();
                        } else {
                            oo00oVar.set(Long.valueOf(jLongValue));
                        }
                        cursor = o00o4.f40394OooO00o;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(o00o3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".");
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f14849OooO0oo.remove();
            } else {
                f14849OooO0oo.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = o00o4.f40394OooO00o;
            if (cursor5 != null) {
                cursor5.close();
            }
            f14848OooO0oO.set(o00o3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:132:0x01c4 */
    /* JADX WARN: Code duplicated, block: B:101:0x0177 A[Catch: all -> 0x01d0, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x01d0, blocks: (B:3:0x0002, B:60:0x00db, B:62:0x00e1, B:67:0x0102, B:97:0x0169, B:101:0x0177, B:120:0x01c9, B:121:0x01cc, B:116:0x01c1, B:65:0x00e7, B:124:0x01cf, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:58:0x00d8, B:19:0x0047, B:40:0x009a, B:43:0x009d, B:51:0x00b6, B:59:0x00da, B:57:0x00bc), top: B:140:0x0002, inners: #5, #10 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a9 A[Catch: all -> 0x00b4, TryCatch #9 {, blocks: (B:9:0x0027, B:11:0x0033, B:47:0x00b2, B:14:0x0039, B:16:0x0040, B:18:0x0046, B:21:0x0049, B:23:0x004d, B:26:0x0056, B:28:0x005e, B:31:0x0065, B:38:0x0091, B:39:0x0099, B:34:0x006c, B:36:0x0072, B:37:0x0083, B:42:0x009c, B:45:0x009f, B:46:0x00a9, B:15:0x003c), top: B:141:0x0027, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0166  */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        Cursor cursor;
        RemoteException e;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f14843OooO0O0;
                boolean z2 = true;
                int iZzf = 0;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    OooO0O0(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!OooO0OO(context)) {
                                    return 0;
                                }
                                if (f14845OooO0Oo) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        try {
                                            int iOooO00o = OooO00o(context, str, z, true);
                                            String str2 = f14844OooO0OO;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        oOO00O.OooO00o();
                                                        String str3 = f14844OooO0OO;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = o00O00O.OooO00o(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f14844OooO0OO;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new o00O00o0(ClassLoader.getSystemClassLoader(), str4);
                                                    }
                                                }
                                                OooO0O0(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                f14843OooO0O0 = bool2;
                                                return iOooO00o;
                                            }
                                            return iOooO00o;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        }
                                    }
                                }
                            }
                            f14843OooO0O0 = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return OooO00o(context, str, z, false);
                    } catch (LoadingException e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarOooO0Oo = OooO0Oo(context);
                try {
                    if (zzqVarOooO0Oo != null) {
                        try {
                            int iZze = zzqVarOooO0Oo.zze();
                            if (iZze >= 3) {
                                ThreadLocal threadLocal = f14848OooO0oO;
                                o00O0 o00o1 = (o00O0) threadLocal.get();
                                if (o00o1 == null || (cursor2 = o00o1.f40394OooO00o) == null) {
                                    cursor = (Cursor) ObjectWrapper.unwrap(zzqVarOooO0Oo.zzk(ObjectWrapper.wrap(context), str, z, ((Long) f14849OooO0oo.get()).longValue()));
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                int i = cursor.getInt(0);
                                                if (i > 0) {
                                                    o00O0 o00o2 = (o00O0) threadLocal.get();
                                                    if (o00o2 == null || o00o2.f40394OooO00o != null) {
                                                        z2 = false;
                                                    } else {
                                                        o00o2.f40394OooO00o = cursor;
                                                    }
                                                    cursor3 = z2 ? null : cursor;
                                                }
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor3 = cursor;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                            if (cursor3 != null) {
                                                cursor3.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor2.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarOooO0Oo.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarOooO0Oo.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return iZzf;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursor3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.f14852OooO00o;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f14852OooO00o.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }
}
