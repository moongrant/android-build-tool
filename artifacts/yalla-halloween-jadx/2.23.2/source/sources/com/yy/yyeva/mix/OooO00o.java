package com.yy.yyeva.mix;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612o0oo0OoO.r5;
import p615o0oo0o0.o0OoOo0;
import p617o0oo0o0O.o0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEvaMixAnimPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EvaMixAnimPlugin.kt\ncom/yy/yyeva/mix/EvaMixAnimPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1855#2,2:231\n*S KotlinDebug\n*F\n+ 1 EvaMixAnimPlugin.kt\ncom/yy/yyeva/mix/EvaMixAnimPlugin\n*L\n63#1:225,2\n90#1:227,2\n145#1:229,2\n213#1:231,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final r5 f32424OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0OoOo0 f32425OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public OooO0o f32426OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f32427OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Object f32428OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f32429OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f32430OooO0oO;

    /* JADX INFO: renamed from: com.yy.yyeva.mix.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0376OooO00o extends Lambda implements Function0<o0O0o0> {
        public C0376OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0o0 invoke() {
            return new o0O0o0(OooO00o.this);
        }
    }

    public OooO00o(@NotNull r5 playerEva) {
        Intrinsics.checkNotNullParameter(playerEva, "playerEva");
        this.f32424OooO00o = playerEva;
        this.f32429OooO0o0 = LazyKt.lazy(new C0376OooO00o());
        this.f32428OooO0o = new Object();
    }
}
