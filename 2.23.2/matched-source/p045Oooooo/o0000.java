package p045Oooooo;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.impl.oo00o;
import androidx.camera.video.internal.BufferProvider;
import com.yy.yyeva.util.EvaJniUtil;
import com.yy.yyeva.view.EvaAnimView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p612o0oo0OoO.r5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1858OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1859OooO0o0;

    public /* synthetic */ o0000(int i, Object obj, Object obj2) {
        this.f1857OooO0Oo = i;
        this.f1859OooO0o0 = obj;
        this.f1858OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1857OooO0Oo) {
            case 0:
                ((oo00o.OooO00o) ((Map.Entry) this.f1859OooO0o0).getKey()).OooO00o((BufferProvider.State) this.f1858OooO0o);
                break;
            default:
                EvaAnimView this$0 = (EvaAnimView) this.f1859OooO0o0;
                SurfaceHolder holder = (SurfaceHolder) this.f1858OooO0o;
                int i = EvaAnimView.f32438OooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                r5 r5Var = this$0.f32440OooO0Oo;
                r5 r5Var2 = null;
                if (r5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var = null;
                }
                EvaJniUtil evaJniUtil = EvaJniUtil.f32437OooO00o;
                r5 r5Var3 = this$0.f32440OooO0Oo;
                if (r5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var3 = null;
                }
                int i2 = r5Var3.f57461OooO0O0;
                Surface surface = holder.getSurface();
                Intrinsics.checkNotNullExpressionValue(surface, "holder.surface");
                r5 r5Var4 = this$0.f32440OooO0Oo;
                if (r5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var4 = null;
                }
                r5Var.f57461OooO0O0 = evaJniUtil.initRender(i2, surface, false, r5Var4.f57479OooOo0);
                r5 r5Var5 = this$0.f32440OooO0Oo;
                if (r5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    r5Var5 = null;
                }
                int externalTexture = evaJniUtil.getExternalTexture(r5Var5.f57461OooO0O0);
                if (externalTexture >= 0) {
                    Bitmap bitmap = this$0.f32447OooOO0o;
                    if (bitmap != null) {
                        r5 r5Var6 = this$0.f32440OooO0Oo;
                        if (r5Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                        } else {
                            r5Var2 = r5Var6;
                        }
                        evaJniUtil.setBgBitmap(r5Var2.f57461OooO0O0, bitmap);
                        bitmap.recycle();
                    }
                    SurfaceTexture surfaceTexture = new SurfaceTexture(externalTexture);
                    this$0.f32441OooO0o = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this$0);
                } else {
                    Log.e("EvaAnimPlayer.AnimView", "surfaceCreated init OpenGL ES failed!");
                }
                break;
        }
    }
}
