package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
public final class ConstraintLayoutKt$ConstraintLayout$6$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        if (((num.intValue() & 11) ^ 2) != 0 || !composer2.getSkipping()) {
            throw null;
        }
        composer2.skipToGroupEnd();
        return Unit.INSTANCE;
    }
}
