package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function3<p400o0Oo0OO.OooOO0O<YallaTeamMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25950OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f25950OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(p400o0Oo0OO.OooOO0O<YallaTeamMessage> oooOO0O, View view, Integer num) {
        YallaTeamMessage data;
        p400o0Oo0OO.OooOO0O<YallaTeamMessage> adapter = oooOO0O;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25950OooO0Oo;
        com.yalla.yalla.ui.adapter.o00O00o0 o00o00o1 = yallaTeamMessageActivity.f25780OooOo0o;
        if (o00o00o1 == null || (data = o00o00o1.getData(iIntValue)) == null) {
            return Boolean.FALSE;
        }
        if (data.getType() == 1) {
            return Boolean.TRUE;
        }
        p157o00OoOO0.o00O0O o00o0o2 = new p157o00OoOO0.o00O0O(yallaTeamMessageActivity, null);
        MoreTag moreTag = MoreTag.copy;
        MoreModel item = new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = o00o0o2.f38233OooO0oo;
        arrayList.clear();
        arrayList.add(item);
        o00o0o2.f38231OooO.notifyDataSetChanged();
        o00o0o2.OooOOo0(new oo0OOoo(itemView, yallaTeamMessageActivity));
        o00o0o2.OooOO0o();
        return Boolean.TRUE;
    }
}
