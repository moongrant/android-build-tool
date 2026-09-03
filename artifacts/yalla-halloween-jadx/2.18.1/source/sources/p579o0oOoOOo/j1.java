package p579o0oOoOOo;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxOpenDialog f45986Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(TreasureBoxOpenDialog treasureBoxOpenDialog) {
        super(0);
        this.f45986Oooo0o = treasureBoxOpenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TreasureBoxOpenDialog treasureBoxOpenDialog = this.f45986Oooo0o;
        LinearLayoutCompat linearLayoutCompat = treasureBoxOpenDialog.f23794OoooOO0.f50324OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.vCountdown");
        oOO00O.OooO00o(linearLayoutCompat);
        LinearLayoutCompat linearLayoutCompat2 = treasureBoxOpenDialog.f23794OoooOO0.f50325OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.vAward");
        oOO00O.OooO(linearLayoutCompat2);
        Job job = treasureBoxOpenDialog.f23795OoooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        treasureBoxOpenDialog.f41544Oooo0oO.setCancelable(true);
        treasureBoxOpenDialog.f23795OoooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(treasureBoxOpenDialog.f23793OoooO), null, null, new k1(treasureBoxOpenDialog, null), 3, null);
        return Unit.INSTANCE;
    }
}
