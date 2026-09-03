package p485o0o00O0;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p157o00OoOO0.o0OO00O;
import p400o0Oo0OO.OooOO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function3<OooOO0O<MomentMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f47838OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(MomentMessageListActivity momentMessageListActivity) {
        super(3);
        this.f47838OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(OooOO0O<MomentMessage> oooOO0O, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(oooOO0O, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        MomentMessageListActivity momentMessageListActivity = this.f47838OooO0Oo;
        o0OO00O o0oo00o2 = new o0OO00O(momentMessageListActivity);
        o0oo00o2.OooOOoo(oO00OOo0.art_you_sure);
        o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.delete));
        o0oo00o2.OooOo0(new o00O00OO(momentMessageListActivity, iIntValue));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOO0o();
        return Boolean.TRUE;
    }
}
