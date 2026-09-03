package p509o0o0O0;

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
import p362o0OOo0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<NetImageView, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f51206OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BoxWithConstraintsScope f51207OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(MomentDetailModel momentDetailModel, BoxWithConstraintsScope boxWithConstraintsScope) {
        super(1);
        this.f51206OooO0Oo = momentDetailModel;
        this.f51207OooO0o0 = boxWithConstraintsScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(NetImageView netImageView) {
        NetImageView it = netImageView;
        Intrinsics.checkNotNullParameter(it, "it");
        it.setScaleType(ImageView.ScaleType.CENTER_CROP);
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(it.getContext());
        oooO00o.f43911OooO0OO = this.f51206OooO0Oo.getCoverPic();
        oooO00o.f43909OooO00o = 0;
        BoxWithConstraintsScope boxWithConstraintsScope = this.f51207OooO0o0;
        int iM3733getMaxWidthimpl = Constraints.m3733getMaxWidthimpl(boxWithConstraintsScope.mo414getConstraintsmsEJaDk());
        int iM3732getMaxHeightimpl = Constraints.m3732getMaxHeightimpl(boxWithConstraintsScope.mo414getConstraintsmsEJaDk());
        oooO00o.f43920OooOOO = o0000O0.OooO00o(iM3733getMaxWidthimpl);
        oooO00o.f43922OooOOOO = o0000O0.OooO00o(iM3732getMaxHeightimpl);
        oooO00o.f43936OooOoo0 = 2;
        oooO00o.OooO0Oo(it);
        return Unit.INSTANCE;
    }
}
