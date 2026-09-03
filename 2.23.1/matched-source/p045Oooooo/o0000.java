package p045Oooooo;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.impl.o00O0;
import androidx.camera.video.internal.BufferProvider;
import com.yy.yyeva.util.EvaJniUtil;
import com.yy.yyeva.view.EvaAnimView;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p612o0oo0OOo.n5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1861OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1862OooO0o0;

    public /* synthetic */ o0000(int i, Object obj, Object obj2) {
        this.f1860OooO0Oo = i;
        this.f1862OooO0o0 = obj;
        this.f1861OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1860OooO0Oo) {
            case 0:
                ((o00O0.OooO00o) ((Map.Entry) this.f1862OooO0o0).getKey()).OooO00o((BufferProvider.State) this.f1861OooO0o);
                break;
            default:
                EvaAnimView this$0 = (EvaAnimView) this.f1862OooO0o0;
                SurfaceHolder holder = (SurfaceHolder) this.f1861OooO0o;
                int i = EvaAnimView.f32435OooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                n5 n5Var = this$0.f32437OooO0Oo;
                n5 n5Var2 = null;
                if (n5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    n5Var = null;
                }
                EvaJniUtil evaJniUtil = EvaJniUtil.f32434OooO00o;
                n5 n5Var3 = this$0.f32437OooO0Oo;
                if (n5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    n5Var3 = null;
                }
                int i2 = n5Var3.f57042OooO0O0;
                Surface surface = holder.getSurface();
                Intrinsics.checkNotNullExpressionValue(surface, "holder.surface");
                n5 n5Var4 = this$0.f32437OooO0Oo;
                if (n5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    n5Var4 = null;
                }
                n5Var.f57042OooO0O0 = evaJniUtil.initRender(i2, surface, false, n5Var4.f57060OooOo0);
                n5 n5Var5 = this$0.f32437OooO0Oo;
                if (n5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                    n5Var5 = null;
                }
                int externalTexture = evaJniUtil.getExternalTexture(n5Var5.f57042OooO0O0);
                if (externalTexture >= 0) {
                    Bitmap bitmap = this$0.f32444OooOO0o;
                    if (bitmap != null) {
                        n5 n5Var6 = this$0.f32437OooO0Oo;
                        if (n5Var6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playerEva");
                        } else {
                            n5Var2 = n5Var6;
                        }
                        evaJniUtil.setBgBitmap(n5Var2.f57042OooO0O0, bitmap);
                        bitmap.recycle();
                    }
                    SurfaceTexture surfaceTexture = new SurfaceTexture(externalTexture);
                    this$0.f32438OooO0o = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this$0);
                } else {
                    Log.e("EvaAnimPlayer.AnimView", "surfaceCreated init OpenGL ES failed!");
                }
                break;
        }
    }
}
