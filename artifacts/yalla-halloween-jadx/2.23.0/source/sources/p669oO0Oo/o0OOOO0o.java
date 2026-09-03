package p669oO0Oo;

import androidx.compose.runtime.MutableState;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<String> f60729OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60730OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.f60729OooO0Oo = mutableState;
        this.f60730OooO0o0 = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        String strOooOoO = StringsKt.OooOoO(it, ZegoConstants.ZegoVideoDataAuxPublishingStream, "");
        if (strOooOoO.length() > 4) {
            it = strOooOoO.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(it, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        this.f60729OooO0Oo.setValue(it);
        this.f60730OooO0o0.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
