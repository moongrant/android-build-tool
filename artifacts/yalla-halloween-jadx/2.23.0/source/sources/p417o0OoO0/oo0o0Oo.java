package p417o0OoO0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDialogExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1855#2,2:58\n*S KotlinDebug\n*F\n+ 1 DialogExt.kt\ncom/yalla/yalla/ext/DialogExtKt\n*L\n23#1:58,2\n*E\n"})
public final class oo0o0Oo {

    public static final class OooO00o extends Lambda implements Function0<List<Function0<? extends Unit>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f45531OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Function0<? extends Unit>> invoke() {
            return new ArrayList();
        }
    }

    public static final void OooO00o(@NotNull Dialog dialog, @NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(dialog, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final Lazy lazy = LazyKt.lazy(OooO00o.f45531OooO0Oo);
        ((List) lazy.getValue()).add(listener);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o0OoO0.o0OOO0o
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

    public static final void OooO0O0(@NotNull Oooo0 oooo0, @NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(oooo0, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Lazy lazy = LazyKt.lazy(o0OO00O.f45526OooO0Oo);
        ((List) lazy.getValue()).add(listener);
        oooo0.OooOO0(new o0Oo0oo(lazy));
    }

    public static final void OooO0OO(@Nullable Dialog dialog, @Nullable LifeCycleDialog lifeCycleDialog) {
        if (lifeCycleDialog != null) {
            OooO00o(lifeCycleDialog, new o0O0O00(dialog));
        }
        if (lifeCycleDialog != null) {
            OooO0Oo(lifeCycleDialog);
        }
    }

    public static final void OooO0Oo(@Nullable Dialog dialog) {
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        Context context = dialog.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity == null || OooO.OooO00o(fragmentActivity, null)) {
            Activity ownerActivity = dialog.getOwnerActivity();
            FragmentActivity fragmentActivity2 = ownerActivity instanceof FragmentActivity ? (FragmentActivity) ownerActivity : null;
            if (fragmentActivity2 == null || OooO.OooO00o(fragmentActivity2, null)) {
                dialog.show();
            }
        }
    }
}
