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
import p081o000OoO.o00O0O;
import p096o000o0o.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements o00oO0o<OooO0OO> {

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: o000o00.OooOOO
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

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final OooO0OO create(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new OooO0OO();
        }
        OooO00o.OooO00o(new o00O0O(this, context.getApplicationContext(), 1));
        return new OooO0OO();
    }

    @Override // p096o000o0o.o00oO0o
    @NonNull
    public final List<Class<? extends o00oO0o<?>>> dependencies() {
        return Collections.emptyList();
    }
}
