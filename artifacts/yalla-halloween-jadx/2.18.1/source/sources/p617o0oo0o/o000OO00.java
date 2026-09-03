package p617o0oo0o;

import com.yalla.yalla.model.MomentSendModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends Lambda implements Function2<String, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendModel f48527Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MomentSendModel momentSendModel) {
        super(2);
        this.f48527Oooo0o = momentSendModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        String urlName = str;
        String sizes = str2;
        Intrinsics.checkNotNullParameter(urlName, "urlName");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        this.f48527Oooo0o.setEditPicUrlName(urlName);
        this.f48527Oooo0o.setEditPicSizes(sizes);
        return Unit.INSTANCE;
    }
}
