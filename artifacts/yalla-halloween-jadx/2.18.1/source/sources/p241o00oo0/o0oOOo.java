package p241o00oo0;

import android.util.Log;
import androidx.annotation.NonNull;
import o000OO0O.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO<Object> f34118OooO00o = new OooO00o();

    public interface OooO<T> {
        void OooO00o(@NonNull T t);
    }

    public class OooO00o implements OooO<Object> {
        @Override // o00oo0.o0oOOo.OooO
        public final void OooO00o(@NonNull Object obj) {
        }
    }

    public interface OooO0O0<T> {
        T OooO00o();
    }

    public static final class OooO0OO<T> implements o000OO0O.OooO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0<T> f34119OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO<T> f34120OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000OO0O.OooO<T> f34121OooO0OO;

        public OooO0OO(@NonNull o000OO0O.OooO<T> oooO, @NonNull OooO0O0<T> oooO0O0, @NonNull OooO<T> oooO2) {
            this.f34121OooO0OO = oooO;
            this.f34119OooO00o = oooO0O0;
            this.f34120OooO0O0 = oooO2;
        }

        @Override // o000OO0O.OooO
        public final boolean OooO00o(@NonNull T t) {
            if (t instanceof OooO0o) {
                ((o0O00000.OooO00o) ((OooO0o) t).OooO0O0()).f34117OooO00o = true;
            }
            this.f34120OooO0O0.OooO00o(t);
            return this.f34121OooO0OO.OooO00o(t);
        }

        @Override // o000OO0O.OooO
        public final T OooO0O0() {
            T tOooO0O0 = this.f34121OooO0OO.OooO0O0();
            if (tOooO0O0 == null) {
                tOooO0O0 = this.f34119OooO00o.OooO00o();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Created new ");
                    sbOooO0o0.append(tOooO0O0.getClass());
                    Log.v("FactoryPools", sbOooO0o0.toString());
                }
            }
            if (tOooO0O0 instanceof OooO0o) {
                ((o0O00000.OooO00o) ((OooO0o) tOooO0O0).OooO0O0()).f34117OooO00o = false;
            }
            return tOooO0O0;
        }
    }

    public interface OooO0o {
        @NonNull
        o0O00000 OooO0O0();
    }

    @NonNull
    public static <T extends OooO0o> o000OO0O.OooO<T> OooO00o(int i, @NonNull OooO0O0<T> oooO0O0) {
        return new OooO0OO(new OooOO0O(i), oooO0O0, f34118OooO00o);
    }
}
