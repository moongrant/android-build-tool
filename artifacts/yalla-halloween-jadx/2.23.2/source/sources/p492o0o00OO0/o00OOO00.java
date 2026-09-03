package p492o0o00OO0;

import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
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
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 extends Lambda implements Function0<EditTextSpan> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOO0 f49190OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO00(o00OOO0 o00ooo1) {
        super(0);
        this.f49190OooO0Oo = o00ooo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final EditTextSpan invoke() {
        final o00OOO0 o00ooo1 = this.f49190OooO0Oo;
        EditTextSpan editTextSpan = new EditTextSpan(o00ooo1.f49178OooO00o);
        editTextSpan.setGravity(8388627);
        editTextSpan.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ResponseInfo.UnknownError)});
        Intrinsics.checkNotNullParameter(editTextSpan, "<this>");
        editTextSpan.setTextSize(2, 14.0f);
        editTextSpan.setBackground(null);
        editTextSpan.setFocusable(false);
        editTextSpan.setFocusableInTouchMode(true);
        editTextSpan.clearFocus();
        editTextSpan.setTextColor(o0000.OooO00o(o0OOO0o.color_333333_85));
        editTextSpan.addTextChangedListener(new o00OO(o00ooo1));
        editTextSpan.setOnClickListener(new View.OnClickListener() { // from class: o0o00OO0.o00OO0OO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00OOO0 this$0 = o00ooo1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0(true);
            }
        });
        editTextSpan.setImeOptions(4);
        editTextSpan.setSingleLine(false);
        editTextSpan.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o00OO0.oo0O
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                o00OOO0 this$0 = o00ooo1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function1<o00OOO0, Unit> function1 = this$0.f49187OooOO0O;
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
