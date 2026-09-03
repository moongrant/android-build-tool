package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooO0OO;
import com.google.firebase.components.Oooo000;
import java.util.Arrays;
import java.util.List;
import p233o00oOoOO.o0OoO00O;
import p234o00oOoOo.o0O00O;
import p238o00oOooo.o0OOooO0;
import p296o0O0Ooo0.OooOo;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o0OoO00O lambda$getComponents$0(OooO0OO oooO0OO) {
        o0OOooO0.OooO0O0((Context) oooO0OO.OooO00o(Context.class));
        return o0OOooO0.OooO00o().OooO0OO(o0O00O.f39908OooO0o0);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o0OoO00O.class);
        OooO00o2.f19327OooO00o = LIBRARY_NAME;
        OooO00o2.OooO00o(Oooo000.OooO0O0(Context.class));
        OooO00o2.f19331OooO0o = new OooOo();
        return Arrays.asList(OooO00o2.OooO0O0(), o000OO.OooO00o(LIBRARY_NAME, "18.1.8"));
    }
}
