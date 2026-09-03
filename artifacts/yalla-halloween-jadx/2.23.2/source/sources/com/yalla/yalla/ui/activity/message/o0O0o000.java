package com.yalla.yalla.ui.activity.message;

import android.view.View;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p643o0ooOOOO.h3;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o000 extends Lambda implements Function3<h3<YallaTeamMessage>, View, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25508OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o000(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(3);
        this.f25508OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(h3<YallaTeamMessage> h3Var, View view, Integer num) {
        YallaTeamMessage data;
        h3<YallaTeamMessage> adapter = h3Var;
        View itemView = view;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25508OooO0Oo;
        com.yalla.yalla.ui.adapter.o00O0O00 o00o0o01 = yallaTeamMessageActivity.f25325OooOo0o;
        if (o00o0o01 == null || (data = o00o0o01.getData(iIntValue)) == null) {
            return Boolean.FALSE;
        }
        if (data.getType() == 1) {
            return Boolean.TRUE;
        }
        p205o00o0o0o.o000O0o o000o0o2 = new p205o00o0o0o.o000O0o(yallaTeamMessageActivity, null);
        MoreTag moreTag = MoreTag.copy;
        MoreModel item = new MoreModel(com.code.android.util.o0000.OooO0OO(moreTag.getText()), moreTag);
        Intrinsics.checkNotNullParameter(item, "item");
        ArrayList arrayList = o000o0o2.f39375OooO0oo;
        arrayList.clear();
        arrayList.add(item);
        o000o0o2.f39373OooO.notifyDataSetChanged();
        o000o0o2.OooOOo0(new oo0OOoo(itemView, yallaTeamMessageActivity));
        o000o0o2.OooOO0o();
        return Boolean.TRUE;
    }
}
