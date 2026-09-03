package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static Object OooO00o(Composer composer, int i) {
        composer.startReplaceableGroup(i);
        return composer.consume(CompositionLocalsKt.getLocalDensity());
    }

    public static String OooO0O0(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }
}
