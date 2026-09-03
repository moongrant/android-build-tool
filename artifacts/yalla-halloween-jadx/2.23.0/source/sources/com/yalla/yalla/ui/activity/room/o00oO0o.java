package com.yalla.yalla.ui.activity.room;

import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oO0o extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f26891OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f26891OooO0Oo = createRoomActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        StringBuilder sb;
        Editable editable2 = editable;
        EditText editText = null;
        CreateRoomActivity createRoomActivity = this.f26891OooO0Oo;
        if (editable2 != null) {
            TextView textView = createRoomActivity.f26505OooOOoo;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                textView = null;
            }
            boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
            int length = editable2.length();
            if (zOooO0o0) {
                sb = new StringBuilder("24/");
                sb.append(length);
            } else {
                sb = new StringBuilder();
                sb.append(length);
                sb.append("/24");
            }
            textView.setText(sb.toString());
        }
        Button button = createRoomActivity.f26506OooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        EditText editText2 = createRoomActivity.f26503OooOOo;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText2 = null;
        }
        Editable text = editText2.getText();
        boolean z = false;
        if (!(text == null || StringsKt.isBlank(text))) {
            EditText editText3 = createRoomActivity.f26507OooOo0;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            } else {
                editText = editText3;
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
