package p582o0oOoOoO;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O0O0O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46926Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(0);
        this.f46926Oooo0o = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f46926Oooo0o.f24159OoooO);
        RoomMemberConveneListDialog roomMemberConveneListDialog = this.f46926Oooo0o;
        oo0ooo0.OooOoo(R.string.room_member_convene_dialog_title);
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('\n');
        sbOooO00o.append(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_member_convene_info_content_1_xxx1_xxx2), String.valueOf(RoomMemberConveneListDialog.OooOO0O(roomMemberConveneListDialog)), String.valueOf(((Number) roomMemberConveneListDialog.f24172Oooooo0.getValue()).intValue())));
        stringBuffer.append(sbOooO00o.toString());
        stringBuffer.append('\n' + o000O0O0.OooO0OO(R.string.room_member_convene_info_content_2));
        stringBuffer.append('\n' + o000O0O0.OooO0OO(R.string.room_member_convene_info_content_3));
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "this.toString()");
        oo0ooo0.OooOo0O(string);
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
