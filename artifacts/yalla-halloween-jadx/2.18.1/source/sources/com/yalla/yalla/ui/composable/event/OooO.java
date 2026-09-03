package com.yalla.yalla.ui.composable.event;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p584o0oOoo.o000O;
import p591o0oOooOo.d5;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O.OooO00o f23718Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f23719Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(o00000O.OooO00o oooO00o, String str) {
        super(1);
        this.f23718Oooo0o = oooO00o;
        this.f23719Oooo0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        if (((o00000O.OooO00o.OooO0O0) CollectionsKt.firstOrNull((List) this.f23718Oooo0o.OooO00o(this.f23719Oooo0oO, iIntValue, iIntValue))) != null) {
            o000O.OooO00o(d5.f47212OooO00o, null);
        }
        return Unit.INSTANCE;
    }
}
