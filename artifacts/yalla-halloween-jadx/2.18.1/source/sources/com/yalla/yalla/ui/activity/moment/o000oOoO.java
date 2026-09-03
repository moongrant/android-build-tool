package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.common.ui.view.UserTagView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserTagView f22724Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(UserTagView userTagView) {
        super(1);
        this.f22724Oooo0o = userTagView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        this.f22724Oooo0o.setName(str2);
        return null;
    }
}
