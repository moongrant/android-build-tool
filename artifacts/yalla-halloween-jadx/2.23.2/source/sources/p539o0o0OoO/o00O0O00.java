package p539o0o0OoO;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.code.android.util.o000000;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f54556OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(MutableState<TextFieldValue> mutableState) {
        super(1);
        this.f54556OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextFieldValue textFieldValue) {
        TextFieldValue it = textFieldValue;
        Intrinsics.checkNotNullParameter(it, "it");
        String strValueOf = String.valueOf(RangesKt.coerceIn(o000000.OooO0o0(it.getText()), 0, 500));
        this.f54556OooO0Oo.setValue(new TextFieldValue(strValueOf, TextRangeKt.TextRange(strValueOf.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }
}
