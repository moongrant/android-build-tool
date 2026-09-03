package androidx.compose.foundation;

import androidx.compose.ui.platform.o00O000o;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/o00O000o;", "", "invoke", "(Landroidx/compose/ui/platform/o00O000o;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class ClickableKt$clickableXHw0xAI$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<o00O000o, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function0 f5571Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f5572Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f5573Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooOO0O f5574Oooo0oo;

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O000o o00o000o2) {
        o00O000o o00o000o3 = o00o000o2;
        Intrinsics.checkNotNullParameter(o00o000o3, "$this$null");
        Objects.requireNonNull(o00o000o3);
        o00o000o3.f6462OooO0O0.OooO00o("enabled", Boolean.valueOf(this.f5572Oooo0o));
        o00o000o3.f6462OooO0O0.OooO00o("onClickLabel", this.f5573Oooo0oO);
        o00o000o3.f6462OooO0O0.OooO00o("role", this.f5574Oooo0oo);
        o00o000o3.f6462OooO0O0.OooO00o("onClick", this.f5571Oooo);
        return Unit.INSTANCE;
    }
}
