package p582o0oOoOoO;

import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46845Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(0);
        this.f46845Oooo0o = roomMemberConveneListDialog;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Long, com.yalla.yalla.model.RoomUserInfoModel>] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        RoomMemberConveneListDialog roomMemberConveneListDialog = this.f46845Oooo0o;
        Objects.requireNonNull(roomMemberConveneListDialog);
        ArrayList arrayList = new ArrayList();
        Iterator it = roomMemberConveneListDialog.f24162OoooOOo.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
        }
        roomMemberConveneListDialog.OooOOOO().conveneBarMember(roomMemberConveneListDialog.f24161OoooOOO, arrayList).observe(roomMemberConveneListDialog.f24159OoooO, new OooOo(new s2(roomMemberConveneListDialog), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
