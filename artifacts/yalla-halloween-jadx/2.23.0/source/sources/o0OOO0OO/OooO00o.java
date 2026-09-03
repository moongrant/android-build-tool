package o0OOO0OO;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.Surface;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import com.ss.ugc.android.alpha_player.widget.GLTextureView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface OooO00o extends GLTextureView.Oooo000, GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: o0OOO0OO.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0459OooO00o {
        void OooO00o(@NotNull Surface surface);
    }

    void OooO00o();

    void OooO0O0();

    void OooO0Oo(@NotNull InterfaceC0459OooO00o interfaceC0459OooO00o);

    void OooO0o(float f, float f2, float f3, float f4);

    void setScaleType(@NotNull ScaleType scaleType);
}
