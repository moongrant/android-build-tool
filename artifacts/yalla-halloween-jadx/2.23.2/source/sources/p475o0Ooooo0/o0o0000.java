package p475o0Ooooo0;

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
import p285o0O0OOo.OooOo;
import p390o0OOooo.o00000;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;
import p590o0oOooo0.oO0oO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0o0000 f48068OooO0Oo = new o0o0000();

    public o0o0000() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        Long l2 = l;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(l2);
        long jLongValue = l2.longValue();
        oo000o0OooO00o.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m4215constructorimpl(Boolean.valueOf(oo000o0OooO00o.OooO(String.valueOf(-836030906), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(String.valueOf(jLongValue), oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, (String) null, 4, (Object) null)))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        if (l2.longValue() > 0) {
            AppsFlyerLib.getInstance().setCustomerUserId(String.valueOf(l2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", l2);
            o00000.OooO00o("af_set_customer_user_id", linkedHashMap);
            o00000.OooO00o("app_open", linkedHashMap);
            Sailfish.INSTANCE.setUniqueId(String.valueOf(l2));
            OooOo.OooO00o().OooO0OO("userId", String.valueOf(l2));
        }
        return Unit.INSTANCE;
    }
}
