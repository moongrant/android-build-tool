package p382o0OOoo0o;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0000OO0;
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
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44306OooO00o = LazyKt.lazy(OooO.f44312OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44307OooO0O0 = LazyKt.lazy(OooOO0.f44317OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f44308OooO0OO = LazyKt.lazy(OooO0o.f44316OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f44309OooO0Oo = LazyKt.lazy(OooO0OO.f44315OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f44311OooO0o0 = LazyKt.lazy(OooO0O0.f44314OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f44310OooO0o = LazyKt.lazy(OooO00o.f44313OooO0Oo);

    public static final class OooO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f44312OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class OooO00o extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44313OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String str = "x86";
            try {
                String line = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
                Intrinsics.checkNotNullExpressionValue(line, "BufferedReader(InputStre….inputStream)).readLine()");
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
        public static final OooO0O0 f44314OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String strOooO00o = o0000OO0.OooO0O0().OooO00o("APP_DEVICEDID");
            boolean z = true;
            if (strOooO00o == null || StringsKt.isBlank(strOooO00o)) {
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                strOooO00o = StringsKt.OooOoO(string, "-", "");
            }
            if (strOooO00o != null && !StringsKt.isBlank(strOooO00o)) {
                z = false;
            }
            if (z) {
                int i = OooOOOO.f56797OooO00o;
                Random random = new Random();
                StringBuffer stringBuffer = new StringBuffer();
                for (int i2 = 0; i2 < 32; i2++) {
                    stringBuffer.append("zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890".charAt(random.nextInt(62)));
                }
                strOooO00o = stringBuffer.toString();
            }
            o0000OO0.OooO0O0().OooO0o0("APP_DEVICEDID", strOooO00o);
            return strOooO00o;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f44315OooO0Oo = new OooO0OO();

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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f44316OooO0Oo = new OooO0o();

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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f44317OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    @NotNull
    public static String OooO00o() {
        Object value = f44311OooO0o0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-deviceId>(...)");
        return (String) value;
    }

    @NotNull
    public static String OooO0O0() {
        return (String) f44309OooO0Oo.getValue();
    }

    @NotNull
    public static String OooO0OO() {
        return (String) f44308OooO0OO.getValue();
    }

    @NotNull
    public static String OooO0Oo() {
        Object value = f44307OooO0O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-systemVersionName>(...)");
        return (String) value;
    }
}
