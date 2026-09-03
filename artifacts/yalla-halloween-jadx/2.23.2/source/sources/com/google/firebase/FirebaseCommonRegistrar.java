package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.common.support.apm.Constants;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.Oooo000;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.o00oO0o;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import o000Oo0.OooO0OO;
import p102o000oo0.o00Ooo;
import p300o0O0o00o.OooOOOO;
import p300o0O0o00o.OooOo;
import p315o0O0oOo.o0000O;
import p315o0O0oOo.o0000O0;
import p315o0O0oOo.o000OO;
import p626o0ooO.o0OO00O;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String OooO00o(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<OooO0O0<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o0000O.class);
        OooO00o2.OooO00o(new Oooo000(2, 0, o0000O0.class));
        OooO00o2.f19331OooO0o = new androidx.compose.compiler.plugins.kotlin.lower.OooO0O0();
        arrayList.add(OooO00o2.OooO0O0());
        final Qualified qualified = new Qualified(Background.class, Executor.class);
        OooO0O0.OooO00o oooO00o = new OooO0O0.OooO00o(OooO00o.class, new Class[]{OooOo.class, HeartBeatInfo.class});
        oooO00o.OooO00o(Oooo000.OooO0O0(Context.class));
        oooO00o.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        oooO00o.OooO00o(new Oooo000(2, 0, OooOOOO.class));
        oooO00o.OooO00o(new Oooo000(1, 1, o0000O.class));
        oooO00o.OooO00o(new Oooo000((Qualified<?>) qualified, 1, 0));
        oooO00o.f19331OooO0o = new OooO() { // from class: o0O0o00o.OooOOO0
            @Override // com.google.firebase.components.OooO
            public final Object OooO00o(o00oO0o o00oo0o2) {
                return new OooO00o((Context) o00oo0o2.OooO00o(Context.class), ((o0OOO0o) o00oo0o2.OooO00o(o0OOO0o.class)).OooO0Oo(), o00oo0o2.OooO0oo(OooOOOO.class), o00oo0o2.OooO0o0(o0000O.class), (Executor) o00oo0o2.OooO0Oo(qualified));
            }
        };
        arrayList.add(oooO00o.OooO0O0());
        arrayList.add(o000OO.OooO00o("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o000OO.OooO00o("fire-core", "20.3.3"));
        arrayList.add(o000OO.OooO00o("device-name", OooO00o(Build.PRODUCT)));
        arrayList.add(o000OO.OooO00o("device-model", OooO00o(Build.DEVICE)));
        arrayList.add(o000OO.OooO00o("device-brand", OooO00o(Build.BRAND)));
        arrayList.add(o000OO.OooO0O0("android-target-sdk", new o00Ooo()));
        arrayList.add(o000OO.OooO0O0("android-min-sdk", new o0OO00O()));
        arrayList.add(o000OO.OooO0O0("android-platform", new p103o000oo00.Oooo000()));
        arrayList.add(o000OO.OooO0O0("android-installer", new OooO0OO()));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(o000OO.OooO00o(Constants.SDK_LANGUAGE, string));
        }
        return arrayList;
    }
}
