package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f58891OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(MainRoomVM mainRoomVM) {
        super(0);
        this.f58891OooO0Oo = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = TaskActivity.f25083OooOooO;
            TaskActivity.OooO00o.OooO00o(activityOooO0O0, false);
        }
        oOo000o0.OooO0o0(this.f58891OooO0Oo);
        return Unit.INSTANCE;
    }
}
