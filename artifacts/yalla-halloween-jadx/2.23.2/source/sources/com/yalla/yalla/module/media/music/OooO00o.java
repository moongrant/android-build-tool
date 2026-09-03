package com.yalla.yalla.module.media.music;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p584o0oOoo0O.oo0o0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f24084OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo0o0O0 f24085OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AppCompatActivity appCompatActivity, oo0o0O0 oo0o0o0) {
        super(0);
        this.f24084OooO0Oo = appCompatActivity;
        this.f24085OooO0o0 = oo0o0o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MusicAddScreen.INSTANCE.scanMusic(this.f24084OooO0Oo, this.f24085OooO0o0);
        return Unit.INSTANCE;
    }
}
