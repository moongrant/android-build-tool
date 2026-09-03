package p144o00Oo;

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
import p037OoooOo0.o000O0o;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.o0OO00O;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00O0O00;
import p174o00OooOo.o00O0OOO;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0<R> implements o000O000.OooO00o, Runnable, Comparable<o000Oo0<?>>, o0O00o0.OooO0O0.OooO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f37663OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO.OooO<o000Oo0<?>> f37664OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public com.bumptech.glide.OooO f37666OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0OOO0o f37667OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000O0O0 f37668OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Priority f37669OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f37670OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f37671OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public oo0o0Oo f37672OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public o000O00O f37673OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0<R> f37674OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f37675OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooOOO0 f37676OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f37677OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0O f37678OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f37679OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Thread f37680OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f37681OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o0OOO0o f37682OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f37683OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OOO0o f37684OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public DataSource f37685OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public com.bumptech.glide.load.data.OooO0o<?> f37686OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f37687Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile o000O000 f37688Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile boolean f37689Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public volatile boolean f37690Oooo00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0o<R> f37660OooO0Oo = new o000O0o<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f37662OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00o0.OooO.OooO00o f37661OooO0o = new o0O00o0.OooO.OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o<?> f37659OooO = new OooO0o<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0 f37665OooOO0 = new OooOO0();

    public interface OooO {
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f37691OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f37692OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int[] f37693OooO0OO;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f37693OooO0OO = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37693OooO0OO[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OooOOO0.values().length];
            f37692OooO0O0 = iArr2;
            try {
                iArr2[OooOOO0.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37692OooO0O0[OooOOO0.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37692OooO0O0[OooOOO0.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37692OooO0O0[OooOOO0.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37692OooO0O0[OooOOO0.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[OooOO0O.values().length];
            f37691OooO00o = iArr3;
            try {
                iArr3[OooOO0O.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37691OooO00o[OooOO0O.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37691OooO00o[OooOO0O.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface OooO0O0<R> {
    }

    public final class OooO0OO<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DataSource f37694OooO00o;

        public OooO0OO(DataSource dataSource) {
            this.f37694OooO00o = dataSource;
        }
    }

    public static class OooO0o<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0OOO0o f37696OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000OOo<Z> f37697OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0O0ooO<Z> f37698OooO0OO;
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f37699OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f37700OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f37701OooO0OO;

        public final boolean OooO00o() {
            return (this.f37701OooO0OO || this.f37700OooO0O0) && this.f37699OooO00o;
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

    public o000Oo0(OooO oooO, o0O00o0.OooO0O0.OooO0OO oooO0OO) {
        this.f37663OooO0oO = oooO;
        this.f37664OooO0oo = oooO0OO;
    }

    public final OooOOO0 OooO(OooOOO0 oooOOO0) {
        int i = OooO00o.f37692OooO0O0[oooOOO0.ordinal()];
        if (i == 1) {
            return this.f37673OooOOo0.OooO00o() ? OooOOO0.DATA_CACHE : OooO(OooOOO0.DATA_CACHE);
        }
        if (i == 2) {
            return this.f37675OooOo ? OooOOO0.FINISHED : OooOOO0.SOURCE;
        }
        if (i == 3 || i == 4) {
            return OooOOO0.FINISHED;
        }
        if (i == 5) {
            return this.f37673OooOOo0.OooO0O0() ? OooOOO0.RESOURCE_CACHE : OooO(OooOOO0.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + oooOOO0);
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO00o(o0OOO0o o0ooo0o2, Object obj, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource, o0OOO0o o0ooo0o3) {
        this.f37682OooOoOO = o0ooo0o2;
        this.f37683OooOoo = obj;
        this.f37686OooOooo = oooO0o;
        this.f37685OooOooO = dataSource;
        this.f37684OooOoo0 = o0ooo0o3;
        this.f37687Oooo0 = o0ooo0o2 != this.f37660OooO0Oo.OooO00o().get(0);
        if (Thread.currentThread() != this.f37680OooOoO) {
            OooOOOo(OooOO0O.DECODE_DATA);
        } else {
            OooO0oO();
        }
    }

    @Override // o0O00o0.OooO0O0.OooO0o
    @NonNull
    public final o0O00o0.OooO.OooO00o OooO0O0() {
        return this.f37661OooO0o;
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO0OO() {
        OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO0Oo(o0OOO0o o0ooo0o2, Exception exc, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource) {
        oooO0o.OooO0O0();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsOooO00o = oooO0o.OooO00o();
        glideException.f13065OooO0o0 = o0ooo0o2;
        glideException.f13064OooO0o = dataSource;
        glideException.f13066OooO0oO = clsOooO00o;
        this.f37662OooO0o0.add(glideException);
        if (Thread.currentThread() != this.f37680OooOoO) {
            OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
        } else {
            OooOOo0();
        }
    }

    public final <Data> o00oOoo<R> OooO0o(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        o000O0o<R> o000o0o2 = this.f37660OooO0Oo;
        o00O0000<Data, ?, R> o00o0000OooO0OO = o000o0o2.OooO0OO(cls);
        oo0o0Oo oo0o0oo = this.f37672OooOOo;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || o000o0o2.f37650OooOOo;
            o0OO00O<Boolean> o0oo00o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f13082OooO;
            Boolean bool = (Boolean) oo0o0oo.OooO0OO(o0oo00o2);
            if (bool == null || (bool.booleanValue() && !z)) {
                oo0o0oo = new oo0o0Oo();
                o00O0O00 o00o0o01 = this.f37672OooOOo.f37835OooO0O0;
                o00O0O00 o00o0o02 = oo0o0oo.f37835OooO0O0;
                o00o0o02.OooO(o00o0o01);
                o00o0o02.put(o0oo00o2, Boolean.valueOf(z));
            }
        }
        oo0o0Oo oo0o0oo2 = oo0o0oo;
        com.bumptech.glide.load.data.OooO oooOOooO0oo = this.f37666OooOO0O.OooO0O0().OooO0oo(data);
        try {
            return o00o0000OooO0OO.OooO00o(this.f37670OooOOOO, this.f37671OooOOOo, oo0o0oo2, oooOOooO0oo, new OooO0OO(dataSource));
        } finally {
            oooOOooO0oo.OooO0O0();
        }
    }

    public final <Data> o00oOoo<R> OooO0o0(com.bumptech.glide.load.data.OooO0o<?> oooO0o, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            oooO0o.OooO0O0();
            return null;
        }
        try {
            int i = o00O0OOO.f38347OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            o00oOoo<R> o00ooooOooO0o = OooO0o(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooOO0(jElapsedRealtimeNanos, "Decoded result " + o00ooooOooO0o, null);
            }
            return o00ooooOooO0o;
        } finally {
            oooO0o.OooO0O0();
        }
    }

    public final void OooO0oO() {
        o0O0ooO o0o0oooOooO0o0;
        if (Log.isLoggable("DecodeJob", 2)) {
            OooOO0(this.f37679OooOo0o, "Retrieved data", "data: " + this.f37683OooOoo + ", cache key: " + this.f37682OooOoOO + ", fetcher: " + this.f37686OooOooo);
        }
        o0O0ooO o0o0ooo = null;
        try {
            o0o0oooOooO0o0 = OooO0o0(this.f37686OooOooo, this.f37683OooOoo, this.f37685OooOooO);
        } catch (GlideException e) {
            o0OOO0o o0ooo0o2 = this.f37684OooOoo0;
            DataSource dataSource = this.f37685OooOooO;
            e.f13065OooO0o0 = o0ooo0o2;
            e.f13064OooO0o = dataSource;
            e.f13066OooO0oO = null;
            this.f37662OooO0o0.add(e);
            o0o0oooOooO0o0 = null;
        }
        if (o0o0oooOooO0o0 == null) {
            OooOOo0();
            return;
        }
        DataSource dataSource2 = this.f37685OooOooO;
        boolean z = this.f37687Oooo0;
        if (o0o0oooOooO0o0 instanceof o000OOo0) {
            ((o000OOo0) o0o0oooOooO0o0).initialize();
        }
        boolean z2 = true;
        if (this.f37659OooO.f37698OooO0OO != null) {
            o0o0ooo = (o0O0ooO) o0O0ooO.f37728OooO0oo.OooO0O0();
            o00OO00O.OooO0O0(o0o0ooo);
            o0o0ooo.f37732OooO0oO = false;
            o0o0ooo.f37730OooO0o = true;
            o0o0ooo.f37731OooO0o0 = o0o0oooOooO0o0;
            o0o0oooOooO0o0 = o0o0ooo;
        }
        OooOOoo();
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37674OooOOoo;
        synchronized (o000o0oo2) {
            o000o0oo2.f37620OooOo00 = o0o0oooOooO0o0;
            o000o0oo2.f37619OooOo0 = dataSource2;
            o000o0oo2.f37626OooOoo0 = z;
        }
        o000o0oo2.OooO0oo();
        this.f37676OooOo0 = OooOOO0.ENCODE;
        try {
            OooO0o<?> oooO0o = this.f37659OooO;
            if (oooO0o.f37698OooO0OO == null) {
                z2 = false;
            }
            if (z2) {
                OooO oooO = this.f37663OooO0oO;
                oo0o0Oo oo0o0oo = this.f37672OooOOo;
                oooO0o.getClass();
                try {
                    ((o000O0.OooO0OO) oooO).OooO00o().OooO0O0(oooO0o.f37696OooO00o, new o000(oooO0o.f37697OooO0O0, oooO0o.f37698OooO0OO, oo0o0oo));
                    oooO0o.f37698OooO0OO.OooO0Oo();
                } catch (Throwable th) {
                    oooO0o.f37698OooO0OO.OooO0Oo();
                    throw th;
                }
            }
            if (o0o0ooo != null) {
                o0o0ooo.OooO0Oo();
            }
            OooOO0o();
        } catch (Throwable th2) {
            if (o0o0ooo != null) {
                o0o0ooo.OooO0Oo();
            }
            throw th2;
        }
    }

    public final o000O000 OooO0oo() {
        int i = OooO00o.f37692OooO0O0[this.f37676OooOo0.ordinal()];
        o000O0o<R> o000o0o2 = this.f37660OooO0Oo;
        if (i == 1) {
            return new o00O000(o000o0o2, this);
        }
        if (i == 2) {
            return new o0000O(o000o0o2.OooO00o(), o000o0o2, this);
        }
        if (i == 3) {
            return new oOO00O(o000o0o2, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f37676OooOo0);
    }

    public final void OooOO0(long j, String str, String str2) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " in ");
        sbOooO0O0.append(o00O0OOO.OooO00o(j));
        sbOooO0O0.append(", load key: ");
        sbOooO0O0.append(this.f37668OooOOO);
        sbOooO0O0.append(str2 != null ? ", ".concat(str2) : "");
        sbOooO0O0.append(", thread: ");
        sbOooO0O0.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbOooO0O0.toString());
    }

    public final void OooOO0O() {
        OooOOoo();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f37662OooO0o0));
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37674OooOOoo;
        synchronized (o000o0oo2) {
            o000o0oo2.f37622OooOo0o = glideException;
        }
        o000o0oo2.OooO0oO();
        OooOOO0();
    }

    public final void OooOO0o() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37665OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37700OooO0O0 = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37665OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37699OooO00o = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO0() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37665OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37701OooO0OO = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOOO() {
        OooOO0 oooOO1 = this.f37665OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37700OooO0O0 = false;
            oooOO1.f37699OooO00o = false;
            oooOO1.f37701OooO0OO = false;
        }
        OooO0o<?> oooO0o = this.f37659OooO;
        oooO0o.f37696OooO00o = null;
        oooO0o.f37697OooO0O0 = null;
        oooO0o.f37698OooO0OO = null;
        o000O0o<R> o000o0o2 = this.f37660OooO0Oo;
        o000o0o2.f37637OooO0OO = null;
        o000o0o2.f37638OooO0Oo = null;
        o000o0o2.f37646OooOOO = null;
        o000o0o2.f37641OooO0oO = null;
        o000o0o2.f37644OooOO0O = null;
        o000o0o2.f37634OooO = null;
        o000o0o2.f37648OooOOOO = null;
        o000o0o2.f37643OooOO0 = null;
        o000o0o2.f37649OooOOOo = null;
        o000o0o2.f37635OooO00o.clear();
        o000o0o2.f37645OooOO0o = false;
        o000o0o2.f37636OooO0O0.clear();
        o000o0o2.f37647OooOOO0 = false;
        this.f37689Oooo00O = false;
        this.f37666OooOO0O = null;
        this.f37667OooOO0o = null;
        this.f37672OooOOo = null;
        this.f37669OooOOO0 = null;
        this.f37668OooOOO = null;
        this.f37674OooOOoo = null;
        this.f37676OooOo0 = null;
        this.f37688Oooo000 = null;
        this.f37680OooOoO = null;
        this.f37682OooOoOO = null;
        this.f37683OooOoo = null;
        this.f37685OooOooO = null;
        this.f37686OooOooo = null;
        this.f37679OooOo0o = 0L;
        this.f37690Oooo00o = false;
        this.f37681OooOoO0 = null;
        this.f37662OooO0o0.clear();
        this.f37664OooO0oo.OooO00o(this);
    }

    public final void OooOOOo(OooOO0O oooOO0O) {
        p157o00OoO0o.OooO oooO;
        this.f37678OooOo0O = oooOO0O;
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37674OooOOoo;
        if (o000o0oo2.f37616OooOOo0) {
            oooO = o000o0oo2.f37610OooOO0o;
        } else {
            oooO = o000o0oo2.f37615OooOOo ? o000o0oo2.f37612OooOOO0 : o000o0oo2.f37609OooOO0O;
        }
        oooO.execute(this);
    }

    public final void OooOOo() {
        int i = OooO00o.f37691OooO00o[this.f37678OooOo0O.ordinal()];
        if (i == 1) {
            this.f37676OooOo0 = OooO(OooOOO0.INITIALIZE);
            this.f37688Oooo000 = OooO0oo();
            OooOOo0();
        } else if (i == 2) {
            OooOOo0();
        } else if (i == 3) {
            OooO0oO();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f37678OooOo0O);
        }
    }

    public final void OooOOo0() {
        this.f37680OooOoO = Thread.currentThread();
        int i = o00O0OOO.f38347OooO0O0;
        this.f37679OooOo0o = SystemClock.elapsedRealtimeNanos();
        boolean zOooO0O0 = false;
        while (!this.f37690Oooo00o && this.f37688Oooo000 != null && !(zOooO0O0 = this.f37688Oooo000.OooO0O0())) {
            this.f37676OooOo0 = OooO(this.f37676OooOo0);
            this.f37688Oooo000 = OooO0oo();
            if (this.f37676OooOo0 == OooOOO0.SOURCE) {
                OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f37676OooOo0 == OooOOO0.FINISHED || this.f37690Oooo00o) && !zOooO0O0) {
            OooOO0O();
        }
    }

    public final void OooOOoo() {
        this.f37661OooO0o.OooO00o();
        if (this.f37689Oooo00O) {
            throw new IllegalStateException("Already notified", this.f37662OooO0o0.isEmpty() ? null : (Throwable) OooOOO.OooO00o(this.f37662OooO0o0, 1));
        }
        this.f37689Oooo00O = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull o000Oo0<?> o000oo1) {
        o000Oo0<?> o000oo2 = o000oo1;
        int iOrdinal = this.f37669OooOOO0.ordinal() - o000oo2.f37669OooOOO0.ordinal();
        return iOrdinal == 0 ? this.f37677OooOo00 - o000oo2.f37677OooOo00 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.OooO0o<?> oooO0o = this.f37686OooOooo;
        try {
            try {
                try {
                    if (this.f37690Oooo00o) {
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
                } catch (o000OO e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f37690Oooo00o + ", stage: " + this.f37676OooOo0, th);
                }
                if (this.f37676OooOo0 != OooOOO0.ENCODE) {
                    this.f37662OooO0o0.add(th);
                    OooOO0O();
                }
                if (!this.f37690Oooo00o) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
            throw th2;
        }
    }
}
