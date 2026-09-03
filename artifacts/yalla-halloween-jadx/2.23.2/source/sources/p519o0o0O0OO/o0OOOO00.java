package p519o0o0O0OO;

import android.widget.ImageView;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.ui.unit.Constraints;
import com.code.android.util.o0000O0;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.moment.MomentDetailModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p368o0OOo0Oo.Oooo000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function1<NetImageView, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BoxWithConstraintsScope f52552OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(MomentDetailModel momentDetailModel, BoxWithConstraintsScope boxWithConstraintsScope) {
        super(1);
        this.f52551OooO0Oo = momentDetailModel;
        this.f52552OooO0o0 = boxWithConstraintsScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetImageView netImageView) {
        NetImageView it = netImageView;
        Intrinsics.checkNotNullParameter(it, "it");
        it.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(it.getContext());
        oooO00o.f43126OooO0OO = this.f52551OooO0Oo.getCoverPic();
        oooO00o.f43124OooO00o = 0;
        BoxWithConstraintsScope boxWithConstraintsScope = this.f52552OooO0o0;
        int iM3743getMaxWidthimpl = Constraints.m3743getMaxWidthimpl(boxWithConstraintsScope.mo416getConstraintsmsEJaDk());
        int iM3742getMaxHeightimpl = Constraints.m3742getMaxHeightimpl(boxWithConstraintsScope.mo416getConstraintsmsEJaDk());
        oooO00o.f43135OooOOO = o0000O0.OooO00o(iM3743getMaxWidthimpl);
        oooO00o.f43137OooOOOO = o0000O0.OooO00o(iM3742getMaxHeightimpl);
        oooO00o.f43151OooOoo0 = 2;
        oooO00o.OooO0Oo(it);
        return Unit.INSTANCE;
    }
}
