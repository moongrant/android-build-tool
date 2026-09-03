package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O00O;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TaskViewModel f59070OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f59071OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooooO000(TaskViewModel taskViewModel, MainRoomVM mainRoomVM) {
        super(0);
        this.f59070OooO0Oo = taskViewModel;
        this.f59071OooO0o0 = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            this.f59070OooO0Oo.getRoomInfoFromTaskEnter().observe(fragmentActivity, new o000oOoO(oOO00O0.f58938OooO0Oo, null, new oOO00OO(this.f59071OooO0o0), false, 10));
        }
        return Unit.INSTANCE;
    }
}
