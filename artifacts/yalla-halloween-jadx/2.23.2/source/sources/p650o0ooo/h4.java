package p650o0ooo;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o000O;
import com.yalla.yalla.ui.dialog.TreasureBoxOpenDialog;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import p405o0Oo0OOO.t;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TreasureBoxOpenDialog f58267OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(TreasureBoxOpenDialog treasureBoxOpenDialog) {
        super(0);
        this.f58267OooO0Oo = treasureBoxOpenDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        TreasureBoxOpenDialog treasureBoxOpenDialog = this.f58267OooO0Oo;
        t tVar = treasureBoxOpenDialog.f27510OooOO0o;
        LinearLayoutCompat vCountdown = tVar.f45540OooOOO;
        Intrinsics.checkNotNullExpressionValue(vCountdown, "vCountdown");
        o000O.OooO0O0(vCountdown);
        LinearLayoutCompat vAward = tVar.f45541OooOOO0;
        Intrinsics.checkNotNullExpressionValue(vAward, "vAward");
        o000O.OooOOOO(vAward);
        Job job = treasureBoxOpenDialog.f27511OooOOO;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        treasureBoxOpenDialog.f58509OooO0o0.setCancelable(true);
        treasureBoxOpenDialog.f27511OooOOO = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(treasureBoxOpenDialog.f27509OooOO0O), null, null, new i4(treasureBoxOpenDialog, null), 3, null);
        return Unit.INSTANCE;
    }
}
