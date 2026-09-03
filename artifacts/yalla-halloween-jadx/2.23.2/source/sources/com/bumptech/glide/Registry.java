package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00OoO.o00O0O;
import o00OoO.o00Oo0;
import o00OoO.o0OoOo0;
import p144o00Oo.o000O00;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.o0ooOOo;
import p168o00Ooo00.o00oO0o;
import p168o00Ooo00.oo000o;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class Registry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f13002OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final p169o00Ooo0O.OooOO0 f13003OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final p169o00Ooo0O.OooOOOO f13004OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p169o00Ooo0O.OooOo00 f13005OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00oO0o f13006OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.bumptech.glide.load.data.OooOO0 f13007OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p169o00Ooo0O.OooOO0O f13008OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0O00o0.OooO0O0.OooO0OO f13010OooOO0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p169o00Ooo0O.OooOOO f13009OooO0oo = new p169o00Ooo0O.OooOOO();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p169o00Ooo0O.OooOOO0 f13001OooO = new p169o00Ooo0O.OooOOO0();

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public NoModelLoaderAvailableException(@NonNull List list, @NonNull Object obj) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super(androidx.compose.compiler.plugins.kotlin.k1.OooO00o.OooO00o("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        o0O00o0.OooO0O0.OooO0OO oooO0OO = new o0O00o0.OooO0O0.OooO0OO(new o000OO.OooOO0O(20), new p279o0O00o0.OooO0OO(), new p279o0O00o0.OooO0o());
        this.f13010OooOO0 = oooO0OO;
        this.f13002OooO00o = new o00Oo0(oooO0OO);
        this.f13003OooO0O0 = new p169o00Ooo0O.OooOO0();
        this.f13004OooO0OO = new p169o00Ooo0O.OooOOOO();
        this.f13005OooO0Oo = new p169o00Ooo0O.OooOo00();
        this.f13007OooO0o0 = new com.bumptech.glide.load.data.OooOO0();
        this.f13006OooO0o = new o00oO0o();
        this.f13008OooO0oO = new p169o00Ooo0O.OooOO0O();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        p169o00Ooo0O.OooOOOO oooOOOO = this.f13004OooO0OO;
        synchronized (oooOOOO) {
            ArrayList<String> arrayList2 = new ArrayList(oooOOOO.f38240OooO00o);
            oooOOOO.f38240OooO00o.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                oooOOOO.f38240OooO00o.add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    oooOOOO.f38240OooO00o.add(str);
                }
            }
        }
    }

    @NonNull
    public final void OooO(@NonNull ImageHeaderParser imageHeaderParser) {
        p169o00Ooo0O.OooOO0O oooOO0O = this.f13008OooO0oO;
        synchronized (oooOO0O) {
            oooOO0O.f38234OooO00o.add(imageHeaderParser);
        }
    }

    @NonNull
    public final void OooO00o(@NonNull Class cls, @NonNull Class cls2, @NonNull o00O0O o00o0o2) {
        o00Oo0 o00oo1 = this.f13002OooO00o;
        synchronized (o00oo1) {
            o00oo1.f37887OooO00o.OooO00o(cls, cls2, o00o0o2);
            o00oo1.f37888OooO0O0.f37889OooO00o.clear();
        }
    }

    @NonNull
    public final void OooO0O0(@NonNull Class cls, @NonNull o0ooOOo o0ooooo) {
        p169o00Ooo0O.OooOO0 oooOO1 = this.f13003OooO0O0;
        synchronized (oooOO1) {
            oooOO1.f38231OooO00o.add(new o00Ooo0O.OooOO0.OooO00o(cls, o0ooooo));
        }
    }

    @NonNull
    public final void OooO0OO(@NonNull Class cls, @NonNull o000OOo o000ooo2) {
        p169o00Ooo0O.OooOo00 oooOo00 = this.f13005OooO0Oo;
        synchronized (oooOo00) {
            oooOo00.f38245OooO00o.add(new o00Ooo0O.OooOo00.OooO00o(cls, o000ooo2));
        }
    }

    @NonNull
    public final void OooO0Oo(@NonNull o0O0O00 o0o0o00, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        p169o00Ooo0O.OooOOOO oooOOOO = this.f13004OooO0OO;
        synchronized (oooOOOO) {
            oooOOOO.OooO00o(str).add(new o00Ooo0O.OooOOOO.OooO00o<>(cls, cls2, o0o0o00));
        }
    }

    @NonNull
    public final ArrayList OooO0o() {
        ArrayList arrayList;
        p169o00Ooo0O.OooOO0O oooOO0O = this.f13008OooO0oO;
        synchronized (oooOO0O) {
            arrayList = oooOO0O.f38234OooO00o;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @NonNull
    public final ArrayList OooO0o0(@NonNull Class cls, @NonNull Class cls2, @NonNull Class cls3) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Class cls4 : this.f13004OooO0OO.OooO0O0(cls, cls2)) {
            for (Class cls5 : this.f13006OooO0o.OooO0O0(cls4, cls3)) {
                p169o00Ooo0O.OooOOOO oooOOOO = this.f13004OooO0OO;
                synchronized (oooOOOO) {
                    arrayList = new ArrayList();
                    Iterator it = oooOOOO.f38240OooO00o.iterator();
                    while (it.hasNext()) {
                        List<o00Ooo0O.OooOOOO.OooO00o> list = (List) oooOOOO.f38241OooO0O0.get((String) it.next());
                        if (list != null) {
                            for (o00Ooo0O.OooOOOO.OooO00o oooO00o : list) {
                                if (oooO00o.f38242OooO00o.isAssignableFrom(cls) && cls4.isAssignableFrom(oooO00o.f38243OooO0O0)) {
                                    arrayList.add(oooO00o.f38244OooO0OO);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new o000O00(cls, cls4, cls5, arrayList, this.f13006OooO0o.OooO00o(cls4, cls5), this.f13010OooOO0));
            }
        }
        return arrayList2;
    }

    @NonNull
    public final <Model> List<o0OoOo0<Model, ?>> OooO0oO(@NonNull Model model) {
        List<o0OoOo0<Model, ?>> listUnmodifiableList;
        o00Oo0 o00oo1 = this.f13002OooO00o;
        o00oo1.getClass();
        Class<?> cls = model.getClass();
        synchronized (o00oo1) {
            o00Oo0.OooO00o.C0428OooO00o c0428OooO00o = (o00Oo0.OooO00o.C0428OooO00o) o00oo1.f37888OooO0O0.f37889OooO00o.get(cls);
            listUnmodifiableList = c0428OooO00o == null ? null : c0428OooO00o.f37890OooO00o;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(o00oo1.f37887OooO00o.OooO0O0(cls));
                if (((o00Oo0.OooO00o.C0428OooO00o) o00oo1.f37888OooO0O0.f37889OooO00o.put(cls, new o00Oo0.OooO00o.C0428OooO00o(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        int size = listUnmodifiableList.size();
        List<o0OoOo0<Model, ?>> listEmptyList = Collections.emptyList();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            o0OoOo0<Model, ?> o0oooo1 = listUnmodifiableList.get(i);
            if (o0oooo1.OooO00o(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(o0oooo1);
            }
        }
        if (listEmptyList.isEmpty()) {
            throw new NoModelLoaderAvailableException(listUnmodifiableList, model);
        }
        return listEmptyList;
    }

    @NonNull
    public final <X> com.bumptech.glide.load.data.OooO<X> OooO0oo(@NonNull X x) {
        com.bumptech.glide.load.data.OooO<X> oooOBuild;
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f13007OooO0o0;
        synchronized (oooOO1) {
            o00OO00O.OooO0O0(x);
            com.bumptech.glide.load.data.OooO.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO.OooO00o) oooOO1.f13043OooO00o.get(x.getClass());
            if (oooO00o == null) {
                for (com.bumptech.glide.load.data.OooO.OooO00o oooO00o2 : oooOO1.f13043OooO00o.values()) {
                    if (oooO00o2.OooO00o().isAssignableFrom(x.getClass())) {
                        oooO00o = oooO00o2;
                        break;
                    }
                }
            }
            if (oooO00o == null) {
                oooO00o = com.bumptech.glide.load.data.OooOO0.f13042OooO0O0;
            }
            oooOBuild = oooO00o.build(x);
        }
        return oooOBuild;
    }

    @NonNull
    public final void OooOO0(@NonNull com.bumptech.glide.load.data.OooO.OooO00o oooO00o) {
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f13007OooO0o0;
        synchronized (oooOO1) {
            oooOO1.f13043OooO00o.put(oooO00o.OooO00o(), oooO00o);
        }
    }

    @NonNull
    public final void OooOO0O(@NonNull Class cls, @NonNull Class cls2, @NonNull oo000o oo000oVar) {
        o00oO0o o00oo0o2 = this.f13006OooO0o;
        synchronized (o00oo0o2) {
            o00oo0o2.f38224OooO00o.add(new o00oO0o.OooO00o(cls, cls2, oo000oVar));
        }
    }

    @NonNull
    public final void OooOO0o(@NonNull com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o oooO00o) {
        o00Oo0 o00oo1 = this.f13002OooO00o;
        synchronized (o00oo1) {
            Iterator it = o00oo1.f37887OooO00o.OooO0oO(oooO00o).iterator();
            while (it.hasNext()) {
                ((o00O0O) it.next()).OooO0OO();
            }
            o00oo1.f37888OooO0O0.f37889OooO00o.clear();
        }
    }
}
