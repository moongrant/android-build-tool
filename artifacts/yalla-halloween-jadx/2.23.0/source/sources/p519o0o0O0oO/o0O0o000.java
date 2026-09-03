package p519o0o0O0oO;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.dialog.MenuDialogTag;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p157o00OoOO0.o00O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o000 extends o00O0O {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(@NotNull Activity context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        if (z) {
            MenuDialogTag menuDialogTag = MenuDialogTag.copyEvent;
            arrayList.add(new oOo00OO0(menuDialogTag, o0000.OooO0OO(menuDialogTag.getValue())));
        }
        if (z2) {
            MenuDialogTag menuDialogTag2 = MenuDialogTag.delete;
            arrayList.add(new oOo00OO0(menuDialogTag2, o0000.OooO0OO(menuDialogTag2.getValue())));
        }
        if (z4) {
            MenuDialogTag menuDialogTag3 = MenuDialogTag.dislike;
            arrayList.add(new oOo00OO0(menuDialogTag3, o0000.OooO0OO(menuDialogTag3.getValue())));
        }
        if (z3) {
            MenuDialogTag menuDialogTag4 = MenuDialogTag.report;
            arrayList.add(new oOo00OO0(menuDialogTag4, o0000.OooO0OO(menuDialogTag4.getValue())));
        }
        OooOOO(arrayList);
    }
}
