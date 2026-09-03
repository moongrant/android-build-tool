package p566o0oOo00O;

import com.yalla.yalla.model.ItemVipModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000OOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ItemVipModel f45364Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000OOo(ItemVipModel itemVipModel) {
        super(0);
        this.f45364Oooo0o = itemVipModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f45364Oooo0o.getLocalShowRedDot().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
