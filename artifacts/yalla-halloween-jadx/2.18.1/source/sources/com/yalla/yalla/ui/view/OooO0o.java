package com.yalla.yalla.ui.view;

import com.yalla.yalla.common.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserTagView f25038Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(UserTagView userTagView) {
        super(1);
        this.f25038Oooo0o = userTagView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        this.f25038Oooo0o.setName(str2);
        return null;
    }
}
