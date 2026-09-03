package p143o00Oo;

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
import p153o00Oo0oo.o000OOo;
import p153o00Oo0oo.o0OO00O;
import p153o00Oo0oo.o0OOO0o;
import p153o00Oo0oo.oo0o0Oo;
import p174o00OooOo.o00O0O0;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0<R> implements o000O000.OooO00o, Runnable, Comparable<o000Oo0<?>>, o0O00o0.OooO0O0.OooO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f37661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000OO.OooO<o000Oo0<?>> f37662OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public com.bumptech.glide.OooO f37664OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0OOO0o f37665OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000O0O0 f37666OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Priority f37667OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f37668OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f37669OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public oo0o0Oo f37670OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public o000O00O f37671OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooO0O0<R> f37672OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f37673OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooOOO0 f37674OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f37675OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooOO0O f37676OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f37677OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Thread f37678OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f37679OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o0OOO0o f37680OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f37681OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OOO0o f37682OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public DataSource f37683OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public com.bumptech.glide.load.data.OooO0o<?> f37684OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f37685Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public volatile o000O000 f37686Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public volatile boolean f37687Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public volatile boolean f37688Oooo00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0o<R> f37658OooO0Oo = new o000O0o<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f37660OooO0o0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O00o0.OooO.OooO00o f37659OooO0o = new o0O00o0.OooO.OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0o<?> f37657OooO = new OooO0o<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooOO0 f37663OooOO0 = new OooOO0();

    public interface OooO {
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f37689OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f37690OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int[] f37691OooO0OO;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f37691OooO0OO = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37691OooO0OO[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OooOOO0.values().length];
            f37690OooO0O0 = iArr2;
            try {
                iArr2[OooOOO0.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37690OooO0O0[OooOOO0.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37690OooO0O0[OooOOO0.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37690OooO0O0[OooOOO0.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37690OooO0O0[OooOOO0.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[OooOO0O.values().length];
            f37689OooO00o = iArr3;
            try {
                iArr3[OooOO0O.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37689OooO00o[OooOO0O.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37689OooO00o[OooOO0O.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface OooO0O0<R> {
    }

    public final class OooO0OO<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DataSource f37692OooO00o;

        public OooO0OO(DataSource dataSource) {
            this.f37692OooO00o = dataSource;
        }
    }

    public static class OooO0o<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o0OOO0o f37694OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o000OOo<Z> f37695OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00O0000<Z> f37696OooO0OO;
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f37697OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f37698OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f37699OooO0OO;

        public final boolean OooO00o() {
            return (this.f37699OooO0OO || this.f37698OooO0O0) && this.f37697OooO00o;
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
        this.f37661OooO0oO = oooO;
        this.f37662OooO0oo = oooO0OO;
    }

    public final OooOOO0 OooO(OooOOO0 oooOOO0) {
        int i = OooO00o.f37690OooO0O0[oooOOO0.ordinal()];
        if (i == 1) {
            return this.f37671OooOOo0.OooO00o() ? OooOOO0.DATA_CACHE : OooO(OooOOO0.DATA_CACHE);
        }
        if (i == 2) {
            return this.f37673OooOo ? OooOOO0.FINISHED : OooOOO0.SOURCE;
        }
        if (i == 3 || i == 4) {
            return OooOOO0.FINISHED;
        }
        if (i == 5) {
            return this.f37671OooOOo0.OooO0O0() ? OooOOO0.RESOURCE_CACHE : OooO(OooOOO0.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + oooOOO0);
    }

    @Override // o00Oo.o000O000.OooO00o
    public final void OooO00o(o0OOO0o o0ooo0o2, Object obj, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource, o0OOO0o o0ooo0o3) {
        this.f37680OooOoOO = o0ooo0o2;
        this.f37681OooOoo = obj;
        this.f37684OooOooo = oooO0o;
        this.f37683OooOooO = dataSource;
        this.f37682OooOoo0 = o0ooo0o3;
        this.f37685Oooo0 = o0ooo0o2 != this.f37658OooO0Oo.OooO00o().get(0);
        if (Thread.currentThread() != this.f37678OooOoO) {
            OooOOOo(OooOO0O.DECODE_DATA);
        } else {
            OooO0oO();
        }
    }

    @Override // o0O00o0.OooO0O0.OooO0o
    @NonNull
    public final o0O00o0.OooO.OooO00o OooO0O0() {
        return this.f37659OooO0o;
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
        glideException.f13075OooO0o0 = o0ooo0o2;
        glideException.f13074OooO0o = dataSource;
        glideException.f13076OooO0oO = clsOooO00o;
        this.f37660OooO0o0.add(glideException);
        if (Thread.currentThread() != this.f37678OooOoO) {
            OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
        } else {
            OooOOo0();
        }
    }

    public final <Data> o0O0ooO<R> OooO0o(Data data, DataSource dataSource) throws GlideException {
        Class<?> cls = data.getClass();
        o000O0o<R> o000o0o2 = this.f37658OooO0Oo;
        o00<Data, ?, R> o00VarOooO0OO = o000o0o2.OooO0OO(cls);
        oo0o0Oo oo0o0oo = this.f37670OooOOo;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || o000o0o2.f37653OooOOo;
            o0OO00O<Boolean> o0oo00o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f13092OooO;
            Boolean bool = (Boolean) oo0o0oo.OooO0OO(o0oo00o2);
            if (bool == null || (bool.booleanValue() && !z)) {
                oo0o0oo = new oo0o0Oo();
                o00O0O0 o00o0o0 = this.f37670OooOOo.f37830OooO0O0;
                o00O0O0 o00o0o1 = oo0o0oo.f37830OooO0O0;
                o00o0o1.OooO(o00o0o0);
                o00o0o1.put(o0oo00o2, Boolean.valueOf(z));
            }
        }
        oo0o0Oo oo0o0oo2 = oo0o0oo;
        com.bumptech.glide.load.data.OooO oooOOooO0oo = this.f37664OooOO0O.OooO0O0().OooO0oo(data);
        try {
            return o00VarOooO0OO.OooO00o(this.f37668OooOOOO, this.f37669OooOOOo, oo0o0oo2, oooOOooO0oo, new OooO0OO(dataSource));
        } finally {
            oooOOooO0oo.OooO0O0();
        }
    }

    public final <Data> o0O0ooO<R> OooO0o0(com.bumptech.glide.load.data.OooO0o<?> oooO0o, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            oooO0o.OooO0O0();
            return null;
        }
        try {
            int i = oo0oOO0.f38356OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            o0O0ooO<R> o0o0oooOooO0o = OooO0o(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooOO0(jElapsedRealtimeNanos, "Decoded result " + o0o0oooOooO0o, null);
            }
            return o0o0oooOooO0o;
        } finally {
            oooO0o.OooO0O0();
        }
    }

    public final void OooO0oO() {
        o00O0000 o00o0000OooO0o0;
        if (Log.isLoggable("DecodeJob", 2)) {
            OooOO0(this.f37677OooOo0o, "Retrieved data", "data: " + this.f37681OooOoo + ", cache key: " + this.f37680OooOoOO + ", fetcher: " + this.f37684OooOooo);
        }
        o00O0000 o00o0001 = null;
        try {
            o00o0000OooO0o0 = OooO0o0(this.f37684OooOooo, this.f37681OooOoo, this.f37683OooOooO);
        } catch (GlideException e) {
            o0OOO0o o0ooo0o2 = this.f37682OooOoo0;
            DataSource dataSource = this.f37683OooOooO;
            e.f13075OooO0o0 = o0ooo0o2;
            e.f13074OooO0o = dataSource;
            e.f13076OooO0oO = null;
            this.f37660OooO0o0.add(e);
            o00o0000OooO0o0 = null;
        }
        if (o00o0000OooO0o0 == null) {
            OooOOo0();
            return;
        }
        DataSource dataSource2 = this.f37683OooOooO;
        boolean z = this.f37685Oooo0;
        if (o00o0000OooO0o0 instanceof o000OO00) {
            ((o000OO00) o00o0000OooO0o0).initialize();
        }
        boolean z2 = true;
        if (this.f37657OooO.f37696OooO0OO != null) {
            o00o0001 = (o00O0000) o00O0000.f37711OooO0oo.OooO0O0();
            o00OO0O0.OooO0O0(o00o0001);
            o00o0001.f37715OooO0oO = false;
            o00o0001.f37713OooO0o = true;
            o00o0001.f37714OooO0o0 = o00o0000OooO0o0;
            o00o0000OooO0o0 = o00o0001;
        }
        OooOOoo();
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37672OooOOoo;
        synchronized (o000o0oo2) {
            o000o0oo2.f37623OooOo00 = o00o0000OooO0o0;
            o000o0oo2.f37622OooOo0 = dataSource2;
            o000o0oo2.f37629OooOoo0 = z;
        }
        o000o0oo2.OooO0oo();
        this.f37674OooOo0 = OooOOO0.ENCODE;
        try {
            OooO0o<?> oooO0o = this.f37657OooO;
            if (oooO0o.f37696OooO0OO == null) {
                z2 = false;
            }
            if (z2) {
                OooO oooO = this.f37661OooO0oO;
                oo0o0Oo oo0o0oo = this.f37670OooOOo;
                oooO0o.getClass();
                try {
                    ((o000O0.OooO0OO) oooO).OooO00o().OooO0O0(oooO0o.f37694OooO00o, new o000(oooO0o.f37695OooO0O0, oooO0o.f37696OooO0OO, oo0o0oo));
                    oooO0o.f37696OooO0OO.OooO0Oo();
                } catch (Throwable th) {
                    oooO0o.f37696OooO0OO.OooO0Oo();
                    throw th;
                }
            }
            if (o00o0001 != null) {
                o00o0001.OooO0Oo();
            }
            OooOO0o();
        } catch (Throwable th2) {
            if (o00o0001 != null) {
                o00o0001.OooO0Oo();
            }
            throw th2;
        }
    }

    public final o000O000 OooO0oo() {
        int i = OooO00o.f37690OooO0O0[this.f37674OooOo0.ordinal()];
        o000O0o<R> o000o0o2 = this.f37658OooO0Oo;
        if (i == 1) {
            return new o00oOoo(o000o0o2, this);
        }
        if (i == 2) {
            return new o0000O(o000o0o2.OooO00o(), o000o0o2, this);
        }
        if (i == 3) {
            return new o00O00O(o000o0o2, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f37674OooOo0);
    }

    public final void OooOO0(long j, String str, String str2) {
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " in ");
        sbOooO0O0.append(oo0oOO0.OooO00o(j));
        sbOooO0O0.append(", load key: ");
        sbOooO0O0.append(this.f37666OooOOO);
        sbOooO0O0.append(str2 != null ? ", ".concat(str2) : "");
        sbOooO0O0.append(", thread: ");
        sbOooO0O0.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbOooO0O0.toString());
    }

    public final void OooOO0O() {
        OooOOoo();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f37660OooO0o0));
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37672OooOOoo;
        synchronized (o000o0oo2) {
            o000o0oo2.f37625OooOo0o = glideException;
        }
        o000o0oo2.OooO0oO();
        OooOOO0();
    }

    public final void OooOO0o() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37663OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37698OooO0O0 = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37663OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37697OooO00o = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOO0() {
        boolean zOooO00o;
        OooOO0 oooOO1 = this.f37663OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37699OooO0OO = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOOO();
        }
    }

    public final void OooOOOO() {
        OooOO0 oooOO1 = this.f37663OooOO0;
        synchronized (oooOO1) {
            oooOO1.f37698OooO0O0 = false;
            oooOO1.f37697OooO00o = false;
            oooOO1.f37699OooO0OO = false;
        }
        OooO0o<?> oooO0o = this.f37657OooO;
        oooO0o.f37694OooO00o = null;
        oooO0o.f37695OooO0O0 = null;
        oooO0o.f37696OooO0OO = null;
        o000O0o<R> o000o0o2 = this.f37658OooO0Oo;
        o000o0o2.f37640OooO0OO = null;
        o000o0o2.f37641OooO0Oo = null;
        o000o0o2.f37649OooOOO = null;
        o000o0o2.f37644OooO0oO = null;
        o000o0o2.f37647OooOO0O = null;
        o000o0o2.f37637OooO = null;
        o000o0o2.f37651OooOOOO = null;
        o000o0o2.f37646OooOO0 = null;
        o000o0o2.f37652OooOOOo = null;
        o000o0o2.f37638OooO00o.clear();
        o000o0o2.f37648OooOO0o = false;
        o000o0o2.f37639OooO0O0.clear();
        o000o0o2.f37650OooOOO0 = false;
        this.f37687Oooo00O = false;
        this.f37664OooOO0O = null;
        this.f37665OooOO0o = null;
        this.f37670OooOOo = null;
        this.f37667OooOOO0 = null;
        this.f37666OooOOO = null;
        this.f37672OooOOoo = null;
        this.f37674OooOo0 = null;
        this.f37686Oooo000 = null;
        this.f37678OooOoO = null;
        this.f37680OooOoOO = null;
        this.f37681OooOoo = null;
        this.f37683OooOooO = null;
        this.f37684OooOooo = null;
        this.f37677OooOo0o = 0L;
        this.f37688Oooo00o = false;
        this.f37679OooOoO0 = null;
        this.f37660OooO0o0.clear();
        this.f37662OooO0oo.OooO00o(this);
    }

    public final void OooOOOo(OooOO0O oooOO0O) {
        p157o00OoO0o.OooO oooO;
        this.f37676OooOo0O = oooOO0O;
        o000O0Oo o000o0oo2 = (o000O0Oo) this.f37672OooOOoo;
        if (o000o0oo2.f37619OooOOo0) {
            oooO = o000o0oo2.f37613OooOO0o;
        } else {
            oooO = o000o0oo2.f37618OooOOo ? o000o0oo2.f37615OooOOO0 : o000o0oo2.f37612OooOO0O;
        }
        oooO.execute(this);
    }

    public final void OooOOo() {
        int i = OooO00o.f37689OooO00o[this.f37676OooOo0O.ordinal()];
        if (i == 1) {
            this.f37674OooOo0 = OooO(OooOOO0.INITIALIZE);
            this.f37686Oooo000 = OooO0oo();
            OooOOo0();
        } else if (i == 2) {
            OooOOo0();
        } else if (i == 3) {
            OooO0oO();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f37676OooOo0O);
        }
    }

    public final void OooOOo0() {
        this.f37678OooOoO = Thread.currentThread();
        int i = oo0oOO0.f38356OooO0O0;
        this.f37677OooOo0o = SystemClock.elapsedRealtimeNanos();
        boolean zOooO0O0 = false;
        while (!this.f37688Oooo00o && this.f37686Oooo000 != null && !(zOooO0O0 = this.f37686Oooo000.OooO0O0())) {
            this.f37674OooOo0 = OooO(this.f37674OooOo0);
            this.f37686Oooo000 = OooO0oo();
            if (this.f37674OooOo0 == OooOOO0.SOURCE) {
                OooOOOo(OooOO0O.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f37674OooOo0 == OooOOO0.FINISHED || this.f37688Oooo00o) && !zOooO0O0) {
            OooOO0O();
        }
    }

    public final void OooOOoo() {
        this.f37659OooO0o.OooO00o();
        if (this.f37687Oooo00O) {
            throw new IllegalStateException("Already notified", this.f37660OooO0o0.isEmpty() ? null : (Throwable) OooOOO.OooO00o(this.f37660OooO0o0, 1));
        }
        this.f37687Oooo00O = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull o000Oo0<?> o000oo1) {
        o000Oo0<?> o000oo2 = o000oo1;
        int iOrdinal = this.f37667OooOOO0.ordinal() - o000oo2.f37667OooOOO0.ordinal();
        return iOrdinal == 0 ? this.f37675OooOo00 - o000oo2.f37675OooOo00 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.OooO0o<?> oooO0o = this.f37684OooOooo;
        try {
            try {
                try {
                    if (this.f37688Oooo00o) {
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
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f37688Oooo00o + ", stage: " + this.f37674OooOo0, th);
                }
                if (this.f37674OooOo0 != OooOOO0.ENCODE) {
                    this.f37660OooO0o0.add(th);
                    OooOO0O();
                }
                if (!this.f37688Oooo00o) {
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
