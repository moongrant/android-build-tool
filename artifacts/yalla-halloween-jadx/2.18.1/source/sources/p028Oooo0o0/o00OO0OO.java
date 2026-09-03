package p028Oooo0o0;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO extends Lambda implements Function2<OooOOOO, Integer, Integer> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o00OO0OO f2096Oooo0o = new o00OO0OO();

    public o00OO0OO() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(OooOOOO oooOOOO, Integer num) {
        OooOOOO intrinsicSize = oooOOOO;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(intrinsicSize, "$this$intrinsicSize");
        return Integer.valueOf(intrinsicSize.OooOOO(iIntValue));
    }
}
