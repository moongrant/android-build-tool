package p526o0o0OO0O;

import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareLogType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O00O f53301OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ String f53302OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ShareContentModel f53303OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(o000O00O o000o00o2, ShareContentModel shareContentModel, String str) {
        super(0);
        this.f53301OooO0Oo = o000o00o2;
        this.f53303OooO0o0 = shareContentModel;
        this.f53302OooO0o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f53301OooO0Oo.f53307OooO0O0.shareLog(this.f53303OooO0o0.getType(), String.valueOf(this.f53302OooO0o), ShareLogType.Twitter);
        return Unit.INSTANCE;
    }
}
