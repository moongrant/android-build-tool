package p519o0o0O0oO;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import p641o0ooOOOO.f8;

/* JADX INFO: loaded from: classes4.dex */
public final class j4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxOpenDialog f52380OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(TreasureBoxOpenDialog treasureBoxOpenDialog) {
        super(0);
        this.f52380OooO0Oo = treasureBoxOpenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TreasureBoxOpenDialog treasureBoxOpenDialog = this.f52380OooO0Oo;
        f8 f8Var = treasureBoxOpenDialog.f27973OooOO0o;
        LinearLayoutCompat linearLayoutCompat = f8Var.f57935OooOOO;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "binding.vCountdown");
        o000OO00.OooO0O0(linearLayoutCompat);
        LinearLayoutCompat linearLayoutCompat2 = f8Var.f57936OooOOO0;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "binding.vAward");
        o000OO00.OooOOOO(linearLayoutCompat2);
        Job job = treasureBoxOpenDialog.f27974OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        treasureBoxOpenDialog.f52534OooO0o0.setCancelable(true);
        treasureBoxOpenDialog.f27974OooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(treasureBoxOpenDialog.f27972OooOO0O), null, null, new k4(treasureBoxOpenDialog, null), 3, null);
        return Unit.INSTANCE;
    }
}
