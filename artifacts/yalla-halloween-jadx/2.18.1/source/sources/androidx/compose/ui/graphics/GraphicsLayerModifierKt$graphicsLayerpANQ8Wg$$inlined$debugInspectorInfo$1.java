package androidx.compose.ui.graphics;

import androidx.compose.ui.platform.o00O000o;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o000OOo0;
import p145o00Oo0.o00O00;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.GraphicsLayerModifierKt$graphicsLayer-pANQ8Wg$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class GraphicsLayerModifierKt$graphicsLayerpANQ8Wg$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f6010Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f6011Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f6012Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f6013Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ float f6014OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ float f6015OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f6016OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ float f6017OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ float f6018OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ long f6019OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f6020OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final /* synthetic */ boolean f6021OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final /* synthetic */ long f6022OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final /* synthetic */ long f6023OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ float f6024o000oOoO;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o("scaleX", Float.valueOf(this.f6011Oooo0o));
        o00o000o3.f6462OooO0O0.OooO00o("scaleY", Float.valueOf(this.f6012Oooo0oO));
        o00o000o3.f6462OooO0O0.OooO00o("alpha", Float.valueOf(this.f6013Oooo0oo));
        o00o000o3.f6462OooO0O0.OooO00o("translationX", Float.valueOf(this.f6010Oooo));
        o00o000o3.f6462OooO0O0.OooO00o("translationY", Float.valueOf(this.f6016OoooO00));
        o00o000o3.f6462OooO0O0.OooO00o("shadowElevation", Float.valueOf(this.f6015OoooO0));
        o00o000o3.f6462OooO0O0.OooO00o("rotationX", Float.valueOf(this.f6017OoooO0O));
        o00o000o3.f6462OooO0O0.OooO00o("rotationY", Float.valueOf(this.f6014OoooO));
        o00o000o3.f6462OooO0O0.OooO00o("rotationZ", Float.valueOf(this.f6018OoooOO0));
        o00o000o3.f6462OooO0O0.OooO00o("cameraDistance", Float.valueOf(this.f6024o000oOoO));
        o00o000o3.f6462OooO0O0.OooO00o("transformOrigin", new o00O00(this.f6019OoooOOO));
        o00o000o3.f6462OooO0O0.OooO00o("shape", this.f6020OoooOOo);
        o00o000o3.f6462OooO0O0.OooO00o("clip", Boolean.valueOf(this.f6021OoooOo0));
        o00o000o3.f6462OooO0O0.OooO00o("renderEffect", null);
        o00o000o3.f6462OooO0O0.OooO00o("ambientShadowColor", new o00000O0(this.f6022OoooOoO));
        o00o000o3.f6462OooO0O0.OooO00o("spotShadowColor", new o00000O0(this.f6023OoooOoo));
        return Unit.INSTANCE;
    }
}
