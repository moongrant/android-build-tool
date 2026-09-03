package p540o0o0OoO0;

import androidx.compose.runtime.MutableState;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o0oO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f55029OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f55030OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.f55029OooO0Oo = mutableState;
        this.f55030OooO0o0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(it, ZegoConstants.ZegoVideoDataAuxPublishingStream, "", false, 4, (Object) null);
        if (strReplace$default.length() > 4) {
            it = strReplace$default.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(it, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.f55029OooO0Oo.setValue(it);
        this.f55030OooO0o0.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
