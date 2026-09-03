package p073o000O0oo;

import android.animation.ValueAnimator;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.o000000O;
import androidx.media3.ui.o0O0O00;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import kotlin.jvm.internal.Intrinsics;
import p613o0oo0Ooo.w5;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34361OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34362OooO0o0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f34361OooO0Oo = i;
        this.f34362OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34361OooO0Oo) {
            case 0:
                o0000Ooo o0000ooo = o0000Ooo.this;
                if (o0000ooo.f34369OooO0oO != null) {
                    o0000ooo.OooO00o();
                }
                break;
            case 1:
                o0O0O00 o0o0o00 = (o0O0O00) this.f34362OooO0o0;
                ViewGroup viewGroup = o0o0o00.f9857OooO0o0;
                if (viewGroup != null) {
                    viewGroup.setVisibility(o0o0o00.f9877OooOoOO ? 0 : 4);
                }
                View view = o0o0o00.f9860OooOO0;
                if (view != null) {
                    int dimensionPixelSize = o0o0o00.f9852OooO00o.getResources().getDimensionPixelSize(o000000O.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (o0o0o00.f9877OooOoOO) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        if (o0o0o00.f9877OooOoOO) {
                            ValueAnimator valueAnimator = defaultTimeBar.f9565Oooo00o;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.f9566Oooo0O0 = true;
                            defaultTimeBar.f9562Oooo0 = 0.0f;
                            defaultTimeBar.invalidate(defaultTimeBar.f9534OooO0Oo);
                        } else {
                            int i = o0o0o00.f9875OooOoO;
                            if (i == 1) {
                                ValueAnimator valueAnimator2 = defaultTimeBar.f9565Oooo00o;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                defaultTimeBar.f9566Oooo0O0 = false;
                                defaultTimeBar.f9562Oooo0 = 0.0f;
                                defaultTimeBar.invalidate(defaultTimeBar.f9534OooO0Oo);
                            } else if (i != 3) {
                                ValueAnimator valueAnimator3 = defaultTimeBar.f9565Oooo00o;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                defaultTimeBar.f9566Oooo0O0 = false;
                                defaultTimeBar.f9562Oooo0 = 1.0f;
                                defaultTimeBar.invalidate(defaultTimeBar.f9534OooO0Oo);
                            }
                        }
                    }
                }
                for (View view2 : o0o0o00.f9876OooOoO0) {
                    view2.setVisibility((o0o0o00.f9877OooOoOO && o0O0O00.OooOO0(view2)) ? 4 : 0);
                }
                break;
            default:
                w5 this$0 = (w5) this.f34362OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    SurfaceTexture surfaceTexture = this$0.f57500OooOO0O;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        EvaJniUtil evaJniUtil = EvaJniUtil.f32437OooO00o;
                        evaJniUtil.renderFrame(this$0.f57484OooO0Oo.f57461OooO0O0);
                        this$0.f57484OooO0Oo.f57478OooOo.OooO0Oo();
                        evaJniUtil.renderSwapBuffers(this$0.f57484OooO0Oo.f57461OooO0O0);
                    }
                } catch (Throwable tr) {
                    String msg = "render exception=" + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                    return;
                }
                break;
        }
    }
}
