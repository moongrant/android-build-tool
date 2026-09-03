package p519o0o0O0OO;

import androidx.compose.ui.layout.LayoutCoordinates;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p521o0o0O0o0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailModel f52091OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f52092OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO f52093OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(int i, MomentDetailModel momentDetailModel, o000OO o000oo2) {
        super(1);
        this.f52091OooO0Oo = momentDetailModel;
        this.f52093OooO0o0 = o000oo2;
        this.f52092OooO0o = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        o000OO o000oo2;
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentDetailModel momentDetailModel = this.f52091OooO0Oo;
        if (momentDetailModel.getType() != MomentType.Video.getValue() && (o000oo2 = this.f52093OooO0o0) != null) {
            o000oo2.OooO0OO(this.f52092OooO0o, it, momentDetailModel);
        }
        return Unit.INSTANCE;
    }
}
