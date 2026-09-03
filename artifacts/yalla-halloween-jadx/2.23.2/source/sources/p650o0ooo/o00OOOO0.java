package p650o0ooo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O0o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOOO0 extends o000O0o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(@NotNull Activity context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        if (z) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                MenuDialogTag menuDialogTag = MenuDialogTag.copyEvent;
                arrayList.add(new o0OO(menuDialogTag, o0000.OooO0OO(menuDialogTag.getValue())));
            }
        }
        if (z2) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                MenuDialogTag menuDialogTag2 = MenuDialogTag.delete;
                arrayList.add(new o0OO(menuDialogTag2, o0000.OooO0OO(menuDialogTag2.getValue())));
            }
        }
        if (z4) {
            MenuDialogTag menuDialogTag3 = MenuDialogTag.dislike;
            arrayList.add(new o0OO(menuDialogTag3, o0000.OooO0OO(menuDialogTag3.getValue())));
        }
        if (z3) {
            MenuDialogTag menuDialogTag4 = MenuDialogTag.report;
            arrayList.add(new o0OO(menuDialogTag4, o0000.OooO0OO(menuDialogTag4.getValue())));
        }
        OooOOO(arrayList);
    }
}
