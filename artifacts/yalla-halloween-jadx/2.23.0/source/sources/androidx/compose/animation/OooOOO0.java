package androidx.compose.animation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO0 {
    public static ValueElementSequence OooO00o(InspectorInfo inspectorInfo, String str, String str2) {
        Intrinsics.checkNotNullParameter(inspectorInfo, str);
        inspectorInfo.setName(str2);
        return inspectorInfo.getProperties();
    }
}
