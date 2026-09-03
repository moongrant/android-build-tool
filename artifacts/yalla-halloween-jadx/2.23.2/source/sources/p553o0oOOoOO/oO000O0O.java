package p553o0oOOoOO;

import com.yalla.yalla.model.ItemVipModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000O0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<ItemVipModel, Unit> f56091OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ItemVipModel f56092OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oO000O0O(Function1<? super ItemVipModel, Unit> function1, ItemVipModel itemVipModel) {
        super(0);
        this.f56091OooO0Oo = function1;
        this.f56092OooO0o0 = itemVipModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f56091OooO0Oo.invoke(this.f56092OooO0o0);
        return Unit.INSTANCE;
    }
}
