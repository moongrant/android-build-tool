package p475o0Ooooo0;

import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;
import p590o0oOooo0.oO0oO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0OOO00 f48110OooO0Oo = new oO0OOO00();

    public oO0OOO00() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String value = str;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(value);
        oo000o0OooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        oo000o0OooO00o.OooO(String.valueOf(140975345), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, (String) null, 4, (Object) null)));
        return Unit.INSTANCE;
    }
}
