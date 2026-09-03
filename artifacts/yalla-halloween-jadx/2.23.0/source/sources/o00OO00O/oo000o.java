package o00OO00O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Registry;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p126o00O0oOo.o00000;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f37159OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f37160OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f37161OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OO.OooO<List<Throwable>> f37162OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooO0OO f37158OooO0o0 = new OooO0OO();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f37157OooO0o = new OooO00o();

    public static class OooO00o implements o0OoOo0<Object, Object> {
        @Override // o00OO00O.o0OoOo0
        public final boolean OooO00o(@NonNull Object obj) {
            return false;
        }

        @Override // o00OO00O.o0OoOo0
        @Nullable
        public final o0OoOo0.OooO00o<Object> OooO0O0(@NonNull Object obj, int i, int i2, @NonNull o00000 o00000Var) {
            return null;
        }
    }

    public static class OooO0O0<Model, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<Model> f37163OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<Data> f37164OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O<? extends Model, ? extends Data> f37165OooO0OO;

        public OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o00O0O<? extends Model, ? extends Data> o00o0o2) {
            this.f37163OooO00o = cls;
            this.f37164OooO0O0 = cls2;
            this.f37165OooO0OO = o00o0o2;
        }
    }

    public static class OooO0OO {
    }

    public oo000o(@NonNull o00OOO.OooO00o.OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = f37158OooO0o0;
        this.f37159OooO00o = new ArrayList();
        this.f37161OooO0OO = new HashSet();
        this.f37162OooO0Oo = oooO0OO;
        this.f37160OooO0O0 = oooO0OO2;
    }

    public final synchronized <Model, Data> void OooO00o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o00O0O<? extends Model, ? extends Data> o00o0o2) {
        OooO0O0 oooO0O0 = new OooO0O0(cls, cls2, o00o0o2);
        ArrayList arrayList = this.f37159OooO00o;
        arrayList.add(arrayList.size(), oooO0O0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList OooO0O0(@NonNull Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (OooO0O0 oooO0O0 : this.f37159OooO00o) {
                if (!this.f37161OooO0OO.contains(oooO0O0) && oooO0O0.f37163OooO00o.isAssignableFrom((Class<?>) cls)) {
                    this.f37161OooO0OO.add(oooO0O0);
                    o0OoOo0 o0oooo0OooO0OO = oooO0O0.f37165OooO0OO.OooO0OO(this);
                    o0000O00.OooO0O0(o0oooo0OooO0OO);
                    arrayList.add(o0oooo0OooO0OO);
                    this.f37161OooO0OO.remove(oooO0O0);
                }
            }
        } catch (Throwable th) {
            this.f37161OooO0OO.clear();
            throw th;
        }
        return arrayList;
    }

    @NonNull
    public final synchronized <Model, Data> o0OoOo0<Model, Data> OooO0OO(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f37159OooO00o.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                OooO0O0<?, ?> oooO0O0 = (OooO0O0) it.next();
                if (this.f37161OooO0OO.contains(oooO0O0)) {
                    z = true;
                } else {
                    if (!oooO0O0.f37163OooO00o.isAssignableFrom(cls) || !oooO0O0.f37164OooO0O0.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f37161OooO0OO.add(oooO0O0);
                        arrayList.add(OooO0Oo(oooO0O0));
                        this.f37161OooO0OO.remove(oooO0O0);
                    }
                }
            }
            if (arrayList.size() > 1) {
                OooO0OO oooO0OO = this.f37160OooO0O0;
                o000OO.OooO<List<Throwable>> oooO = this.f37162OooO0Oo;
                oooO0OO.getClass();
                return new o00Ooo(arrayList, oooO);
            }
            if (arrayList.size() == 1) {
                return (o0OoOo0) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return f37157OooO0o;
        } catch (Throwable th) {
            this.f37161OooO0OO.clear();
            throw th;
        }
    }

    @NonNull
    public final <Model, Data> o0OoOo0<Model, Data> OooO0Oo(@NonNull OooO0O0<?, ?> oooO0O0) {
        o0OoOo0<Model, Data> o0oooo0 = (o0OoOo0<Model, Data>) oooO0O0.f37165OooO0OO.OooO0OO(this);
        o0000O00.OooO0O0(o0oooo0);
        return o0oooo0;
    }

    @NonNull
    public final synchronized ArrayList OooO0o() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f37159OooO00o.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            if (oooO0O0.f37163OooO00o.isAssignableFrom(OooOOO0.class) && oooO0O0.f37164OooO0O0.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(oooO0O0.f37165OooO0OO);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final synchronized ArrayList OooO0o0(@NonNull Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (OooO0O0 oooO0O0 : this.f37159OooO00o) {
            if (!arrayList.contains(oooO0O0.f37164OooO0O0) && oooO0O0.f37163OooO00o.isAssignableFrom((Class<?>) cls)) {
                arrayList.add(oooO0O0.f37164OooO0O0);
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized ArrayList OooO0oO(@NonNull com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o oooO00o) {
        ArrayList arrayListOooO0o;
        arrayListOooO0o = OooO0o();
        OooO00o(OooOOO0.class, InputStream.class, oooO00o);
        return arrayListOooO0o;
    }
}
