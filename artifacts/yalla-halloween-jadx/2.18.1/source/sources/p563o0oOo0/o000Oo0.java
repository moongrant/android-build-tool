package p563o0oOo0;

import android.view.View;
import com.app.base.adapter.roomMemberManager.RoomMemberManagerTag;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0o;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45059Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f45060OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f45061OoooO00;

    public o000Oo0(o000OO00 o000oo01, RoomUserInfoModel roomUserInfoModel, OooO0o oooO0o) {
        this.f45059Oooo = o000oo01;
        this.f45061OoooO00 = roomUserInfoModel;
        this.f45060OoooO0 = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Function3<? super RoomUserInfoModel, ? super Integer, ? super RoomMemberManagerTag, Unit> function3 = this.f45059Oooo.f45052OooO00o;
        if (function3 != null) {
            function3.invoke(this.f45061OoooO00, Integer.valueOf(this.f45060OoooO0.getLayoutPosition()), RoomMemberManagerTag.detail);
        }
    }
}
