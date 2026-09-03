package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.OooOo;
import java.util.Arrays;
import java.util.List;
import p176o00o0.o0OoOo0;
import p190o00o0O00.OooO;
import p191o00o0O0O.o000000;
import p290o0O0OoO.Oooo000;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0OoOo0 lambda$getComponents$0(OooO0OO oooO0OO) {
        o000000.OooO0O0((Context) oooO0OO.OooO00o(Context.class));
        return o000000.OooO00o().OooO0OO(OooO.f38857OooO0o0);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o0OoOo0.class);
        OooO00o2.f19801OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(OooOo.OooO0O0(Context.class));
        OooO00o2.f19805OooO0o = new Oooo000();
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o(LIBRARY_NAME, "18.1.8"));
    }
}
