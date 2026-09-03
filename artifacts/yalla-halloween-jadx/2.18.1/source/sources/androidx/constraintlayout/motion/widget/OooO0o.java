package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MotionLayout f7355OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public HashSet<View> f7357OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ArrayList<OooO0OO.OooO00o> f7360OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ArrayList<OooO0OO> f7356OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f7358OooO0Oo = "ViewTransitionController";

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ArrayList<OooO0OO.OooO00o> f7359OooO0o = new ArrayList<>();

    public class OooO00o implements androidx.constraintlayout.widget.OooO0O0.OooO00o {
    }

    public OooO0o(MotionLayout motionLayout) {
        this.f7355OooO00o = motionLayout;
    }

    public final void OooO00o() {
        this.f7355OooO00o.invalidate();
    }

    public final void OooO0O0(OooO0OO oooO0OO, boolean z) {
        ConstraintLayout.getSharedValues().OooO00o(oooO0OO.f7340OooOo0, new OooO00o());
    }
}
