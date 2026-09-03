package com.yalla.yalla.ui.adapter;

import android.widget.TextView;
import com.yalla.yalla.data.db.table.Conversation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TextView f27427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Conversation f27428OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(TextView textView, Conversation conversation) {
        super(1);
        this.f27427OooO0Oo = textView;
        this.f27428OooO0o0 = conversation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        this.f27427OooO0Oo.setText(this.f27428OooO0o0.getIsAcceptMsg() ? com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_xx_get_you_theme), str2) : com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.message_you_get_xx_theme), str2));
        return null;
    }
}
