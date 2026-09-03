package o00O000o;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o<K, A> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO<K> f36275OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00O0O00.OooO0OO<A> f36278OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f36273OooO00o = new ArrayList(1);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f36274OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f36276OooO0Oo = 0.0f;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public A f36277OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f36279OooO0oO = -1.0f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f36280OooO0oo = -1.0f;

    public static final class OooO<T> implements OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final o00O0O00.OooO00o<T> f36281OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f36282OooO0O0 = -1.0f;

        public OooO(List<? extends o00O0O00.OooO00o<T>> list) {
            this.f36281OooO00o = list.get(0);
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO00o(float f) {
            if (this.f36282OooO0O0 == f) {
                return true;
            }
            this.f36282OooO0O0 = f;
            return false;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final o00O0O00.OooO00o<T> OooO0O0() {
            return this.f36281OooO00o;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO0OO(float f) {
            return !this.f36281OooO00o.OooO0OO();
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0Oo() {
            return this.f36281OooO00o.OooO0O0();
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0o0() {
            return this.f36281OooO00o.OooO00o();
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: renamed from: o00O000o.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0420OooO00o {
        void OooO0O0();
    }

    public static final class OooO0O0<T> implements OooO0OO<T> {
        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO00o(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final o00O0O00.OooO00o<T> OooO0O0() {
            throw new IllegalStateException("not implemented");
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO0OO(float f) {
            return false;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0Oo() {
            return 0.0f;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0o0() {
            return 1.0f;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean isEmpty() {
            return true;
        }
    }

    public interface OooO0OO<T> {
        boolean OooO00o(float f);

        o00O0O00.OooO00o<T> OooO0O0();

        boolean OooO0OO(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float OooO0Oo();

        @FloatRange(from = 0.0d, to = 1.0d)
        float OooO0o0();

        boolean isEmpty();
    }

    public static final class OooO0o<T> implements OooO0OO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<? extends o00O0O00.OooO00o<T>> f36283OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public o00O0O00.OooO00o<T> f36285OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f36286OooO0Oo = -1.0f;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public o00O0O00.OooO00o<T> f36284OooO0O0 = OooO0o(0.0f);

        public OooO0o(List<? extends o00O0O00.OooO00o<T>> list) {
            this.f36283OooO00o = list;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO00o(float f) {
            o00O0O00.OooO00o<T> oooO00o = this.f36285OooO0OO;
            o00O0O00.OooO00o<T> oooO00o2 = this.f36284OooO0O0;
            if (oooO00o == oooO00o2 && this.f36286OooO0Oo == f) {
                return true;
            }
            this.f36285OooO0OO = oooO00o2;
            this.f36286OooO0Oo = f;
            return false;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        @NonNull
        public final o00O0O00.OooO00o<T> OooO0O0() {
            return this.f36284OooO0O0;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean OooO0OO(float f) {
            o00O0O00.OooO00o<T> oooO00o = this.f36284OooO0O0;
            if (f >= oooO00o.OooO0O0() && f < oooO00o.OooO00o()) {
                return !this.f36284OooO0O0.OooO0OO();
            }
            this.f36284OooO0O0 = OooO0o(f);
            return true;
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0Oo() {
            return this.f36283OooO00o.get(0).OooO0O0();
        }

        public final o00O0O00.OooO00o<T> OooO0o(float f) {
            List<? extends o00O0O00.OooO00o<T>> list = this.f36283OooO00o;
            o00O0O00.OooO00o<T> oooO00o = list.get(list.size() - 1);
            if (f >= oooO00o.OooO0O0()) {
                return oooO00o;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z = false;
                if (size < 1) {
                    return list.get(0);
                }
                o00O0O00.OooO00o<T> oooO00o2 = list.get(size);
                if (this.f36284OooO0O0 != oooO00o2) {
                    if (f >= oooO00o2.OooO0O0() && f < oooO00o2.OooO00o()) {
                        z = true;
                    }
                    if (z) {
                        return oooO00o2;
                    }
                }
                size--;
            }
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final float OooO0o0() {
            List<? extends o00O0O00.OooO00o<T>> list = this.f36283OooO00o;
            return list.get(list.size() - 1).OooO00o();
        }

        @Override // o00O000o.OooO00o.OooO0OO
        public final boolean isEmpty() {
            return false;
        }
    }

    public OooO00o(List<? extends o00O0O00.OooO00o<K>> list) {
        OooO0OO<K> oooO;
        if (list.isEmpty()) {
            oooO = new OooO0O0<>();
        } else {
            oooO = list.size() == 1 ? new OooO<>(list) : new OooO0o<>(list);
        }
        this.f36275OooO0OO = oooO;
    }

    public void OooO() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36273OooO00o;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0420OooO00o) arrayList.get(i)).OooO0O0();
            i++;
        }
    }

    public final void OooO00o(InterfaceC0420OooO00o interfaceC0420OooO00o) {
        this.f36273OooO00o.add(interfaceC0420OooO00o);
    }

    public final o00O0O00.OooO00o<K> OooO0O0() {
        o00O0O00.OooO00o<K> oooO00oOooO0O0 = this.f36275OooO0OO.OooO0O0();
        com.airbnb.lottie.OooO0OO.OooO00o();
        return oooO00oOooO0O0;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float OooO0OO() {
        if (this.f36280OooO0oo == -1.0f) {
            this.f36280OooO0oo = this.f36275OooO0OO.OooO0o0();
        }
        return this.f36280OooO0oo;
    }

    public final float OooO0Oo() {
        o00O0O00.OooO00o<K> oooO00oOooO0O0 = OooO0O0();
        if (oooO00oOooO0O0.OooO0OO()) {
            return 0.0f;
        }
        return oooO00oOooO0O0.f36505OooO0Oo.getInterpolation(OooO0o0());
    }

    public A OooO0o() {
        Interpolator interpolator;
        float fOooO0o0 = OooO0o0();
        if (this.f36278OooO0o0 == null && this.f36275OooO0OO.OooO00o(fOooO0o0)) {
            return this.f36277OooO0o;
        }
        o00O0O00.OooO00o<K> oooO00oOooO0O0 = OooO0O0();
        Interpolator interpolator2 = oooO00oOooO0O0.f36507OooO0o0;
        A aOooO0oO = (interpolator2 == null || (interpolator = oooO00oOooO0O0.f36506OooO0o) == null) ? OooO0oO(oooO00oOooO0O0, OooO0Oo()) : OooO0oo(oooO00oOooO0O0, fOooO0o0, interpolator2.getInterpolation(fOooO0o0), interpolator.getInterpolation(fOooO0o0));
        this.f36277OooO0o = aOooO0oO;
        return aOooO0oO;
    }

    public final float OooO0o0() {
        if (this.f36274OooO0O0) {
            return 0.0f;
        }
        o00O0O00.OooO00o<K> oooO00oOooO0O0 = OooO0O0();
        if (oooO00oOooO0O0.OooO0OO()) {
            return 0.0f;
        }
        return (this.f36276OooO0Oo - oooO00oOooO0O0.OooO0O0()) / (oooO00oOooO0O0.OooO00o() - oooO00oOooO0O0.OooO0O0());
    }

    public abstract A OooO0oO(o00O0O00.OooO00o<K> oooO00o, float f);

    public A OooO0oo(o00O0O00.OooO00o<K> oooO00o, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void OooOO0(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        OooO0OO<K> oooO0OO = this.f36275OooO0OO;
        if (oooO0OO.isEmpty()) {
            return;
        }
        if (this.f36279OooO0oO == -1.0f) {
            this.f36279OooO0oO = oooO0OO.OooO0Oo();
        }
        float f2 = this.f36279OooO0oO;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.f36279OooO0oO = oooO0OO.OooO0Oo();
            }
            f = this.f36279OooO0oO;
        } else if (f > OooO0OO()) {
            f = OooO0OO();
        }
        if (f == this.f36276OooO0Oo) {
            return;
        }
        this.f36276OooO0Oo = f;
        if (oooO0OO.OooO0OO(f)) {
            OooO();
        }
    }

    public final void OooOO0O(@Nullable o00O0O00.OooO0OO<A> oooO0OO) {
        o00O0O00.OooO0OO<A> oooO0OO2 = this.f36278OooO0o0;
        if (oooO0OO2 != null) {
            oooO0OO2.getClass();
        }
        this.f36278OooO0o0 = oooO0OO;
    }
}
