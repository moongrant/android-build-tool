package p039OoooOoo;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.OooO0OO;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoOutput;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.o0000;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1683OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1684OooO0o0;

    public /* synthetic */ o00O00OO(Object obj, int i) {
        this.f1683OooO0Oo = i;
        this.f1684OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[Catch: all -> 0x003e, PHI: r2
      0x0023: PHI (r2v2 boolean) = (r2v0 boolean), (r2v5 boolean) binds: [B:8:0x001c, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003e, blocks: (B:7:0x000f, B:27:0x004f, B:12:0x0023, B:14:0x0027, B:17:0x002c, B:19:0x0032, B:22:0x0040, B:24:0x0044), top: B:73:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef A[LOOP:3: B:62:0x00e9->B:64:0x00ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        OooOO0O.OooOOO0 oooOOO0;
        OooO0OO oooO0OO;
        OooOO0O.OooOOO0 oooOOO0OooOOOO;
        int i = 0;
        boolean z = true;
        switch (this.f1683OooO0Oo) {
            case 0:
                OooOO0O oooOO0O = (OooOO0O) this.f1684OooO0o0;
                synchronized (oooOO0O.f3923OooO0o) {
                    try {
                        int i2 = OooOO0O.OooOO0.f3982OooO00o[oooOO0O.f3926OooO0oo.ordinal()];
                        oooOOO0 = null;
                        if (i2 != 3) {
                            z = false;
                            if (i2 != 4) {
                                oooOOO0OooOOOO = null;
                            } else if (oooOO0O.f3928OooOO0O == null || oooOO0O.f3966OoooOOo) {
                                oooO0OO = null;
                            } else if (oooOO0O.f3970o000oOoO == VideoOutput.SourceState.INACTIVE) {
                                OooO0OO oooO0OO2 = oooOO0O.f3929OooOO0o;
                                oooOO0O.f3929OooOO0o = null;
                                oooOO0O.OooOo0O();
                                Set<OooOO0O.OooOOO> set = OooOO0O.f3912Ooooo00;
                                oooO0OO = oooO0OO2;
                                i = 4;
                            } else if (oooOO0O.f3945OooOoo != null) {
                                oooOOO0OooOOOO = oooOO0O.OooOOOO(oooOO0O.f3926OooO0oo);
                            } else {
                                oooO0OO = null;
                            }
                            oooOOO0 = oooOOO0OooOOOO;
                            oooO0OO = null;
                        } else if (oooOO0O.f3928OooOO0O == null) {
                            oooO0OO = null;
                        } else {
                            oooO0OO = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (oooOOO0 != null) {
                    oooOO0O.OooOooo(oooOOO0, z);
                    return;
                } else {
                    if (oooO0OO != null) {
                        oooOO0O.OooO0oo(oooO0OO, i);
                        return;
                    }
                    return;
                }
            default:
                o0000 o0000Var = (o0000) this.f1684OooO0o0;
                ViewGroup viewGroup2 = o0000Var.f14038OooO0o;
                if (viewGroup2 == null || (viewGroup = o0000Var.f14040OooO0oO) == null) {
                    return;
                }
                StyledPlayerControlView styledPlayerControlView = o0000Var.f14034OooO00o;
                int width = (styledPlayerControlView.getWidth() - styledPlayerControlView.getPaddingLeft()) - styledPlayerControlView.getPaddingRight();
                while (viewGroup.getChildCount() > 1) {
                    int childCount = viewGroup.getChildCount() - 2;
                    View childAt = viewGroup.getChildAt(childCount);
                    viewGroup.removeViewAt(childCount);
                    viewGroup2.addView(childAt, 0);
                }
                View view = o0000Var.f14043OooOO0O;
                if (view != null) {
                    view.setVisibility(8);
                }
                int iOooO0Oo = o0000.OooO0Oo(o0000Var.f14033OooO);
                int childCount2 = viewGroup2.getChildCount() - 1;
                for (int i3 = 0; i3 < childCount2; i3++) {
                    iOooO0Oo += o0000.OooO0Oo(viewGroup2.getChildAt(i3));
                }
                if (iOooO0Oo <= width) {
                    ViewGroup viewGroup3 = o0000Var.f14041OooO0oo;
                    if (viewGroup3 == null || viewGroup3.getVisibility() != 0) {
                        return;
                    }
                    ValueAnimator valueAnimator = o0000Var.f14049OooOOo;
                    if (valueAnimator.isStarted()) {
                        return;
                    }
                    o0000Var.f14050OooOOo0.cancel();
                    valueAnimator.start();
                    return;
                }
                if (view != null) {
                    view.setVisibility(0);
                    iOooO0Oo += o0000.OooO0Oo(view);
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt2 = viewGroup2.getChildAt(i4);
                    iOooO0Oo -= o0000.OooO0Oo(childAt2);
                    arrayList.add(childAt2);
                    if (iOooO0Oo <= width) {
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        viewGroup2.removeViews(0, arrayList.size());
                        while (i < arrayList.size()) {
                            viewGroup.addView((View) arrayList.get(i), viewGroup.getChildCount() - 1);
                            i++;
                        }
                        return;
                    }
                }
                if (arrayList.isEmpty()) {
                    viewGroup2.removeViews(0, arrayList.size());
                    while (i < arrayList.size()) {
                        viewGroup.addView((View) arrayList.get(i), viewGroup.getChildCount() - 1);
                        i++;
                    }
                    return;
                }
                return;
        }
    }
}
