package p105o000oo0o;

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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p102o000oo0.OooOO0;
import p102o000oo0.OooOo00;
import p103o000oo00.o000O000;
import p103o000oo00.oo000o;
import p109o000ooo.o0Oo0oo;
import p110o000ooo0.o00000;
import p110o000ooo0.o000000O;
import p321o0O0ooO.o000O;
import p321o0O0ooO.o000O0O0;
import p634o0ooO0oO.o00O00OO;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo0O;
import p646o0ooOoo.oO0Oo0oo;
import p659o0oooO00.o00;
import p659o0oooO00.o0000;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o00O00OO f35776OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o00O00OO f35777OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f35778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy<o00O00o0.OooO00o> f35780OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy<OooOO0> f35781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f35782OooO0o0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Uri> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Lazy<o00O00o0.OooO00o> f35783OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Lazy<OooOO0> f35784OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f35785OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull Lazy<? extends o00O00o0.OooO00o> lazy, @NotNull Lazy<? extends OooOO0> lazy2, boolean z) {
            this.f35783OooO00o = lazy;
            this.f35784OooO0O0 = lazy2;
            this.f35785OooO0OO = z;
        }

        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "http") || Intrinsics.areEqual(uri.getScheme(), "https")) {
                return new o00O0OO(uri.toString(), o0oo0oo2, this.f35783OooO00o, this.f35784OooO0O0, this.f35785OooO0OO);
            }
            return null;
        }
    }

    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {}, l = {223}, m = "executeNetworkRequest", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f35786OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f35787OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35786OooO0Oo = obj;
            this.f35787OooO0o |= Integer.MIN_VALUE;
            o00O00OO o00o00oo2 = o00O0OO.f35776OooO0o;
            return o00O0OO.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {76, 105}, m = "fetch", n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f35789OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O0OO f35790OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f35791OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOO0.OooO0O0 f35792OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f35793OooO0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f35793OooO0oO = obj;
            this.f35789OooO |= Integer.MIN_VALUE;
            return o00O0OO.this.OooO00o(this);
        }
    }

    static {
        o00O00OO.OooO00o oooO00o = new o00O00OO.OooO00o();
        oooO00o.f57170OooO00o = true;
        oooO00o.f57171OooO0O0 = true;
        f35776OooO0o = oooO00o.OooO00o();
        o00O00OO.OooO00o oooO00o2 = new o00O00OO.OooO00o();
        oooO00o2.f57170OooO00o = true;
        oooO00o2.f57174OooO0o = true;
        f35777OooO0oO = oooO00o2.OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O0OO(@NotNull String str, @NotNull o0Oo0oo o0oo0oo2, @NotNull Lazy<? extends o00O00o0.OooO00o> lazy, @NotNull Lazy<? extends OooOO0> lazy2, boolean z) {
        this.f35778OooO00o = str;
        this.f35779OooO0O0 = o0oo0oo2;
        this.f35780OooO0OO = lazy;
        this.f35781OooO0Oo = lazy2;
        this.f35782OooO0o0 = z;
    }

    @VisibleForTesting
    @Nullable
    public static String OooO0Oo(@NotNull String str, @Nullable o00OOO0 o00ooo1) {
        String strOooO0O0;
        String str2 = o00ooo1 != null ? o00ooo1.f57235OooO00o : null;
        if ((str2 == null || StringsKt.Oooo00o(str2, "text/plain")) && (strOooO0O0 = o000O0O0.OooO0O0(MimeTypeMap.getSingleton(), str)) != null) {
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
    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) throws Exception {
        OooO0OO oooO0OO;
        OooOo00.OooO0O0 oooO0O0;
        OooOO0.OooO0O0 oooO0O1;
        Exception e;
        o00000 o00000VarOooO00o;
        o00O0OO o00o0oo2;
        o000000O o000000o2;
        OooOO0 value;
        o0oOOo o0oooo;
        o0oOOo o0oooo2;
        OooOO0.OooO0O0 oooO0O2;
        o00O0OO o00o0oo3;
        o0O0o o0o0o;
        DataSource dataSource;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f35789OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f35789OooO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object obj = oooO0OO.f35793OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f35789OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            o0Oo0oo o0oo0oo2 = this.f35779OooO0O0;
            boolean readEnabled = o0oo0oo2.f35874OooOOO.getReadEnabled();
            String str = this.f35778OooO00o;
            if (!readEnabled || (value = this.f35781OooO0Oo.getValue()) == null) {
                oooO0O0 = null;
            } else {
                String str2 = o0oo0oo2.f35862OooO;
                if (str2 == null) {
                    str2 = str;
                }
                oooO0O0 = value.get(str2);
            }
            try {
                if (oooO0O0 != null) {
                    Long l = OooO0OO().OooO0oo(oooO0O0.getMetadata()).f60190OooO0Oo;
                    if (l != null && l.longValue() == 0) {
                        return new oo0oOO0(OooO0oO(oooO0O0), OooO0Oo(str, null), DataSource.DISK);
                    }
                    if (!this.f35782OooO0o0) {
                        oo000o oo000oVarOooO0oO = OooO0oO(oooO0O0);
                        o000000O o000000oOooO0o = OooO0o(oooO0O0);
                        return new oo0oOO0(oo000oVarOooO0oO, OooO0Oo(str, o000000oOooO0o != null ? (o00OOO0) o000000oOooO0o.f35913OooO0O0.getValue() : null), DataSource.DISK);
                    }
                    o00000VarOooO00o = new o00000.OooO0O0(OooO0o0(), OooO0o(oooO0O0)).OooO00o();
                    if (o00000VarOooO00o.f35898OooO00o == null && (o000000o2 = o00000VarOooO00o.f35899OooO0O0) != null) {
                        return new oo0oOO0(OooO0oO(oooO0O0), OooO0Oo(str, (o00OOO0) o000000o2.f35913OooO0O0.getValue()), DataSource.DISK);
                    }
                } else {
                    o00000VarOooO00o = new o00000.OooO0O0(OooO0o0(), null).OooO00o();
                }
                o00OOOOo o00ooooo2 = o00000VarOooO00o.f35898OooO00o;
                Intrinsics.checkNotNull(o00ooooo2);
                oooO0OO.f35790OooO0Oo = this;
                oooO0OO.f35792OooO0o0 = oooO0O0;
                oooO0OO.f35791OooO0o = o00000VarOooO00o;
                oooO0OO.f35789OooO = 1;
                Object objOooO0O0 = OooO0O0(o00ooooo2, oooO0OO);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o0oo2 = this;
                oooO0O1 = oooO0O0;
                obj = objOooO0O0;
            } catch (Exception e2) {
                oooO0O1 = oooO0O0;
                e = e2;
                if (oooO0O1 != null) {
                    o000O0O0.OooO00o(oooO0O1);
                }
                throw e;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oooo2 = (o0oOOo) oooO0OO.f35791OooO0o;
                oooO0O2 = oooO0OO.f35792OooO0o0;
                o00o0oo3 = oooO0OO.f35790OooO0Oo;
                try {
                    ResultKt.throwOnFailure(obj);
                    o0oooo = (o0oOOo) obj;
                    try {
                        o00o0oo3.getClass();
                        o0o0o = o0oooo.f57347OooOO0;
                        if (o0o0o != null) {
                            throw new IllegalStateException("response body == null".toString());
                        }
                        o0000 o0000VarOooOOo0 = o0o0o.OooOOo0();
                        Context context = o00o0oo3.f35779OooO0O0.f35863OooO00o;
                        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
                        File cacheDir = context.getCacheDir();
                        cacheDir.mkdirs();
                        o000O000 o000o001 = new o000O000(o0000VarOooOOo0, cacheDir, null);
                        String strOooO0Oo = OooO0Oo(o00o0oo3.f35778OooO00o, o0o0o.OooO0oO());
                        if (o0oooo.f57348OooOO0O != null) {
                            dataSource = DataSource.NETWORK;
                        } else {
                            dataSource = DataSource.DISK;
                        }
                        return new oo0oOO0(o000o001, strOooO0Oo, dataSource);
                    } catch (Exception e3) {
                        e = e3;
                        oooO0O1 = oooO0O2;
                        o0oooo2 = o0oooo;
                        e = e;
                        oooO0O2 = oooO0O1;
                        try {
                            o000O0O0.OooO00o(o0oooo2);
                            throw e;
                        } catch (Exception e4) {
                            e = e4;
                            oooO0O1 = oooO0O2;
                            if (oooO0O1 != null) {
                                o000O0O0.OooO00o(oooO0O1);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    o000O0O0.OooO00o(o0oooo2);
                    throw e;
                }
            }
            o00000VarOooO00o = (o00000) oooO0OO.f35791OooO0o;
            oooO0O1 = oooO0OO.f35792OooO0o0;
            o00o0oo2 = oooO0OO.f35790OooO0Oo;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e6) {
                e = e6;
                if (oooO0O1 != null) {
                    o000O0O0.OooO00o(oooO0O1);
                }
                throw e;
            }
        }
        o0oooo = (o0oOOo) obj;
        o00o0oo2.getClass();
        o0O0o o0o0o2 = o0oooo.f57347OooOO0;
        if (o0o0o2 == null) {
            throw new IllegalStateException("response body == null".toString());
        }
        try {
            OooOO0.OooO0O0 oooO0O0OooO0oo = o00o0oo2.OooO0oo(oooO0O1, o00000VarOooO00o.f35898OooO00o, o0oooo, o00000VarOooO00o.f35899OooO0O0);
            String str3 = o00o0oo2.f35778OooO00o;
            if (oooO0O0OooO0oo != null) {
                oo000o oo000oVarOooO0oO2 = o00o0oo2.OooO0oO(oooO0O0OooO0oo);
                o000000O o000000oOooO0o2 = o00o0oo2.OooO0o(oooO0O0OooO0oo);
                return new oo0oOO0(oo000oVarOooO0oO2, OooO0Oo(str3, o000000oOooO0o2 != null ? (o00OOO0) o000000oOooO0o2.f35913OooO0O0.getValue() : null), DataSource.NETWORK);
            }
            if (o0o0o2.OooO0OO() > 0) {
                o0000 o0000VarOooOOo1 = o0o0o2.OooOOo0();
                Context context2 = o00o0oo2.f35779OooO0O0.f35863OooO00o;
                Bitmap.Config[] configArr2 = o000O0O0.f42845OooO00o;
                File cacheDir2 = context2.getCacheDir();
                cacheDir2.mkdirs();
                return new oo0oOO0(new o000O000(o0000VarOooOOo1, cacheDir2, null), OooO0Oo(str3, o0o0o2.OooO0oO()), o0oooo.f57348OooOO0O != null ? DataSource.NETWORK : DataSource.DISK);
            }
            o000O0O0.OooO00o(o0oooo);
            o00OOOOo o00oooooOooO0o0 = o00o0oo2.OooO0o0();
            oooO0OO.f35790OooO0Oo = o00o0oo2;
            oooO0OO.f35792OooO0o0 = oooO0O0OooO0oo;
            oooO0OO.f35791OooO0o = o0oooo;
            oooO0OO.f35789OooO = 2;
            Object objOooO0O1 = o00o0oo2.OooO0O0(o00oooooOooO0o0, oooO0OO);
            if (objOooO0O1 == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0oooo2 = o0oooo;
            obj = objOooO0O1;
            oooO0O2 = oooO0O0OooO0oo;
            o00o0oo3 = o00o0oo2;
            o0oooo = (o0oOOo) obj;
            o00o0oo3.getClass();
            o0o0o = o0oooo.f57347OooOO0;
            if (o0o0o != null) {
                throw new IllegalStateException("response body == null".toString());
            }
            o0000 o0000VarOooOOo2 = o0o0o.OooOOo0();
            Context context3 = o00o0oo3.f35779OooO0O0.f35863OooO00o;
            Bitmap.Config[] configArr3 = o000O0O0.f42845OooO00o;
            File cacheDir3 = context3.getCacheDir();
            cacheDir3.mkdirs();
            o000O000 o000o002 = new o000O000(o0000VarOooOOo2, cacheDir3, null);
            String strOooO0Oo2 = OooO0Oo(o00o0oo3.f35778OooO00o, o0o0o.OooO0oO());
            if (o0oooo.f57348OooOO0O != null) {
                dataSource = DataSource.NETWORK;
            } else {
                dataSource = DataSource.DISK;
            }
            return new oo0oOO0(o000o002, strOooO0Oo2, dataSource);
        } catch (Exception e7) {
            e = e7;
            o0oooo2 = o0oooo;
            e = e;
            oooO0O2 = oooO0O1;
            o000O0O0.OooO00o(o0oooo2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(o00OOOOo o00ooooo2, Continuation<? super o0oOOo> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        o0oOOo o0ooooExecute;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f35787OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f35787OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object result = oooO0O0.f35786OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f35787OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(result);
            Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
            boolean zAreEqual = Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
            Lazy<o00O00o0.OooO00o> lazy = this.f35780OooO0OO;
            if (!zAreEqual) {
                oO0Oo0oo oo0oo0ooOooO0O0 = lazy.getValue().OooO0O0(o00ooooo2);
                oooO0O0.f35787OooO0o = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO0O0), 1);
                cancellableContinuationImpl.initCancellability();
                o000O o000o = new o000O(oo0oo0ooOooO0O0, cancellableContinuationImpl);
                FirebasePerfOkHttpClient.enqueue(oo0oo0ooOooO0O0, o000o);
                cancellableContinuationImpl.invokeOnCancellation(o000o);
                result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO0O0);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (this.f35779OooO0O0.f35876OooOOOO.getReadEnabled()) {
                    throw new NetworkOnMainThreadException();
                }
                o0ooooExecute = FirebasePerfOkHttpClient.execute(lazy.getValue().OooO0O0(o00ooooo2));
            }
            if (!o0ooooExecute.OooO0oO() || o0ooooExecute.f57345OooO0oO == 304) {
                return o0ooooExecute;
            }
            o0O0o o0o0o = o0ooooExecute.f57347OooOO0;
            if (o0o0o != null) {
                o000O0O0.OooO00o(o0o0o);
            }
            throw new HttpException(o0ooooExecute);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(result);
        o0ooooExecute = (o0oOOo) result;
        if (o0ooooExecute.OooO0oO()) {
        }
        return o0ooooExecute;
    }

    public final o0000O0O OooO0OO() {
        OooOO0 value = this.f35781OooO0Oo.getValue();
        Intrinsics.checkNotNull(value);
        return value.OooO00o();
    }

    public final o000000O OooO0o(OooOO0.OooO0O0 oooO0O0) throws Throwable {
        o000000O o000000o2;
        try {
            o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(OooO0OO().OooOO0o(oooO0O0.getMetadata()));
            try {
                o000000o2 = new o000000O(o00o0000OooO0O0);
                th = null;
            } catch (Throwable th) {
                th = th;
                o000000o2 = null;
            }
            try {
                o00o0000OooO0O0.close();
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
            Intrinsics.checkNotNull(o000000o2);
            return o000000o2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final o00OOOOo OooO0o0() {
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(this.f35778OooO00o);
        o0Oo0oo o0oo0oo2 = this.f35779OooO0O0;
        oooO00o.OooO0o0(o0oo0oo2.f35871OooOO0);
        for (Map.Entry<Class<?>, Object> entry : o0oo0oo2.f35872OooOO0O.f35830OooO00o.entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            oooO00o.OooO(key, entry.getValue());
        }
        CachePolicy cachePolicy = o0oo0oo2.f35874OooOOO;
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean readEnabled2 = o0oo0oo2.f35876OooOOOO.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            oooO00o.OooO0OO(o00O00OO.f57156OooOOOO);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                oooO00o.OooO0OO(f35777OooO0oO);
            }
        } else if (cachePolicy.getWriteEnabled()) {
            oooO00o.OooO0OO(o00O00OO.f57155OooOOO);
        } else {
            oooO00o.OooO0OO(f35776OooO0o);
        }
        return oooO00o.OooO0O0();
    }

    public final oo000o OooO0oO(OooOO0.OooO0O0 oooO0O0) {
        o000OO00 data = oooO0O0.getData();
        o0000O0O o0000o0oOooO0OO = OooO0OO();
        String str = this.f35779OooO0O0.f35862OooO;
        if (str == null) {
            str = this.f35778OooO00o;
        }
        return new oo000o(data, o0000o0oOooO0OO, str, oooO0O0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    public final OooOO0.OooO0O0 OooO0oo(OooOO0.OooO0O0 oooO0O0, o00OOOOo o00ooooo2, o0oOOo o0oooo, o000000O o000000o2) {
        OooOo00.OooO00o oooO00oOooO0O0;
        Unit unit;
        Long lValueOf;
        Unit unit2;
        o0Oo0oo o0oo0oo2 = this.f35779OooO0O0;
        boolean writeEnabled = o0oo0oo2.f35874OooOOO.getWriteEnabled();
        oo0O oo0o = o0oooo.f57341OooO;
        boolean z = false;
        if (writeEnabled) {
            if (this.f35782OooO0o0) {
                if ((o00ooooo2.OooO00o().f57159OooO0O0 || o0oooo.OooO00o().f57159OooO0O0 || Intrinsics.areEqual(oo0o.OooO00o("Vary"), "*")) ? false : true) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        Throwable th = null;
        if (!z) {
            if (oooO0O0 != null) {
                o000O0O0.OooO00o(oooO0O0);
            }
            return null;
        }
        if (oooO0O0 != null) {
            oooO00oOooO0O0 = oooO0O0.o000000O();
        } else {
            OooOO0 value = this.f35781OooO0Oo.getValue();
            if (value != null) {
                String str = o0oo0oo2.f35862OooO;
                if (str == null) {
                    str = this.f35778OooO00o;
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
                if (o0oooo.f57345OooO0oO != 304 || o000000o2 == null) {
                    o00 o00VarOooO00o = o000O0Oo.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0Oo()));
                    try {
                        new o000000O(o0oooo).OooO00o(o00VarOooO00o);
                        unit = Unit.INSTANCE;
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        unit = null;
                    }
                    try {
                        o00VarOooO00o.close();
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
                    o00 o00VarOooO00o2 = o000O0Oo.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0OO()));
                    try {
                        o0O0o o0o0o = o0oooo.f57347OooOO0;
                        Intrinsics.checkNotNull(o0o0o);
                        lValueOf = Long.valueOf(o0o0o.OooOOo0().o00oO0O(o00VarOooO00o2));
                    } catch (Throwable th4) {
                        lValueOf = null;
                        th = th4;
                    }
                    try {
                        o00VarOooO00o2.close();
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
                    o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o(o0oooo);
                    oooO00o.OooO0OO(o00000.OooO00o.OooO00o(o000000o2.f35916OooO0o, oo0o));
                    o0oOOo o0ooooOooO00o = oooO00o.OooO00o();
                    o00 o00VarOooO00o3 = o000O0Oo.OooO00o(OooO0OO().OooOO0O(oooO00oOooO0O0.OooO0Oo()));
                    try {
                        new o000000O(o0ooooOooO00o).OooO00o(o00VarOooO00o3);
                        unit2 = Unit.INSTANCE;
                    } catch (Throwable th6) {
                        unit2 = null;
                        th = th6;
                    }
                    try {
                        o00VarOooO00o3.close();
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
                OooOo00.OooO0O0 OooO0O1 = oooO00oOooO0O0.OooO0O0();
                o000O0O0.OooO00o(o0oooo);
                return OooO0O1;
            } catch (Exception e) {
                Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
                try {
                    oooO00oOooO0O0.OooO00o();
                } catch (Exception unused) {
                }
                throw e;
            }
        } catch (Throwable th8) {
            o000O0O0.OooO00o(o0oooo);
            throw th8;
        }
    }
}
