package p386o0OOooO;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.StringKt;
import com.code.android.util.o000O00O;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p063o0000oO.o00O0O;
import p063o0000oO.o00oO0o;
import p269o00oooo0.o0O0oo0o;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43482OooO00o = LazyKt.lazy(OooOO0O.f43496OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43483OooO0O0 = LazyKt.lazy(OooOOO0.f43497OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f43484OooO0OO = LazyKt.lazy(OooO.f43490OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f43485OooO0Oo = LazyKt.lazy(OooO0o.f43494OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f43487OooO0o0 = LazyKt.lazy(OooOO0.f43495OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f43486OooO0o = LazyKt.lazy(OooO0O0.f43492OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f43488OooO0oO = LazyKt.lazy(OooO0OO.f43493OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f43489OooO0oo = LazyKt.lazy(OooO00o.f43491OooO0Oo);

    public static final class OooO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f43490OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            return StringsKt.trim((CharSequence) MODEL).toString();
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f43491OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = "x86";
            try {
                String line = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
                if (StringsKt__StringsKt.contains(line, "arm64-v8a", true)) {
                    str = "arm64-v8a";
                } else if (StringsKt__StringsKt.contains(line, "armeabi-v7a", true)) {
                    str = "armeabi-v7a";
                } else if (StringsKt__StringsKt.contains(line, "x86-64", true)) {
                    str = "x86-64";
                } else if (!StringsKt__StringsKt.contains(line, "x86", true)) {
                    str = "other";
                }
                return str;
            } catch (Exception unused) {
                return "other";
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f43492OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            o00oO0o o00oo0oOooO00o = o00O0O.OooO00o(Resources.getSystem().getConfiguration());
            Intrinsics.checkNotNullExpressionValue(o00oo0oOooO00o, "getLocales(...)");
            String upperCase = null;
            if (!o00oo0oOooO00o.OooO0Oo()) {
                Locale localeOooO0OO = o00oo0oOooO00o.OooO0OO(0);
                String country = localeOooO0OO != null ? localeOooO0OO.getCountry() : null;
                if (!(country == null || country.length() == 0)) {
                    upperCase = StringKt.toUpperCase(country, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
                }
            }
            return upperCase == null ? "" : upperCase;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f43493OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String strOooO00o = o0O0oo0o.OooO00o().OooO00o("APP_DEVICEDID");
            boolean z = true;
            if (strOooO00o == null || StringsKt.isBlank(strOooO00o)) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                strOooO00o = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
            }
            if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
                z = false;
            }
            if (z) {
                int i = o0O0O0Oo.f57394OooO00o;
                Random random = new Random();
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < 32; i2++) {
                    stringBuffer.append("zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt(random.nextInt(62)));
                }
                strOooO00o = stringBuffer.toString();
            }
            o0O0oo0o.OooO00o().OooO0o0("APP_DEVICEDID", strOooO00o);
            return strOooO00o;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f43494OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            return StringsKt.trim((CharSequence) BRAND).toString();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f43495OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String upperCase;
            Context context = o000O00O.OooO00o();
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("phone");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            if (simCountryIso == null || simCountryIso.length() == 0) {
                upperCase = null;
            } else {
                Intrinsics.checkNotNull(simCountryIso);
                upperCase = StringKt.toUpperCase(simCountryIso, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
            }
            return upperCase == null ? "" : upperCase;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f43496OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f43497OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    @NotNull
    public static String OooO00o() {
        Object value = f43488OooO0oO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    @NotNull
    public static String OooO0O0() {
        return (String) f43485OooO0Oo.getValue();
    }

    @NotNull
    public static String OooO0OO() {
        return (String) f43484OooO0OO.getValue();
    }

    @NotNull
    public static String OooO0Oo() {
        Object value = f43483OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }
}
