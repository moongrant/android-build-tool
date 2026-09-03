package p609o0oo0OOO;

import android.content.Context;
import android.widget.Toast;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@JvmName(name = "ToastUtil")
public final class j5 {
    public static final void OooO00o(@NotNull Context context, @NotNull Function0<? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Toast toastMakeText = Toast.makeText(context, (CharSequence) null, 0);
        toastMakeText.setText(value.invoke());
        toastMakeText.show();
    }
}
