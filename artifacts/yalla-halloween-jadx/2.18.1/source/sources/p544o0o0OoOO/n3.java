package p544o0o0OoOO;

import OooO00o.OooO00o;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44275Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f44275Oooo0o = createRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        boolean z;
        StringBuilder sb;
        Editable editable2 = editable;
        EditText editText = null;
        if (editable2 != null) {
            CreateRoomActivity createRoomActivity = this.f44275Oooo0o;
            String string = editable2.toString();
            if (StringsKt__StringsKt.contains$default(string, "\n", false, 2, (Object) null)) {
                EditText editText2 = createRoomActivity.f22779Ooooo0o;
                if (editText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText2 = null;
                }
                int selectionStart = editText2.getSelectionStart();
                int length = string.length();
                string = new Regex("\n").replace(string, "");
                int length2 = selectionStart - (length - string.length());
                EditText editText3 = createRoomActivity.f22779Ooooo0o;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText3 = null;
                }
                editText3.setText(string);
                if (length2 >= 0) {
                    EditText editText4 = createRoomActivity.f22779Ooooo0o;
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
            TextView textView = createRoomActivity.f22780OooooO0;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRoomAnnoNum");
                textView = null;
            }
            if (oo000o.OooO0o0()) {
                sb = OooO00o.OooO0o0("100/");
                sb.append(string.length());
            } else {
                sb = new StringBuilder();
                sb.append(string.length());
                sb.append("/100");
            }
            textView.setText(sb.toString());
        }
        Button button = this.f44275Oooo0o.f22782OooooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        EditText editText5 = this.f44275Oooo0o.f22776OoooOoO;
        if (editText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText5 = null;
        }
        Editable text = editText5.getText();
        if (!(text == null || StringsKt.isBlank(text))) {
            EditText editText6 = this.f44275Oooo0o.f22779Ooooo0o;
            if (editText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            } else {
                editText = editText6;
            }
            Editable text2 = editText.getText();
            z = text2 == null || StringsKt.isBlank(text2) ? false : true;
        }
        button.setEnabled(z);
        return Unit.INSTANCE;
    }
}
