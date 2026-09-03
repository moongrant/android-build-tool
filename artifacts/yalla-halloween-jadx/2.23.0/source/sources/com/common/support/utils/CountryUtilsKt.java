package com.common.support.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p063o0000oO.o00oO0o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0000\u001a\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0006\u0010\b\u001a\u00020\u0007\u001a\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005\u001a\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"", "getCountryCodeBySim", "getCountryCodeFromDefaultLocale", "getCountryCodeFromSystemLocale", "getSystemLanguageCode", "Ljava/util/Locale;", "getDefaultLocale", "Landroidx/core/os/OooO00o;", "getSystemLocale", "Landroid/content/Context;", "context", "language", "oldLocale", "", "updateLanguage", "setLanguage", "utils_release"}, k = 2, mv = {1, 5, 1})
public final class CountryUtilsKt {
    @NotNull
    public static final String getCountryCodeBySim() {
        Object systemService = Utils.INSTANCE.getApp().getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            return "";
        }
        String isoCountryCode = telephonyManager.getNetworkCountryIso();
        if (isoCountryCode == null || StringsKt.isBlank(isoCountryCode)) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(isoCountryCode, "isoCountryCode");
        String upperCase = isoCountryCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @NotNull
    public static final String getCountryCodeFromDefaultLocale() {
        String country = getDefaultLocale().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getDefaultLocale().country");
        return country;
    }

    @NotNull
    public static final String getCountryCodeFromSystemLocale() {
        Object objM4213constructorimpl;
        String country;
        try {
            Result.Companion companion = Result.INSTANCE;
            Locale localeOooO0OO = getSystemLocale().OooO0OO(0);
            if (localeOooO0OO == null || (country = localeOooO0OO.getCountry()) == null) {
                country = "";
            }
            objM4213constructorimpl = Result.m4213constructorimpl(country);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m4216exceptionOrNullimpl(objM4213constructorimpl) == null ? objM4213constructorimpl : "");
    }

    @NotNull
    public static final Locale getDefaultLocale() {
        Locale locale = Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault();
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        return locale2;
    }

    @NotNull
    public static final String getSystemLanguageCode() {
        Object objM4213constructorimpl;
        String language;
        try {
            Result.Companion companion = Result.INSTANCE;
            Locale localeOooO0OO = getSystemLocale().OooO0OO(0);
            if (localeOooO0OO == null || (language = localeOooO0OO.getLanguage()) == null) {
                language = "";
            }
            objM4213constructorimpl = Result.m4213constructorimpl(language);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m4216exceptionOrNullimpl(objM4213constructorimpl) == null ? objM4213constructorimpl : "");
    }

    @NotNull
    public static final androidx.core.os.OooO00o getSystemLocale() {
        androidx.core.os.OooO00o OooO00o2 = o00oO0o.OooO00o(Resources.getSystem().getConfiguration());
        Intrinsics.checkNotNullExpressionValue(OooO00o2, "getLocales(configuration)");
        return OooO00o2;
    }

    @NotNull
    public static final Context setLanguage(@NotNull Context context, @NotNull String language, @NotNull Locale oldLocale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(oldLocale, "oldLocale");
        try {
            Locale locale = new Locale(language, oldLocale.getCountry(), oldLocale.getVariant());
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            Locale.setDefault(locale);
            Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
            Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "context.createConfigurationContext(config)");
            return contextCreateConfigurationContext;
        } catch (Exception e) {
            e.printStackTrace();
            return context;
        }
    }

    public static final void updateLanguage(@NotNull Context context, @NotNull String language, @NotNull Locale oldLocale) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(oldLocale, "oldLocale");
        try {
            Locale locale = new Locale(language, oldLocale.getCountry(), oldLocale.getVariant());
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            Locale.setDefault(locale);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
