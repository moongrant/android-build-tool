package p709oo0oOOo;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO {

    public interface OooO00o {

        /* JADX INFO: renamed from: oo0oOOo.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0442OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0443OooO00o> f53363OooO00o = new CopyOnWriteArrayList<>();

            /* JADX INFO: renamed from: oo0oOOo.OooO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0443OooO00o {

                /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                public final Handler f53364OooO00o;

                /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
                public final OooO00o f53365OooO0O0;

                /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
                public boolean f53366OooO0OO;

                public C0443OooO00o(Handler handler, OooO00o oooO00o) {
                    this.f53364OooO00o = handler;
                    this.f53365OooO0O0 = oooO00o;
                }
            }

            public final void OooO00o(OooO00o oooO00o) {
                for (C0443OooO00o c0443OooO00o : this.f53363OooO00o) {
                    if (c0443OooO00o.f53365OooO0O0 == oooO00o) {
                        c0443OooO00o.f53366OooO0OO = true;
                        this.f53363OooO00o.remove(c0443OooO00o);
                    }
                }
            }
        }
    }

    void OooO0O0(Handler handler, OooO00o oooO00o);

    @Nullable
    o000oOoO OooO0o0();

    void OooO0oO(OooO00o oooO00o);
}
