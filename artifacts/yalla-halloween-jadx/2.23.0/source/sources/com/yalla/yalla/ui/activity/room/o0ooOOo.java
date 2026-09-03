package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26955OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f26955OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        StringBuilder sb;
        Editable editable2 = editable;
        CreateRoomActivity createRoomActivity = this.f26955OooO0Oo;
        EditText editText = null;
        if (editable2 != null) {
            String string = editable2.toString();
            if (StringsKt.OooO0o(string, "\n")) {
                EditText editText2 = createRoomActivity.f26507OooOo0;
                if (editText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText2 = null;
                }
                int selectionStart = editText2.getSelectionStart();
                int length = string.length();
                string = new Regex("\n").replace(string, "");
                int length2 = selectionStart - (length - string.length());
                EditText editText3 = createRoomActivity.f26507OooOo0;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText3 = null;
                }
                editText3.setText(string);
                if (length2 >= 0) {
                    EditText editText4 = createRoomActivity.f26507OooOo0;
                    if (editText4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                        editText4 = null;
                    }
                    if (length2 > string.length()) {
                        length2 = string.length();
                    }
                    editText4.setSelection(length2);
                }
            }
            TextView textView = createRoomActivity.f26509OooOo0O;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                textView = null;
            }
            boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
            int length3 = string.length();
            if (zOooO0o0) {
                sb = new StringBuilder("100/");
                sb.append(length3);
            } else {
                sb = new StringBuilder();
                sb.append(length3);
                sb.append("/100");
            }
            textView.setText(sb.toString());
        }
        Button button = createRoomActivity.f26506OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        EditText editText5 = createRoomActivity.f26503OooOOo;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText5 = null;
        }
        Editable text = editText5.getText();
        boolean z = false;
        if (!(text == null || StringsKt.isBlank(text))) {
            EditText editText6 = createRoomActivity.f26507OooOo0;
            if (editText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            } else {
                editText = editText6;
            }
            Editable text2 = editText.getText();
            if (!(text2 == null || StringsKt.isBlank(text2))) {
                z = true;
            }
        }
        button.setEnabled(z);
        return Unit.INSTANCE;
    }
}
