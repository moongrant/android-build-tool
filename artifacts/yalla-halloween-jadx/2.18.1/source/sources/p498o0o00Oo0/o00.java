package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import com.appsflyer.AppsFlyerLib;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import p141o00OOoo.OooO;
import p168o00Ooo0.OooOOOO;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.o00O0O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00<T> f41292OooO00o = new o00<>();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long it = (Long) obj;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        long jLongValue = it.longValue();
        Objects.requireNonNull(o00o0oOooO00o);
        try {
            Result.Companion companion = Result.INSTANCE;
            String strValueOf = String.valueOf(o000O0O0.OooO00o(-19296459922960L).hashCode());
            String strOooO0OO = OooOOOO.OooO0OO(String.valueOf(jLongValue));
            Intrinsics.checkNotNullExpressionValue(strOooO0OO, o000O0O0.OooO00o(-19326524694032L));
            Result.m502constructorimpl(Boolean.valueOf(o00o0oOooO00o.OooO(strValueOf, strOooO0OO)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
        if (it.longValue() > 0) {
            AppsFlyerLib.getInstance().setCustomerUserId(String.valueOf(it));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("userId", it);
            OooO.OooO00o("af_set_customer_user_id", linkedHashMap);
            OooO.OooO00o("app_open", linkedHashMap);
        }
    }
}
