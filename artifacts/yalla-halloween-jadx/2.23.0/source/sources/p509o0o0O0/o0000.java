package p509o0o0O0;

import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p515o0o0O0O0.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f50411OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f50412OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f50413OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(int i, MomentDetailModel momentDetailModel, o0Oo0oo o0oo0oo2) {
        super(1);
        this.f50411OooO0Oo = momentDetailModel;
        this.f50413OooO0o0 = o0oo0oo2;
        this.f50412OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        o0Oo0oo o0oo0oo2;
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentDetailModel momentDetailModel = this.f50411OooO0Oo;
        if (momentDetailModel.getType() != MomentType.Video.getValue() && (o0oo0oo2 = this.f50413OooO0o0) != null) {
            o0oo0oo2.OooO0OO(this.f50412OooO0o, it, momentDetailModel);
        }
        return Unit.INSTANCE;
    }
}
