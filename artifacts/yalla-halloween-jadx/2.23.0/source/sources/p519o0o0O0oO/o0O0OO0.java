package p519o0o0O0oO;

import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import com.code.android.util.o000000;
import com.facebook.appevents.AppEventsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f52658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52659OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f52660OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(int i, int i2, MutableState mutableState) {
        super(1);
        this.f52658OooO0Oo = i;
        this.f52660OooO0o0 = mutableState;
        this.f52659OooO0o = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextFieldValue textFieldValue) {
        TextFieldValue it = textFieldValue;
        Intrinsics.checkNotNullParameter(it, "it");
        int iOooO0o0 = o000000.OooO0o0(it.getText());
        MutableState<TextFieldValue> mutableState = this.f52660OooO0o0;
        int i = this.f52658OooO0Oo;
        if (iOooO0o0 < i) {
            mutableState.setValue(new TextFieldValue(String.valueOf(i), TextRangeKt.TextRange(String.valueOf(i).length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        } else {
            int i2 = this.f52659OooO0o;
            if (iOooO0o0 > i2) {
                mutableState.setValue(new TextFieldValue(String.valueOf(i2), TextRangeKt.TextRange(String.valueOf(i2).length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            } else if (TextUtils.isEmpty(it.getText())) {
                mutableState.setValue(new TextFieldValue(AppEventsConstants.EVENT_PARAM_VALUE_NO, TextRangeKt.TextRange(1), (TextRange) null, 4, (DefaultConstructorMarker) null));
            } else {
                String strValueOf = String.valueOf(iOooO0o0);
                mutableState.setValue(new TextFieldValue(strValueOf, TextRangeKt.TextRange(strValueOf.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
            }
        }
        return Unit.INSTANCE;
    }
}
