package p471o0OoooO0;

import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p535o0o0Oo0.oO0O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O000Oo f47885OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(o0O000Oo o0o000oo2) {
        super(1);
        this.f47885OooO0Oo = o0o000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        List list;
        int iIndexOf;
        if (bool.booleanValue()) {
            boolean z = oO0O00.f53970OooO00o;
            List list2 = (List) MusicState.OooO00o().getValue();
            if (list2 != null) {
                MusicTable value = MusicState.f22362OooO00o.getValue();
                MusicTable musicTable = (value != null && (list = (List) MusicState.OooO00o().getValue()) != null && (iIndexOf = list.indexOf(value)) > 0 && iIndexOf <= list.size() + (-1)) ? (MusicTable) list.get(iIndexOf - 1) : null;
                if (musicTable == null) {
                    musicTable = (MusicTable) list2.get(list2.size() - 1);
                }
                if (musicTable != null) {
                    oO0O00.OooO0o(musicTable, 2);
                }
            }
            this.f47885OooO0Oo.OooOO0();
        }
        return Unit.INSTANCE;
    }
}
