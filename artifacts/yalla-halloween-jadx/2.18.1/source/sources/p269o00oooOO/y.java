package p269o00oooOO;

import com.tencent.mars.xlog.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final y f34957Oooo0o = new y();

    public y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Log.appenderFlushSync(true);
        return Unit.INSTANCE;
    }
}
