package com.opensource.svgaplayer;

import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends Lambda implements Function1<InputStream, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f20776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f20777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f20778OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f20779OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO00o oooO00o, OooO0OO oooO0OO, String str, String str2) {
        super(1);
        this.f20776OooO0Oo = oooO0OO;
        this.f20778OooO0o0 = str;
        this.f20777OooO0o = oooO00o;
        this.f20779OooO0oO = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InputStream inputStream) {
        InputStream it = inputStream;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f20776OooO0Oo.OooO0OO(it, this.f20778OooO0o0, this.f20777OooO0o, false, this.f20779OooO0oO);
        return Unit.INSTANCE;
    }
}
