package p485o0o00O0;

import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.qiniu.android.http.ResponseInfo;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function0<EditTextSpan> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f47859OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(o00OOOOo o00ooooo2) {
        super(0);
        this.f47859OooO0Oo = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EditTextSpan invoke() {
        final o00OOOOo o00ooooo2 = this.f47859OooO0Oo;
        EditTextSpan editTextSpan = new EditTextSpan(o00ooooo2.f47861OooO00o);
        editTextSpan.setGravity(8388627);
        editTextSpan.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ResponseInfo.UnknownError)});
        Intrinsics.checkNotNullParameter(editTextSpan, "<this>");
        editTextSpan.setTextSize(2, 14.0f);
        editTextSpan.setBackground(null);
        editTextSpan.setFocusable(false);
        editTextSpan.setFocusableInTouchMode(true);
        editTextSpan.clearFocus();
        editTextSpan.setTextColor(o0000.OooO00o(oO00O0o.color_333333_85));
        editTextSpan.addTextChangedListener(new o0o0Oo(o00ooooo2));
        editTextSpan.setOnClickListener(new o00OOO0(o00ooooo2, 0));
        editTextSpan.setImeOptions(4);
        editTextSpan.setSingleLine(false);
        editTextSpan.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o00O0.o00OOO0O
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                o00OOOOo this$0 = o00ooooo2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<o00OOOOo, Unit> function1 = this$0.f47870OooOO0O;
                if (function1 == null) {
                    return true;
                }
                function1.invoke(this$0);
                return true;
            }
        });
        float f = 6;
        editTextSpan.setPadding(0, o0000O0.OooO00o(f), 0, o0000O0.OooO00o(f));
        return editTextSpan;
    }
}
