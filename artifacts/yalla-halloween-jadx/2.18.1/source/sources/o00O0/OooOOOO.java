package o00O0;

import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.network.HttpException;
import coil.size.Size;
import java.io.IOException;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.o00oO0o;
import p119o00O0Oo0.o00O0O;
import p119o00O0Oo0.o0OOO0o;
import p660o0ooo0o0.o00O0000;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0O0ooO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOOO<T> implements OooOO0O<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00O0000 f30080OooO0O0 = new o00O0000(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0000 f30081OooO0OO = new o00O0000(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O0ooO.OooO00o f30082OooO00o;

    public OooOOOO(@NotNull o0O0ooO.OooO00o callFactory) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        this.f30082OooO00o = callFactory;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0126  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0153  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0107, please report this as an issue */
    public static Object OooO0Oo(OooOOOO oooOOOO, Object obj, o00oO0o o00oo0o2, Continuation continuation) throws IOException {
        OooOOO oooOOO;
        o00OO000 data;
        o00OOOO0 response;
        o00OOOOo body;
        o00OO0O0 o00oo0o0OooO0o;
        String str;
        String strOooO0O0;
        DataSource dataSource;
        o00OOOOo o00ooooo2;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f30077OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f30077OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(oooOOOO, continuation);
            }
        } else {
            oooOOO = new OooOOO(oooOOOO, continuation);
        }
        Object result = oooOOO.f30073Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f30077OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            data = oooOOOO.OooO0o0(obj);
            o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o();
            oooO00o.OooOOO0(data);
            oooO00o.OooO0o(o00oo0o2.f30382OooO0oo);
            boolean readEnabled = o00oo0o2.f30385OooOO0o.getReadEnabled();
            boolean readEnabled2 = o00oo0o2.f30384OooOO0O.getReadEnabled();
            if (!readEnabled && readEnabled2) {
                oooO00o.OooO0OO(o00O0000.f51262OooOOOO);
            } else if (!readEnabled || readEnabled2) {
                if (!readEnabled && !readEnabled2) {
                    oooO00o.OooO0OO(f30081OooO0OO);
                }
            } else if (o00oo0o2.f30384OooOO0O.getWriteEnabled()) {
                oooO00o.OooO0OO(o00O0000.f51261OooOOO);
            } else {
                oooO00o.OooO0OO(f30080OooO0O0);
            }
            if (!(oooOOO.get$context().get(CoroutineDispatcher.INSTANCE) instanceof MainCoroutineDispatcher)) {
                o0O0ooO o0o0oooOooO0OO = oooOOOO.f30082OooO00o.OooO0OO(oooO00o.OooO0O0());
                Intrinsics.checkNotNullExpressionValue(o0o0oooOooO0OO, "callFactory.newCall(request.build())");
                oooOOO.f30074Oooo0o = oooOOOO;
                oooOOO.f30075Oooo0oO = data;
                oooOOO.f30076Oooo0oo = o0o0oooOooO0OO;
                oooOOO.f30077OoooO0 = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooOOO), 1);
                cancellableContinuationImpl.initCancellability();
                o0OOO0o o0ooo0o2 = new o0OOO0o(o0o0oooOooO0OO, cancellableContinuationImpl);
                o0o0oooOooO0OO.OoooO0O(o0ooo0o2);
                cancellableContinuationImpl.invokeOnCancellation(o0ooo0o2);
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooOOO);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (readEnabled) {
                    throw new NetworkOnMainThreadException();
                }
                response = oooOOOO.f30082OooO00o.OooO0OO(oooO00o.OooO0O0()).OooO0O0();
            }
            if (!response.OooO0Oo()) {
                o00ooooo2 = response.f51441OoooO;
                if (o00ooooo2 != null) {
                    o00ooooo2.close();
                }
                Intrinsics.checkNotNullExpressionValue(response, "response");
                throw new HttpException(response);
            }
            body = response.f51441OoooO;
            if (body != null) {
                throw new IllegalStateException("Null response body!".toString());
            }
            o0oOOo o0ooooOooO0oo = body.OooO0oo();
            Intrinsics.checkNotNullExpressionValue(o0ooooOooO0oo, "body.source()");
            Objects.requireNonNull(oooOOOO);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(body, "body");
            o00oo0o0OooO0o = body.OooO0o();
            if (o00oo0o0OooO0o == null) {
                str = null;
            } else {
                str = o00oo0o0OooO0o.f51402OooO00o;
            }
            if (str != null || StringsKt.OooOoOO(str, "text/plain")) {
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                Intrinsics.checkNotNullExpressionValue(singleton, "getSingleton()");
                strOooO0O0 = o00O0O.OooO0O0(singleton, data.f51390OooOO0);
                if (strOooO0O0 == null) {
                    strOooO0O0 = str != null ? StringsKt__StringsKt.substringBefore$default(str, ';', (String) null, 2, (Object) null) : null;
                }
            } else {
                strOooO0O0 = str != null ? StringsKt__StringsKt.substringBefore$default(str, ';', (String) null, 2, (Object) null) : null;
            }
            if (response.f51450o000oOoO != null) {
                dataSource = DataSource.DISK;
            } else {
                dataSource = DataSource.NETWORK;
            }
            return new Oooo0(o0ooooOooO0oo, strOooO0O0, dataSource);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o00OO000 o00oo001 = oooOOO.f30075Oooo0oO;
        OooOOOO oooOOOO2 = oooOOO.f30074Oooo0o;
        ResultKt.throwOnFailure(result);
        data = o00oo001;
        oooOOOO = oooOOOO2;
        response = (o00OOOO0) result;
        if (!response.OooO0Oo()) {
            o00ooooo2 = response.f51441OoooO;
            if (o00ooooo2 != null) {
                o00ooooo2.close();
            }
            Intrinsics.checkNotNullExpressionValue(response, "response");
            throw new HttpException(response);
        }
        body = response.f51441OoooO;
        if (body != null) {
            throw new IllegalStateException("Null response body!".toString());
        }
        o0oOOo o0ooooOooO0oo2 = body.OooO0oo();
        Intrinsics.checkNotNullExpressionValue(o0ooooOooO0oo2, "body.source()");
        Objects.requireNonNull(oooOOOO);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(body, "body");
        o00oo0o0OooO0o = body.OooO0o();
        if (o00oo0o0OooO0o == null) {
            str = null;
        } else {
            str = o00oo0o0OooO0o.f51402OooO00o;
        }
        if (str != null) {
            MimeTypeMap singleton2 = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(singleton2, "getSingleton()");
            strOooO0O0 = o00O0O.OooO0O0(singleton2, data.f51390OooOO0);
            if (strOooO0O0 == null) {
                strOooO0O0 = str != null ? StringsKt__StringsKt.substringBefore$default(str, ';', (String) null, 2, (Object) null) : null;
            }
        } else {
            MimeTypeMap singleton3 = MimeTypeMap.getSingleton();
            Intrinsics.checkNotNullExpressionValue(singleton3, "getSingleton()");
            strOooO0O0 = o00O0O.OooO0O0(singleton3, data.f51390OooOO0);
            if (strOooO0O0 == null) {
                strOooO0O0 = str != null ? StringsKt__StringsKt.substringBefore$default(str, ';', (String) null, 2, (Object) null) : null;
            }
        }
        if (response.f51450o000oOoO != null) {
            dataSource = DataSource.DISK;
        } else {
            dataSource = DataSource.NETWORK;
        }
        return new Oooo0(o0ooooOooO0oo2, strOooO0O0, dataSource);
    }

    @Override // o00O0.OooOO0O
    public boolean OooO00o(@NotNull T t) {
        OooOO0O.OooO00o.OooO00o(this, t);
        return true;
    }

    @Override // o00O0.OooOO0O
    @Nullable
    public final Object OooO0OO(@NotNull p113o00O00Oo.OooO0O0 oooO0O0, @NotNull T t, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOO0> continuation) {
        return OooO0Oo(this, t, o00oo0o2, continuation);
    }

    @NotNull
    public abstract o00OO000 OooO0o0(@NotNull T t);
}
