package p501o0o00o;

import com.yalla.yalla.model.DialogLinkFrom;
import com.yalla.yalla.model.DialogLinkItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends Lambda implements Function2<DialogLinkItem, Map<DialogLinkFrom, Boolean>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41467Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o000 o000Var) {
        super(2);
        this.f41467Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(DialogLinkItem dialogLinkItem, Map<DialogLinkFrom, Boolean> map) {
        DialogLinkItem item = dialogLinkItem;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(map, "<anonymous parameter 1>");
        if (item.containsAndValue(DialogLinkFrom.ReceiveCrystalDialogFromGiftSendDialog)) {
            item.clear();
            this.f41467Oooo0o.OooOoOO(false);
        }
        return Unit.INSTANCE;
    }
}
