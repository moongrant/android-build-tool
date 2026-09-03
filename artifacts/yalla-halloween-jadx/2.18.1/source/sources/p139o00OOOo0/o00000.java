package p139o00OOOo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.dialog.baseDialog.MenuDialogTag;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.o00O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00000 extends o00O0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f31736OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f31737OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f31738OooOOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(@NotNull Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31737OooOOO0 = z;
        this.f31736OooOOO = z2;
        this.f31738OooOOOO = z3;
        ArrayList arrayList = new ArrayList();
        if (this.f31737OooOOO0) {
            MenuDialogTag menuDialogTag = MenuDialogTag.copyEvent;
            arrayList.add(new o000O0o(menuDialogTag, o000O0O0.OooO0OO(menuDialogTag.getValue())));
        }
        if (this.f31736OooOOO) {
            MenuDialogTag menuDialogTag2 = MenuDialogTag.delete;
            arrayList.add(new o000O0o(menuDialogTag2, o000O0O0.OooO0OO(menuDialogTag2.getValue())));
        }
        if (this.f31738OooOOOO) {
            MenuDialogTag menuDialogTag3 = MenuDialogTag.report;
            arrayList.add(new o000O0o(menuDialogTag3, o000O0O0.OooO0OO(menuDialogTag3.getValue())));
        }
        OooOOo0(arrayList);
    }
}
