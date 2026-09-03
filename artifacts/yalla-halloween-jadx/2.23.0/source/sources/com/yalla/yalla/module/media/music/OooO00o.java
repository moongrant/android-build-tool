package com.yalla.yalla.module.media.music;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p575o0oOoOo.o0O0o00O;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f24548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0o00O f24549OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AppCompatActivity appCompatActivity, o0O0o00O o0o0o00o) {
        super(0);
        this.f24548OooO0Oo = appCompatActivity;
        this.f24549OooO0o0 = o0o0o00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicAddScreen.INSTANCE.scanMusic(this.f24548OooO0Oo, this.f24549OooO0o0);
        return Unit.INSTANCE;
    }
}
