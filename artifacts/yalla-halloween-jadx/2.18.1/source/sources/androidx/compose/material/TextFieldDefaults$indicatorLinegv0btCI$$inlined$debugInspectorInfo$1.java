package androidx.compose.material;

import Oooo0.OooOO0O;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOO0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class TextFieldDefaults$indicatorLinegv0btCI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00OOO0 o00ooo1 = o00o000o3.f6462OooO0O0;
        Boolean bool = Boolean.FALSE;
        o00ooo1.OooO00o("enabled", bool);
        o00o000o3.f6462OooO0O0.OooO00o("isError", bool);
        o00o000o3.f6462OooO0O0.OooO00o("interactionSource", null);
        o00o000o3.f6462OooO0O0.OooO00o("colors", null);
        OooOO0O.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00o000o3.f6462OooO0O0, "focusedIndicatorLineThickness");
        OooOO0O.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00o000o3.f6462OooO0O0, "unfocusedIndicatorLineThickness");
        return Unit.INSTANCE;
    }
}
