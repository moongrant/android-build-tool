package com.opensource.svgaplayer;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f21245OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f21246OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo000o f21247OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f21248OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO0OO oooO0OO, oo000o oo000oVar, OooO0OO.OooO0O0 oooO0O0, String str) {
        super(0);
        this.f21245OooO0Oo = oooO0OO;
        this.f21247OooO0o0 = oo000oVar;
        this.f21246OooO0o = oooO0O0;
        this.f21248OooO0oO = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter("SVGAVideoEntity prepare success", "msg");
        this.f21245OooO0Oo.getClass();
        OooO0OO.OooO0oO(this.f21246OooO0o, this.f21247OooO0o0, this.f21248OooO0oO);
        return Unit.INSTANCE;
    }
}
