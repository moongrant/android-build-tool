package p487o0o000oO;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p168o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0Oo0oo f40947OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40948OooO0O0 = LazyKt.lazy(OooO.f40954Oooo0o);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40949OooO0OO = LazyKt.lazy(OooOO0.f40959Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f40950OooO0Oo = LazyKt.lazy(OooO0o.f40958Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f40952OooO0o0 = LazyKt.lazy(OooO0OO.f40957Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f40951OooO0o = LazyKt.lazy(OooO0O0.f40956Oooo0o);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f40953OooO0oO = LazyKt.lazy(OooO00o.f40955Oooo0o);

    public static final class OooO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f40954Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40955Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = "arm64-v8a";
            try {
                String line = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                Intrinsics.checkNotNullExpressionValue(line, "BufferedReader(InputStre….inputStream)).readLine()");
                if (!StringsKt__StringsKt.contains(line, "arm64-v8a", true)) {
                    if (StringsKt__StringsKt.contains(line, "armeabi-v7a", true)) {
                        str = "armeabi-v7a";
                    } else {
                        str = StringsKt__StringsKt.contains(line, "x86", true) ? "x86" : "other";
                    }
                }
                return str;
            } catch (Exception unused) {
                return "other";
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f40956Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String strOooO0OO = o00000O.OooO0O0().OooO0OO("APP_DEVICEDID");
            boolean z = true;
            if (strOooO0OO == null || StringsKt.isBlank(strOooO0OO)) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                strOooO0OO = StringsKt.OooOo00(string, "-", "");
            }
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                int i = o0O0O00.f32652OooO00o;
                Random random = new Random();
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < 32; i2++) {
                    stringBuffer.append("zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt(random.nextInt(62)));
                }
                strOooO0OO = stringBuffer.toString();
            }
            o00000O.OooO0O0().OooO0oO("APP_DEVICEDID", strOooO0OO);
            return strOooO0OO;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f40957Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            return StringsKt.trim((CharSequence) BRAND).toString();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f40958Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            return StringsKt.trim((CharSequence) MODEL).toString();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f40959Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    @NotNull
    public static final String OooO00o() {
        Object value = f40951OooO0o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-deviceId>(...)");
        return (String) value;
    }

    @NotNull
    public static final String OooO0O0() {
        return (String) f40952OooO0o0.getValue();
    }

    @NotNull
    public static final String OooO0OO() {
        return (String) f40950OooO0Oo.getValue();
    }

    @NotNull
    public static final String OooO0Oo() {
        Object value = f40949OooO0OO.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-systemVersionName>(...)");
        return (String) value;
    }
}
