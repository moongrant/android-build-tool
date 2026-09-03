package o00OOO;

import android.util.Log;
import androidx.annotation.NonNull;
import o000OO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C0433OooO00o f37326OooO00o = new C0433OooO00o();

    public interface OooO<T> {
        void OooO00o(@NonNull T t);
    }

    /* JADX INFO: renamed from: o00OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0433OooO00o implements OooO<Object> {
        @Override // o00OOO.OooO00o.OooO
        public final void OooO00o(@NonNull Object obj) {
        }
    }

    public interface OooO0O0<T> {
        T OooO00o();
    }

    public static final class OooO0OO<T> implements o000OO.OooO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0<T> f37327OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO<T> f37328OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000OO.OooO<T> f37329OooO0OO;

        public OooO0OO(@NonNull OooOO0O oooOO0O, @NonNull OooO0O0 oooO0O0, @NonNull OooO oooO) {
            this.f37329OooO0OO = oooOO0O;
            this.f37327OooO00o = oooO0O0;
            this.f37328OooO0O0 = oooO;
        }

        @Override // o000OO.OooO
        public final boolean OooO00o(@NonNull T t) {
            if (t instanceof OooO0o) {
                ((OooO0o) t).OooO0OO().f37330OooO00o = true;
            }
            this.f37328OooO0O0.OooO00o(t);
            return this.f37329OooO0OO.OooO00o(t);
        }

        @Override // o000OO.OooO
        public final T OooO0O0() {
            T tOooO0O0 = this.f37329OooO0OO.OooO0O0();
            if (tOooO0O0 == null) {
                tOooO0O0 = this.f37327OooO00o.OooO00o();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tOooO0O0.getClass());
                }
            }
            if (tOooO0O0 instanceof OooO0o) {
                ((OooO0o) tOooO0O0).OooO0OO().f37330OooO00o = false;
            }
            return tOooO0O0;
        }
    }

    public interface OooO0o {
        @NonNull
        o00OOO.OooO0o.OooO00o OooO0OO();
    }

    @NonNull
    public static OooO0OO OooO00o(int i, @NonNull OooO0O0 oooO0O0) {
        return new OooO0OO(new OooOO0O(i), oooO0O0, f37326OooO00o);
    }
}
