package p582o0oOoOoO;

import android.widget.EditText;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p516o0o0O000.o00000O;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 extends Lambda implements Function2<EditText, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46915Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(2);
        this.f46915Oooo0o = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EditText editText, Integer num) {
        EditText view = editText;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(view, "view");
        if (iIntValue == 3) {
            String strOooO0oO = o00O0.OooO0oO(StringsKt.trim((CharSequence) view.getText().toString()).toString());
            if (o00O0.OooO0o0(strOooO0oO)) {
                this.f46915Oooo0o.OooOOo(strOooO0oO, true);
                o00000O.OooO00o(view, this.f46915Oooo0o.f24159OoooO);
            }
        }
        return Unit.INSTANCE;
    }
}
