package com.google.firebase;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.Oooo000;
import com.common.support.apm.Constants;
import com.facebook.o000oOoO;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import p198o00o0OoO.o00O0;
import p198o00o0OoO.o00O0O00;
import p281o0O0O0oO.OooOO0;
import p297o0O0o00.o0Oo0oo;
import p297o0O0o00.o0ooOOo;
import p314o0O0oOo0.o000O00O;
import p314o0O0oOo0.o000O0Oo;
import p314o0O0oOo0.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String OooO00o(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<OooO0O0<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o000OO0O.class);
        OooO00o2.OooO00o(new OooOo(2, 0, o000O00O.class));
        OooO00o2.f19805OooO0o = new o000oOoO();
        arrayList.add(OooO00o2.OooO0O0());
        final Qualified qualified = new Qualified(Background.class, Executor.class);
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(OooO00o.class, new Class[]{o0Oo0oo.class, HeartBeatInfo.class});
        oooO00o.OooO00o(OooOo.OooO0O0(Context.class));
        oooO00o.OooO00o(OooOo.OooO0O0(OooOO0.class));
        oooO00o.OooO00o(new OooOo(2, 0, o0ooOOo.class));
        oooO00o.OooO00o(new OooOo(1, 1, o000OO0O.class));
        oooO00o.OooO00o(new OooOo((Qualified<?>) qualified, 1, 0));
        oooO00o.f19805OooO0o = new OooO() { // from class: o0O0o00.oo000o
            @Override // com.google.firebase.components.OooO
            public final Object OooO0OO(com.google.firebase.components.oo000o oo000oVar) {
                return new OooO00o((Context) oo000oVar.OooO00o(Context.class), ((OooOO0) oo000oVar.OooO00o(OooOO0.class)).OooO0Oo(), oo000oVar.OooO0oo(o0ooOOo.class), oo000oVar.OooO0o0(o000OO0O.class), (Executor) oo000oVar.OooO0Oo(qualified));
            }
        };
        arrayList.add(oooO00o.OooO0O0());
        arrayList.add(o000O0Oo.OooO00o("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o000O0Oo.OooO00o("fire-core", "20.3.3"));
        arrayList.add(o000O0Oo.OooO00o("device-name", OooO00o(Build.PRODUCT)));
        arrayList.add(o000O0Oo.OooO00o("device-model", OooO00o(Build.DEVICE)));
        arrayList.add(o000O0Oo.OooO00o("device-brand", OooO00o(Build.BRAND)));
        arrayList.add(o000O0Oo.OooO0O0("android-target-sdk", new o00O0()));
        arrayList.add(o000O0Oo.OooO0O0("android-min-sdk", new o00O0O00()));
        arrayList.add(o000O0Oo.OooO0O0("android-platform", new androidx.compose.animation.OooOo()));
        arrayList.add(o000O0Oo.OooO0O0("android-installer", new Oooo000()));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(o000O0Oo.OooO00o(Constants.SDK_LANGUAGE, string));
        }
        return arrayList;
    }
}
