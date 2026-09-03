package p022Oooo00O;

import android.graphics.SurfaceTexture;
import androidx.camera.core.impl.o0O0O00;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yy.yyeva.view.EvaAnimView;
import kotlin.jvm.internal.Intrinsics;
import p045Oooooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f615OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f616OooO0o0;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f615OooO0Oo = i;
        this.f616OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f615OooO0Oo) {
            case 0:
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f616OooO0o0;
                o0oo0oo2.OooOO0(o0oo0oo2.f850OooOOO0.f1094OooO0oo);
                break;
            case 1:
                o000OO.OooO0OO oooO0OO = (o000OO.OooO0OO) ((o0O0O00.OooO0OO) this.f616OooO0o0);
                if (o000OO.this.f554OooO0oo == o000OO.OooOO0.PENDING_OPEN) {
                    o000OO.this.Oooo0OO(false);
                }
                break;
            case 2:
                ((o00Oo0) this.f616OooO0o0).OooO00o();
                break;
            case 3:
                MomentDetailActivity this$0 = (MomentDetailActivity) this.f616OooO0o0;
                int i = MomentDetailActivity.f26057Oooo0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoOO().f59056OooOO0.setCurrentItem(this$0.f26069OooOooO);
                break;
            default:
                EvaAnimView this$1 = (EvaAnimView) this.f616OooO0o0;
                int i2 = EvaAnimView.f32973OooOOo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SurfaceTexture surfaceTexture = this$1.f32976OooO0o;
                if (surfaceTexture != null) {
                    surfaceTexture.setOnFrameAvailableListener(null);
                }
                this$1.f32974OooO = null;
                this$1.removeAllViews();
                break;
        }
    }
}
