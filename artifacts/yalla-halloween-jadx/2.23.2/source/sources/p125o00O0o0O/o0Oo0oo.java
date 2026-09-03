package p125o00O0o0O;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import coil.decode.DataSource;
import coil.network.HttpException;
import coil.request.CachePolicy;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o00OO00O.OooOo;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.o0000OO0;
import p124o00O0o00.o000oOoO;
import p129o00O0oOo.o00;
import p129o00O0oOo.o00O0000;
import p131o00O0oo0.o0O0O00;
import p224o00oOOo.o000OOo;
import p224o00oOOo.o0OOO0o;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.oo0O;
import p653o0ooo00O.o0000O0;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.o0OOo000;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo implements o0ooOOo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final oo0O f36608OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final oo0O f36609OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f36610OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36611OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy<o00OO.OooO00o> f36612OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy<o0OOO0o> f36613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f36614OooO0o0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Lazy<o00OO.OooO00o> f36615OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Lazy<o0OOO0o> f36616OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f36617OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull Lazy<? extends o00OO.OooO00o> lazy, @NotNull Lazy<? extends o0OOO0o> lazy2, boolean z) {
            this.f36615OooO00o = lazy;
            this.f36616OooO0O0 = lazy2;
            this.f36617OooO0OO = z;
        }

        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https")) {
                return new o0Oo0oo(uri.toString(), o0o0o00, this.f36615OooO00o, this.f36616OooO0O0, this.f36617OooO0OO);
            }
            return null;
        }
    }

    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {223}, m = "executeNetworkRequest", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f36618OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f36619OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36618OooO0Oo = obj;
            this.f36619OooO0o |= Integer.MIN_VALUE;
            oo0O oo0o = o0Oo0oo.f36608OooO0o;
            return o0Oo0oo.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {76, 105}, m = "fetch", n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f36621OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0Oo0oo f36622OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f36623OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public o0OOO0o.OooO0O0 f36624OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f36625OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36625OooO0oO = obj;
            this.f36621OooO |= Integer.MIN_VALUE;
            return o0Oo0oo.this.OooO00o(this);
        }
    }

    static {
        oo0O.OooO00o oooO00o = new oo0O.OooO00o();
        oooO00o.f57984OooO00o = true;
        oooO00o.f57985OooO0O0 = true;
        f36608OooO0o = oooO00o.OooO00o();
        oo0O.OooO00o oooO00o2 = new oo0O.OooO00o();
        oooO00o2.f57984OooO00o = true;
        oooO00o2.f57988OooO0o = true;
        f36609OooO0oO = oooO00o2.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(@NotNull String str, @NotNull o0O0O00 o0o0o00, @NotNull Lazy<? extends o00OO.OooO00o> lazy, @NotNull Lazy<? extends o0OOO0o> lazy2, boolean z) {
        this.f36610OooO00o = str;
        this.f36611OooO0O0 = o0o0o00;
        this.f36612OooO0OO = lazy;
        this.f36613OooO0Oo = lazy2;
        this.f36614OooO0o0 = z;
    }

    @VisibleForTesting
    @Nullable
    public static String OooO0Oo(@NotNull String str, @Nullable o0O000Oo o0o000oo2) {
        String strOooO0O0;
        String str2 = o0o000oo2 != null ? o0o000oo2.f57808OooO00o : null;
        if ((str2 == null || StringsKt__StringsJVMKt.startsWith$default(str2, "text/plain", false, 2, null)) && (strOooO0O0 = OooOo00.OooO0O0(MimeTypeMap.getSingleton(), str)) != null) {
            return strOooO0O0;
        }
        if (str2 != null) {
            return StringsKt__StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a9 A[Catch: Exception -> 0x01d8, TryCatch #3 {Exception -> 0x01d8, blocks: (B:82:0x01a2, B:84:0x01a9, B:86:0x01cf, B:88:0x01d4, B:87:0x01d2, B:92:0x01da, B:93:0x01e3), top: B:113:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01cf A[Catch: Exception -> 0x01d8, TryCatch #3 {Exception -> 0x01d8, blocks: (B:82:0x01a2, B:84:0x01a9, B:86:0x01cf, B:88:0x01d4, B:87:0x01d2, B:92:0x01da, B:93:0x01e3), top: B:113:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2 A[Catch: Exception -> 0x01d8, TryCatch #3 {Exception -> 0x01d8, blocks: (B:82:0x01a2, B:84:0x01a9, B:86:0x01cf, B:88:0x01d4, B:87:0x01d2, B:92:0x01da, B:93:0x01e3), top: B:113:0x01a2 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01da A[Catch: Exception -> 0x01d8, TryCatch #3 {Exception -> 0x01d8, blocks: (B:82:0x01a2, B:84:0x01a9, B:86:0x01cf, B:88:0x01d4, B:87:0x01d2, B:92:0x01da, B:93:0x01e3), top: B:113:0x01a2 }] */
    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) throws Exception {
        OooO0OO oooO0OO;
        o000OOo.OooO0O0 oooO0O0;
        o0OOO0o.OooO0O0 oooO0O1;
        Exception e;
        o00O0000 o00o0000OooO00o;
        o0Oo0oo o0oo0oo2;
        o00 o00Var;
        o0OOO0o value;
        o0O00o00 o0o00o01;
        o0O00o00 o0o00o02;
        o0OOO0o.OooO0O0 oooO0O2;
        o0Oo0oo o0oo0oo3;
        o0O00oO0 o0o00oo1;
        DataSource dataSource;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f36621OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f36621OooO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object obj = oooO0OO.f36625OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f36621OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0O00 o0o0o00 = this.f36611OooO0O0;
            boolean readEnabled = o0o0o00.f36849OooOOO.getReadEnabled();
            String str = this.f36610OooO00o;
            if (!readEnabled || (value = this.f36613OooO0Oo.getValue()) == null) {
                oooO0O0 = null;
            } else {
                String str2 = o0o0o00.f36837OooO;
                if (str2 == null) {
                    str2 = str;
                }
                oooO0O0 = value.get(str2);
            }
            try {
                if (oooO0O0 != null) {
                    Long l = OooO0OO().OooO0oo(oooO0O0.getMetadata()).f59746OooO0Oo;
                    if (l != null && l.longValue() == 0) {
                        return new oo0o0Oo(OooO0oO(oooO0O0), OooO0Oo(str, null), DataSource.DISK);
                    }
                    if (!this.f36614OooO0o0) {
                        o000oOoO o000ooooOooO0oO = OooO0oO(oooO0O0);
                        o00 o00VarOooO0o = OooO0o(oooO0O0);
                        return new oo0o0Oo(o000ooooOooO0oO, OooO0Oo(str, o00VarOooO0o != null ? (o0O000Oo) o00VarOooO0o.f36739OooO0O0.getValue() : null), DataSource.DISK);
                    }
                    o00o0000OooO00o = new o00O0000.OooO0O0(OooO0o0(), OooO0o(oooO0O0)).OooO00o();
                    if (o00o0000OooO00o.f36750OooO00o == null && (o00Var = o00o0000OooO00o.f36751OooO0O0) != null) {
                        return new oo0o0Oo(OooO0oO(oooO0O0), OooO0Oo(str, (o0O000Oo) o00Var.f36739OooO0O0.getValue()), DataSource.DISK);
                    }
                } else {
                    o00o0000OooO00o = new o00O0000.OooO0O0(OooO0o0(), null).OooO00o();
                }
                o0O00O0o o0o00o0o = o00o0000OooO00o.f36750OooO00o;
                Intrinsics.checkNotNull(o0o00o0o);
                oooO0OO.f36622OooO0Oo = this;
                oooO0OO.f36624OooO0o0 = oooO0O0;
                oooO0OO.f36623OooO0o = o00o0000OooO00o;
                oooO0OO.f36621OooO = 1;
                Object objOooO0O0 = OooO0O0(o0o00o0o, oooO0OO);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo0oo2 = this;
                oooO0O1 = oooO0O0;
                obj = objOooO0O0;
            } catch (Exception e2) {
                oooO0O1 = oooO0O0;
                e = e2;
                if (oooO0O1 != null) {
                    OooOo00.OooO00o(oooO0O1);
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0o00o02 = (o0O00o00) oooO0OO.f36623OooO0o;
                oooO0O2 = oooO0OO.f36624OooO0o0;
                o0oo0oo3 = oooO0OO.f36622OooO0Oo;
                try {
                    ResultKt.throwOnFailure(obj);
                    o0o00o01 = (o0O00o00) obj;
                    try {
                        o0oo0oo3.getClass();
                        o0o00oo1 = o0o00o01.f57852OooOO0;
                        if (o0o00oo1 != null) {
                            throw new IllegalStateException("response body == null".toString());
                        }
                        o0O0o0 o0o0o0OooOOo = o0o00oo1.OooOOo();
                        Context context = o0oo0oo3.f36611OooO0O0.f36838OooO00o;
                        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
                        File cacheDir = context.getCacheDir();
                        cacheDir.mkdirs();
                        o0000OO0 o0000oo1 = new o0000OO0(o0o0o0OooOOo, cacheDir, null);
                        String strOooO0Oo = OooO0Oo(o0oo0oo3.f36610OooO00o, o0o00oo1.OooO0oO());
                        if (o0o00o01.f57853OooOO0O != null) {
                            dataSource = DataSource.NETWORK;
                        } else {
                            dataSource = DataSource.DISK;
                        }
                        return new oo0o0Oo(o0000oo1, strOooO0Oo, dataSource);
                    } catch (Exception e3) {
                        e = e3;
                        oooO0O1 = oooO0O2;
                        o0o00o02 = o0o00o01;
                        e = e;
                        oooO0O2 = oooO0O1;
                        try {
                            OooOo00.OooO00o(o0o00o02);
                            throw e;
                        } catch (Exception e4) {
                            e = e4;
                            oooO0O1 = oooO0O2;
                            if (oooO0O1 != null) {
                                OooOo00.OooO00o(oooO0O1);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    OooOo00.OooO00o(o0o00o02);
                    throw e;
                }
            }
            o00o0000OooO00o = (o00O0000) oooO0OO.f36623OooO0o;
            oooO0O1 = oooO0OO.f36624OooO0o0;
            o0oo0oo2 = oooO0OO.f36622OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e6) {
                e = e6;
                if (oooO0O1 != null) {
                    OooOo00.OooO00o(oooO0O1);
                }
                throw e;
            }
        }
        o0o00o01 = (o0O00o00) obj;
        o0oo0oo2.getClass();
        o0O00oO0 o0o00oo2 = o0o00o01.f57852OooOO0;
        if (o0o00oo2 == null) {
            throw new IllegalStateException("response body == null".toString());
        }
        try {
            o0OOO0o.OooO0O0 oooO0O0OooO0oo = o0oo0oo2.OooO0oo(oooO0O1, o00o0000OooO00o.f36750OooO00o, o0o00o01, o00o0000OooO00o.f36751OooO0O0);
            String str3 = o0oo0oo2.f36610OooO00o;
            if (oooO0O0OooO0oo != null) {
                o000oOoO o000ooooOooO0oO2 = o0oo0oo2.OooO0oO(oooO0O0OooO0oo);
                o00 o00VarOooO0o2 = o0oo0oo2.OooO0o(oooO0O0OooO0oo);
                return new oo0o0Oo(o000ooooOooO0oO2, OooO0Oo(str3, o00VarOooO0o2 != null ? (o0O000Oo) o00VarOooO0o2.f36739OooO0O0.getValue() : null), DataSource.NETWORK);
            }
            if (o0o00oo2.OooO0OO() > 0) {
                o0O0o0 o0o0o0OooOOo2 = o0o00oo2.OooOOo();
                Context context2 = o0oo0oo2.f36611OooO0O0.f36838OooO00o;
                Bitmap.Config[] configArr2 = OooOo00.f37081OooO00o;
                File cacheDir2 = context2.getCacheDir();
                cacheDir2.mkdirs();
                return new oo0o0Oo(new o0000OO0(o0o0o0OooOOo2, cacheDir2, null), OooO0Oo(str3, o0o00oo2.OooO0oO()), o0o00o01.f57853OooOO0O != null ? DataSource.NETWORK : DataSource.DISK);
            }
            OooOo00.OooO00o(o0o00o01);
            o0O00O0o o0o00o0oOooO0o0 = o0oo0oo2.OooO0o0();
            oooO0OO.f36622OooO0Oo = o0oo0oo2;
            oooO0OO.f36624OooO0o0 = oooO0O0OooO0oo;
            oooO0OO.f36623OooO0o = o0o00o01;
            oooO0OO.f36621OooO = 2;
            Object objOooO0O1 = o0oo0oo2.OooO0O0(o0o00o0oOooO0o0, oooO0OO);
            if (objOooO0O1 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0o00o02 = o0o00o01;
            obj = objOooO0O1;
            oooO0O2 = oooO0O0OooO0oo;
            o0oo0oo3 = o0oo0oo2;
            o0o00o01 = (o0O00o00) obj;
            o0oo0oo3.getClass();
            o0o00oo1 = o0o00o01.f57852OooOO0;
            if (o0o00oo1 != null) {
                throw new IllegalStateException("response body == null".toString());
            }
            o0O0o0 o0o0o0OooOOo3 = o0o00oo1.OooOOo();
            Context context3 = o0oo0oo3.f36611OooO0O0.f36838OooO00o;
            Bitmap.Config[] configArr3 = OooOo00.f37081OooO00o;
            File cacheDir3 = context3.getCacheDir();
            cacheDir3.mkdirs();
            o0000OO0 o0000oo2 = new o0000OO0(o0o0o0OooOOo3, cacheDir3, null);
            String strOooO0Oo2 = OooO0Oo(o0oo0oo3.f36610OooO00o, o0o00oo1.OooO0oO());
            if (o0o00o01.f57853OooOO0O != null) {
                dataSource = DataSource.NETWORK;
            } else {
                dataSource = DataSource.DISK;
            }
            return new oo0o0Oo(o0000oo2, strOooO0Oo2, dataSource);
        } catch (Exception e7) {
            e = e7;
            o0o00o02 = o0o00o01;
            e = e;
            oooO0O2 = oooO0O1;
            OooOo00.OooO00o(o0o00o02);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(o0O00O0o o0o00o0o, Continuation<? super o0O00o00> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        o0O00o00 o0o00o00Execute;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f36619OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f36619OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object result = oooO0O0.f36618OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f36619OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
            boolean zAreEqual = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
            Lazy<o00OO.OooO00o> lazy = this.f36612OooO0OO;
            if (!zAreEqual) {
                o0000O0 o0000o0OooO0O0 = lazy.getValue().OooO0O0(o0o00o0o);
                oooO0O0.f36619OooO0o = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0O0), 1);
                cancellableContinuationImpl.initCancellability();
                OooOo oooOo = new OooOo(o0000o0OooO0O0, cancellableContinuationImpl);
                FirebasePerfOkHttpClient.enqueue(o0000o0OooO0O0, oooOo);
                cancellableContinuationImpl.invokeOnCancellation(oooOo);
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0O0);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (this.f36611OooO0O0.f36851OooOOOO.getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                o0o00o00Execute = FirebasePerfOkHttpClient.execute(lazy.getValue().OooO0O0(o0o00o0o));
            }
            if (!o0o00o00Execute.OooO0oO() || o0o00o00Execute.f57850OooO0oO == 304) {
                return o0o00o00Execute;
            }
            o0O00oO0 o0o00oo1 = o0o00o00Execute.f57852OooOO0;
            if (o0o00oo1 != null) {
                OooOo00.OooO00o(o0o00oo1);
            }
            throw new HttpException(o0o00o00Execute);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(result);
        o0o00o00Execute = (o0O00o00) result;
        if (o0o00o00Execute.OooO0oO()) {
        }
        return o0o00o00Execute;
    }

    public final o0OO000 OooO0OO() {
        o0OOO0o value = this.f36613OooO0Oo.getValue();
        Intrinsics.checkNotNull(value);
        return value.OooO00o();
    }

    public final o00 OooO0o(o0OOO0o.OooO0O0 oooO0O0) throws Throwable {
        o00 o00Var;
        try {
            o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(OooO0OO().OooOO0o(oooO0O0.getMetadata()));
            try {
                o00Var = new o00(o0o0000VarOooO0O0);
                th = null;
            } catch (Throwable th) {
                th = th;
                o00Var = null;
            }
            try {
                o0o0000VarOooO0O0.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    ExceptionsKt.addSuppressed(th, th2);
                }
            }
            if (th != null) {
                throw th;
            }
            Intrinsics.checkNotNull(o00Var);
            return o00Var;
        } catch (IOException unused) {
            return null;
        }
    }

    public final o0O00O0o OooO0o0() {
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(this.f36610OooO00o);
        o0O0O00 o0o0o00 = this.f36611OooO0O0;
        oooO00o.OooO0o0(o0o0o00.f36846OooOO0);
        for (Map.Entry<Class<?>, Object> entry : o0o0o00.f36847OooOO0O.f36780OooO00o.entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            oooO00o.OooO(key, entry.getValue());
        }
        CachePolicy cachePolicy = o0o0o00.f36849OooOOO;
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean readEnabled2 = o0o0o00.f36851OooOOOO.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            oooO00o.OooO0OO(oo0O.f57970OooOOOO);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                oooO00o.OooO0OO(f36609OooO0oO);
            }
        } else if (cachePolicy.getWriteEnabled()) {
            oooO00o.OooO0OO(oo0O.f57969OooOOO);
        } else {
            oooO00o.OooO0OO(f36608OooO0o);
        }
        return oooO00o.OooO0O0();
    }

    public final o000oOoO OooO0oO(o0OOO0o.OooO0O0 oooO0O0) {
        o0OOOO00 data = oooO0O0.getData();
        o0OO000 o0oo000OooO0OO = OooO0OO();
        String str = this.f36611OooO0O0.f36837OooO;
        if (str == null) {
            str = this.f36610OooO00o;
        }
        return new o000oOoO(data, o0oo000OooO0OO, str, oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    public final o0OOO0o.OooO0O0 OooO0oo(o0OOO0o.OooO0O0 oooO0O0, o0O00O0o o0o00o0o, o0O00o00 o0o00o01, o00 o00Var) {
        o000OOo.OooO00o oooO00oOooO0O0;
        Unit unit;
        Long lValueOf;
        Unit unit2;
        o0O0O00 o0o0o00 = this.f36611OooO0O0;
        boolean writeEnabled = o0o0o00.f36849OooOOO.getWriteEnabled();
        o0O000 o0o001 = o0o00o01.f57846OooO;
        boolean z = false;
        if (writeEnabled) {
            if (this.f36614OooO0o0) {
                if ((o0o00o0o.OooO00o().f57973OooO0O0 || o0o00o01.OooO00o().f57973OooO0O0 || Intrinsics.areEqual(o0o001.OooO00o("Vary"), "*")) ? false : true) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        Throwable th = null;
        if (!z) {
            if (oooO0O0 != null) {
                OooOo00.OooO00o(oooO0O0);
            }
            return null;
        }
        if (oooO0O0 != null) {
            oooO00oOooO0O0 = oooO0O0.o00000();
        } else {
            o0OOO0o value = this.f36613OooO0Oo.getValue();
            if (value != null) {
                String str = o0o0o00.f36837OooO;
                if (str == null) {
                    str = this.f36610OooO00o;
                }
                oooO00oOooO0O0 = value.OooO0O0(str);
            } else {
                oooO00oOooO0O0 = null;
            }
        }
        try {
            if (oooO00oOooO0O0 == null) {
                return null;
            }
            try {
                if (o0o00o01.f57850OooO0oO != 304 || o00Var == null) {
                    o0OOo000 o0ooo000OooO00o = o0OO.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0Oo()));
                    try {
                        new o00(o0o00o01).OooO00o(o0ooo000OooO00o);
                        unit = Unit.INSTANCE;
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        unit = null;
                    }
                    try {
                        o0ooo000OooO00o.close();
                    } catch (Throwable th3) {
                        if (th == null) {
                            th = th3;
                        } else {
                            ExceptionsKt.addSuppressed(th, th3);
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    Intrinsics.checkNotNull(unit);
                    o0OOo000 o0ooo000OooO00o2 = o0OO.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0OO()));
                    try {
                        o0O00oO0 o0o00oo1 = o0o00o01.f57852OooOO0;
                        Intrinsics.checkNotNull(o0o00oo1);
                        lValueOf = Long.valueOf(o0o00oo1.OooOOo().o00000oo(o0ooo000OooO00o2));
                    } catch (Throwable th4) {
                        lValueOf = null;
                        th = th4;
                    }
                    try {
                        o0ooo000OooO00o2.close();
                    } catch (Throwable th5) {
                        if (th == null) {
                            th = th5;
                        } else {
                            ExceptionsKt.addSuppressed(th, th5);
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    Intrinsics.checkNotNull(lValueOf);
                } else {
                    o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o(o0o00o01);
                    oooO00o.OooO0OO(o00O0000.OooO00o.OooO00o(o00Var.f36742OooO0o, o0o001));
                    o0O00o00 o0o00o00OooO00o = oooO00o.OooO00o();
                    o0OOo000 o0ooo000OooO00o3 = o0OO.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0Oo()));
                    try {
                        new o00(o0o00o00OooO00o).OooO00o(o0ooo000OooO00o3);
                        unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        unit2 = null;
                        th = th6;
                    }
                    try {
                        o0ooo000OooO00o3.close();
                    } catch (Throwable th7) {
                        if (th == null) {
                            th = th7;
                        } else {
                            ExceptionsKt.addSuppressed(th, th7);
                        }
                    }
                    if (th != null) {
                        throw th;
                    }
                    Intrinsics.checkNotNull(unit2);
                }
                o000OOo.OooO0O0 OooO0O1 = oooO00oOooO0O0.OooO0O0();
                OooOo00.OooO00o(o0o00o01);
                return OooO0O1;
            } catch (Exception e) {
                Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
                try {
                    oooO00oOooO0O0.OooO00o();
                } catch (Exception unused) {
                }
                throw e;
            }
        } catch (Throwable th8) {
            OooOo00.OooO00o(o0o00o01);
            throw th8;
        }
    }
}
