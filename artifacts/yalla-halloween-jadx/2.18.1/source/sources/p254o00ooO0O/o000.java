package p254o00ooO0O;

import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p145o00Oo0.o0000;

/* JADX INFO: loaded from: classes.dex */
public final class o000 extends Lambda implements Function1<o0000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f34237Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(LayoutDirection layoutDirection) {
        super(1);
        this.f34237Oooo0o = layoutDirection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000 o0000Var) {
        o0000 graphicsLayer = o0000Var;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.OooO0Oo(this.f34237Oooo0o == LayoutDirection.Rtl ? 180.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        return Unit.INSTANCE;
    }
}
