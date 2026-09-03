package p221o00oOO;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o000OO0O.OooO;
import p217o00oO00o.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooO0O0<?, ?>> f33684OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f33685OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Set<OooO0O0<?, ?>> f33686OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO<List<Throwable>> f33687OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0OO f33683OooO0o0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00000O0<Object, Object> f33682OooO0o = new OooO00o();

    public static class OooO00o implements o00000O0<Object, Object> {
        @Override // p221o00oOO.o00000O0
        public final boolean OooO00o(@NonNull Object obj) {
            return false;
        }

        @Override // p221o00oOO.o00000O0
        @Nullable
        public final o00000O0.OooO00o<Object> OooO0O0(@NonNull Object obj, int i, int i2, @NonNull o00000 o00000Var) {
            return null;
        }
    }

    public static class OooO0O0<Model, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Model> f33688OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<Data> f33689OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000O<? extends Model, ? extends Data> f33690OooO0OO;

        public OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o00000O<? extends Model, ? extends Data> o00000o) {
            this.f33688OooO00o = cls;
            this.f33689OooO0O0 = cls2;
            this.f33690OooO0OO = o00000o;
        }

        public final boolean OooO00o(@NonNull Class<?> cls) {
            return this.f33688OooO00o.isAssignableFrom(cls);
        }
    }

    public static class OooO0OO {
    }

    public o0000(@NonNull OooO<List<Throwable>> oooO) {
        OooO0OO oooO0OO = f33683OooO0o0;
        this.f33684OooO00o = new ArrayList();
        this.f33686OooO0OO = new HashSet();
        this.f33687OooO0Oo = oooO;
        this.f33685OooO0O0 = oooO0OO;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final synchronized <Model, Data> void OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o00000O<? extends Model, ? extends Data> o00000o) {
        OooO0O0<?, ?> oooO0O0 = new OooO0O0<>(cls, cls2, o00000o);
        List<OooO0O0<?, ?>> list = this.f33684OooO00o;
        list.add(list.size(), oooO0O0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized <Model> List<o00000O0<Model, ?>> OooO0O0(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (OooO0O0<?, ?> oooO0O0 : this.f33684OooO00o) {
                if (!this.f33686OooO0OO.contains(oooO0O0) && oooO0O0.OooO00o(cls)) {
                    this.f33686OooO0OO.add(oooO0O0);
                    o00000O0 o00000o0OooO00o = oooO0O0.f33690OooO0OO.OooO00o(this);
                    Objects.requireNonNull(o00000o0OooO00o, "Argument must not be null");
                    arrayList.add(o00000o0OooO00o);
                    this.f33686OooO0OO.remove(oooO0O0);
                }
            }
        } catch (Throwable th) {
            this.f33686OooO0OO.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00oOO.o0000$OooO0O0<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<o00oOO.o0000$OooO0O0<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<o00oOO.o0000$OooO0O0<?, ?>>] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.HashSet, java.util.Set<o00oOO.o0000$OooO0O0<?, ?>>] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.HashSet, java.util.Set<o00oOO.o0000$OooO0O0<?, ?>>] */
    @NonNull
    public final synchronized <Model, Data> o00000O0<Model, Data> OooO0OO(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (OooO0O0<?, ?> oooO0O0 : this.f33684OooO00o) {
                if (this.f33686OooO0OO.contains(oooO0O0)) {
                    z = true;
                } else if (oooO0O0.OooO00o(cls) && oooO0O0.f33689OooO0O0.isAssignableFrom(cls2)) {
                    this.f33686OooO0OO.add(oooO0O0);
                    arrayList.add(OooO0Oo(oooO0O0));
                    this.f33686OooO0OO.remove(oooO0O0);
                }
            }
            if (arrayList.size() > 1) {
                OooO0OO oooO0OO = this.f33685OooO0O0;
                OooO<List<Throwable>> oooO = this.f33687OooO0Oo;
                Objects.requireNonNull(oooO0OO);
                return new o0000Ooo(arrayList, oooO);
            }
            if (arrayList.size() == 1) {
                return (o00000O0) arrayList.get(0);
            }
            if (z) {
                return (o00000O0<Model, Data>) f33682OooO0o;
            }
            throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
        } catch (Throwable th) {
            this.f33686OooO0OO.clear();
            throw th;
        }
    }

    @NonNull
    public final <Model, Data> o00000O0<Model, Data> OooO0Oo(@NonNull OooO0O0<?, ?> oooO0O0) {
        o00000O0<Model, Data> o00000o1 = (o00000O0<Model, Data>) oooO0O0.f33690OooO0OO.OooO00o(this);
        Objects.requireNonNull(o00000o1, "Argument must not be null");
        return o00000o1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o00oOO.o0000$OooO0O0<?, ?>>] */
    @NonNull
    public final synchronized List OooO0o(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f33684OooO00o.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            if (oooO0O0.OooO00o(o0Oo0oo.class) && oooO0O0.f33689OooO0O0.isAssignableFrom(cls)) {
                it.remove();
                arrayList.add(oooO0O0.f33690OooO0OO);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o00oOO.o0000$OooO0O0<?, ?>>] */
    @NonNull
    public final synchronized List<Class<?>> OooO0o0(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (OooO0O0 oooO0O0 : this.f33684OooO00o) {
            if (!arrayList.contains(oooO0O0.f33689OooO0O0) && oooO0O0.OooO00o(cls)) {
                arrayList.add(oooO0O0.f33689OooO0O0);
            }
        }
        return arrayList;
    }
}
