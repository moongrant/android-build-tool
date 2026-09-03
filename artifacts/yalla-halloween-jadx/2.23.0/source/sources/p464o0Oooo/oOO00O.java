package p464o0Oooo;

import com.appsflyer.AppsFlyerLib;
import com.common.support.apm.Sailfish;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0OOO.OooOO0;
import p386o0OOooOo.o00O0O0O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p579o0oOoo.o0o0000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oOO00O f46860OooO0Oo = new oOO00O();

    public oOO00O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long it = l;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        long jLongValue = it.longValue();
        o00oooOooO00o.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4213constructorimpl(Boolean.valueOf(o00oooOooO00o.OooO(String.valueOf(-836030906), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(String.valueOf(jLongValue), o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, (String) null, 4, (Object) null)))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        if (it.longValue() > 0) {
            AppsFlyerLib.getInstance().setCustomerUserId(String.valueOf(it));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", it);
            o00O0O0O.OooO00o("af_set_customer_user_id", linkedHashMap);
            o00O0O0O.OooO00o("app_open", linkedHashMap);
            Sailfish.INSTANCE.setUniqueId(String.valueOf(it));
            OooOO0.OooO00o().OooO0OO("userId", String.valueOf(it));
        }
        return Unit.INSTANCE;
    }
}
