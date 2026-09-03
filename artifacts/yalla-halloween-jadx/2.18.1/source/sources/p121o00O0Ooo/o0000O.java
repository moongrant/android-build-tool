package p121o00O0Ooo;

import android.content.Context;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.OooOOO;
import com.airbnb.lottie.OooOOO0;
import com.airbnb.lottie.OooOOOO;
import com.airbnb.lottie.OooOo00;
import com.airbnb.lottie.o00Oo0;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Objects;
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
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O {
    public static final String OooO00o(String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        return StringsKt__StringsKt.endsWith$default((CharSequence) str, '/', false, 2, (Object) null) ? str : Intrinsics.stringPlus(str, "/");
    }

    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object OooO0O0(Context context, o00000O o00000o, String str, String str2, String str3, String str4, Continuation continuation) {
        o0000O0 o0000o1;
        String str5;
        String str6;
        Context context2;
        String str7;
        Object objWithContext;
        String str8;
        OooOO0O oooOO0O;
        Object objWithContext2;
        if (continuation instanceof o0000O0) {
            o0000o1 = (o0000O0) continuation;
            int i = o0000o1.f30888OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0000o1.f30888OoooO0 = i - Integer.MIN_VALUE;
            } else {
                o0000o1 = new o0000O0(continuation);
            }
        } else {
            o0000o1 = new o0000O0(continuation);
        }
        Object result = o0000o1.f30889OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o0000o1.f30888OoooO0;
        if (i2 != 0) {
            if (i2 == 1) {
                str7 = (String) o0000o1.f30884Oooo;
                String str9 = o0000o1.f30887Oooo0oo;
                String str10 = o0000o1.f30886Oooo0oO;
                context2 = (Context) o0000o1.f30885Oooo0o;
                ResultKt.throwOnFailure(result);
                str6 = str9;
                str5 = str10;
            } else if (i2 == 2) {
                oooOO0O = (OooOO0O) o0000o1.f30884Oooo;
                str8 = o0000o1.f30887Oooo0oo;
                str6 = o0000o1.f30886Oooo0oO;
                Context context3 = (Context) o0000o1.f30885Oooo0o;
                ResultKt.throwOnFailure(result);
                context2 = context3;
                o0000o1.f30885Oooo0o = oooOO0O;
                o0000o1.f30886Oooo0oO = null;
                o0000o1.f30887Oooo0oo = null;
                o0000o1.f30884Oooo = null;
                o0000o1.f30888OoooO0 = 3;
                if (!oooOO0O.f10046OooO0o0.isEmpty() || (objWithContext2 = BuildersKt.withContext(Dispatchers.getIO(), new o0000O00(oooOO0O, context2, str6, str8, null), o0000o1)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                }
                if (objWithContext2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOO0O = (OooOO0O) o0000o1.f30885Oooo0o;
                ResultKt.throwOnFailure(result);
            }
            return oooOO0O;
        }
        ResultKt.throwOnFailure(result);
        o00Oo0<OooOO0O> o00oo0OooO0Oo = OooO0Oo(context, o00000o, str4, false);
        if (o00oo0OooO0Oo == null) {
            throw new IllegalArgumentException(("Unable to create parsing task for " + o00000o + '.').toString());
        }
        o0000o1.f30885Oooo0o = context;
        str5 = str;
        o0000o1.f30886Oooo0oO = str5;
        str6 = str2;
        o0000o1.f30887Oooo0oo = str6;
        o0000o1.f30884Oooo = str3;
        o0000o1.f30888OoooO0 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(o0000o1), 1);
        cancellableContinuationImpl.initCancellability();
        o00oo0OooO0Oo.OooO0O0(new o0000Ooo(cancellableContinuationImpl));
        o00oo0OooO0Oo.OooO00o(new o0000(cancellableContinuationImpl));
        result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(o0000o1);
        }
        if (result == coroutine_suspended) {
            return coroutine_suspended;
        }
        context2 = context;
        str7 = str3;
        OooOO0O oooOO0O2 = (OooOO0O) result;
        o0000o1.f30885Oooo0o = context2;
        o0000o1.f30886Oooo0oO = str6;
        o0000o1.f30887Oooo0oo = str7;
        o0000o1.f30884Oooo = oooOO0O2;
        o0000o1.f30888OoooO0 = 2;
        if (!(!oooOO0O2.f10044OooO0Oo.isEmpty()) || (objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o0000oo(oooOO0O2, context2, str5, null), o0000o1)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objWithContext = Unit.INSTANCE;
        }
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        str8 = str7;
        oooOO0O = oooOO0O2;
        o0000o1.f30885Oooo0o = oooOO0O;
        o0000o1.f30886Oooo0oO = null;
        o0000o1.f30887Oooo0oo = null;
        o0000o1.f30884Oooo = null;
        o0000o1.f30888OoooO0 = 3;
        objWithContext2 = !oooOO0O.f10046OooO0o0.isEmpty() ? Unit.INSTANCE : Unit.INSTANCE;
        if (objWithContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return oooOO0O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o00000O0 OooO0OO(o0O00OO o0o00oo2) {
        return (o00000O0) o0o00oo2.getValue();
    }

    public static final o00Oo0<OooOO0O> OooO0Oo(Context context, o00000O o00000o, String str, boolean z) {
        if (o00000o instanceof o00000O.OooO0o) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                Objects.requireNonNull((o00000O.OooO0o) o00000o);
                return OooOOO0.OooO0oO(context, 0, OooOOO0.OooOOO0(context, 0));
            }
            Objects.requireNonNull((o00000O.OooO0o) o00000o);
            return OooOOO0.OooO0oO(context, 0, str);
        }
        if (o00000o instanceof o00000O.OooO) {
            if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
                Objects.requireNonNull((o00000O.OooO) o00000o);
                return OooOOO0.OooO(context, null);
            }
            Objects.requireNonNull((o00000O.OooO) o00000o);
            return OooOOO0.OooOO0(context, null, str);
        }
        if (o00000o instanceof o00000O.OooO0O0) {
            if (z) {
                return null;
            }
            Objects.requireNonNull((o00000O.OooO0O0) o00000o);
            FileInputStream fileInputStream = new FileInputStream((String) null);
            if (!StringsKt__StringsJVMKt.endsWith$default(null, "zip", false, 2, null)) {
                Map<String, o00Oo0<OooOO0O>> map = OooOOO0.f10057OooO00o;
                return OooOOO0.OooO00o(null, new OooOOO(fileInputStream));
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            Map<String, o00Oo0<OooOO0O>> map2 = OooOOO0.f10057OooO00o;
            return OooOOO0.OooO00o(null, new OooOo00(zipInputStream));
        }
        if (o00000o instanceof o00000O.OooO00o) {
            return Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__") ? OooOOO0.OooO0O0(context, ((o00000O.OooO00o) o00000o).f30872OooO00o) : OooOOO0.OooO0OO(context, ((o00000O.OooO00o) o00000o).f30872OooO00o, null);
        }
        if (!(o00000o instanceof o00000O.OooO0OO)) {
            throw new NoWhenBranchMatchedException();
        }
        if (Intrinsics.areEqual(str, "__LottieInternalDefaultCacheKey__")) {
            Objects.requireNonNull((o00000O.OooO0OO) o00000o);
            throw null;
        }
        Objects.requireNonNull((o00000O.OooO0OO) o00000o);
        Map<String, o00Oo0<OooOO0O>> map3 = OooOOO0.f10057OooO00o;
        return OooOOO0.OooO00o(str, new OooOOOO(str));
    }
}
