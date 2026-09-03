package p285o0O0OOoo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import o0O0o0.OooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 implements o000O0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f42161OooO0oO = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f42162OooO0oo = Pattern.quote("/");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000Oo0 f42163OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f42164OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f42165OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f42166OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f42167OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO f42168OooO0o0;

    public o000O000(Context context, String str, OooO oooO, o000OO o000oo2) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f42164OooO0O0 = context;
        this.f42165OooO0OO = str;
        this.f42166OooO0Oo = oooO;
        this.f42168OooO0o0 = o000oo2;
        this.f42163OooO00o = new o000Oo0();
    }

    public static String OooO0O0() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @NonNull
    public final synchronized String OooO00o(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f42161OooO0oO.matcher(string).replaceAll("").toLowerCase(Locale.US);
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
        String str = this.f42167OooO0o;
        if (str != null) {
            return str;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        boolean z = false;
        SharedPreferences sharedPreferences = this.f42164OooO0O0.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        String str2 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        if (this.f42168OooO0o0.OooO00o()) {
            try {
                strOooO0O0 = (String) o00O00.OooO00o(this.f42166OooO0Oo.getId());
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
                this.f42167OooO0o = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f42167OooO0o = OooO00o(strOooO0O0, sharedPreferences);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z = true;
            }
            if (z) {
                this.f42167OooO0o = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f42167OooO0o = OooO00o(OooO0O0(), sharedPreferences);
            }
        }
        if (this.f42167OooO0o == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f42167OooO0o = OooO00o(OooO0O0(), sharedPreferences);
        }
        String str4 = "Crashlytics installation ID: " + this.f42167OooO0o;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str4, null);
        }
        return this.f42167OooO0o;
    }

    public final String OooO0Oo() {
        String str;
        o000Oo0 o000oo1 = this.f42163OooO00o;
        Context context = this.f42164OooO0O0;
        synchronized (o000oo1) {
            if (o000oo1.f42178OooO00o == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                o000oo1.f42178OooO00o = installerPackageName;
            }
            str = "".equals(o000oo1.f42178OooO00o) ? null : o000oo1.f42178OooO00o;
        }
        return str;
    }
}
