package p045Oooooo;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.BufferProvider;
import java.util.concurrent.Executor;
import p039OoooOoo.o0O000;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o00O0O {

    public interface OooO00o extends OooO0O0, BufferProvider<o000OO0O> {
    }

    public interface OooO0O0 {
    }

    public interface OooO0OO extends OooO0O0 {

        public interface OooO00o {
            void OooO00o(@NonNull Surface surface);
        }

        void OooO0o0(@NonNull Executor executor, @NonNull o0O000 o0o001);
    }
}
