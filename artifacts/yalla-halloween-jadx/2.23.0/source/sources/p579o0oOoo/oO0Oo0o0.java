package p579o0oOoo;

import com.yalla.yalla.model.moment.MomentSendModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo0o0 extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f56614OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo0o0(MomentSendModel momentSendModel) {
        super(2);
        this.f56614OooO0Oo = momentSendModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String urlName = str;
        String sizes = str2;
        Intrinsics.checkNotNullParameter(urlName, "urlName");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        MomentSendModel momentSendModel = this.f56614OooO0Oo;
        momentSendModel.setEditPicUrlName(urlName);
        momentSendModel.setEditPicSizes(sizes);
        return Unit.INSTANCE;
    }
}
