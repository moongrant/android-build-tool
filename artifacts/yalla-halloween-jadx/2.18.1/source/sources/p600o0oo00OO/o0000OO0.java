package p600o0oo00OO;

import com.app.base.model.UserHeadFrameModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000OO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f48025Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function3<UserHeadFrameModel, Integer, Boolean, Unit> f48026Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ UserHeadFrameModel f48027Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f48028Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000OO0(Function3<? super UserHeadFrameModel, ? super Integer, ? super Boolean, Unit> function3, UserHeadFrameModel userHeadFrameModel, int i, boolean z) {
        super(0);
        this.f48026Oooo0o = function3;
        this.f48027Oooo0oO = userHeadFrameModel;
        this.f48028Oooo0oo = i;
        this.f48025Oooo = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f48026Oooo0o.invoke(this.f48027Oooo0oO, Integer.valueOf(this.f48028Oooo0oo), Boolean.valueOf(this.f48025Oooo));
        return Unit.INSTANCE;
    }
}
