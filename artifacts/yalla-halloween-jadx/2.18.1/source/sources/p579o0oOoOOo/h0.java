package p579o0oOoOOo;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.model.VoteRankModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00O000;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteRankModel f45959Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(VoteRankModel voteRankModel) {
        super(1);
        this.f45959Oooo0o = voteRankModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        o00O000.OooO().OooO0oo(this.f45959Oooo0o.getUserId());
        return Unit.INSTANCE;
    }
}
