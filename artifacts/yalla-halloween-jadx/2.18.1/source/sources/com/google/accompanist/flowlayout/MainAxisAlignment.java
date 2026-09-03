package com.google.accompanist.flowlayout;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "Center", "Start", "End", "SpaceEvenly", "SpaceBetween", "SpaceAround", "flowlayout_release"}, k = 1, mv = {1, 7, 1})
public enum MainAxisAlignment {
    Center(o00O000.f2033OooO0o),
    Start(o00O000.f2032OooO0Oo),
    End(o00O000.f2034OooO0o0),
    SpaceEvenly(o00O000.f2035OooO0oO),
    SpaceBetween(o00O000.f2036OooO0oo),
    SpaceAround(o00O000.f2028OooO);


    @NotNull
    private final o00O000.OooOo arrangement;

    static {
        o00O000 o00o001 = o00O000.f2029OooO00o;
    }

    MainAxisAlignment(o00O000.OooOo oooOo) {
        this.arrangement = oooOo;
    }
}
