package p648o0ooo;

import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareLogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000 f59741OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f59742OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShareContentModel f59743OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(o000000 o000000Var, ShareContentModel shareContentModel, String str) {
        super(0);
        this.f59741OooO0Oo = o000000Var;
        this.f59743OooO0o0 = shareContentModel;
        this.f59742OooO0o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f59741OooO0Oo.f59732OooO0O0.shareLog(this.f59743OooO0o0.getType(), String.valueOf(this.f59742OooO0o), ShareLogType.Twitter);
        return Unit.INSTANCE;
    }
}
