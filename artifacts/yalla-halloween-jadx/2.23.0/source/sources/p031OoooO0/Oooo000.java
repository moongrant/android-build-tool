package p031OoooO0;

import android.util.CloseGuard;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f1397OooO00o;

    @RequiresApi(30)
    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final CloseGuard f1398OooO00o = new CloseGuard();

        @Override // OoooO0.Oooo000.OooO0O0
        public final void OooO00o(@NonNull String str) {
            this.f1398OooO00o.open(str);
        }

        @Override // OoooO0.Oooo000.OooO0O0
        public final void OooO0O0() {
            this.f1398OooO00o.warnIfOpen();
        }

        @Override // OoooO0.Oooo000.OooO0O0
        public final void close() {
            this.f1398OooO00o.close();
        }
    }

    public interface OooO0O0 {
        void OooO00o(@NonNull String str);

        void OooO0O0();

        void close();
    }

    public static final class OooO0OO implements OooO0O0 {
        @Override // OoooO0.Oooo000.OooO0O0
        public final void OooO00o(@NonNull String str) {
        }

        @Override // OoooO0.Oooo000.OooO0O0
        public final void OooO0O0() {
        }

        @Override // OoooO0.Oooo000.OooO0O0
        public final void close() {
        }
    }

    public Oooo000(OooO0O0 oooO0O0) {
        this.f1397OooO00o = oooO0O0;
    }
}
