package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p293o0O0Ooo.Oooo0;
import p294o0O0Ooo0.o0000O;
import p294o0O0Ooo0.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, o0000O0O<?>> f20165OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o0000O<?>> f20166OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O0O<Object> f20167OooO0OO;

    public static final class OooO00o implements Oooo0<OooO00o> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO f20168OooO00o = new OooO();
    }

    public OooOO0(HashMap map, HashMap map2, OooO oooO) {
        this.f20165OooO00o = map;
        this.f20166OooO0O0 = map2;
        this.f20167OooO0OO = oooO;
    }

    public final void OooO00o(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull Object obj) throws IOException {
        Map<Class<?>, o0000O0O<?>> map = this.f20165OooO00o;
        OooO0o oooO0o = new OooO0o(byteArrayOutputStream, map, this.f20166OooO0O0, this.f20167OooO0OO);
        if (obj == null) {
            return;
        }
        o0000O0O<?> o0000o0o2 = map.get(obj.getClass());
        if (o0000o0o2 != null) {
            o0000o0o2.OooO00o(obj, oooO0o);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
