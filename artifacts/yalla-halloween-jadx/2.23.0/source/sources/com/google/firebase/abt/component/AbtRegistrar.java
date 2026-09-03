package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import java.util.Arrays;
import java.util.List;
import o0O0OO0O.OooO00o;
import p203o00o0o0o.o0O00o00;
import p314o0O0oOo0.o000O0Oo;
import p623o0ooO.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Oooo0 lambda$getComponents$0(OooO0OO oooO0OO) {
        return new Oooo0((Context) oooO0OO.OooO00o(Context.class), oooO0OO.OooO0o0(OooO00o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(Oooo0.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(OooOo.OooO0O0(Context.class));
        OooO00o2.OooO00o(OooOo.OooO00o(OooO00o.class));
        OooO00o2.f19805OooO0o = new o0O00o00();
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "21.1.1"));
    }
}
