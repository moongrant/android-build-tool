package p200o00o0OoO;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.o00Ooo;
import o0OO0o00.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO0OO extends Lambda implements Function1<o00Ooo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f39288OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f39289OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0OO(MutableState mutableState, boolean z) {
        super(1);
        this.f39288OooO0Oo = z;
        this.f39289OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00Ooo o00ooo2) {
        o00Ooo videoItem = o00ooo2;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        if (this.f39288OooO0Oo) {
            OooO0OO oooO0OO = videoItem.f42407OooO0Oo;
            double d = oooO0OO.f42463OooO00o;
            if (d > 0.0d) {
                double d2 = oooO0OO.f42464OooO0O0;
                if (d2 > 0.0d) {
                    this.f39289OooO0o0.setValue(Float.valueOf((float) (d / d2)));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
