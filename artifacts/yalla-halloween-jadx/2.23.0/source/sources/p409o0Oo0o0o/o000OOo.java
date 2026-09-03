package p409o0Oo0o0o;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.common.support.crypto.AESKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p480o0o000Oo.o00oO0o;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo extends o00oO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f45213OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f45214OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f45215OooO0Oo;

    public static final class OooO00o extends Lambda implements Function0<String> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            o000OOo o000ooo2 = o000OOo.this;
            o000ooo2.getClass();
            return o000ooo2.OooO0o0("imId", o0000.OooO0OO(oO00OOo0.single_imId));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<byte[]> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final byte[] invoke() {
            o000OOo o000ooo2 = o000OOo.this;
            o000ooo2.getClass();
            return AESKt.aesDecrypt$default(o000ooo2.OooO0o0(String.valueOf(104359), o0000.OooO0OO(oO00OOo0.single_imK)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<byte[]> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final byte[] invoke() {
            o000OOo o000ooo2 = o000OOo.this;
            o000ooo2.getClass();
            return AESKt.aesDecrypt$default(o000ooo2.OooO0o0(String.valueOf(104370), o0000.OooO0OO(oO00OOo0.single_imV)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null);
        }
    }

    public o000OOo() {
        super("key_table");
        String strOooO0o0 = OooO0o0("imK", "");
        if (!StringsKt.isBlank(strOooO0o0)) {
            OooO(String.valueOf(104359), strOooO0o0);
            OooOO0("imK");
        }
        String strOooO0o1 = OooO0o0("imV", "");
        if (!StringsKt.isBlank(strOooO0o1)) {
            OooO(String.valueOf(104370), strOooO0o1);
            OooOO0("imV");
        }
        String strOooO0o2 = OooO0o0("twitterKey", "");
        if (!StringsKt.isBlank(strOooO0o2)) {
            OooO(String.valueOf(-59014420), strOooO0o2);
            OooOO0("twitterKey");
        }
        String strOooO0o3 = OooO0o0("twitterSecret", "");
        if (!StringsKt.isBlank(strOooO0o3)) {
            OooO(String.valueOf(-1228471549), strOooO0o3);
            OooOO0("twitterSecret");
        }
        String strOooO0o4 = OooO0o0("instagramKey1", "");
        if (!StringsKt.isBlank(strOooO0o4)) {
            OooO(String.valueOf(-372408188), strOooO0o4);
            OooOO0("instagramKey1");
        }
        String strOooO0o5 = OooO0o0("instagramSecret1", "");
        if (!StringsKt.isBlank(strOooO0o5)) {
            OooO(String.valueOf(-2019988625), strOooO0o5);
            OooOO0("instagramSecret1");
        }
        String strOooO0o6 = OooO0o0("wechatKey1", "");
        if (!StringsKt.isBlank(strOooO0o6)) {
            OooO(String.valueOf(1657547256), strOooO0o6);
            OooOO0("wechatKey1");
        }
        String strOooO0o7 = OooO0o0("zegoKey1", "");
        if (!StringsKt.isBlank(strOooO0o7)) {
            OooO(String.valueOf(371703205), strOooO0o7);
            OooOO0("zegoKey1");
        }
        String strOooO0o8 = OooO0o0("appsFlyerKey1", "");
        if (!StringsKt.isBlank(strOooO0o8)) {
            OooO(String.valueOf(-1347112992), strOooO0o8);
            OooOO0("appsFlyerKey1");
        }
        this.f45213OooO0O0 = LazyKt.lazy(new OooO0O0());
        this.f45214OooO0OO = LazyKt.lazy(new OooO0OO());
        this.f45215OooO0Oo = LazyKt.lazy(new OooO00o());
    }

    @NotNull
    public final String OooOO0O() {
        return new String(AESKt.aesDecrypt$default(OooO0o0(String.valueOf(-372408188), o0000.OooO0OO(oO00OOo0.single_instagram_client_id)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
    }

    @NotNull
    public final String OooOO0o() {
        return new String(AESKt.aesDecrypt$default(OooO0o0(String.valueOf(1657547256), o0000.OooO0OO(oO00OOo0.wechat_app_id)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
    }

    @NotNull
    public final String OooOOO() {
        return OooO0o0(String.valueOf(1772725217), o0000.OooO0OO(oO00OOo0.single_yallaChat_appKey));
    }

    @NotNull
    public final String OooOOO0() {
        return OooO0o0(String.valueOf(-1751298935), o0000.OooO0OO(oO00OOo0.single_yallaChat_appId));
    }
}
