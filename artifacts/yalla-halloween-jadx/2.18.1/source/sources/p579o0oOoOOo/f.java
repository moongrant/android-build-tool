package p579o0oOoOOo;

import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ b f45952Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar) {
        super(1);
        this.f45952Oooo0o = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        List list;
        int iIndexOf;
        if (bool.booleanValue()) {
            o00 o00Var = o00.f48461OooO00o;
            MusicState musicState = MusicState.f21402OooO00o;
            List list2 = (List) MusicState.OooO00o().getValue();
            if (list2 != null) {
                MusicTable value = MusicState.f21403OooO0O0.getValue();
                MusicTable musicTable = null;
                if (value != null && (list = (List) MusicState.OooO00o().getValue()) != null && (iIndexOf = list.indexOf(value)) > 0 && iIndexOf <= list.size() - 1) {
                    musicTable = (MusicTable) list.get(iIndexOf - 1);
                }
                if (musicTable == null) {
                    musicTable = (MusicTable) list2.get(list2.size() - 1);
                }
                if (musicTable != null) {
                    o00Var.OooO0Oo(musicTable);
                }
            }
            this.f45952Oooo0o.OooOO0o();
        }
        return Unit.INSTANCE;
    }
}
