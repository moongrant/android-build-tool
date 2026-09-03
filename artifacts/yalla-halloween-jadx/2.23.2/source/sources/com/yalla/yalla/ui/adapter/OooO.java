package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserTagView f26944OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(UserTagView userTagView) {
        super(1);
        this.f26944OooO0Oo = userTagView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f26944OooO0Oo.setName(str2);
        return null;
    }
}
