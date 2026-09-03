package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static void OooO00o(int i, Function2 function2, Composer composer) {
        function2.invoke(composer, Integer.valueOf(i));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }
}
