package p464o0Oooo;

import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p579o0oOoo.o0o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OoOoOo f46854OooO0Oo = new o0OoOoOo();

    public o0OoOoOo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String value = str;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(value, "it");
        o00oooOooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        o00oooOooO00o.OooO(String.valueOf(140975345), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, (String) null, 4, (Object) null)));
        return Unit.INSTANCE;
    }
}
