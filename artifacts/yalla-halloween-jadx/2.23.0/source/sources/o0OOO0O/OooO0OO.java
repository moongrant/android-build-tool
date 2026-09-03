package o0OOO0O;

import android.view.Surface;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO0OO {

    public interface OooO00o {
        void OooO0O0();
    }

    public interface OooO0O0 {
        void onError();
    }

    /* JADX INFO: renamed from: o0OOO0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC0458OooO0OO {
        void OooO00o();
    }

    public interface OooO0o {
        void OooO00o();
    }

    @NotNull
    o0OOO0O0.OooO0O0 getVideoInfo() throws Exception;

    void initMediaPlayer() throws Exception;

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void setDataSource(@NotNull String str) throws IOException;

    void setLooping(boolean z);

    void setOnCompletionListener(@NotNull OooO00o oooO00o);

    void setOnErrorListener(@NotNull OooO0O0 oooO0O0);

    void setOnFirstFrameListener(@NotNull InterfaceC0458OooO0OO interfaceC0458OooO0OO);

    void setOnPreparedListener(@NotNull OooO0o oooO0o);

    void setScreenOnWhilePlaying(boolean z);

    void setSurface(@NotNull Surface surface);

    void start();

    void stop();
}
