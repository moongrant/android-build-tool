package p536o0o0OOoo;

import android.view.View;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import java.util.Objects;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p255o00ooO0o.o00O0;
import p464o0Ooo0oO.o0000O0O;
import p563o0oOo0.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 extends Lambda implements Function3<o0000O0O<YallaTeamMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43853Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f43853Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o0000O0O<YallaTeamMessage> o0000o0o2, View view, Integer num) {
        YallaTeamMessage data;
        o0000O0O<YallaTeamMessage> adapter = o0000o0o2;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        oOO00O ooo00o = this.f43853Oooo0o.f22256OooooOO;
        if (ooo00o == null || (data = ooo00o.getData(iIntValue)) == null) {
            return Boolean.FALSE;
        }
        if (data.getType() == 1) {
            return Boolean.TRUE;
        }
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43853Oooo0o;
        Objects.requireNonNull(yallaTeamMessageActivity);
        o00O0 o00o1 = new o00O0(yallaTeamMessageActivity);
        MoreTag moreTag = MoreTag.copy;
        o00o1.OooOOOo(new MoreModel(OooOOO.OooO0OO(moreTag.getText()), moreTag));
        o00o1.OooOOoo(new p2(itemView, this.f43853Oooo0o));
        o00o1.OooOOO0();
        return Boolean.TRUE;
    }
}
