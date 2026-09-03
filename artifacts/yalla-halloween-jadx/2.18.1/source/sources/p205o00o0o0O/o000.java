package p205o00o0o0O;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import java.util.Objects;
import p062o0000o0O.o0ooOOo;
import p200o00o0Oo0.o00000OO;
import p202o00o0Ooo.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f33246OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0ooOOo f33247OooO0O0 = new o0ooOOo(this, 1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f33248OooO0OO = new OooO00o();

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            o000 o000Var = o000.this;
            Objects.requireNonNull(o000Var);
            if (message.what == 1) {
                o0O0ooO o0o0ooo = (o0O0ooO) message.obj;
                o00000OO<o0O0ooO> o00000oo2 = ((o000O000) o000Var).f33251OooO0o;
                if (o00000oo2 != null) {
                    o00000oo2.OooO00o(o0o0ooo);
                }
            }
        }
    }

    public o000(Context context) {
        this.f33246OooO00o = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o() {
        try {
            try {
                OooO00o oooO00o = this.f33248OooO0OO;
                if (oooO00o != null) {
                    oooO00o.removeCallbacks(this.f33247OooO0O0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f33247OooO0O0 = null;
            this.f33248OooO0OO = null;
        }
    }
}
