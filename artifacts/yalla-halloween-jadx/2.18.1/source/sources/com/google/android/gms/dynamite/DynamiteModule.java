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
import dalvik.system.DelegateLastClassLoader;
import io.agora.rtc.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
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
    public static Boolean f15827OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static String f15828OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static boolean f15829OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static Boolean f15830OooO0o = null;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("DynamiteModule.class")
    public static int f15831OooO0o0 = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static zzq f15834OooOO0 = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    @GuardedBy("DynamiteModule.class")
    public static zzr f15835OooOO0O = null;

    @KeepForSdk
    public static final int REMOTE = 1;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15836OooO00o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ThreadLocal f15832OooO0oO = new ThreadLocal();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0OO00OO.OooO0OO f15833OooO0oo = new o0OO00OO.OooO0OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f15826OooO = new OooO00o();

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
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
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
        this.f15836OooO00o = context;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    public static int OooO00o(Context context, String str, boolean z, boolean z2) throws Throwable {
        Exception e;
        Throwable th;
        boolean z3;
        Cursor cursor = null;
        try {
            boolean z4 = true;
            Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f15833OooO0oo.get()).longValue())).build(), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z5 = false;
                        int i = cursorQuery.getInt(0);
                        if (i > 0) {
                            synchronized (DynamiteModule.class) {
                                f15828OooO0OO = cursorQuery.getString(2);
                                int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                if (columnIndex >= 0) {
                                    f15831OooO0o0 = cursorQuery.getInt(columnIndex);
                                }
                                int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                if (columnIndex2 >= 0) {
                                    z3 = cursorQuery.getInt(columnIndex2) != 0;
                                    f15829OooO0Oo = z3;
                                } else {
                                    z3 = false;
                                }
                            }
                            o0OO00OO.OooO0o oooO0o = (o0OO00OO.OooO0o) f15832OooO0oO.get();
                            if (oooO0o == null || oooO0o.f37209OooO00o != null) {
                                z4 = false;
                            } else {
                                oooO0o.f37209OooO00o = cursorQuery;
                            }
                            cursorQuery = z4 ? null : cursorQuery;
                            z5 = z3;
                        }
                        if (z2 && z5) {
                            throw new LoadingException("forcing fallback to container DynamiteLoader impl");
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return i;
                    }
                } catch (Exception e2) {
                    e = e2;
                    cursor = cursorQuery;
                    try {
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed", e);
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
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
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static DynamiteModule OooO0O0(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    public static void OooO0OO(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            f15835OooOO0O = zzrVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e);
        }
    }

    @GuardedBy("DynamiteModule.class")
    public static boolean OooO0Oo(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f15830OooO0o)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (f15830OooO0o == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            f15830OooO0o = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & Constants.ERR_WATERMARK_READ) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f15829OooO0Oo = true;
            }
        }
        if (!zBooleanValue) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return zBooleanValue;
    }

    @Nullable
    public static zzq OooO0o0(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = f15834OooOO0;
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
                    f15834OooOO0 = zzqVar;
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

    /* JADX WARN: Code duplicated, block: B:101:0x0202 A[Catch: all -> 0x020a, TRY_ENTER, TryCatch #3 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0202, B:102:0x0209), top: B:150:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0281 A[Catch: all -> 0x02c8, TryCatch #2 {all -> 0x02c8, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x020e, B:108:0x0218, B:110:0x021a, B:112:0x021c, B:113:0x0223, B:131:0x0281, B:132:0x0297, B:115:0x0225, B:117:0x0243, B:119:0x0253, B:129:0x0279, B:130:0x0280, B:133:0x0298, B:134:0x02c7), top: B:149:0x0025, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x007d A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #2 {all -> 0x02c8, blocks: (B:3:0x0025, B:7:0x006f, B:12:0x0077, B:15:0x007d, B:26:0x009f, B:107:0x020e, B:108:0x0218, B:110:0x021a, B:112:0x021c, B:113:0x0223, B:131:0x0281, B:132:0x0297, B:115:0x0225, B:117:0x0243, B:119:0x0253, B:129:0x0279, B:130:0x0280, B:133:0x0298, B:134:0x02c7), top: B:149:0x0025, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: all -> 0x020a, TryCatch #3 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:101:0x0202, B:102:0x0209), top: B:150:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TRY_ENTER, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TRY_ENTER, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0156 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x017a A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0181 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0189 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0198 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a2 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b2 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TRY_ENTER, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2 A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa A[Catch: all -> 0x020d, LoadingException -> 0x0219, RemoteException -> 0x021b, TryCatch #7 {RemoteException -> 0x021b, LoadingException -> 0x0219, all -> 0x020d, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00d2, B:40:0x00d8, B:42:0x00e0, B:44:0x00e4, B:45:0x00ef, B:52:0x00fc, B:54:0x0102, B:56:0x0129, B:58:0x0131, B:59:0x0138, B:60:0x013f, B:55:0x0116, B:63:0x0142, B:64:0x0143, B:65:0x014a, B:66:0x014b, B:67:0x0152, B:70:0x0155, B:71:0x0156, B:73:0x017a, B:75:0x0181, B:77:0x0189, B:83:0x01c1, B:85:0x01c7, B:95:0x01ea, B:96:0x01f1, B:78:0x0198, B:79:0x019f, B:81:0x01a2, B:82:0x01b2, B:97:0x01f2, B:98:0x01f9, B:99:0x01fa, B:100:0x0201, B:105:0x020c), top: B:152:0x00a1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x0281, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x0156, please report this as an issue */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i;
        Boolean bool;
        zzq zzqVarOooO0o0;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        o0OO00OO.OooO0o oooO0o;
        Cursor cursor;
        zzr zzrVar;
        o0OO00OO.OooO0o oooO0o2;
        Boolean boolValueOf;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        ThreadLocal threadLocal = f15832OooO0oO;
        o0OO00OO.OooO0o oooO0o3 = (o0OO00OO.OooO0o) threadLocal.get();
        o0OO00OO.OooO0o oooO0o4 = new o0OO00OO.OooO0o(null);
        threadLocal.set(oooO0o4);
        o0OO00OO.OooO0OO oooO0OO = f15833OooO0oo;
        long jLongValue = ((Long) oooO0OO.get()).longValue();
        try {
            oooO0OO.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, f15826OooO);
            Log.i("DynamiteModule", "Considering local module " + str + CertificateUtil.DELIMITER + selectionResultSelectModule.localVersion + " and remote module " + str + CertificateUtil.DELIMITER + selectionResultSelectModule.remoteVersion);
            int i2 = selectionResultSelectModule.selection;
            if (i2 != 0) {
                if (i2 != -1) {
                    if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            DynamiteModule dynamiteModuleOooO0O0 = OooO0O0(context, str);
                            if (jLongValue == 0) {
                                oooO0OO.remove();
                            } else {
                                oooO0OO.set(Long.valueOf(jLongValue));
                            }
                            cursor2 = oooO0o4.f37209OooO00o;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(oooO0o3);
                            return dynamiteModuleOooO0O0;
                        }
                        if (i2 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i2);
                        }
                        try {
                            i = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (OooO0Oo(context)) {
                                        throw new LoadingException("Remote loading disabled");
                                    }
                                    bool = f15827OooO0O0;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = f15835OooOO0O;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                    }
                                    oooO0o2 = (o0OO00OO.OooO0o) threadLocal.get();
                                    if (oooO0o2 != null || oooO0o2.f37209OooO00o == null) {
                                        throw new LoadingException("No result cursor");
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = oooO0o2.f37209OooO00o;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        boolValueOf = Boolean.valueOf(f15831OooO0o0 >= 2);
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
                                    zzqVarOooO0o0 = OooO0o0(context);
                                    if (zzqVarOooO0o0 != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.");
                                    }
                                    iZze = zzqVarOooO0o0.zze();
                                    if (iZze >= 3) {
                                        oooO0o = (o0OO00OO.OooO0o) threadLocal.get();
                                        if (oooO0o != null) {
                                            throw new LoadingException("No cached result cursor holder");
                                        }
                                        iObjectWrapperZzh = zzqVarOooO0o0.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(oooO0o.f37209OooO00o));
                                    } else if (iZze == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZzh = zzqVarOooO0o0.zzj(ObjectWrapper.wrap(context), str, i);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZzh = zzqVarOooO0o0.zzh(ObjectWrapper.wrap(context), str, i);
                                    }
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                    if (objUnwrap != null) {
                                        throw new LoadingException("Failed to load remote module.");
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                }
                                if (jLongValue == 0) {
                                    oooO0OO.remove();
                                } else {
                                    oooO0OO.set(Long.valueOf(jLongValue));
                                }
                                cursor = oooO0o4.f37209OooO00o;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(oooO0o3);
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
                            DynamiteModule dynamiteModuleOooO0O1 = OooO0O0(context, str);
                            if (jLongValue == 0) {
                                f15833OooO0oo.remove();
                            } else {
                                f15833OooO0oo.set(Long.valueOf(jLongValue));
                            }
                            Cursor cursor4 = oooO0o4.f37209OooO00o;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f15832OooO0oO.set(oooO0o3);
                            return dynamiteModuleOooO0O1;
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i2 = -1;
                    if (i2 == 1) {
                    }
                    if (i2 == -1) {
                        DynamiteModule dynamiteModuleOooO0O2 = OooO0O0(context, str);
                        if (jLongValue == 0) {
                            oooO0OO.remove();
                        } else {
                            oooO0OO.set(Long.valueOf(jLongValue));
                        }
                        cursor2 = oooO0o4.f37209OooO00o;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(oooO0o3);
                        return dynamiteModuleOooO0O2;
                    }
                    if (i2 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2);
                    }
                    i = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (OooO0Oo(context)) {
                            throw new LoadingException("Remote loading disabled");
                        }
                        bool = f15827OooO0O0;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                            synchronized (DynamiteModule.class) {
                                zzrVar = f15835OooOO0O;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                oooO0o2 = (o0OO00OO.OooO0o) threadLocal.get();
                                if (oooO0o2 != null) {
                                }
                                throw new LoadingException("No result cursor");
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                        zzqVarOooO0o0 = OooO0o0(context);
                        if (zzqVarOooO0o0 != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.");
                        }
                        iZze = zzqVarOooO0o0.zze();
                        if (iZze >= 3) {
                            oooO0o = (o0OO00OO.OooO0o) threadLocal.get();
                            if (oooO0o != null) {
                                throw new LoadingException("No cached result cursor holder");
                            }
                            iObjectWrapperZzh = zzqVarOooO0o0.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(oooO0o.f37209OooO00o));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarOooO0o0.zzj(ObjectWrapper.wrap(context), str, i);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarOooO0o0.zzh(ObjectWrapper.wrap(context), str, i);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.");
                        }
                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            oooO0OO.remove();
                        } else {
                            oooO0OO.set(Long.valueOf(jLongValue));
                        }
                        cursor = oooO0o4.f37209OooO00o;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(oooO0o3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".");
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f15833OooO0oo.remove();
            } else {
                f15833OooO0oo.set(Long.valueOf(jLongValue));
            }
            Cursor cursor5 = oooO0o4.f37209OooO00o;
            if (cursor5 != null) {
                cursor5.close();
            }
            f15832OooO0oO.set(oooO0o3);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00a7 A[Catch: all -> 0x00b2, TryCatch #6 {, blocks: (B:9:0x0027, B:11:0x0033, B:47:0x00b0, B:14:0x0039, B:16:0x0040, B:18:0x0046, B:21:0x0049, B:23:0x004d, B:26:0x0056, B:28:0x005e, B:31:0x0065, B:38:0x008f, B:39:0x0097, B:34:0x006c, B:36:0x0072, B:37:0x0081, B:42:0x009a, B:45:0x009d, B:46:0x00a7, B:15:0x003c), top: B:138:0x0027, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0172 A[Catch: all -> 0x01cd, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x01cd, blocks: (B:3:0x0002, B:60:0x00d9, B:62:0x00df, B:67:0x0100, B:95:0x0164, B:99:0x0172, B:120:0x01c6, B:121:0x01c9, B:116:0x01be, B:65:0x00e5, B:124:0x01cc, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:58:0x00d6, B:19:0x0047, B:40:0x0098, B:43:0x009b, B:51:0x00b4, B:59:0x00d8, B:57:0x00ba), top: B:137:0x0002, inners: #3, #10 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        Cursor cursor;
        RemoteException e;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f15827OooO0O0;
                boolean z2 = true;
                Cursor cursor3 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    OooO0OO(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!OooO0Oo(context)) {
                                    return 0;
                                }
                                if (f15829OooO0Oo) {
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
                                            String str2 = f15828OooO0OO;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = f15828OooO0OO;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = f15828OooO0OO;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new o0OO00OO.OooO0O0(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                OooO0OO(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                f15827OooO0O0 = bool2;
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
                            f15827OooO0O0 = bool;
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
                zzq zzqVarOooO0o0 = OooO0o0(context);
                if (zzqVarOooO0o0 != null) {
                    try {
                        try {
                            int iZze = zzqVarOooO0o0.zze();
                            if (iZze >= 3) {
                                ThreadLocal threadLocal = f15832OooO0oO;
                                o0OO00OO.OooO0o oooO0o = (o0OO00OO.OooO0o) threadLocal.get();
                                if (oooO0o == null || (cursor2 = oooO0o.f37209OooO00o) == null) {
                                    cursor = (Cursor) ObjectWrapper.unwrap(zzqVarOooO0o0.zzk(ObjectWrapper.wrap(context), str, z, ((Long) f15833OooO0oo.get()).longValue()));
                                    if (cursor != null) {
                                        try {
                                            if (cursor.moveToFirst()) {
                                                int i = cursor.getInt(0);
                                                if (i > 0) {
                                                    o0OO00OO.OooO0o oooO0o2 = (o0OO00OO.OooO0o) threadLocal.get();
                                                    if (oooO0o2 == null || oooO0o2.f37209OooO00o != null) {
                                                        z2 = false;
                                                    } else {
                                                        oooO0o2.f37209OooO00o = cursor;
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
                                iZzf = zzqVarOooO0o0.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarOooO0o0.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursor3;
                    }
                }
                return iZzf;
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.f15836OooO00o;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f15836OooO00o.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e);
        }
    }
}
