package p506o0o00oO0;

import com.yalla.yalla.common.model.ShareLogType;
import com.yalla.yalla.common.model.ShareModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O f41640Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41641Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f41642Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(o00O o00o2, ShareModel shareModel, String str) {
        super(0);
        this.f41640Oooo0o = o00o2;
        this.f41641Oooo0oO = shareModel;
        this.f41642Oooo0oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f41640Oooo0o.f41624OooO0O0.shareLog(this.f41641Oooo0oO.getType(), String.valueOf(this.f41642Oooo0oo), ShareLogType.Facebook);
        return Unit.INSTANCE;
    }
}
