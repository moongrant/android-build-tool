package p492o0o00OO0;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function3<h3<MomentMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f49158OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(MomentMessageListActivity momentMessageListActivity) {
        super(3);
        this.f49158OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(h3<MomentMessage> h3Var, View view, Integer num) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(h3Var, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 1>");
        MomentMessageListActivity momentMessageListActivity = this.f49158OooO0Oo;
        o000O o000o = new o000O(momentMessageListActivity);
        o000o.OooOOoo(o000000.art_you_sure);
        o000o.OooOOOo(o0000.OooO0OO(o000000.delete));
        o000o.OooOo0(new oOO00O(momentMessageListActivity, iIntValue));
        o000o.OooOo(true);
        o000o.OooOO0o();
        return Boolean.TRUE;
    }
}
