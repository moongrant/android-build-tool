package p361o0OOOoOo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
import o0OO0o00.OooO00o;
import p377o0OOoO00.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO implements o0000O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Pattern f38468OooO0oO = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f38469OooO0oo = Pattern.quote("/");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38470OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f38471OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f38472OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f38473OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f38474OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O00 f38475OooO0o0;

    public o000OO(Context context, String str, OooOOO oooOOO, o0000O00 o0000o00) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f38471OooO0O0 = context;
        this.f38472OooO0OO = str;
        this.f38473OooO0Oo = oooOOO;
        this.f38475OooO0o0 = o0000o00;
        this.f38470OooO00o = new OooO00o();
    }

    public static String OooO0O0() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SYN_");
        sbOooO0o0.append(UUID.randomUUID().toString());
        return sbOooO0o0.toString();
    }

    @NonNull
    public final synchronized String OooO00o(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f38468OooO0oO.matcher(string).replaceAll("").toLowerCase(Locale.US);
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
        String str = this.f38474OooO0o;
        if (str != null) {
            return str;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        SharedPreferences sharedPreferencesOooO0oO = Oooo0.OooO0oO(this.f38471OooO0O0);
        String string = sharedPreferencesOooO0oO.getString("firebase.installation.id", null);
        String str2 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        if (this.f38475OooO0o0.OooO00o()) {
            try {
                strOooO0O0 = (String) o000Oo0.OooO00o(this.f38473OooO0Oo.getId());
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
                this.f38474OooO0o = sharedPreferencesOooO0oO.getString("crashlytics.installation.id", null);
            } else {
                this.f38474OooO0o = OooO00o(strOooO0O0, sharedPreferencesOooO0oO);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                this.f38474OooO0o = sharedPreferencesOooO0oO.getString("crashlytics.installation.id", null);
            } else {
                this.f38474OooO0o = OooO00o(OooO0O0(), sharedPreferencesOooO0oO);
            }
        }
        if (this.f38474OooO0o == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f38474OooO0o = OooO00o(OooO0O0(), sharedPreferencesOooO0oO);
        }
        String str4 = "Crashlytics installation ID: " + this.f38474OooO0o;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str4, null);
        }
        return this.f38474OooO0o;
    }

    public final String OooO0Oo() {
        String str;
        OooO00o oooO00o = this.f38470OooO00o;
        Context context = this.f38471OooO0O0;
        synchronized (oooO00o) {
            if (((String) oooO00o.f37917OooO0Oo) == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                oooO00o.f37917OooO0Oo = installerPackageName;
            }
            str = "".equals((String) oooO00o.f37917OooO0Oo) ? null : (String) oooO00o.f37917OooO0Oo;
        }
        return str;
    }

    public final String OooO0o0(String str) {
        return str.replaceAll(f38469OooO0oo, "");
    }
}
