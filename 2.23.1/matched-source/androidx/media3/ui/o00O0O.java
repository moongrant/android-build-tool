package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yy.yyeva.util.EvaJniUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p613o0oo0Oo.oO0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f9857OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9858OooO0o0;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f9857OooO0Oo = i;
        this.f9858OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a A[LOOP:3: B:32:0x0094->B:34:0x009a, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f9857OooO0Oo) {
            case 0:
                o0O0O00 o0o0o00 = (o0O0O00) this.f9858OooO0o0;
                ViewGroup viewGroup2 = o0o0o00.f9867OooO0o;
                if (viewGroup2 != null && (viewGroup = o0o0o00.f9869OooO0oO) != null) {
                    PlayerControlView playerControlView = o0o0o00.f9863OooO00o;
                    int width = (playerControlView.getWidth() - playerControlView.getPaddingLeft()) - playerControlView.getPaddingRight();
                    while (viewGroup.getChildCount() > 1) {
                        int childCount = viewGroup.getChildCount() - 2;
                        View childAt = viewGroup.getChildAt(childCount);
                        viewGroup.removeViewAt(childCount);
                        viewGroup2.addView(childAt, 0);
                    }
                    View view = o0o0o00.f9872OooOO0O;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    int iOooO0Oo = o0O0O00.OooO0Oo(o0o0o00.f9862OooO);
                    int childCount2 = viewGroup2.getChildCount() - 1;
                    for (int i = 0; i < childCount2; i++) {
                        iOooO0Oo += o0O0O00.OooO0Oo(viewGroup2.getChildAt(i));
                    }
                    if (iOooO0Oo > width) {
                        if (view != null) {
                            view.setVisibility(0);
                            iOooO0Oo += o0O0O00.OooO0Oo(view);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < childCount2; i2++) {
                            View childAt2 = viewGroup2.getChildAt(i2);
                            iOooO0Oo -= o0O0O00.OooO0Oo(childAt2);
                            arrayList.add(childAt2);
                            if (iOooO0Oo <= width) {
                                if (!arrayList.isEmpty()) {
                                    viewGroup2.removeViews(0, arrayList.size());
                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                        viewGroup.addView((View) arrayList.get(i3), viewGroup.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            viewGroup2.removeViews(0, arrayList.size());
                            while (i3 < arrayList.size()) {
                                viewGroup.addView((View) arrayList.get(i3), viewGroup.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup3 = o0o0o00.f9870OooO0oo;
                        if (viewGroup3 != null && viewGroup3.getVisibility() == 0) {
                            ValueAnimator valueAnimator = o0o0o00.f9878OooOOo;
                            if (!valueAnimator.isStarted()) {
                                o0o0o00.f9879OooOOo0.cancel();
                                valueAnimator.start();
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                oO0O0O00 this$0 = (oO0O0O00) this.f9858OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EvaJniUtil evaJniUtil = EvaJniUtil.f32434OooO00o;
                evaJniUtil.renderClearFrame(this$0.f57068OooO0Oo.f57042OooO0O0);
                try {
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("releaseLastFrame", "msg");
                    SurfaceTexture surfaceTexture = this$0.f57081OooOO0O;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                    }
                    this$0.f57081OooOO0O = null;
                    evaJniUtil.releaseTexture(this$0.f57068OooO0Oo.f57042OooO0O0);
                } catch (Throwable tr) {
                    String msg = "release e=" + tr;
                    Intrinsics.checkNotNullParameter("EvaAnimPlayer.HardDecoder", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter(msg, "msg");
                    Intrinsics.checkNotNullParameter(tr, "tr");
                }
                this$0.f57072OooO0oo = false;
                this$0.onVideoComplete();
                if (this$0.f57084OooOOO0) {
                    this$0.OooO0Oo();
                }
                this$0.f57068OooO0Oo.f57062OooOo0O = false;
                break;
        }
    }
}
