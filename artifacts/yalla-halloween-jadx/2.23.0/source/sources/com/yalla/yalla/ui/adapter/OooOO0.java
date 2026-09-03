package com.yalla.yalla.ui.adapter;

import android.widget.TextView;
import com.yalla.yalla.data.db.table.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TextView f27417OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Conversation f27418OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(TextView textView, Conversation conversation) {
        super(1);
        this.f27417OooO0Oo = textView;
        this.f27418OooO0o0 = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        this.f27417OooO0Oo.setText(this.f27418OooO0o0.getIsAcceptMsg() ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.recommend_room_to_you), str2) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.recommend_room_from_you), str2));
        return null;
    }
}
