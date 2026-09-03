package p127o00O0oo;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Collections;
import p018OooOoo0.OooOOO;
import p037OoooOo0.o000Oo0;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;
import p126o00O0oOo.o00000O;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo<R> implements o0ooOOo.OooO00o, Runnable, Comparable<o0Oo0oo<?>>, o00OOO.OooO00o.OooO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f36896OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO.OooO<o0Oo0oo<?>> f36897OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public com.bumptech.glide.OooO f36899OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o000OOo f36900OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000000O f36901OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Priority f36902OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f36903OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f36904OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public o00000 f36905OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public oo0o0Oo f36906OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0<R> f36907OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f36908OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooOOO0 f36909OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f36910OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0O f36911OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f36912OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Thread f36913OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f36914OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o000OOo f36915OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f36916OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o000OOo f36917OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public DataSource f36918OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public com.bumptech.glide.load.data.OooO0o<?> f36919OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f36920Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile o0ooOOo f36921Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile boolean f36922Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public volatile boolean f36923Oooo00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o<R> f36893OooO0Oo = new o0OOO0o<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f36895OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OOO.OooO0o.OooO00o f36894OooO0o = new o00OOO.OooO0o.OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o<?> f36892OooO = new OooO0o<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0 f36898OooOO0 = new OooOO0();

    public interface OooO {
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f36925OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int[] f36926OooO0OO;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f36926OooO0OO = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36926OooO0OO[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OooOOO0.values().length];
            f36925OooO0O0 = iArr2;
            try {
                iArr2[OooOOO0.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36925OooO0O0[OooOOO0.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36925OooO0O0[OooOOO0.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36925OooO0O0[OooOOO0.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36925OooO0O0[OooOOO0.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[OooOO0O.values().length];
            f36924OooO00o = iArr3;
            try {
                iArr3[OooOO0O.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36924OooO00o[OooOO0O.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36924OooO00o[OooOO0O.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface OooO0O0<R> {
    }

    public final class OooO0OO<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DataSource f36927OooO00o;

        public OooO0OO(DataSource dataSource) {
            this.f36927OooO00o = dataSource;
        }
    }

    public static class OooO0o<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000OOo f36929OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00000O<Z> f36930OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0000Ooo<Z> f36931OooO0OO;
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f36932OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f36933OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f36934OooO0OO;

        public final boolean OooO00o() {
            return (this.f36934OooO0OO || this.f36933OooO0O0) && this.f36932OooO00o;
        }
    }

    public enum OooOO0O {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum OooOOO0 {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public o0Oo0oo(OooO oooO, o00OOO.OooO00o.OooO0OO oooO0OO) {
        this.f36896OooO0oO = oooO;
        this.f36897OooO0oo = oooO0OO;
    }

    public final OooOOO0 OooO(OooOOO0 oooOOO0) {
        int i = OooO00o.f36925OooO0O0[oooOOO0.ordinal()];
        if (i == 1) {
            return this.f36906OooOOo0.OooO00o() ? OooOOO0.DATA_CACHE : OooO(OooOOO0.DATA_CACHE);
        }
        if (i == 2) {
            return this.f36908OooOo ? OooOOO0.FINISHED : OooOOO0.SOURCE;
        }
        if (i == 3 || i == 4) {
            return OooOOO0.FINISHED;
        }
        if (i == 5) {
            return this.f36906OooOOo0.OooO0O0() ? OooOOO0.RESOURCE_CACHE : OooO(OooOOO0.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + oooOOO0);
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO00o(o000OOo o000ooo2, Object obj, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource, o000OOo o000ooo3) {
        this.f36915OooOoOO = o000ooo2;
        this.f36916OooOoo = obj;
        this.f36919OooOooo = oooO0o;
        this.f36918OooOooO = dataSource;
        this.f36917OooOoo0 = o000ooo3;
        this.f36920Oooo0 = o000ooo2 != this.f36893OooO0Oo.OooO00o().get(0);
        if (Thread.currentThread() != this.f36913OooOoO) {
            OooOOOo(OooOO0O.DECODE_DATA);
        } else {
            OooO0oO();
        }
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO0O0(o000OOo o000ooo2, Exception exc, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource) {
        oooO0o.OooO0O0();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsOooO00o = oooO0o.OooO00o();
        glideException.f9974OooO0o0 = o000ooo2;
        glideException.f9973OooO0o = dataSource;
        glideException.f9975OooO0oO = clsOooO00o;
        this.f36895OooO0o0.add(glideException);
        if (Thread.currentThread() != this.f36913OooOoO) {
            OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
        } else {
            OooOOo0();
        }
    }

    @Override // o00OOO.OooO00o.OooO0o
    @NonNull
    public final o00OOO.OooO0o.OooO00o OooO0OO() {
        return this.f36894OooO0o;
    }

    public final <Data> o0000<R> OooO0Oo(com.bumptech.glide.load.data.OooO0o<?> oooO0o, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            oooO0o.OooO0O0();
            return null;
        }
        try {
            int i = p532o0o0Oo.o00000O.f54564OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            o0000<R> o0000VarOooO0o = OooO0o(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooOO0(jElapsedRealtimeNanos, "Decoded result " + o0000VarOooO0o, null);
            }
            return o0000VarOooO0o;
        } finally {
            oooO0o.OooO0O0();
        }
    }

    public final <Data> o0000<R> OooO0o(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        o0OOO0o<R> o0ooo0o2 = this.f36893OooO0Oo;
        o00000OO<Data, ?, R> o00000ooOooO0OO = o0ooo0o2.OooO0OO(cls);
        o00000 o00000Var = this.f36905OooOOo;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || o0ooo0o2.f36890OooOOo;
            o000000O<Boolean> o000000o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f9991OooO;
            Boolean bool = (Boolean) o00000Var.OooO0OO(o000000o2);
            if (bool == null || (bool.booleanValue() && !z)) {
                o00000Var = new o00000();
                o0O0O00 o0o0o00 = this.f36905OooOOo.f36724OooO0O0;
                o0O0O00 o0o0o01 = o00000Var.f36724OooO0O0;
                o0o0o01.OooO(o0o0o00);
                o0o0o01.put(o000000o2, Boolean.valueOf(z));
            }
        }
        o00000 o00000Var2 = o00000Var;
        com.bumptech.glide.load.data.OooO oooOOooO0oo = this.f36899OooOO0O.OooO0O0().OooO0oo(data);
        try {
            return o00000ooOooO0OO.OooO00o(this.f36903OooOOOO, this.f36904OooOOOo, o00000Var2, oooOOooO0oo, new OooO0OO(dataSource));
        } finally {
            oooOOooO0oo.OooO0O0();
        }
    }

    @Override // o00O0oo.o0ooOOo.OooO00o
    public final void OooO0o0() {
        OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
    }

    public final void OooO0oO() {
        o0000Ooo o0000oooOooO0Oo;
        if (Log.isLoggable("DecodeJob", 2)) {
            OooOO0(this.f36912OooOo0o, "Retrieved data", "data: " + this.f36916OooOoo + ", cache key: " + this.f36915OooOoOO + ", fetcher: " + this.f36919OooOooo);
        }
        o0000Ooo o0000ooo = null;
        try {
            o0000oooOooO0Oo = OooO0Oo(this.f36919OooOooo, this.f36916OooOoo, this.f36918OooOooO);
        } catch (GlideException e) {
            o000OOo o000ooo2 = this.f36917OooOoo0;
            DataSource dataSource = this.f36918OooOooO;
            e.f9974OooO0o0 = o000ooo2;
            e.f9973OooO0o = dataSource;
            e.f9975OooO0oO = null;
            this.f36895OooO0o0.add(e);
            o0000oooOooO0Oo = null;
        }
        if (o0000oooOooO0Oo == null) {
            OooOOo0();
            return;
        }
        DataSource dataSource2 = this.f36918OooOooO;
        boolean z = this.f36920Oooo0;
        if (o0000oooOooO0Oo instanceof o00000O0) {
            ((o00000O0) o0000oooOooO0Oo).initialize();
        }
        boolean z2 = true;
        if (this.f36892OooO.f36931OooO0OO != null) {
            o0000ooo = (o0000Ooo) o0000Ooo.f36767OooO0oo.OooO0O0();
            o0000O00.OooO0O0(o0000ooo);
            o0000ooo.f36771OooO0oO = false;
            o0000ooo.f36769OooO0o = true;
            o0000ooo.f36770OooO0o0 = o0000oooOooO0Oo;
            o0000oooOooO0Oo = o0000ooo;
        }
        OooOOoo();
        o000OOo o000ooo3 = (o000OOo) this.f36907OooOOoo;
        synchronized (o000ooo3) {
            o000ooo3.f36807OooOo00 = o0000oooOooO0Oo;
            o000ooo3.f36806OooOo0 = dataSource2;
            o000ooo3.f36813OooOoo0 = z;
        }
        o000ooo3.OooO0oo();
        this.f36909OooOo0 = OooOOO0.ENCODE;
        try {
            OooO0o<?> oooO0o = this.f36892OooO;
            if (oooO0o.f36931OooO0OO == null) {
                z2 = false;
            }
            if (z2) {
                OooO oooO = this.f36896OooO0oO;
                o00000 o00000Var = this.f36905OooOOo;
                oooO0o.getClass();
                try {
                    ((o0O0O00.OooO0OO) oooO).OooO00o().OooO0O0(oooO0o.f36929OooO00o, new o00oO0o(oooO0o.f36930OooO0O0, oooO0o.f36931OooO0OO, o00000Var));
                    oooO0o.f36931OooO0OO.OooO0Oo();
                } catch (Throwable th) {
                    oooO0o.f36931OooO0OO.OooO0Oo();
                    throw th;
                }
            }
            if (o0000ooo != null) {
                o0000ooo.OooO0Oo();
            }
            OooOO0o();
        } catch (Throwable th2) {
            if (o0000ooo != null) {
                o0000ooo.OooO0Oo();
            }
            throw th2;
        }
    }

    public final o0ooOOo OooO0oo() {
        int i = OooO00o.f36925OooO0O0[this.f36909OooOo0.ordinal()];
        o0OOO0o<R> o0ooo0o2 = this.f36893OooO0Oo;
        if (i == 1) {
            return new o0000O00(o0ooo0o2, this);
        }
        if (i == 2) {
            return new o00Ooo(o0ooo0o2.OooO00o(), o0ooo0o2, this);
        }
        if (i == 3) {
            return new o000OO(o0ooo0o2, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f36909OooOo0);
    }

    public final void OooOO0(long j, String str, String str2) {
        StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, " in ");
        sbOooO0O0.append(p532o0o0Oo.o00000O.OooO00o(j));
        sbOooO0O0.append(", load key: ");
        sbOooO0O0.append(this.f36901OooOOO);
        sbOooO0O0.append(str2 != null ? ", ".concat(str2) : "");
        sbOooO0O0.append(", thread: ");
        sbOooO0O0.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbOooO0O0.toString());
    }

    public final void OooOO0O() {
        OooOOoo();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f36895OooO0o0));
        o000OOo o000ooo2 = (o000OOo) this.f36907OooOOoo;
        synchronized (o000ooo2) {
            o000ooo2.f36809OooOo0o = glideException;
        }
        o000ooo2.OooO0oO();
        OooOOO0();
    }

    public final void OooOO0o() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f36898OooOO0;
        synchronized (oooOO1) {
            oooOO1.f36933OooO0O0 = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f36898OooOO0;
        synchronized (oooOO1) {
            oooOO1.f36932OooO00o = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO0() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f36898OooOO0;
        synchronized (oooOO1) {
            oooOO1.f36934OooO0OO = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOOO() {
        OooOO0 oooOO1 = this.f36898OooOO0;
        synchronized (oooOO1) {
            oooOO1.f36933OooO0O0 = false;
            oooOO1.f36932OooO00o = false;
            oooOO1.f36934OooO0OO = false;
        }
        OooO0o<?> oooO0o = this.f36892OooO;
        oooO0o.f36929OooO00o = null;
        oooO0o.f36930OooO0O0 = null;
        oooO0o.f36931OooO0OO = null;
        o0OOO0o<R> o0ooo0o2 = this.f36893OooO0Oo;
        o0ooo0o2.f36877OooO0OO = null;
        o0ooo0o2.f36878OooO0Oo = null;
        o0ooo0o2.f36886OooOOO = null;
        o0ooo0o2.f36881OooO0oO = null;
        o0ooo0o2.f36884OooOO0O = null;
        o0ooo0o2.f36874OooO = null;
        o0ooo0o2.f36888OooOOOO = null;
        o0ooo0o2.f36883OooOO0 = null;
        o0ooo0o2.f36889OooOOOo = null;
        o0ooo0o2.f36875OooO00o.clear();
        o0ooo0o2.f36885OooOO0o = false;
        o0ooo0o2.f36876OooO0O0.clear();
        o0ooo0o2.f36887OooOOO0 = false;
        this.f36922Oooo00O = false;
        this.f36899OooOO0O = null;
        this.f36900OooOO0o = null;
        this.f36905OooOOo = null;
        this.f36902OooOOO0 = null;
        this.f36901OooOOO = null;
        this.f36907OooOOoo = null;
        this.f36909OooOo0 = null;
        this.f36921Oooo000 = null;
        this.f36913OooOoO = null;
        this.f36915OooOoOO = null;
        this.f36916OooOoo = null;
        this.f36918OooOooO = null;
        this.f36919OooOooo = null;
        this.f36912OooOo0o = 0L;
        this.f36923Oooo00o = false;
        this.f36914OooOoO0 = null;
        this.f36895OooO0o0.clear();
        this.f36897OooO0oo.OooO00o(this);
    }

    public final void OooOOOo(OooOO0O oooOO0O) {
        o00OO000.OooO00o oooO00o;
        this.f36911OooOo0O = oooOO0O;
        o000OOo o000ooo2 = (o000OOo) this.f36907OooOOoo;
        if (o000ooo2.f36803OooOOo0) {
            oooO00o = o000ooo2.f36797OooOO0o;
        } else {
            oooO00o = o000ooo2.f36802OooOOo ? o000ooo2.f36799OooOOO0 : o000ooo2.f36796OooOO0O;
        }
        oooO00o.execute(this);
    }

    public final void OooOOo() {
        int i = OooO00o.f36924OooO00o[this.f36911OooOo0O.ordinal()];
        if (i == 1) {
            this.f36909OooOo0 = OooO(OooOOO0.INITIALIZE);
            this.f36921Oooo000 = OooO0oo();
            OooOOo0();
        } else if (i == 2) {
            OooOOo0();
        } else if (i == 3) {
            OooO0oO();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f36911OooOo0O);
        }
    }

    public final void OooOOo0() {
        this.f36913OooOoO = Thread.currentThread();
        int i = p532o0o0Oo.o00000O.f54564OooO0O0;
        this.f36912OooOo0o = SystemClock.elapsedRealtimeNanos();
        boolean zOooO0Oo = false;
        while (!this.f36923Oooo00o && this.f36921Oooo000 != null && !(zOooO0Oo = this.f36921Oooo000.OooO0Oo())) {
            this.f36909OooOo0 = OooO(this.f36909OooOo0);
            this.f36921Oooo000 = OooO0oo();
            if (this.f36909OooOo0 == OooOOO0.SOURCE) {
                OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f36909OooOo0 == OooOOO0.FINISHED || this.f36923Oooo00o) && !zOooO0Oo) {
            OooOO0O();
        }
    }

    public final void OooOOoo() {
        this.f36894OooO0o.OooO00o();
        if (this.f36922Oooo00O) {
            throw new IllegalStateException("Already notified", this.f36895OooO0o0.isEmpty() ? null : (Throwable) OooOOO.OooO0O0(this.f36895OooO0o0, 1));
        }
        this.f36922Oooo00O = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull o0Oo0oo<?> o0oo0oo2) {
        o0Oo0oo<?> o0oo0oo3 = o0oo0oo2;
        int iOrdinal = this.f36902OooOOO0.ordinal() - o0oo0oo3.f36902OooOOO0.ordinal();
        return iOrdinal == 0 ? this.f36910OooOo00 - o0oo0oo3.f36910OooOo00 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.OooO0o<?> oooO0o = this.f36919OooOooo;
        try {
            try {
                try {
                    if (this.f36923Oooo00o) {
                        OooOO0O();
                        if (oooO0o != null) {
                            oooO0o.OooO0O0();
                            return;
                        }
                        return;
                    }
                    OooOOo();
                    if (oooO0o != null) {
                        oooO0o.OooO0O0();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f36923Oooo00o + ", stage: " + this.f36909OooOo0, th);
                    }
                    if (this.f36909OooOo0 != OooOOO0.ENCODE) {
                        this.f36895OooO0o0.add(th);
                        OooOO0O();
                    }
                    if (!this.f36923Oooo00o) {
                        throw th;
                    }
                    throw th;
                }
            } catch (o00Oo0 e) {
                throw e;
            }
        } catch (Throwable th2) {
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
            throw th2;
        }
    }
}
