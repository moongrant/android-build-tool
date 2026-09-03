package com.yalla.yalla.ui.fragment;

import com.yalla.yalla.common.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserTagView f24526Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(UserTagView userTagView) {
        super(1);
        this.f24526Oooo0o = userTagView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        UserTagView userTagView = this.f24526Oooo0o;
        if (str2 == null) {
            str2 = "";
        }
        userTagView.setName(str2);
        return null;
    }
}
