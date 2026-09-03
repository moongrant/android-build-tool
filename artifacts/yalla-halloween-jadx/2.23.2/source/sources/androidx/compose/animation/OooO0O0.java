package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 {
    public static int OooO00o(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static void OooO0O0(int i, Composer composer, int i2, Function2 function2) {
        composer.updateRememberedValue(Integer.valueOf(i));
        composer.apply(Integer.valueOf(i2), function2);
    }
}
