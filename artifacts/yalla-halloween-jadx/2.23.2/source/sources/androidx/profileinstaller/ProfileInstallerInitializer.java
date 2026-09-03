package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.List;
import p045Oooooo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallerInitializer implements o00O000o.OooO0O0<OooO0OO> {

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o000ooO.o00O0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    @RequiresApi(28)
    public static class OooO0O0 {
        @DoNotInline
        public static Handler OooO00o(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class OooO0OO {
    }

    @Override // o00O000o.OooO0O0
    @NonNull
    public final OooO0OO create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new OooO0OO();
        }
        OooO00o.OooO00o(new o0000O(2, this, context.getApplicationContext()));
        return new OooO0OO();
    }

    @Override // o00O000o.OooO0O0
    @NonNull
    public final List<Class<? extends o00O000o.OooO0O0<?>>> dependencies() {
        return Collections.emptyList();
    }
}
