package p560o0oOOooO;

import android.view.View;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p391o0OOooOo.o0O00000;
import p530o0o0OOO.o00OO00O;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOO extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ RoomUserInfoModel f44884Oooo;

    public oO00OOO(RoomUserInfoModel roomUserInfoModel) {
        this.f44884Oooo = roomUserInfoModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0O00000.OooO0OO("InRoom_enter_hint");
        if (this.f44884Oooo.getIsUnLoginUser()) {
            return;
        }
        o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(this.f44884Oooo);
    }
}
