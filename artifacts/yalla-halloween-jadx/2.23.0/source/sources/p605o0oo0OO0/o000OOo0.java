package p605o0oo0OO0;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@JvmName(name = "ToastUtil")
public final class o000OOo0 {
    public static final void OooO00o(@NotNull Context context, @NotNull Function0<? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Toast toastMakeText = Toast.makeText(context, (CharSequence) null, 0);
        toastMakeText.setText(value.invoke());
        toastMakeText.show();
    }
}
