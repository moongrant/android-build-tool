package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p217o00oO00o.o00000O0;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000OO;
import p221o00oOO.o0Oo0oo;
import p230o00oOo0O.OooOo;
import p230o00oOo0O.OooOo00;
import p232o00oOoO.o00OO;
import p232o00oOoO.o00OO0O0;
import p232o00oOoO.o00OO0OO;
import p232o00oOoO.o00OOO0;
import p232o00oOoO.o00OOO00;
import p232o00oOoO.oo0O;
import p241o00oo0.o0;
import p241o00oo0.o0O0o;
import p241o00oo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO f12428OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00OO0O0 f12429OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00OOO00 f12430OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOO0 f12431OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo f12432OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.bumptech.glide.load.data.OooOO0 f12433OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00OO0OO f12434OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000OO0O.OooO<List<Throwable>> f12436OooOO0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00OO f12435OooO0oo = new o00OO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo0O f12427OooO = new oo0O();

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super(androidx.lifecycle.OooOOO.OooO00o("Failed to find source encoder for data class: ", cls));
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public Registry() {
        o0oOOo.OooO0OO oooO0OO = new o0oOOo.OooO0OO(new o000OO0O.OooOO0O(20), new o0O0o(), new o0());
        this.f12436OooOO0 = oooO0OO;
        this.f12428OooO00o = new o00000OO(oooO0OO);
        this.f12429OooO0O0 = new o00OO0O0();
        this.f12430OooO0OO = new o00OOO00();
        this.f12431OooO0Oo = new o00OOO0();
        this.f12433OooO0o0 = new com.bumptech.glide.load.data.OooOO0();
        this.f12432OooO0o = new OooOo();
        this.f12434OooO0oO = new o00OO0OO();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        o00OOO00 o00ooo01 = this.f12430OooO0OO;
        synchronized (o00ooo01) {
            ArrayList<String> arrayList2 = new ArrayList(o00ooo01.f33952OooO00o);
            o00ooo01.f33952OooO00o.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                o00ooo01.f33952OooO00o.add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    o00ooo01.f33952OooO00o.add(str);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o00oOO.o00000OO$OooO00o$OooO00o<?>>] */
    @NonNull
    public final Registry OooO(@NonNull Class cls, @NonNull o00000O o00000o) {
        List listOooO0o;
        o00000OO o00000oo2 = this.f12428OooO00o;
        synchronized (o00000oo2) {
            o0000 o0000Var = o00000oo2.f33699OooO00o;
            synchronized (o0000Var) {
                listOooO0o = o0000Var.OooO0o(cls);
                o0000Var.OooO00o(o0Oo0oo.class, cls, o00000o);
            }
            Iterator it = ((ArrayList) listOooO0o).iterator();
            while (it.hasNext()) {
                ((o00000O) it.next()).OooO0O0();
            }
            o00000oo2.f33700OooO0O0.f33701OooO00o.clear();
        }
        return this;
    }

    @NonNull
    public final <Data, TResource> Registry OooO00o(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull o00000O0<Data, TResource> o00000o1) {
        OooO0Oo("legacy_append", cls, cls2, o00000o1);
        return this;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o00oOO.o00000OO$OooO00o$OooO00o<?>>] */
    @NonNull
    public final <Model, Data> Registry OooO0O0(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o00000O<Model, Data> o00000o) {
        o00000OO o00000oo2 = this.f12428OooO00o;
        synchronized (o00000oo2) {
            o00000oo2.f33699OooO00o.OooO00o(cls, cls2, o00000o);
            o00000oo2.f33700OooO0O0.f33701OooO00o.clear();
        }
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <TResource> Registry OooO0OO(@NonNull Class<TResource> cls, @NonNull p217o00oO00o.o00000O<TResource> o00000o) {
        o00OOO0 o00ooo1 = this.f12431OooO0Oo;
        synchronized (o00ooo1) {
            o00ooo1.f33949OooO00o.add(new o00OOO0.OooO00o<>(cls, o00000o));
        }
        return this;
    }

    @NonNull
    public final <Data, TResource> Registry OooO0Oo(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull o00000O0<Data, TResource> o00000o1) {
        o00OOO00 o00ooo01 = this.f12430OooO0OO;
        synchronized (o00ooo01) {
            o00ooo01.OooO00o(str).add(new o00OOO00.OooO00o<>(cls, cls2, o00000o1));
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o00oOO.o00000OO$OooO00o$OooO00o<?>>] */
    @NonNull
    public final <Model> List<p221o00oOO.o00000O0<Model, ?>> OooO0o(@NonNull Model model) {
        List<p221o00oOO.o00000O0<Model, ?>> listUnmodifiableList;
        o00000OO o00000oo2 = this.f12428OooO00o;
        Objects.requireNonNull(o00000oo2);
        Class<?> cls = model.getClass();
        synchronized (o00000oo2) {
            o00000OO.OooO00o.C0350OooO00o c0350OooO00o = (o00000OO.OooO00o.C0350OooO00o) o00000oo2.f33700OooO0O0.f33701OooO00o.get(cls);
            listUnmodifiableList = c0350OooO00o == null ? null : c0350OooO00o.f33702OooO00o;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(o00000oo2.f33699OooO00o.OooO0O0(cls));
                o00000oo2.f33700OooO0O0.OooO00o(cls, listUnmodifiableList);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = listUnmodifiableList.size();
        List<p221o00oOO.o00000O0<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            p221o00oOO.o00000O0<Model, ?> o00000o1 = listUnmodifiableList.get(i);
            if (o00000o1.OooO00o(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(o00000o1);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model, listUnmodifiableList);
        }
        return listEmptyList;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.bumptech.glide.load.ImageHeaderParser>] */
    @NonNull
    public final List<ImageHeaderParser> OooO0o0() {
        ?? r1;
        o00OO0OO o00oo0oo = this.f12434OooO0oO;
        synchronized (o00oo0oo) {
            r1 = o00oo0oo.f33948OooO00o;
        }
        if (r1.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return r1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.OooO$OooO00o<?>>] */
    @NonNull
    public final Registry OooO0oO(@NonNull com.bumptech.glide.load.data.OooO.OooO00o<?> oooO00o) {
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f12433OooO0o0;
        synchronized (oooOO1) {
            oooOO1.f12472OooO00o.put(oooO00o.OooO00o(), oooO00o);
        }
        return this;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <TResource, Transcode> Registry OooO0oo(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull OooOo00<TResource, Transcode> oooOo00) {
        OooOo oooOo = this.f12432OooO0o;
        synchronized (oooOo) {
            oooOo.f33903OooO00o.add(new OooOo.OooO00o<>(cls, cls2, oooOo00));
        }
        return this;
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        /* JADX WARN: Illegal instructions before constructor call */
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to find any ModelLoaders registered for model class: ");
            sbOooO0o0.append(obj.getClass());
            super(sbOooO0o0.toString());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<p221o00oOO.o00000O0<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
