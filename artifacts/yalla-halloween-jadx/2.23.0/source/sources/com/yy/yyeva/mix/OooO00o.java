package com.yy.yyeva.mix;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607o0oo0OOo.m1;
import p610o0oo0Ooo.r1;
import p613o0oo0o00.OooOOO;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nEvaMixAnimPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaMixAnimPlugin.kt\ncom/yy/yyeva/mix/EvaMixAnimPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n*S KotlinDebug\n*F\n+ 1 EvaMixAnimPlugin.kt\ncom/yy/yyeva/mix/EvaMixAnimPlugin\n*L\n63#1:225,2\n90#1:227,2\n145#1:229,2\n213#1:231,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final m1 f32959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public r1 f32960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0o f32961OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f32962OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Object f32963OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f32964OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f32965OooO0oO;

    /* JADX INFO: renamed from: com.yy.yyeva.mix.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0377OooO00o extends Lambda implements Function0<OooOOO> {
        public C0377OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOOO invoke() {
            return new OooOOO(OooO00o.this);
        }
    }

    public OooO00o(@NotNull m1 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f32959OooO00o = playerEva;
        this.f32964OooO0o0 = LazyKt.lazy(new C0377OooO00o());
        this.f32963OooO0o = new Object();
    }
}
