package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;
import p650o0ooo.o0OOOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17632OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17633OooO0o0;

    public /* synthetic */ o0OOO0o(Object obj, int i) {
        this.f17632OooO0Oo = i;
        this.f17633OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f17632OooO0Oo;
        Object obj = this.f17633OooO0o0;
        switch (i) {
            case 0:
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
                EditText editText = o0oo0oo2.f17634OooO0o;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = o0oo0oo2.f17634OooO0o;
                    if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        o0oo0oo2.f17634OooO0o.setTransformationMethod(null);
                    } else {
                        o0oo0oo2.f17634OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }
                    if (selectionEnd >= 0) {
                        o0oo0oo2.f17634OooO0o.setSelection(selectionEnd);
                    }
                    o0oo0oo2.OooOOo0();
                    break;
                }
                break;
            default:
                o0OOOO0o this$0 = (o0OOOO0o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
                break;
        }
    }
}
