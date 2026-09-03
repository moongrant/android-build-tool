package com.opensource.svgaplayer;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f20772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f20773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f20774OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f20775OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0OO oooO0OO, o00Ooo o00ooo2, OooO0OO.OooO0O0 oooO0O0, String str) {
        super(0);
        this.f20772OooO0Oo = oooO0OO;
        this.f20774OooO0o0 = o00ooo2;
        this.f20773OooO0o = oooO0O0;
        this.f20775OooO0oO = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("SVGAVideoEntity prepare success", "msg");
        this.f20772OooO0Oo.getClass();
        OooO0OO.OooO0oO(this.f20773OooO0o, this.f20774OooO0o0, this.f20775OooO0oO);
        return Unit.INSTANCE;
    }
}
