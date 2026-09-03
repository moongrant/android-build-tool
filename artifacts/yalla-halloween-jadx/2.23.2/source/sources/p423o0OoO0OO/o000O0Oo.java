package p423o0OoO0OO;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDialogExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1855#2,2:58\n*S KotlinDebug\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt\n*L\n23#1:58,2\n*E\n"})
public final class o000O0Oo {
    public static final void OooO00o(@NotNull o0000OO0 o0000oo1, @NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(o0000oo1, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Lazy lazy = LazyKt.lazy(o000O00.f46649OooO0Oo);
        ((List) lazy.getValue()).add(listener);
        o0000oo1.OooOO0(new o000Oo0(lazy));
    }

    public static final void OooO0O0(@Nullable Dialog dialog, @Nullable LifeCycleDialog lifeCycleDialog) {
        if (lifeCycleDialog != null) {
            o000O0 listener = new o000O0(dialog);
            Intrinsics.checkNotNullParameter(lifeCycleDialog, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            final Lazy lazy = LazyKt.lazy(o000O00O.f46652OooO0Oo);
            ((List) lazy.getValue()).add(listener);
            lifeCycleDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0OoO0OO.o000O0o
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
        if (lifeCycleDialog != null) {
            OooO0OO(lifeCycleDialog);
        }
    }

    public static final void OooO0OO(@Nullable Dialog dialog) {
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        Context context = dialog.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || oo0o0Oo.OooO00o(fragmentActivity, null)) {
            Activity ownerActivity = dialog.getOwnerActivity();
            FragmentActivity fragmentActivity2 = ownerActivity instanceof FragmentActivity ? (FragmentActivity) ownerActivity : null;
            if (fragmentActivity2 == null || oo0o0Oo.OooO00o(fragmentActivity2, null)) {
                dialog.show();
            }
        }
    }
}
