package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.OooO00o;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlinx.coroutines.DebugKt;
import p054o00000oo.o00OOO0O;
import p351o0OOOOo.OooOOO;
import p351o0OOOOo.OooOo;
import p351o0OOOOo.OooOo00;
import p357o0OOOo0O.o0000O0;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.oo000o;
import p372o0OOo0o.o0OO00O;
import p372o0OOo0o.oo0o0Oo;
import p382o0OOoOo.o00000;
import p382o0OOoOo.o000000O;
import p382o0OOoOo.o000OOo;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String OooO00o(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String OooO0O0(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<oo000o<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(o00000.class);
        oooO0O0OooO00o.OooO00o(new p357o0OOOo0O.o00000(o000OOo.class, 2, 0));
        oooO0O0OooO00o.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOoOo.o0OO00O
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) {
                Set setOooO0Oo = ((o0000O0) o00oo0o2).OooO0Oo(o000OOo.class);
                o0O0O00 o0o0o00 = o0O0O00.f38844OooO0O0;
                if (o0o0o00 == null) {
                    synchronized (o0O0O00.class) {
                        o0o0o00 = o0O0O00.f38844OooO0O0;
                        if (o0o0o00 == null) {
                            o0o0o00 = new o0O0O00();
                            o0O0O00.f38844OooO0O0 = o0o0o00;
                        }
                    }
                }
                return new oo0o0Oo(setOooO0Oo, o0o0o00);
            }
        };
        arrayList.add(oooO0O0OooO00o.OooO0O0());
        int i = OooO00o.f19113OooO0o;
        String string = null;
        oo000o.OooO0O0 oooO0O0 = new oo000o.OooO0O0(OooO00o.class, new Class[]{oo0o0Oo.class, HeartBeatInfo.class}, null);
        oooO0O0.OooO00o(new p357o0OOOo0O.o00000(Context.class, 1, 0));
        oooO0O0.OooO00o(new p357o0OOOo0O.o00000(OooOOO.class, 1, 0));
        oooO0O0.OooO00o(new p357o0OOOo0O.o00000(o0OO00O.class, 2, 0));
        oooO0O0.OooO00o(new p357o0OOOo0O.o00000(o00000.class, 1, 1));
        oooO0O0.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOo0o.o0OOO0o
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) {
                o0000O0 o0000o1 = (o0000O0) o00oo0o2;
                return new OooO00o((Context) o0000o1.OooO00o(Context.class), ((OooOOO) o0000o1.OooO00o(OooOOO.class)).OooO0Oo(), o0000o1.OooO0Oo(o0OO00O.class), o0000o1.OooO0O0(o00000.class));
            }
        };
        arrayList.add(oooO0O0.OooO0O0());
        arrayList.add(o000000O.OooO00o("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(o000000O.OooO00o("fire-core", "20.1.2"));
        arrayList.add(o000000O.OooO00o("device-name", OooO0O0(Build.PRODUCT)));
        arrayList.add(o000000O.OooO00o("device-model", OooO0O0(Build.DEVICE)));
        arrayList.add(o000000O.OooO00o("device-brand", OooO0O0(Build.BRAND)));
        arrayList.add(o000000O.OooO0O0("android-target-sdk", OooOo00.f38280OooO0Oo));
        arrayList.add(o000000O.OooO0O0("android-min-sdk", o00OOO0O.f27224OooO0o0));
        arrayList.add(o000000O.OooO0O0("android-platform", new o000000O.OooO00o() { // from class: o0OOOOo.OooOOOO
            @Override // o0OOoOo.o000000O.OooO00o
            public final String OooO00o(Object obj) {
                Context context = (Context) obj;
                int i2 = Build.VERSION.SDK_INT;
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
                }
                return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
            }
        }));
        arrayList.add(o000000O.OooO0O0("android-installer", OooOo.f38278OooO0Oo));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (string != null) {
            arrayList.add(o000000O.OooO00o("kotlin", string));
        }
        return arrayList;
    }
}
