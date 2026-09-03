package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.Oooo000;
import java.util.Arrays;
import java.util.List;
import o0O0OO0O.OooO00o;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OooO00o lambda$getComponents$0(OooO0OO oooO0OO) {
        return new OooO00o((Context) oooO0OO.OooO00o(Context.class), oooO0OO.OooO0o0(o0O0OOO0.OooO00o.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooO00o.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(Oooo000.OooO0O0(Context.class));
        OooO00o2.OooO00o(Oooo000.OooO00o(o0O0OOO0.OooO00o.class));
        OooO00o2.f19331OooO0o = new o0O0OO0O.OooO0O0();
        return Arrays.asList(OooO00o2.OooO0O0(), o000OO.OooO00o(LIBRARY_NAME, "21.1.1"));
    }
}
