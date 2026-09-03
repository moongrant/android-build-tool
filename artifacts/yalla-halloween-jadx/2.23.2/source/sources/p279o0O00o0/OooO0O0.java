package p279o0O00o0;

import android.util.Log;
import androidx.annotation.NonNull;
import o000OO.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f41047OooO00o = new OooO00o();

    public interface OooO<T> {
        void OooO00o(@NonNull T t);
    }

    public class OooO00o implements OooO<Object> {
        @Override // o0O00o0.OooO0O0.OooO
        public final void OooO00o(@NonNull Object obj) {
        }
    }

    /* JADX INFO: renamed from: o0O00o0.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public interface InterfaceC0441OooO0O0<T> {
        T OooO00o();
    }

    public static final class OooO0OO<T> implements o000OO.OooO<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC0441OooO0O0<T> f41048OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO<T> f41049OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000OO.OooO<T> f41050OooO0OO;

        public OooO0OO(@NonNull OooOO0O oooOO0O, @NonNull InterfaceC0441OooO0O0 interfaceC0441OooO0O0, @NonNull OooO oooO) {
            this.f41050OooO0OO = oooOO0O;
            this.f41048OooO00o = interfaceC0441OooO0O0;
            this.f41049OooO0O0 = oooO;
        }

        @Override // o000OO.OooO
        public final boolean OooO00o(@NonNull T t) {
            if (t instanceof OooO0o) {
                ((OooO0o) t).OooO0O0().f41046OooO00o = true;
            }
            this.f41049OooO0O0.OooO00o(t);
            return this.f41050OooO0OO.OooO00o(t);
        }

        @Override // o000OO.OooO
        public final T OooO0O0() {
            T tOooO0O0 = this.f41050OooO0OO.OooO0O0();
            if (tOooO0O0 == null) {
                tOooO0O0 = this.f41048OooO00o.OooO00o();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + tOooO0O0.getClass());
                }
            }
            if (tOooO0O0 instanceof OooO0o) {
                ((OooO0o) tOooO0O0).OooO0O0().f41046OooO00o = false;
            }
            return tOooO0O0;
        }
    }

    public interface OooO0o {
        @NonNull
        o0O00o0.OooO.OooO00o OooO0O0();
    }

    @NonNull
    public static OooO0OO OooO00o(int i, @NonNull InterfaceC0441OooO0O0 interfaceC0441OooO0O0) {
        return new OooO0OO(new OooOO0O(i), interfaceC0441OooO0O0, f41047OooO00o);
    }
}
