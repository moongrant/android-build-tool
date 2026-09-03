package p566o0oOo00O;

import com.yalla.yalla.model.ItemVipModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOOOoo extends Lambda implements Function1<ItemVipModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ItemVipModel f45403Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(ItemVipModel itemVipModel) {
        super(1);
        this.f45403Oooo0o = itemVipModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ItemVipModel itemVipModel) {
        ItemVipModel itemKaVipModel = itemVipModel;
        Intrinsics.checkNotNullParameter(itemKaVipModel, "itemKaVipModel");
        if (this.f45403Oooo0o.getPrivilegeId() == itemKaVipModel.getPrivilegeId()) {
            ItemVipModel.INSTANCE.setShowRedDot(itemKaVipModel.getPrivilegeId(), new oO000OOo(itemKaVipModel));
        }
        return Unit.INSTANCE;
    }
}
