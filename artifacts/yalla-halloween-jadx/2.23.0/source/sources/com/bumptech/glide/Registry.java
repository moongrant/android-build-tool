package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o00OO00O.o00O0O;
import o00OO00O.o00Oo0;
import o00OO00O.o0OoOo0;
import p126o00O0oOo.o00000O;
import p126o00O0oOo.o00000O0;
import p126o00O0oOo.o0O0O00;
import p127o00O0oo.o0OO00O;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class Registry {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0 f9911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0O.OooO00o f9912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0O.OooO f9913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo0O.OooOO0 f9914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p133o00OO0oO.o00Oo0 f9915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.bumptech.glide.load.data.OooOO0 f9916OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo0O.OooO0O0 f9917OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00OOO.OooO00o.OooO0OO f9919OooOO0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo0O.OooO0o f9918OooO0oo = new oo0O.OooO0o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo0O.OooO0OO f9910OooO = new oo0O.OooO0OO();

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
            super(androidx.compose.compiler.plugins.kotlin.OooO00o.OooO00o("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        o00OOO.OooO00o.OooO0OO oooO0OO = new o00OOO.OooO00o.OooO0OO(new o000OO.OooOO0O(20), new o00OOO.OooO0O0(), new o00OOO.OooO0OO());
        this.f9919OooOO0 = oooO0OO;
        this.f9911OooO00o = new o00Oo0(oooO0OO);
        this.f9912OooO0O0 = new oo0O.OooO00o();
        this.f9913OooO0OO = new oo0O.OooO();
        this.f9914OooO0Oo = new oo0O.OooOO0();
        this.f9916OooO0o0 = new com.bumptech.glide.load.data.OooOO0();
        this.f9915OooO0o = new p133o00OO0oO.o00Oo0();
        this.f9917OooO0oO = new oo0O.OooO0O0();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        oo0O.OooO oooO = this.f9913OooO0OO;
        synchronized (oooO) {
            ArrayList<String> arrayList2 = new ArrayList(oooO.f60879OooO00o);
            oooO.f60879OooO00o.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                oooO.f60879OooO00o.add((String) it2.next());
            }
            for (String str : arrayList2) {
                if (!arrayList.contains(str)) {
                    oooO.f60879OooO00o.add(str);
                }
            }
        }
    }

    @NonNull
    public final void OooO(@NonNull ImageHeaderParser imageHeaderParser) {
        oo0O.OooO0O0 oooO0O0 = this.f9917OooO0oO;
        synchronized (oooO0O0) {
            oooO0O0.f60887OooO00o.add(imageHeaderParser);
        }
    }

    @NonNull
    public final void OooO00o(@NonNull Class cls, @NonNull Class cls2, @NonNull o00O0O o00o0o2) {
        o00Oo0 o00oo1 = this.f9911OooO00o;
        synchronized (o00oo1) {
            o00oo1.f37125OooO00o.OooO00o(cls, cls2, o00o0o2);
            o00oo1.f37126OooO0O0.f37127OooO00o.clear();
        }
    }

    @NonNull
    public final void OooO0O0(@NonNull Class cls, @NonNull o0O0O00 o0o0o00) {
        oo0O.OooO00o oooO00o = this.f9912OooO0O0;
        synchronized (oooO00o) {
            oooO00o.f60884OooO00o.add(new oo0O.OooO00o.C0521OooO00o(cls, o0o0o00));
        }
    }

    @NonNull
    public final void OooO0OO(@NonNull Class cls, @NonNull o00000O o00000o) {
        oo0O.OooOO0 oooOO1 = this.f9914OooO0Oo;
        synchronized (oooOO1) {
            oooOO1.f60893OooO00o.add(new oo0O.OooOO0.OooO00o(cls, o00000o));
        }
    }

    @NonNull
    public final void OooO0Oo(@NonNull o00000O0 o00000o1, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        oo0O.OooO oooO = this.f9913OooO0OO;
        synchronized (oooO) {
            oooO.OooO00o(str).add(new oo0O.OooO.OooO00o<>(cls, cls2, o00000o1));
        }
    }

    @NonNull
    public final ArrayList OooO0o() {
        ArrayList arrayList;
        oo0O.OooO0O0 oooO0O0 = this.f9917OooO0oO;
        synchronized (oooO0O0) {
            arrayList = oooO0O0.f60887OooO00o;
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
        for (Class cls4 : this.f9913OooO0OO.OooO0O0(cls, cls2)) {
            for (Class cls5 : this.f9915OooO0o.OooO0O0(cls4, cls3)) {
                oo0O.OooO oooO = this.f9913OooO0OO;
                synchronized (oooO) {
                    arrayList = new ArrayList();
                    Iterator it = oooO.f60879OooO00o.iterator();
                    while (it.hasNext()) {
                        List<oo0O.OooO.OooO00o> list = (List) oooO.f60880OooO0O0.get((String) it.next());
                        if (list != null) {
                            for (oo0O.OooO.OooO00o oooO00o : list) {
                                if (oooO00o.f60881OooO00o.isAssignableFrom(cls) && cls4.isAssignableFrom(oooO00o.f60882OooO0O0)) {
                                    arrayList.add(oooO00o.f60883OooO0OO);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new o0OO00O(cls, cls4, cls5, arrayList, this.f9915OooO0o.OooO00o(cls4, cls5), this.f9919OooOO0));
            }
        }
        return arrayList2;
    }

    @NonNull
    public final <Model> List<o0OoOo0<Model, ?>> OooO0oO(@NonNull Model model) {
        List<o0OoOo0<Model, ?>> listUnmodifiableList;
        o00Oo0 o00oo1 = this.f9911OooO00o;
        o00oo1.getClass();
        Class<?> cls = model.getClass();
        synchronized (o00oo1) {
            o00Oo0.OooO00o.C0431OooO00o c0431OooO00o = (o00Oo0.OooO00o.C0431OooO00o) o00oo1.f37126OooO0O0.f37127OooO00o.get(cls);
            listUnmodifiableList = c0431OooO00o == null ? null : c0431OooO00o.f37128OooO00o;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(o00oo1.f37125OooO00o.OooO0O0(cls));
                if (((o00Oo0.OooO00o.C0431OooO00o) o00oo1.f37126OooO0O0.f37127OooO00o.put(cls, new o00Oo0.OooO00o.C0431OooO00o(listUnmodifiableList))) != null) {
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
            o0OoOo0<Model, ?> o0oooo0 = listUnmodifiableList.get(i);
            if (o0oooo0.OooO00o(model)) {
                if (z) {
                    listEmptyList = new ArrayList<>(size - i);
                    z = false;
                }
                listEmptyList.add(o0oooo0);
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
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f9916OooO0o0;
        synchronized (oooOO1) {
            o0000O00.OooO0O0(x);
            com.bumptech.glide.load.data.OooO.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO.OooO00o) oooOO1.f9952OooO00o.get(x.getClass());
            if (oooO00o == null) {
                for (com.bumptech.glide.load.data.OooO.OooO00o oooO00o2 : oooOO1.f9952OooO00o.values()) {
                    if (oooO00o2.OooO00o().isAssignableFrom(x.getClass())) {
                        oooO00o = oooO00o2;
                        break;
                    }
                }
            }
            if (oooO00o == null) {
                oooO00o = com.bumptech.glide.load.data.OooOO0.f9951OooO0O0;
            }
            oooOBuild = oooO00o.build(x);
        }
        return oooOBuild;
    }

    @NonNull
    public final void OooOO0(@NonNull com.bumptech.glide.load.data.OooO.OooO00o oooO00o) {
        com.bumptech.glide.load.data.OooOO0 oooOO1 = this.f9916OooO0o0;
        synchronized (oooOO1) {
            oooOO1.f9952OooO00o.put(oooO00o.OooO00o(), oooO00o);
        }
    }

    @NonNull
    public final void OooOO0O(@NonNull Class cls, @NonNull Class cls2, @NonNull p133o00OO0oO.o00O0O o00o0o2) {
        p133o00OO0oO.o00Oo0 o00oo1 = this.f9915OooO0o;
        synchronized (o00oo1) {
            o00oo1.f37321OooO00o.add(new o00OO0oO.o00Oo0.OooO00o(cls, cls2, o00o0o2));
        }
    }

    @NonNull
    public final void OooOO0o(@NonNull com.bumptech.glide.integration.okhttp3.OooO0O0.OooO00o oooO00o) {
        o00Oo0 o00oo1 = this.f9911OooO00o;
        synchronized (o00oo1) {
            Iterator it = o00oo1.f37125OooO00o.OooO0oO(oooO00o).iterator();
            while (it.hasNext()) {
                ((o00O0O) it.next()).OooO0Oo();
            }
            o00oo1.f37126OooO0O0.f37127OooO00o.clear();
        }
    }
}
