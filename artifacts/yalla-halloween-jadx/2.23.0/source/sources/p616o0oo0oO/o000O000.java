package p616o0oo0oO;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o000O000 extends FunctionReferenceImpl implements Function1<Float, Float> {
    public o000O000(ScrollScope scrollScope) {
        super(1, scrollScope, ScrollScope.class, "scrollBy", "scrollBy(F)F", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f) {
        return Float.valueOf(((ScrollScope) this.receiver).scrollBy(f.floatValue()));
    }
}
