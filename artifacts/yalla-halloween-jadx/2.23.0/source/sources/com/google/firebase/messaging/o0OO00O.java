package com.google.firebase.messaging;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OO00O implements p176o00o0.Oooo0 {
    public static void OooO00o(String str, Object obj, p409o0Oo0o0o.o0O0O00 o0o0o00, boolean z) {
        o0o0o00.OooO0o(str + obj, z);
    }

    @Override // p176o00o0.Oooo0
    public Object apply(Object obj) {
        p563o0oOo0O0.o00000 o00000Var = (p563o0oOo0O0.o00000) obj;
        o00000Var.getClass();
        com.google.firebase.encoders.proto.OooOO0 oooOO1 = o000000.f20291OooO00o;
        oooOO1.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            oooOO1.OooO00o(byteArrayOutputStream, o00000Var);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
