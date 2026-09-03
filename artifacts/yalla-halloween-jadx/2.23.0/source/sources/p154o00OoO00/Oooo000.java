package p154o00OoO00;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.oo000o;
import p330o0OO0Ooo.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends Lambda implements Function1<oo000o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f38181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f38182OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(MutableState mutableState, boolean z) {
        super(1);
        this.f38181OooO0Oo = z;
        this.f38182OooO0o0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oo000o oo000oVar) {
        oo000o videoItem = oo000oVar;
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        if (this.f38181OooO0Oo) {
            OooO oooO = videoItem.f43120OooO0Oo;
            double d = oooO.f43155OooO00o;
            if (d > 0.0d) {
                double d2 = oooO.f43156OooO0O0;
                if (d2 > 0.0d) {
                    this.f38182OooO0o0.setValue(Float.valueOf((float) (d / d2)));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
