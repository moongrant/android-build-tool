package p214o00oO0;

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
import java.util.List;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p217o00oO00o.o000000O;
import p217o00oO00o.o00000O;
import p241o00oo0.o0O00000;
import p241o00oo0.o0oOOo;
import p243o00oo00O.o0000O0O;
import p418o0Oo0oo.o00000O0;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0<R> implements o00O0O0O.OooO00o, Runnable, Comparable<oo0o0O0<?>>, o0oOOo.OooO0o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO f33549Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public com.bumptech.glide.OooO f33553OoooO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final o000OO0O.OooO<oo0o0O0<?>> f33555OoooO00;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public o000000 f33557OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public o00OO0OO f33558OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f33559OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f33560OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o00O f33561OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o00000 f33562OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO0O0<R> f33563Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f33564Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f33565OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f33566OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public long f33567OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public Object f33568Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f33569Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Thread f33570OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o000000 f33571Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Priority f33572o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public DataSource f33573o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public com.bumptech.glide.load.data.OooO0o<?> f33574o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public volatile o00O0O0O f33575o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public volatile boolean f33576o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public volatile boolean f33577o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public o000000 f33578o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public boolean f33579oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public Object f33580ooOO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O0OO0<R> f33550Oooo0o = new o00O0OO0<>();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final List<Throwable> f33551Oooo0oO = new ArrayList();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o0O00000.OooO00o f33552Oooo0oo = new o0O00000.OooO00o();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final OooO0o<?> f33554OoooO0 = new OooO0o<>();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final OooOO0 f33556OoooO0O = new OooOO0();

    public interface OooO {
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33581OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f33582OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final /* synthetic */ int[] f33583OooO0OO;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f33583OooO0OO = iArr;
            try {
                iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33583OooO0OO[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o00000O0.OooO0OO(6).length];
            f33582OooO0O0 = iArr2;
            try {
                iArr2[o00000O0.OooO0O0(2)] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33582OooO0O0[o00000O0.OooO0O0(3)] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33582OooO0O0[o00000O0.OooO0O0(4)] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33582OooO0O0[o00000O0.OooO0O0(6)] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33582OooO0O0[o00000O0.OooO0O0(1)] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[o00000O0.OooO0OO(3).length];
            f33581OooO00o = iArr3;
            try {
                iArr3[o00000O0.OooO0O0(1)] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33581OooO00o[o00000O0.OooO0O0(2)] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33581OooO00o[o00000O0.OooO0O0(3)] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface OooO0O0<R> {
    }

    public final class OooO0OO<Z> implements oo0oOO0.OooO00o<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final DataSource f33584OooO00o;

        public OooO0OO(DataSource dataSource) {
            this.f33584OooO00o = dataSource;
        }
    }

    public static class OooO0o<Z> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public o000000 f33586OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00000O<Z> f33587OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o0o0Oo<Z> f33588OooO0OO;
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f33589OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f33590OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f33591OooO0OO;

        public final boolean OooO00o() {
            return (this.f33591OooO0OO || this.f33590OooO0O0) && this.f33589OooO00o;
        }
    }

    public oo0o0O0(OooO oooO, o000OO0O.OooO<oo0o0O0<?>> oooO2) {
        this.f33549Oooo = oooO;
        this.f33555OoooO00 = oooO2;
    }

    public final o00O0O0O OooO() {
        int i = OooO00o.f33582OooO0O0[o00000O0.OooO0O0(this.f33565OooooO0)];
        if (i == 1) {
            return new o00OOOOo(this.f33550Oooo0o, this);
        }
        if (i == 2) {
            return new o00O0(this.f33550Oooo0o, this);
        }
        if (i == 3) {
            return new oo00oO(this.f33550Oooo0o, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unrecognized stage: ");
        sbOooO0o0.append(o00O0OOO.OooO00o(this.f33565OooooO0));
        throw new IllegalStateException(sbOooO0o0.toString());
    }

    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO00o(o000000 o000000Var, Object obj, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource, o000000 o000000Var2) {
        this.f33571Ooooooo = o000000Var;
        this.f33580ooOO = obj;
        this.f33574o00Oo0 = oooO0o;
        this.f33573o00O0O = dataSource;
        this.f33578o0OoOo0 = o000000Var2;
        this.f33579oo000o = o000000Var != ((ArrayList) this.f33550Oooo0o.OooO00o()).get(0);
        if (Thread.currentThread() == this.f33570OoooooO) {
            OooO0oo();
        } else {
            this.f33566OooooOO = 3;
            ((o00OO00O) this.f33563Ooooo00).OooO(this);
        }
    }

    @Override // o00oo0.o0oOOo.OooO0o
    @NonNull
    public final o0O00000 OooO0O0() {
        return this.f33552Oooo0oo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO0Oo(o000000 o000000Var, Exception exc, com.bumptech.glide.load.data.OooO0o<?> oooO0o, DataSource dataSource) {
        oooO0o.OooO0O0();
        GlideException glideException = new GlideException("Fetching data failed", Collections.singletonList(exc));
        Class<?> clsOooO00o = oooO0o.OooO00o();
        glideException.f12495Oooo0oO = o000000Var;
        glideException.f12496Oooo0oo = dataSource;
        glideException.f12493Oooo = clsOooO00o;
        this.f33551Oooo0oO.add(glideException);
        if (Thread.currentThread() == this.f33570OoooooO) {
            OooOOO();
        } else {
            this.f33566OooooOO = 2;
            ((o00OO00O) this.f33563Ooooo00).OooO(this);
        }
    }

    public final <Data> o00OOOO0<R> OooO0o(com.bumptech.glide.load.data.OooO0o<?> oooO0o, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            oooO0o.OooO0O0();
            return null;
        }
        try {
            int i = o0000O0O.f34164OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            o00OOOO0<R> o00oooo0OooO0oO = OooO0oO(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooOO0O("Decoded result " + o00oooo0OooO0oO, jElapsedRealtimeNanos, null);
            }
            return o00oooo0OooO0oO;
        } finally {
            oooO0o.OooO0O0();
        }
    }

    @Override // o00oO0.o00O0O0O.OooO00o
    public final void OooO0o0() {
        this.f33566OooooOO = 2;
        ((o00OO00O) this.f33563Ooooo00).OooO(this);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <Data> o00OOOO0<R> OooO0oO(Data data, DataSource dataSource) throws GlideException {
        com.bumptech.glide.load.data.OooO<Data> oooOOooO0O0;
        o00OOO0O<Data, ?, R> o00ooo0oOooO0Oo = this.f33550Oooo0o.OooO0Oo(data.getClass());
        o00000 o00000Var = this.f33562OoooOoo;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f33550Oooo0o.f33431OooOOo;
            o000000O<Boolean> o000000o2 = com.bumptech.glide.load.resource.bitmap.OooO00o.f12512OooO;
            Boolean bool = (Boolean) o00000Var.OooO0OO(o000000o2);
            if (bool == null || (bool.booleanValue() && !z)) {
                o00000Var = new o00000();
                o00000Var.OooO0Oo(this.f33562OoooOoo);
                o00000Var.f33630OooO0O0.put(o000000o2, Boolean.valueOf(z));
            }
        }
        o00000 o00000Var2 = o00000Var;
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f33553OoooO.f12361OooO0O0.f12433OooO0o0;
        synchronized (oooOO1) {
            com.bumptech.glide.load.data.OooO.OooO00o<?> oooO00o = oooOO1.f12472OooO00o.get(data.getClass());
            if (oooO00o == null) {
                for (com.bumptech.glide.load.data.OooO.OooO00o<?> oooO00o2 : oooOO1.f12472OooO00o.values()) {
                    if (oooO00o2.OooO00o().isAssignableFrom(data.getClass())) {
                        oooO00o = oooO00o2;
                        break;
                    }
                }
            }
            if (oooO00o == null) {
                oooO00o = com.bumptech.glide.load.data.OooOO0.f12471OooO0O0;
            }
            oooOOooO0O0 = oooO00o.OooO0O0(data);
        }
        try {
            return o00ooo0oOooO0Oo.OooO00o(oooOOooO0O0, o00000Var2, this.f33559OoooOOo, this.f33560OoooOo0, new OooO0OO(dataSource));
        } finally {
            oooOOooO0O0.OooO0O0();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0oo() {
        o0o0Oo o0o0ooOooO0o;
        boolean zOooO00o;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f33567OooooOo;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("data: ");
            sbOooO0o0.append(this.f33580ooOO);
            sbOooO0o0.append(", cache key: ");
            sbOooO0o0.append(this.f33571Ooooooo);
            sbOooO0o0.append(", fetcher: ");
            sbOooO0o0.append(this.f33574o00Oo0);
            OooOO0O("Retrieved data", j, sbOooO0o0.toString());
        }
        o0o0Oo o0o0ooOooO0Oo = null;
        try {
            o0o0ooOooO0o = OooO0o(this.f33574o00Oo0, this.f33580ooOO, this.f33573o00O0O);
        } catch (GlideException e) {
            o000000 o000000Var = this.f33578o0OoOo0;
            DataSource dataSource = this.f33573o00O0O;
            e.f12495Oooo0oO = o000000Var;
            e.f12496Oooo0oo = dataSource;
            e.f12493Oooo = null;
            this.f33551Oooo0oO.add(e);
            o0o0ooOooO0o = null;
        }
        if (o0o0ooOooO0o == null) {
            OooOOO();
            return;
        }
        DataSource dataSource2 = this.f33573o00O0O;
        boolean z = this.f33579oo000o;
        if (o0o0ooOooO0o instanceof o00OOO00) {
            ((o00OOO00) o0o0ooOooO0o).initialize();
        }
        if (this.f33554OoooO0.f33588OooO0OO != null) {
            o0o0ooOooO0Oo = o0o0Oo.OooO0Oo(o0o0ooOooO0o);
            o0o0ooOooO0o = o0o0ooOooO0Oo;
        }
        OooOOOo();
        o00OO00O<?> o00oo00o = (o00OO00O) this.f33563Ooooo00;
        synchronized (o00oo00o) {
            o00oo00o.f33482Ooooo0o = o0o0ooOooO0o;
            o00oo00o.f33483OooooO0 = dataSource2;
            o00oo00o.f33491o0OoOo0 = z;
        }
        synchronized (o00oo00o) {
            o00oo00o.f33469Oooo0oO.OooO00o();
            if (o00oo00o.f33489Ooooooo) {
                o00oo00o.f33482Ooooo0o.OooO00o();
                o00oo00o.OooO0oO();
            } else {
                if (o00oo00o.f33468Oooo0o.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (o00oo00o.f33484OooooOO) {
                    throw new IllegalStateException("Already have resource");
                }
                o00OO00O.OooO0OO oooO0OO = o00oo00o.f33473OoooO00;
                o00OOOO0<?> o00oooo1 = o00oo00o.f33482Ooooo0o;
                boolean z2 = o00oo00o.f33478OoooOo0;
                o000000 o000000Var2 = o00oo00o.f33477OoooOOo;
                o00OO.OooO00o oooO00o = o00oo00o.f33470Oooo0oo;
                Objects.requireNonNull(oooO0OO);
                o00oo00o.f33486Oooooo = new o00OO<>(o00oooo1, z2, true, o000000Var2, oooO00o);
                o00oo00o.f33484OooooOO = true;
                o00OO00O.OooO oooO = o00oo00o.f33468Oooo0o;
                Objects.requireNonNull(oooO);
                ArrayList<o00OO00O.OooO0o> arrayList = new ArrayList(oooO.f33492Oooo0o);
                o00oo00o.OooO0o0(arrayList.size() + 1);
                ((o00OO000) o00oo00o.f33472OoooO0).OooO0o0(o00oo00o, o00oo00o.f33477OoooOOo, o00oo00o.f33486Oooooo);
                for (o00OO00O.OooO0o oooO0o : arrayList) {
                    oooO0o.f33498OooO0O0.execute(new o00OO00O.OooO0O0(oooO0o.f33497OooO00o));
                }
                o00oo00o.OooO0Oo();
            }
        }
        this.f33565OooooO0 = 5;
        try {
            OooO0o<?> oooO0o2 = this.f33554OoooO0;
            if (oooO0o2.f33588OooO0OO != null) {
                try {
                    ((o00OO000.OooO0OO) this.f33549Oooo).OooO00o().OooO00o(oooO0o2.f33586OooO00o, new o00O0O0(oooO0o2.f33587OooO0O0, oooO0o2.f33588OooO0OO, this.f33562OoooOoo));
                    oooO0o2.f33588OooO0OO.OooO0o0();
                } catch (Throwable th) {
                    oooO0o2.f33588OooO0OO.OooO0o0();
                    throw th;
                }
            }
            if (o0o0ooOooO0Oo != null) {
                o0o0ooOooO0Oo.OooO0o0();
            }
            OooOO0 oooOO1 = this.f33556OoooO0O;
            synchronized (oooOO1) {
                oooOO1.f33590OooO0O0 = true;
                zOooO00o = oooOO1.OooO00o();
            }
            if (zOooO00o) {
                OooOOO0();
            }
        } catch (Throwable th2) {
            if (o0o0ooOooO0Oo != null) {
                o0o0ooOooO0Oo.OooO0o0();
            }
            throw th2;
        }
    }

    public final int OooOO0(int i) {
        int[] iArr = OooO00o.f33582OooO0O0;
        if (i == 0) {
            throw null;
        }
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            if (this.f33561OoooOoO.OooO00o()) {
                return 3;
            }
            return OooOO0(3);
        }
        if (i2 == 2) {
            return this.f33569Oooooo0 ? 6 : 4;
        }
        if (i2 == 3 || i2 == 4) {
            return 6;
        }
        if (i2 == 5) {
            if (this.f33561OoooOoO.OooO0O0()) {
                return 2;
            }
            return OooOO0(2);
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unrecognized stage: ");
        sbOooO0o0.append(o00O0OOO.OooO00o(i));
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }

    public final void OooOO0O(String str, long j, String str2) {
        StringBuilder sbOooO00o = Oooo0.OooO00o(str, " in ");
        sbOooO00o.append(o0000O0O.OooO00o(j));
        sbOooO00o.append(", load key: ");
        sbOooO00o.append(this.f33558OoooOOO);
        sbOooO00o.append(str2 != null ? OooOo00.OooO0Oo(", ", str2) : "");
        sbOooO00o.append(", thread: ");
        sbOooO00o.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbOooO00o.toString());
    }

    public final void OooOO0o() {
        boolean zOooO00o;
        OooOOOo();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f33551Oooo0oO));
        o00OO00O<?> o00oo00o = (o00OO00O) this.f33563Ooooo00;
        synchronized (o00oo00o) {
            o00oo00o.f33485OooooOo = glideException;
        }
        synchronized (o00oo00o) {
            o00oo00o.f33469Oooo0oO.OooO00o();
            if (o00oo00o.f33489Ooooooo) {
                o00oo00o.OooO0oO();
            } else {
                if (o00oo00o.f33468Oooo0o.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (o00oo00o.f33487Oooooo0) {
                    throw new IllegalStateException("Already failed once");
                }
                o00oo00o.f33487Oooooo0 = true;
                o000000 o000000Var = o00oo00o.f33477OoooOOo;
                o00OO00O.OooO oooO = o00oo00o.f33468Oooo0o;
                Objects.requireNonNull(oooO);
                ArrayList<o00OO00O.OooO0o> arrayList = new ArrayList(oooO.f33492Oooo0o);
                o00oo00o.OooO0o0(arrayList.size() + 1);
                ((o00OO000) o00oo00o.f33472OoooO0).OooO0o0(o00oo00o, o000000Var, null);
                for (o00OO00O.OooO0o oooO0o : arrayList) {
                    oooO0o.f33498OooO0O0.execute(new o00OO00O.OooO00o(oooO0o.f33497OooO00o));
                }
                o00oo00o.OooO0Oo();
            }
        }
        OooOO0 oooOO1 = this.f33556OoooO0O;
        synchronized (oooOO1) {
            oooOO1.f33591OooO0OO = true;
            zOooO00o = oooOO1.OooO00o();
        }
        if (zOooO00o) {
            OooOOO0();
        }
    }

    public final void OooOOO() {
        this.f33570OoooooO = Thread.currentThread();
        int i = o0000O0O.f34164OooO0O0;
        this.f33567OooooOo = SystemClock.elapsedRealtimeNanos();
        boolean zOooO0O0 = false;
        while (!this.f33577o00ooo && this.f33575o00Ooo != null && !(zOooO0O0 = this.f33575o00Ooo.OooO0O0())) {
            this.f33565OooooO0 = OooOO0(this.f33565OooooO0);
            this.f33575o00Ooo = OooO();
            if (this.f33565OooooO0 == 4) {
                this.f33566OooooOO = 2;
                ((o00OO00O) this.f33563Ooooo00).OooO(this);
                return;
            }
        }
        if ((this.f33565OooooO0 == 6 || this.f33577o00ooo) && !zOooO0O0) {
            OooOO0o();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<o00oOO.o00000O0$OooO00o<?>>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<o00oO00o.o000000>] */
    public final void OooOOO0() {
        OooOO0 oooOO1 = this.f33556OoooO0O;
        synchronized (oooOO1) {
            oooOO1.f33590OooO0O0 = false;
            oooOO1.f33589OooO00o = false;
            oooOO1.f33591OooO0OO = false;
        }
        OooO0o<?> oooO0o = this.f33554OoooO0;
        oooO0o.f33586OooO00o = null;
        oooO0o.f33587OooO0O0 = null;
        oooO0o.f33588OooO0OO = null;
        o00O0OO0<R> o00o0oo1 = this.f33550Oooo0o;
        o00o0oo1.f33418OooO0OO = null;
        o00o0oo1.f33419OooO0Oo = null;
        o00o0oo1.f33427OooOOO = null;
        o00o0oo1.f33422OooO0oO = null;
        o00o0oo1.f33425OooOO0O = null;
        o00o0oo1.f33415OooO = null;
        o00o0oo1.f33429OooOOOO = null;
        o00o0oo1.f33424OooOO0 = null;
        o00o0oo1.f33430OooOOOo = null;
        o00o0oo1.f33416OooO00o.clear();
        o00o0oo1.f33426OooOO0o = false;
        o00o0oo1.f33417OooO0O0.clear();
        o00o0oo1.f33428OooOOO0 = false;
        this.f33576o00o0O = false;
        this.f33553OoooO = null;
        this.f33557OoooOO0 = null;
        this.f33562OoooOoo = null;
        this.f33572o000oOoO = null;
        this.f33558OoooOOO = null;
        this.f33563Ooooo00 = null;
        this.f33565OooooO0 = 0;
        this.f33575o00Ooo = null;
        this.f33570OoooooO = null;
        this.f33571Ooooooo = null;
        this.f33580ooOO = null;
        this.f33573o00O0O = null;
        this.f33574o00Oo0 = null;
        this.f33567OooooOo = 0L;
        this.f33577o00ooo = false;
        this.f33568Oooooo = null;
        this.f33551Oooo0oO.clear();
        this.f33555OoooO00.OooO00o(this);
    }

    public final void OooOOOO() {
        int i = OooO00o.f33581OooO00o[o00000O0.OooO0O0(this.f33566OooooOO)];
        if (i == 1) {
            this.f33565OooooO0 = OooOO0(1);
            this.f33575o00Ooo = OooO();
            OooOOO();
        } else if (i == 2) {
            OooOOO();
        } else if (i == 3) {
            OooO0oo();
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unrecognized run reason: ");
            sbOooO0o0.append(o00O0OO.OooO00o(this.f33566OooooOO));
            throw new IllegalStateException(sbOooO0o0.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    public final void OooOOOo() {
        Throwable th;
        this.f33552Oooo0oo.OooO00o();
        if (!this.f33576o00o0O) {
            this.f33576o00o0O = true;
            return;
        }
        if (this.f33551Oooo0oO.isEmpty()) {
            th = null;
        } else {
            ?? r0 = this.f33551Oooo0oO;
            th = (Throwable) r0.get(r0.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull oo0o0O0<?> oo0o0o0) {
        oo0o0O0<?> oo0o0o1 = oo0o0o0;
        int iOrdinal = this.f33572o000oOoO.ordinal() - oo0o0o1.f33572o000oOoO.ordinal();
        return iOrdinal == 0 ? this.f33564Ooooo0o - oo0o0o1.f33564Ooooo0o : iOrdinal;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.OooO0o<?> oooO0o = this.f33574o00Oo0;
        try {
            try {
                if (this.f33577o00ooo) {
                    OooOO0o();
                    if (oooO0o != null) {
                        oooO0o.OooO0O0();
                        return;
                    }
                    return;
                }
                OooOOOO();
                if (oooO0o != null) {
                    oooO0o.OooO0O0();
                }
            } catch (Throwable th) {
                if (oooO0o != null) {
                    oooO0o.OooO0O0();
                }
                throw th;
            }
        } catch (oo00o e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f33577o00ooo + ", stage: " + o00O0OOO.OooO00o(this.f33565OooooO0), th2);
            }
            if (this.f33565OooooO0 != 5) {
                this.f33551Oooo0oO.add(th2);
                OooOO0o();
            }
            if (!this.f33577o00ooo) {
                throw th2;
            }
            throw th2;
        }
    }
}
