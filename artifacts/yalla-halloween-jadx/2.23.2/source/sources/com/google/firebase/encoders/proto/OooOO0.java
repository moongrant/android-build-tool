package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p297o0O0OooO.o0000O0O;
import p297o0O0OooO.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, o0000oo<?>> f19693OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o0000O0O<?>> f19694OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000oo<Object> f19695OooO0OO;

    public static final class OooO00o implements o0O0o000.OooO00o<OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f19696OooO00o = new OooO();
    }

    public OooOO0(HashMap map, HashMap map2, OooO oooO) {
        this.f19693OooO00o = map;
        this.f19694OooO0O0 = map2;
        this.f19695OooO0OO = oooO;
    }

    public final void OooO00o(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull Object obj) throws IOException {
        Map<Class<?>, o0000oo<?>> map = this.f19693OooO00o;
        OooO0o oooO0o = new OooO0o(byteArrayOutputStream, map, this.f19694OooO0O0, this.f19695OooO0OO);
        if (obj == null) {
            return;
        }
        o0000oo<?> o0000ooVar = map.get(obj.getClass());
        if (o0000ooVar != null) {
            o0000ooVar.OooO00o(obj, oooO0o);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
