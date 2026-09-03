package o00OO0O;

import android.content.Context;
import com.airbnb.lottie.o00oO0o;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {
    public static final String OooO00o(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return StringsKt__StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null) ? str : Intrinsics.stringPlus(str, "/");
    }

    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object OooO0O0(Context context, OooOOO oooOOO, String str, String str2, String str3, String str4, Continuation continuation) throws Throwable {
        o000oOoO o000oooo2;
        String str5;
        String str6;
        Context context2;
        String str7;
        Object objWithContext;
        String str8;
        com.airbnb.lottie.OooOO0 oooOO1;
        Object objWithContext2;
        if (continuation instanceof o000oOoO) {
            o000oooo2 = (o000oOoO) continuation;
            int i = o000oooo2.f37220OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                o000oooo2.f37220OooO = i - Integer.MIN_VALUE;
            } else {
                o000oooo2 = new o000oOoO(continuation);
            }
        } else {
            o000oooo2 = new o000oOoO(continuation);
        }
        Object result = o000oooo2.f37225OooO0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o000oooo2.f37220OooO;
        if (i2 != 0) {
            if (i2 == 1) {
                str7 = (String) o000oooo2.f37224OooO0oO;
                String str9 = o000oooo2.f37222OooO0o;
                String str10 = o000oooo2.f37223OooO0o0;
                context2 = (Context) o000oooo2.f37221OooO0Oo;
                ResultKt.throwOnFailure(result);
                str6 = str9;
                str5 = str10;
            } else if (i2 == 2) {
                oooOO1 = (com.airbnb.lottie.OooOO0) o000oooo2.f37224OooO0oO;
                str8 = o000oooo2.f37222OooO0o;
                str6 = o000oooo2.f37223OooO0o0;
                Context context3 = (Context) o000oooo2.f37221OooO0Oo;
                ResultKt.throwOnFailure(result);
                context2 = context3;
                o000oooo2.f37221OooO0Oo = oooOO1;
                o000oooo2.f37223OooO0o0 = null;
                o000oooo2.f37222OooO0o = null;
                o000oooo2.f37224OooO0oO = null;
                o000oooo2.f37220OooO = 3;
                if (!oooOO1.f11818OooO0o0.isEmpty() || (objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new Oooo000(context2, oooOO1, str6, str8, null), o000oooo2)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (objWithContext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOO1 = (com.airbnb.lottie.OooOO0) o000oooo2.f37221OooO0Oo;
                ResultKt.throwOnFailure(result);
            }
            return oooOO1;
        }
        ResultKt.throwOnFailure(result);
        o00oO0o<com.airbnb.lottie.OooOO0> o00oo0oOooO0OO = OooO0OO(context, oooOOO, str4, false);
        if (o00oo0oOooO0OO == null) {
            throw new IllegalArgumentException(("Unable to create parsing task for " + oooOOO + '.').toString());
        }
        o000oooo2.f37221OooO0Oo = context;
        str5 = str;
        o000oooo2.f37223OooO0o0 = str5;
        str6 = str2;
        o000oooo2.f37222OooO0o = str6;
        o000oooo2.f37224OooO0oO = str3;
        o000oooo2.f37220OooO = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(o000oooo2), 1);
        cancellableContinuationImpl.initCancellability();
        o00oo0oOooO0OO.OooO0OO(new OooOo00(cancellableContinuationImpl));
        o00oo0oOooO0OO.OooO0O0(new OooOo(cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(o000oooo2);
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        context2 = context;
        str7 = str3;
        com.airbnb.lottie.OooOO0 oooOO2 = (com.airbnb.lottie.OooOO0) result;
        o000oooo2.f37221OooO0Oo = context2;
        o000oooo2.f37223OooO0o0 = str6;
        o000oooo2.f37222OooO0o = str7;
        o000oooo2.f37224OooO0oO = oooOO2;
        o000oooo2.f37220OooO = 2;
        if (!(!oooOO2.f11816OooO0Oo.isEmpty()) || (objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new Oooo0(context2, oooOO2, str5, null), o000oooo2)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objWithContext = Unit.INSTANCE;
        }
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        str8 = str7;
        oooOO1 = oooOO2;
        o000oooo2.f37221OooO0Oo = oooOO1;
        o000oooo2.f37223OooO0o0 = null;
        o000oooo2.f37222OooO0o = null;
        o000oooo2.f37224OooO0oO = null;
        o000oooo2.f37220OooO = 3;
        objWithContext2 = !oooOO1.f11818OooO0o0.isEmpty() ? Unit.INSTANCE : Unit.INSTANCE;
        if (objWithContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return oooOO1;
    }

    public static final o00oO0o<com.airbnb.lottie.OooOO0> OooO0OO(Context context, OooOOO oooOOO, String str, boolean z) {
        if (oooOOO instanceof OooOOO.OooO0o) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                ((OooOOO.OooO0o) oooOOO).getClass();
                return com.airbnb.lottie.OooOO0O.OooO0o0(0, context, com.airbnb.lottie.OooOO0O.OooO(0, context));
            }
            ((OooOOO.OooO0o) oooOOO).getClass();
            return com.airbnb.lottie.OooOO0O.OooO0o0(0, context, str);
        }
        if (oooOOO instanceof OooOOO.OooO) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                ((OooOOO.OooO) oooOOO).getClass();
                return com.airbnb.lottie.OooOO0O.OooO00o("url_null", new com.airbnb.lottie.OooOOO0(context, null, "url_null"));
            }
            ((OooOOO.OooO) oooOOO).getClass();
            return com.airbnb.lottie.OooOO0O.OooO00o(str, new com.airbnb.lottie.OooOOO0(context, null, str));
        }
        if (oooOOO instanceof OooOOO.OooO0O0) {
            if (z) {
                return null;
            }
            ((OooOOO.OooO0O0) oooOOO).getClass();
            FileInputStream fileInputStream = new FileInputStream((String) null);
            return StringsKt__StringsJVMKt.endsWith$default(null, "zip", false, 2, null) ? com.airbnb.lottie.OooOO0O.OooO00o(null, new com.airbnb.lottie.Oooo000(new ZipInputStream(fileInputStream))) : com.airbnb.lottie.OooOO0O.OooO00o(null, new com.airbnb.lottie.OooOo00(fileInputStream));
        }
        if (!(oooOOO instanceof OooOOO.OooO00o)) {
            if (!(oooOOO instanceof OooOOO.OooO0OO)) {
                throw new NoWhenBranchMatchedException();
            }
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                ((OooOOO.OooO0OO) oooOOO).getClass();
                throw null;
            }
            ((OooOOO.OooO0OO) oooOOO).getClass();
            return com.airbnb.lottie.OooOO0O.OooO00o(str, new com.airbnb.lottie.OooOo(str));
        }
        if (!Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
            String str2 = ((OooOOO.OooO00o) oooOOO).f37199OooO00o;
            HashMap map = com.airbnb.lottie.OooOO0O.f11827OooO00o;
            return com.airbnb.lottie.OooOO0O.OooO00o(null, new com.airbnb.lottie.OooOOO(context.getApplicationContext(), str2, null));
        }
        String str3 = ((OooOOO.OooO00o) oooOOO).f37199OooO00o;
        HashMap map2 = com.airbnb.lottie.OooOO0O.f11827OooO00o;
        String strOooO00o = o00O00OO.OooO00o("asset_", str3);
        return com.airbnb.lottie.OooOO0O.OooO00o(strOooO00o, new com.airbnb.lottie.OooOOO(context.getApplicationContext(), str3, strOooO00o));
    }
}
