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
import kotlin.text.StringsKt;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 extends Lambda implements Function1<Editable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CreateRoomActivity f44271Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(CreateRoomActivity createRoomActivity) {
        super(1);
        this.f44271Oooo0o = createRoomActivity;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Editable editable) {
        boolean z;
        StringBuilder sb;
        Editable editable2 = editable;
        EditText editText = null;
        if (editable2 != null) {
            TextView textView = this.f44271Oooo0o.f22777OoooOoo;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvRoomNameNum");
                textView = null;
            }
            if (oo000o.OooO0o0()) {
                sb = OooO00o.OooO0o0("24/");
                sb.append(editable2.length());
            } else {
                sb = new StringBuilder();
                sb.append(editable2.length());
                sb.append("/24");
            }
            textView.setText(sb.toString());
        }
        Button button = this.f44271Oooo0o.f22782OooooOo;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btCreate");
            button = null;
        }
        EditText editText2 = this.f44271Oooo0o.f22776OoooOoO;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("etRoomName");
            editText2 = null;
        }
        Editable text = editText2.getText();
        if (!(text == null || StringsKt.isBlank(text))) {
            EditText editText3 = this.f44271Oooo0o.f22779Ooooo0o;
            if (editText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
            } else {
                editText = editText3;
            }
            Editable text2 = editText.getText();
            z = text2 == null || StringsKt.isBlank(text2) ? false : true;
        }
        button.setEnabled(z);
        return Unit.INSTANCE;
    }
}
