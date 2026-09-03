package p561o0oOOooo;

import com.app.base.model.TakeMicModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000o0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TakeMicModel f44937Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44938Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(TakeMicModel takeMicModel, oOo000Oo ooo000oo) {
        super(0);
        this.f44937Oooo0o = takeMicModel;
        this.f44938Oooo0oO = ooo000oo;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        TakeMicModel takeMicModel = this.f44937Oooo0o;
        int i = takeMicModel.micorder;
        if (i <= 0) {
            return null;
        }
        String uid = takeMicModel.from.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "model.from.getUid()");
        this.f44938Oooo0oO.OooO(i - 1, uid, false, false);
        return null;
    }
}
