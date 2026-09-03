package com.app.base.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Lambda implements Function2<String, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f12070Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(FacePanelView facePanelView) {
        super(2);
        this.f12070Oooo0o = facePanelView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Integer num) {
        String gifUrl = str;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        Function2<? super String, ? super Integer, Unit> function2 = this.f12070Oooo0o.f11961OoooO00;
        if (function2 != null) {
            function2.invoke(gifUrl, Integer.valueOf(iIntValue));
        }
        return Unit.INSTANCE;
    }
}
