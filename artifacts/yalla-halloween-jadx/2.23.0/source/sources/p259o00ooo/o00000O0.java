package p259o00ooo;

import androidx.compose.ui.graphics.vector.PathBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00000O0 {
    public static List OooO00o(PathBuilder pathBuilder, float f, float f2, float f3, float f4) {
        pathBuilder.reflectiveCurveToRelative(f, f2, f3, f4);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}
