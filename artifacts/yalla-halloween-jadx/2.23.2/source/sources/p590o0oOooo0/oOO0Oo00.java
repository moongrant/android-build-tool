package p590o0oOooo0;

import android.text.Selection;
import android.widget.EditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apollo.Apollo;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p386o0OOooO.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0Oo00 {
    @JvmStatic
    @NotNull
    public static final String OooO00o() {
        return OooO0O0("K3");
    }

    public static String OooO0O0(String str) {
        String strQ = Apollo.INSTANCE.q(str);
        if (!StringsKt.isBlank(strQ)) {
            return strQ;
        }
        if (!oo0o0Oo.OooO0o0()) {
            throw new NullPointerException("Apollo not init");
        }
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @JvmStatic
    @NotNull
    public static final String OooO0OO() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    public static void OooO0Oo(EditText editText) {
        if (editText == null) {
            return;
        }
        int length = editText.getText().length();
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        String strTrim = editText.getText().toString().trim();
        if (length > strTrim.length()) {
            length = strTrim.length();
        }
        Selection.setSelection(editText.getText(), length);
    }
}
