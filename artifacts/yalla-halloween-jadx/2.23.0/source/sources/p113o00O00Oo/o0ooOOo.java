package p113o00O00Oo;

import android.graphics.PointF;
import androidx.compose.animation.OooO0o;
import java.util.ArrayList;
import java.util.List;
import oOO00O.OooO00o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f36389OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public PointF f36390OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f36391OooO0OO;

    public o0ooOOo(PointF pointF, boolean z, List<OooO00o> list) {
        this.f36390OooO0O0 = pointF;
        this.f36391OooO0OO = z;
        this.f36389OooO00o = new ArrayList(list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f36389OooO00o.size());
        sb.append("closed=");
        return OooO0o.OooO00o(sb, this.f36391OooO0OO, '}');
    }

    public o0ooOOo() {
        this.f36389OooO00o = new ArrayList();
    }
}
