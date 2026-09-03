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
import p613o0oo0Oo.oO0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o0000Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34369OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34370OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f34369OooO0Oo = i;
        this.f34370OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34369OooO0Oo) {
            case 0:
                o00000O o00000o = o00000O.this;
                if (o00000o.f34363OooO0oO != null) {
                    o00000o.OooO00o();
                }
                break;
            case 1:
                o0O0O00 o0o0o00 = (o0O0O00) this.f34370OooO0o0;
                ViewGroup viewGroup = o0o0o00.f9868OooO0o0;
                if (viewGroup != null) {
                    viewGroup.setVisibility(o0o0o00.f9888OooOoOO ? 0 : 4);
                }
                View view = o0o0o00.f9871OooOO0;
                if (view != null) {
                    int dimensionPixelSize = o0o0o00.f9863OooO00o.getResources().getDimensionPixelSize(o000000O.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (o0o0o00.f9888OooOoOO) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof DefaultTimeBar) {
                        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                        if (o0o0o00.f9888OooOoOO) {
                            ValueAnimator valueAnimator = defaultTimeBar.f9575Oooo00o;
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            defaultTimeBar.f9576Oooo0O0 = true;
                            defaultTimeBar.f9572Oooo0 = 0.0f;
                            defaultTimeBar.invalidate(defaultTimeBar.f9544OooO0Oo);
                        } else {
                            int i = o0o0o00.f9886OooOoO;
                            if (i == 1) {
                                ValueAnimator valueAnimator2 = defaultTimeBar.f9575Oooo00o;
                                if (valueAnimator2.isStarted()) {
                                    valueAnimator2.cancel();
                                }
                                defaultTimeBar.f9576Oooo0O0 = false;
                                defaultTimeBar.f9572Oooo0 = 0.0f;
                                defaultTimeBar.invalidate(defaultTimeBar.f9544OooO0Oo);
                            } else if (i != 3) {
                                ValueAnimator valueAnimator3 = defaultTimeBar.f9575Oooo00o;
                                if (valueAnimator3.isStarted()) {
                                    valueAnimator3.cancel();
                                }
                                defaultTimeBar.f9576Oooo0O0 = false;
                                defaultTimeBar.f9572Oooo0 = 1.0f;
                                defaultTimeBar.invalidate(defaultTimeBar.f9544OooO0Oo);
                            }
                        }
                    }
                }
                for (View view2 : o0o0o00.f9887OooOoO0) {
                    view2.setVisibility((o0o0o00.f9888OooOoOO && o0O0O00.OooOO0(view2)) ? 4 : 0);
                }
                break;
            default:
                oO0O0O00 this$0 = (oO0O0O00) this.f34370OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    SurfaceTexture surfaceTexture = this$0.f57081OooOO0O;
                    if (surfaceTexture != null) {
                        surfaceTexture.updateTexImage();
                        EvaJniUtil evaJniUtil = EvaJniUtil.f32434OooO00o;
                        evaJniUtil.renderFrame(this$0.f57068OooO0Oo.f57042OooO0O0);
                        this$0.f57068OooO0Oo.f57059OooOo.OooO0Oo();
                        evaJniUtil.renderSwapBuffers(this$0.f57068OooO0Oo.f57042OooO0O0);
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
