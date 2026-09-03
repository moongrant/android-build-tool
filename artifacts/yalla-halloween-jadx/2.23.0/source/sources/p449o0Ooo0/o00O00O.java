package p449o0Ooo0;

import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p528o0o0OOOo.oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46421OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o000OO00 o000oo01) {
        super(1);
        this.f46421OooO0Oo = o000oo01;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        List list;
        int iIndexOf;
        if (bool.booleanValue()) {
            boolean z = oOO0.f54098OooO00o;
            List list2 = (List) MusicState.OooO00o().getValue();
            if (list2 != null) {
                MusicTable value = MusicState.f22835OooO00o.getValue();
                MusicTable musicTable = (value != null && (list = (List) MusicState.OooO00o().getValue()) != null && (iIndexOf = list.indexOf(value)) > 0 && iIndexOf <= list.size() + (-1)) ? (MusicTable) list.get(iIndexOf - 1) : null;
                if (musicTable == null) {
                    musicTable = (MusicTable) list2.get(list2.size() - 1);
                }
                if (musicTable != null) {
                    oOO0.OooO0o(musicTable, 2);
                }
            }
            this.f46421OooO0Oo.OooOO0();
        }
        return Unit.INSTANCE;
    }
}
