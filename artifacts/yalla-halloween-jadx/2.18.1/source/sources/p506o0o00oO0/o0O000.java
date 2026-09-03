package p506o0o00oO0;

import com.yalla.yalla.common.model.ShareLogType;
import com.yalla.yalla.common.model.ShareModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f41657Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ShareModel f41658Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f41659Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(o0O0000O o0o0000o2, ShareModel shareModel, String str) {
        super(0);
        this.f41657Oooo0o = o0o0000o2;
        this.f41658Oooo0oO = shareModel;
        this.f41659Oooo0oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f41657Oooo0o.f41662OooO0O0.shareLog(this.f41658Oooo0oO.getType(), String.valueOf(this.f41659Oooo0oo), ShareLogType.WhatsApp);
        return Unit.INSTANCE;
    }
}
