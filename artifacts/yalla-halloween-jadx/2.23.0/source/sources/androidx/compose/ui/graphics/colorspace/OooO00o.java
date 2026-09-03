package androidx.compose.ui.graphics.colorspace;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static Iterator OooO0O0(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }
}
