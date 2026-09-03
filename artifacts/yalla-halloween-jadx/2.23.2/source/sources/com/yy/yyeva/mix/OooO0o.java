package com.yy.yyeva.mix;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p612o0oo0OoO.o5;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, EvaSrc> f32436OooO00o;

    public OooO0o(@NotNull ArrayList effects) {
        Intrinsics.checkNotNullParameter(effects, "effects");
        this.f32436OooO00o = new HashMap<>();
        int size = effects.size();
        for (int i = 0; i < size; i++) {
            EvaSrc evaSrc = new EvaSrc((o5.OooO0o) effects.get(i));
            if (evaSrc.f32415OooO0Oo != EvaSrc.SrcType.UNKNOWN) {
                this.f32436OooO00o.put(evaSrc.f32412OooO00o, evaSrc);
            }
        }
    }
}
