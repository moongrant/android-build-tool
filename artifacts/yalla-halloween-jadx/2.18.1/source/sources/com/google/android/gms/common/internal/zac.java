package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.R;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import o000O00O.OooOOO0;
import o000O00O.OooOo00;
import p021OooOooo.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class zac {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("sCache")
    public static final o00oO0o<String, String> f15630OooO00o = new o00oO0o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @GuardedBy("sCache")
    public static Locale f15631OooO0O0;

    public static String OooO00o(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strOooO0O0 = OooO0O0(context, str);
        if (strOooO0O0 == null) {
            strOooO0O0 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strOooO0O0, str2);
    }

    @Nullable
    public static String OooO0O0(Context context, String str) {
        o00oO0o<String, String> o00oo0o2 = f15630OooO00o;
        synchronized (o00oo0o2) {
            Configuration configuration = context.getResources().getConfiguration();
            Locale locale = (Build.VERSION.SDK_INT >= 24 ? new OooOOO0(new OooOo00(o000O00O.OooO.OooO00o(configuration))) : OooOOO0.OooO00o(configuration.locale)).f28094OooO00o.get();
            if (!locale.equals(f15631OooO0O0)) {
                o00oo0o2.clear();
                f15631OooO0O0 = locale;
            }
            String orDefault = o00oo0o2.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            o00oo0o2.put(str, string);
            return string;
        }
    }

    public static String zaa(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.packageManager(context).getApplicationLabel(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String zab(Context context) {
        return context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
    }

    @NonNull
    public static String zac(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_button);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(android.R.string.ok) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_button);
        }
        return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_button);
    }

    @NonNull
    public static String zad(Context context, int i) {
        Resources resources = context.getResources();
        String strZaa = zaa(context);
        if (i == 1) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_text, strZaa);
        }
        if (i == 2) {
            return DeviceProperties.isWearableWithoutPlayStore(context) ? resources.getString(com.google.android.gms.base.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_text, strZaa);
        }
        if (i == 3) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_text, strZaa);
        }
        if (i == 5) {
            return OooO00o(context, "common_google_play_services_invalid_account_text", strZaa);
        }
        if (i == 7) {
            return OooO00o(context, "common_google_play_services_network_error_text", strZaa);
        }
        if (i == 9) {
            return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_unsupported_text, strZaa);
        }
        if (i == 20) {
            return OooO00o(context, "common_google_play_services_restricted_profile_text", strZaa);
        }
        switch (i) {
            case 16:
                return OooO00o(context, "common_google_play_services_api_unavailable_text", strZaa);
            case 17:
                return OooO00o(context, "common_google_play_services_sign_in_failed_text", strZaa);
            case 18:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_updating_text, strZaa);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strZaa);
        }
    }

    @NonNull
    public static String zae(Context context, int i) {
        return (i == 6 || i == 19) ? OooO00o(context, "common_google_play_services_resolution_required_text", zaa(context)) : zad(context, i);
    }

    @NonNull
    public static String zaf(Context context, int i) {
        String strOooO0O0 = i == 6 ? OooO0O0(context, "common_google_play_services_resolution_required_title") : zag(context, i);
        return strOooO0O0 == null ? context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker) : strOooO0O0;
    }

    @Nullable
    public static String zag(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.gms.base.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return OooO0O0(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return OooO0O0(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return OooO0O0(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return OooO0O0(context, "common_google_play_services_restricted_profile_title");
        }
    }
}
