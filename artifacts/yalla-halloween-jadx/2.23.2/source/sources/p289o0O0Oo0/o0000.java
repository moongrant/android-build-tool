package p289o0O0Oo0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import p302o0O0o0OO.o0000O0O;
import p416o0Oo0oo.oO00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 implements o0000O00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f41481OooO0oO = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f41482OooO0oo = Pattern.quote("/");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00Oo0 f41483OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f41484OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41485OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O0O f41486OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f41487OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O0 f41488OooO0o0;

    public o0000(Context context, String str, o0000O0O o0000o0o2, o00000O0 o00000o1) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f41484OooO0O0 = context;
        this.f41485OooO0OO = str;
        this.f41486OooO0Oo = o0000o0o2;
        this.f41488OooO0o0 = o00000o1;
        this.f41483OooO00o = new oO00Oo0(1);
    }

    public static String OooO0O0() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @NonNull
    public final synchronized String OooO00o(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f41481OooO0oO.matcher(string).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @NonNull
    public final synchronized String OooO0OO() {
        String strOooO0O0;
        String str = this.f41487OooO0o;
        if (str != null) {
            return str;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = this.f41484OooO0O0.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        String str2 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        if (this.f41488OooO0o0.OooO00o()) {
            try {
                strOooO0O0 = (String) o000OO00.OooO00o(this.f41486OooO0Oo.getId());
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e);
                strOooO0O0 = null;
            }
            String str3 = "Fetched Firebase Installation ID: " + strOooO0O0;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            if (strOooO0O0 == null) {
                strOooO0O0 = string == null ? OooO0O0() : string;
            }
            if (strOooO0O0.equals(string)) {
                this.f41487OooO0o = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f41487OooO0o = OooO00o(strOooO0O0, sharedPreferences);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z = true;
            }
            if (z) {
                this.f41487OooO0o = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f41487OooO0o = OooO00o(OooO0O0(), sharedPreferences);
            }
        }
        if (this.f41487OooO0o == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f41487OooO0o = OooO00o(OooO0O0(), sharedPreferences);
        }
        String str4 = "Crashlytics installation ID: " + this.f41487OooO0o;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str4, null);
        }
        return this.f41487OooO0o;
    }

    public final String OooO0Oo() {
        String str;
        oO00Oo0 oo00oo0 = this.f41483OooO00o;
        Context context = this.f41484OooO0O0;
        synchronized (oo00oo0) {
            if (((String) oo00oo0.f46471OooO00o) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                oo00oo0.f46471OooO00o = installerPackageName;
            }
            str = "".equals((String) oo00oo0.f46471OooO00o) ? null : (String) oo00oo0.f46471OooO00o;
        }
        return str;
    }
}
