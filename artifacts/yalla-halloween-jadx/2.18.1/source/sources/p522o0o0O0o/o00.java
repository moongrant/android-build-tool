package p522o0o0O0o;

import android.app.Dialog;
import android.content.DialogInterface;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 {
    public static final void OooO00o(@Nullable Dialog dialog, @Nullable Dialog dialog2) {
        if (dialog2 != null) {
            o000OOo0 listener = new o000OOo0(dialog);
            Intrinsics.checkNotNullParameter(dialog2, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            final Lazy lazy = LazyKt.lazy(o000OO00.f42989Oooo0o);
            ((List) lazy.getValue()).add(listener);
            dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0o0O0o.o000OO0O
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Lazy dismissListenerList$delegate = lazy;
                    Intrinsics.checkNotNullParameter(dismissListenerList$delegate, "$dismissListenerList$delegate");
                    for (Function0 function0 : (List) dismissListenerList$delegate.getValue()) {
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                }
            });
        }
        if (dialog2 != null) {
            dialog2.show();
        }
    }
}
