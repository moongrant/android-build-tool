package p136o00OO0oO;

import android.graphics.PointF;
import androidx.compose.animation.OooO0o;
import java.util.ArrayList;
import java.util.List;
import p135o00OO0o0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f37367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PointF f37368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f37369OooO0OO;

    public OooOOOO(PointF pointF, boolean z, List<o00Oo0> list) {
        this.f37368OooO0O0 = pointF;
        this.f37369OooO0OO = z;
        this.f37367OooO00o = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f37367OooO00o.size());
        sb.append("closed=");
        return OooO0o.OooO00o(sb, this.f37369OooO0OO, '}');
    }

    public OooOOOO() {
        this.f37367OooO00o = new ArrayList();
    }
}
