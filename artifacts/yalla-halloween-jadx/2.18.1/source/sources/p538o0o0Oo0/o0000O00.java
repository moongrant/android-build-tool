package p538o0o0Oo0;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p464o0Ooo0oO.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 extends Lambda implements Function3<o0000O0O<MomentMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f43916Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(MomentMessageListActivity momentMessageListActivity) {
        super(3);
        this.f43916Oooo0o = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(o0000O0O<MomentMessage> o0000o0o2, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(o0000o0o2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        oo0oOO0 oo0ooo0 = new oo0oOO0(this.f43916Oooo0o);
        MomentMessageListActivity momentMessageListActivity = this.f43916Oooo0o;
        oo0ooo0.OooOo0(R.string.art_you_sure);
        oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.delete));
        oo0ooo0.OooOo0o(new o0000(momentMessageListActivity, iIntValue));
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOOO0();
        return Boolean.TRUE;
    }
}
